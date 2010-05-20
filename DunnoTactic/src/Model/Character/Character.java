/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;
import Model.Game;
import java.util.Random;
import Model.Character.Special.*;
import java.util.Vector;
import Model.Building.Building;
import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class Character implements Serializable{
    private boolean enable;
    private boolean death;
    private int EnableCounter;
    private boolean EmergencyUsed;
    private CharAtribut KarakterAtribut;
    private int LevelChar;
    private Special[] SpecialList = new Special[5];
    private static int NEXT_ID = 1;
    private int player;
    private int X;
    private int Y;
    private int ID;
    private boolean move = false;
    private boolean attack = false;

    public Character(int RaceID, int player){
        KarakterAtribut = new CharAtribut(RaceID);
        enable = true;
        this.player = player;
        ID = NEXT_ID++;
    }

    public CharAtribut GetAtribut(){
        return KarakterAtribut;
    }
        
    public void Move(int targetX, int targetY){
        X = targetX;
        Y = targetY;
        ++EnableCounter;
        move = true;
        if(EnableCounter==2){
            setEnable(false);
        }
    }

    public void AttackBuilding(Character Attacker, Building TargetBuilding){
        CharAtribut AtributKarakter;
        AtributKarakter = new CharAtribut();
        AtributKarakter = Attacker.GetAtribut();
        Random r = new Random();
        int randFactor = 90+r.nextInt(21);
        int damage;
        switch(AtributKarakter.GetAttackType()){
            case Constanta.ATTACK_ATT_TYPE_ID : {
                damage = (int)((double)AtributKarakter.GetCurrent(Constanta.ATTACK_ID)*(double)randFactor)/100;
            }
            break;
            case Constanta.ATTACK_MATT_TYPE_ID : {
                damage = (int)((double)AtributKarakter.GetCurrent(Constanta.MATTACK_ID)*(double)randFactor*0.75)/100;
            }
            break;
            case Constanta.ATTACK_DOUBLE_TYPE_ID : {
                damage = (int)((double)AtributKarakter.GetCurrent(Constanta.ATTACK_ID)*(double)randFactor*0.45)+(int)((double)AtributKarakter.GetCurrent(Constanta.MATTACK_ID)*(double)randFactor*0.45)/100;
            }
            break;
            default : {
                damage = 500;
            }
            break;
        }
        TargetBuilding.getDamage(damage);
        attack = true;
    }
            
    public void AttackTree(int targetX, int targetY){
        //Game.M.SetTerrain(Game.M.RUMPUT, targetY, targetY);
        Random r = new Random();
        int RandBuffType = r.nextInt(100);
        int RandBuffEfek = r.nextInt(100);
        if(RandBuffType<40){
            // negatif buff efek
            if(RandBuffEfek<25){
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_TIME_FREEZE_ID);
            } else if(RandBuffEfek<45){
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_DISABLE_ID);
            } else if(RandBuffEfek<60){
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_SILENCE_ID);
            } else if(RandBuffEfek<75){
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_IMMOBILIZE_ID);
            } else if(RandBuffEfek<90){
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_POISON_ID);
            } else {
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_BLIND_ID);
            }
        } else{
            // positif buff efek
            if(RandBuffEfek<15){
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_FLEETING_TIME_ID);
            } else if(RandBuffEfek<50){
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_ANGEL_BLESS_ID);
            } else {
                KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_HOLY_GUARD_ID);
            }
        }
        ++EnableCounter;
        if(EnableCounter==2){
            setEnable(false);
        }
        attack = true;
    }    

    public void AttackPlayer(Character Attacker, Character Target){
        int Chance = 75 + (Attacker.GetAtribut().GetCurrent(Constanta.ACC_ID) - Target.GetAtribut().GetCurrent(Constanta.EVA_ID))/4;
        Random r = new Random();
        if(r.nextInt(100)<Chance) {
            CharAtribut AtributKarakter;
            AtributKarakter = new CharAtribut();
            AtributKarakter = Attacker.GetAtribut();

            int randFactor = 90+r.nextInt(21);
            int damage;
            switch(AtributKarakter.GetAttackType()){
                case Constanta.ATTACK_ATT_TYPE_ID : {
                    damage = (int)((double)AtributKarakter.GetCurrent(Constanta.ATTACK_ID)*(double)randFactor)/100;
                }
                break;
                case Constanta.ATTACK_MATT_TYPE_ID : {
                    damage = (int)((double)AtributKarakter.GetCurrent(Constanta.MATTACK_ID)*(double)randFactor*0.75)/100;
                }
                break;
                case Constanta.ATTACK_DOUBLE_TYPE_ID : {
                    damage = (int)((double)AtributKarakter.GetCurrent(Constanta.ATTACK_ID)*(double)randFactor*0.45)+(int)((double)AtributKarakter.GetCurrent(Constanta.MATTACK_ID)*(double)randFactor*0.45)/100;
                }
                break;
                default : {
                    damage = 500;
                }
                break;
            }
            ReceiveAttack(Target.GetAtribut(), damage);
        }
        ++EnableCounter;
        if(EnableCounter==2){
            setEnable(false);
        }
        attack = true;
    }

    public void ReceiveAttack(CharAtribut AtributKarakter, int damage){
        int getDamage = damage - AtributKarakter.GetCurrent(Constanta.DEF_ID);
        if(getDamage<=0){
            getDamage=1;
        }
        int HP = AtributKarakter.GetCurrent(Constanta.HP_ID)-getDamage;
        AtributKarakter.SetCurrentAtribut(Constanta.HP_ID, HP);
        if(HP<=0){
            AtributKarakter.SetCurrentAtribut(Constanta.HP_ID, 0);
            setDeath(true);
        }
        setEnable(false);
    }

    public void SpecialFunction(Character Caster,Vector<Character> Target,int SpecialID){
        Vector<CharAtribut> TargetAtribut;
        TargetAtribut = new Vector();
        for(int i=0;i<Target.size();++i){
            TargetAtribut.add(Target.get(i).GetAtribut());
        }
        int i=0;
        while(i<5 && SpecialID!=Caster.GetAtribut().GetSpecialAvail(i)){
            ++i;
        }
        SpecialList[i].ExecuteSpecial(KarakterAtribut, TargetAtribut);
        setEnable(false);
    }

    public void EmergencyFunction(){
        
    }

    public void WaitFunction(){
        setEnable(false);
    }

    public void UpgradeCharAtribut(){
        KarakterAtribut.Upgrade();
    }

    public void JobChange(int NewJobID){
        KarakterAtribut.UpgradeJob(NewJobID);
        for(int i =0;i<5;++i){
            if(KarakterAtribut.GetSpecialAvail(i)!=0){
                SetSpecial(i, KarakterAtribut.GetSpecialAvail(i));
            } else {
                SpecialList[i]=null;
            }
        }
    }

    public void ReduceBuffDuration(){
        KarakterAtribut.ReduceBuffDuration();
    }

    public void SetSpecial(int Indeks,int SpecialID){
        if(SpecialID<50){
            switch(SpecialID){
                case ConstantaSp.SP_KNIGHT_BLOOD_CLOTING_ID : {
                    SpecialList[Indeks] = new Sp2_BloodCloting();
                }
                break;
                case ConstantaSp.SP_WARRIOR_CRITICAL_SLASH_ID : {
                    SpecialList[Indeks] = new Sp2_CriticalSlash();
                }
                break;
                case ConstantaSp.SP_HEALER_HEALING_PRAY_ID : {
                    SpecialList[Indeks] = new Sp2_HealingPray();
                }
                break;
                case ConstantaSp.SP_MAGE_HELL_FIRE_ID : {
                    SpecialList[Indeks] = new Sp2_HellFire();
                }
                break;
                case ConstantaSp.SP_ARCHER_STRIKE_SHOT_ID : {
                    SpecialList[Indeks] = new Sp2_StrikeShot();
                }
                break;
                case ConstantaSp.SP_NINJA_THROW_KUNAI_ID : {
                    SpecialList[Indeks] = new Sp2_ThrowKunai();
                }
                break;
                default : {
                    
                }
                break;
            }
        } else if(SpecialID<100){
            switch(SpecialID){
                case ConstantaSp.SP_ARCH_KNIGHT_SWORD_FURY_ID : {
                    SpecialList[Indeks] = new Sp31_SwordFury();
                }
                break;
                case ConstantaSp.SP_ARCH_KNIGHT_SHOCKWAVE_ID : {
                    SpecialList[Indeks] = new Sp31_Shockwave();
                }
                break;
                case ConstantaSp.SP_BLADEMASTER_HURRICANE_SWORD_ID : {
                    SpecialList[Indeks] = new Sp31_HurricaneSword();
                }
                break;
                case ConstantaSp.SP_BLADEMASTER_SWORD_MELTING_ID : {
                    SpecialList[Indeks] = new Sp31_SwordMelting();
                }
                break;
                case ConstantaSp.SP_RANGER_FOCUS_SIGHT_ID : {
                    SpecialList[Indeks] = new Sp31_FocusSight();
                }
                break;
                case ConstantaSp.SP_RANGER_DOUBLE_STRIKE_ID : {
                    SpecialList[Indeks] = new Sp31_DoubleStrike();
                }
                break;
                case ConstantaSp.SP_ARCH_MAGE_HALF_LIFE_ID : {
                    SpecialList[Indeks] = new Sp31_HalfLife();
                }
                break;
                case ConstantaSp.SP_ARCH_MAGE_IFRIT_RAGE_ID : {
                    SpecialList[Indeks] = new Sp31_IfritRage();
                }
                break;
                case ConstantaSp.SP_BISHOP_HEALING_CIRCLE_ID : {
                    SpecialList[Indeks] = new Sp31_HealingCircle();
                }
                break;
                case ConstantaSp.SP_BISHOP_PHOENIX_TEAR_ID : {
                    SpecialList[Indeks] = new Sp31_PhoenixTear();
                }
                break;
                case ConstantaSp.SP_ASSASSIN_VENOM_SMOKE_ID : {
                    SpecialList[Indeks] = new Sp31_VenomSmoke();
                }
                break;
                case ConstantaSp.SP_ASSASSIN_SHADOW_BIND_ID : {
                    SpecialList[Indeks] = new Sp31_ShadowBind();
                }
                break;
                default : {
                    
                }
                break;
            }
        } else {
            switch(SpecialID){
                case ConstantaSp.SP_DEFENDER_ABUNDANCE_LIFE_ID : {
                    SpecialList[Indeks] = new Sp32_AbundanceLife();
                }
                break;
                case ConstantaSp.SP_DEFENDER_BARRIER_ID : {
                    SpecialList[Indeks] = new Sp32_Barrier();
                }
                break;
                case ConstantaSp.SP_PALADIN_SWORD_REFLECT_ID : {
                    SpecialList[Indeks] = new Sp32_SwordReflect();
                }
                break;
                case ConstantaSp.SP_PALADIN_SAINT_CROSS_ID: {
                    SpecialList[Indeks] = new Sp32_SaintCross();
                }
                break;
                case ConstantaSp.SP_BARD_SONG_OF_FREEDOM_ID : {
                    SpecialList[Indeks] = new Sp32_SongOfFreedom();
                }
                break;
                case ConstantaSp.SP_BARD_DOWN_MENTAL_ID : {
                    SpecialList[Indeks] = new Sp32_DownMental();
                }
                break;
                case ConstantaSp.SP_TIME_MAGE_TIME_WARP_ID : {
                    SpecialList[Indeks] = new Sp32_TimeWarp();
                }
                break;
                case ConstantaSp.SP_TIME_MAGE_TIME_SWAP_ID : {
                    SpecialList[Indeks] = new Sp32_TimeSwap();
                }
                break;
                case ConstantaSp.SP_SAGE_MANA_LEAK_ID : {
                    SpecialList[Indeks] = new Sp32_ManaLeak();
                }
                break;
                case ConstantaSp.SP_SAGE_PSYCHOKINETIC_ID : {
                    SpecialList[Indeks] = new Sp32_Psychokinetic();
                }
                break;
                case ConstantaSp.SP_DARK_STALKER_OBLIVION_ID : {
                    SpecialList[Indeks] = new Sp32_Oblivion();
                }
                break;
                case ConstantaSp.SP_DARK_STALKER_CURSED_BLOOD_ID : {
                    SpecialList[Indeks] = new Sp32_CursedBlood();
                }
                break;
                default : {

                }
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s = new String();
        s += "ID : ";
        s += Integer.toString(getID());
        s += "\n";

        s += "Player : ";
        s += Integer.toString(getPlayer());
        s += "\n";

        s += "Race : ";
        s += Integer.toString(GetAtribut().GetRaceID());
        s += "\n";

        s += KarakterAtribut.toString();
        return s;
    }

    /**
     * @return the player
     */
    public int getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(int player) {
        this.player = player;
    }

    /**
     * @return the X
     */
    public int getX() {
        return X;
    }

    /**
     * @param X the X to set
     */
    public void setX(int X) {
        this.X = X;
    }

    /**
     * @return the Y
     */
    public int getY() {
        return Y;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(int Y) {
        this.Y = Y;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Set Character Position
     */
    public void setLocation(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public Point getLocation(){
        return new Point(X,Y);
    }

    public boolean GetEnable(){
        return isEnable();
    }

    public void SetEnable(boolean status){
        setEnable(status);
    }

    public Special GetSpecial(int Indeks){
        return SpecialList[Indeks];
    }

    public Vector<Integer> getNextJob() {
        return GetAtribut().getJobChar().GetNextJobAvail();
    }

    /**
     * @return the enable
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * @param enable the enable to set
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    /**
     * @return the death
     */
    public boolean isDeath() {
        return death;
    }

    /**
     * @param death the death to set
     */
    public void setDeath(boolean death) {
        this.death = death;
    }

    /**
     * @return the move
     */
    public boolean isMove() {
        return move;
    }

    /**
     * @param move the move to set
     */
    public void setMove(boolean move) {
        this.move = move;
    }

    /**
     * @return the attack
     */
    public boolean isAttack() {
        return attack;
    }

    /**
     * @param attack the attack to set
     */
    public void setAttack(boolean attack) {
        this.attack = attack;
    }
}
