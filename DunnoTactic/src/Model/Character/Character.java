/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;
import Model.Game.Game;
import java.util.Random;
import Model.Character.Special.*;
import java.util.Vector;
/**
 *
 * @author ifan
 */
public class Character {
    private boolean enable;
    private boolean death;
    private int EnableCounter;
    private boolean EmergencyUsed;
    private CharAtribut KarakterAtribut;
    private int LevelChar;
    private Special[] SpecialList = new Special[5];

    public Character(){
        
    }

    public Character(int ID, int RaceID){
        KarakterAtribut = new CharAtribut(ID, RaceID, 0);
    }

    public CharAtribut GetAtribut(){
        return KarakterAtribut;
    }
        
    public void Move(int targetX, int targetY){
        KarakterAtribut.SetPositionXY(targetX, targetY);
        ++EnableCounter;
        if(EnableCounter==2){
            enable=false;
        }
    }

    public void AttackTree(int targetX, int targetY){
        Game.M.SetContent(Game.M.RUMPUT, targetY, targetY);
        ++EnableCounter;
        if(EnableCounter==2){
            enable=false;
        }
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
            enable=false;
        }
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
            death=true;
        }
        enable = false;
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
        enable = false;
    }

    public void EmergencyFunction(){
        
    }

    public void WaitFunction(){
        enable = false;
    }

    public void UpgradeCharAtribut(){
        KarakterAtribut.Upgrade();
    }

    public void SetSpecial(int Indeks,int SpecialID){
        switch(SpecialID){
            case ConstantaSp.SP_KNIGHT_BLOOD_CLOTING_ID : {
                SpecialList[Indeks] = new Sp_BloodCloting();
            }
            break;
            case ConstantaSp.SP_WARRIOR_CRITICAL_SLASH_ID : {
                SpecialList[Indeks] = new Sp_CriticalSlash();
            }
            break;
            case ConstantaSp.SP_HEALER_HEALING_PRAY_ID : {
                SpecialList[Indeks] = new Sp_HealingPray();
            }
            break;
            case ConstantaSp.SP_MAGE_HELL_FIRE_ID : {
                SpecialList[Indeks] = new Sp_HellFire();
            }
            break;
            case ConstantaSp.SP_ARCHER_STRIKE_SHOT_ID : {
                SpecialList[Indeks] = new Sp_StrikeShot();
            }
            break;
            case ConstantaSp.SP_NINJA_THROW_KUNAI_ID : {
                SpecialList[Indeks] = new Sp_ThrowKunai();
            }
            break;
            default : {
                SpecialList[Indeks] = new Sp_StrikeShot();
            }
            break;
        }
    }

    public void JobChange(int NewJobID){
        KarakterAtribut = new CharAtribut(KarakterAtribut.GetCharID(), KarakterAtribut.GetRaceID(), NewJobID);
        for(int i =0;i<5;++i){
            if(KarakterAtribut.GetSpecialAvail(i)!=0){
                SetSpecial(i, KarakterAtribut.GetSpecialAvail(i));
            }
        }
    }
}
