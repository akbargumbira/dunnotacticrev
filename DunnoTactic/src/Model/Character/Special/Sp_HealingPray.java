/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Special;
import Model.Character.CharAtribut;
import Model.Character.Constanta;
import java.util.Random;
import java.util.Vector;
/**
 *
 * @author ifan
 */
public class Sp_HealingPray extends Special {
    public Sp_HealingPray(){
        SpecialName="Healing Pray";
        SpecialID=ConstantaSp.SP_HEALER_HEALING_PRAY_ID;
        SPCost = 30;
        BaseAcc=100;
        RangeSpecial = 5;
    }
    
    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        Random r = new Random();
        int randFactor = (90+r.nextInt(21));
        CharAtribut temp = new CharAtribut();
        temp = TargetAtribut.get(0);
        int heal=(int)((double)KarakterAtribut.GetCurrent(Constanta.MATTACK_ID)*2.0*(double)randFactor)/100;
        int HP = temp.GetCurrent(Constanta.HP_ID)+heal;
        if(HP>temp.GetDefault(Constanta.HP_ID)){
            temp.SetCurrentAtribut(Constanta.HP_ID, temp.GetDefault(Constanta.HP_ID));
        } else {
            temp.SetCurrentAtribut(Constanta.HP_ID, HP);
        }
    }
}
