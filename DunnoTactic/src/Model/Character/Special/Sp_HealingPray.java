/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Special;
import Model.Character.CharAtribut;
import Model.Character.Constanta;
import java.util.Random;
/**
 *
 * @author ifan
 */
public class Sp_HealingPray extends Special {
    public Sp_HealingPray(){
        SetSpecialName();
        SetSpecialID();
        SetSPCost();
        SetRangeSpecial();
    }

    public void SetSpecialName(){
        SpecialName="Healing Pray";
    }
    public void SetSpecialID(){
        SpecialID=ConstantaSp.SP_HEALER_HEALING_PRAY_ID;
    }
    public void SetSPCost(){
        SPCost = 30;
    }
    public void SetRangeSpecial(){
        RangeSpecial = 5;
    }
    public void ExecuteSpecial(CharAtribut AtributKarakter, int targetX, int targetY){
        CharAtribut TargetAtribut;
        int SP = AtributKarakter.GetCurrent(Constanta.SP_ID)-SPCost;
        AtributKarakter.SetCurrentAtribut(Constanta.SP_ID, SP);

        Random r = new Random();
        int randFactor = (90+r.nextInt(21));
        TargetAtribut = AtributKarakter;
        int heal=(int)((double)AtributKarakter.GetCurrent(Constanta.MATTACK_ID)*2.0*(double)randFactor)/100;
        int HP = TargetAtribut.GetCurrent(Constanta.HP_ID)+heal;
        if(HP>TargetAtribut.GetDefault(Constanta.HP_ID)){
            TargetAtribut.SetCurrentAtribut(Constanta.HP_ID, TargetAtribut.GetDefault(Constanta.HP_ID));
        } else {
            TargetAtribut.SetCurrentAtribut(Constanta.HP_ID, HP);
        }
    }
}
