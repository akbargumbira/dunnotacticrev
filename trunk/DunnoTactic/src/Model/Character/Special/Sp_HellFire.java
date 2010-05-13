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
public class Sp_HellFire extends Special {
    public Sp_HellFire(){
        SpecialName="Hell Fire";
        SpecialID=ConstantaSp.SP_MAGE_HELL_FIRE_ID;
        SPCost = 30;
        RangeSpecial = 5;
    }

    public void ExecuteSpecial(CharAtribut AtributKarakter, int targetX, int targetY){
        CharAtribut TargetAtribut;
        int SP = AtributKarakter.GetCurrent(Constanta.SP_ID)-SPCost;
        AtributKarakter.SetCurrentAtribut(Constanta.SP_ID, SP);

        Random r = new Random();
        int randFactor = (90+r.nextInt(21));
        TargetAtribut = AtributKarakter;
        int damage=(int)((double)(AtributKarakter.GetCurrent(Constanta.MATTACK_ID)-TargetAtribut.GetCurrent(Constanta.MDEF_ID))*5.0*(double)randFactor)/100;
        int HP = TargetAtribut.GetCurrent(Constanta.HP_ID)-damage;
        if(HP<=0){
            TargetAtribut.SetCurrentAtribut(Constanta.HP_ID, 0);
        } else {
            TargetAtribut.SetCurrentAtribut(Constanta.HP_ID, HP);
        }
    }
}
