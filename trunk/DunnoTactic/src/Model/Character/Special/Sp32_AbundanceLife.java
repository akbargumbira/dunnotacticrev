/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Special;
import Model.Character.CharAtribut;
import Model.Character.Constanta;
import java.util.Vector;
/**
 *
 * @author ifan
 */
public class Sp32_AbundanceLife extends Special {
    public Sp32_AbundanceLife(){
        SpecialName="AbundanceLife";
        SpecialID=ConstantaSp.SP_DEFENDER_ABUNDANCE_LIFE_ID;
        SPCost =120;
        BaseAcc=100;
        RangeSpecial = 4;
        AreaType = false;
        TargetEnemy = false;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            int heal=((KarakterAtribut.GetDefault(Constanta.HP_ID)*5)/100)*3;
            int HPcaster = KarakterAtribut.GetCurrent(Constanta.HP_ID)-heal;
            int HPtarget = temp.GetCurrent(Constanta.HP_ID)+heal;
            if(HPcaster<=0){
                KarakterAtribut.SetCurrentAtribut(Constanta.HP_ID, 0);
            } else {
                KarakterAtribut.SetCurrentAtribut(Constanta.HP_ID, HPcaster);
            }
            if(HPtarget>temp.GetDefault(Constanta.HP_ID)){
                temp.SetCurrentAtribut(Constanta.HP_ID, temp.GetDefault(Constanta.HP_ID));
            } else {
                temp.SetCurrentAtribut(Constanta.HP_ID, HPtarget);
            }
        }
    }
}
