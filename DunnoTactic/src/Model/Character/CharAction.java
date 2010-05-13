/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;
import Model.Game.Game;
import java.util.Random;
import Model.Character.Special.*;
/**
 *
 * @author ifan
 */
public class CharAction {
    private boolean enable;
    private boolean death;
    private int StatusActionCounter;
    private boolean EmergencyUsed;

    public CharAction(){
        
    }
        
    public void MoveFunction(CharAtribut AtributKarakter, int targetX, int targetY){
        AtributKarakter.SetPositionXY(targetX, targetY);
    }

    public void AttackFunction(CharAtribut AtributKarakter, int targetX,int targetY){
        AttackPlayer(AtributKarakter,AtributKarakter);
    }

    public void AttackTree(int targetX, int targetY){
        Game.M.SetTerrain(Game.M.RUMPUT, targetY, targetY);
    }

    public void AttackPlayer(CharAtribut AtributKarakter, CharAtribut AtributTarget){
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
        ReceiveAttack(AtributTarget, damage);
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
            enable=false;
        }
    }

    public void SpecialFunction(CharAtribut AtributKarakter,int targetX,int targetY,int SpecialID){
        Special KarakterSpecial;
        switch(SpecialID){
            case ConstantaSp.SP_KNIGHT_BLOOD_CLOTING_ID : {
                KarakterSpecial = new Sp_BloodCloting();
            }
            break;
            case ConstantaSp.SP_HEALER_HEALING_PRAY_ID : {
                KarakterSpecial = new Sp_HealingPray();
            }
            break;
            case ConstantaSp.SP_ARCHER_STRIKE_SHOT_ID : {
                KarakterSpecial = new Sp_StrikeShot();
            }
            break;
            default : {
                KarakterSpecial = new Sp_StrikeShot();
            }
            break;
        }
        
        KarakterSpecial.ExecuteSpecial(AtributKarakter, targetX, targetY);
    }

    public void EmergencyFunction(){
        
    }

    public void WaitFunction(){
        
    }
}
