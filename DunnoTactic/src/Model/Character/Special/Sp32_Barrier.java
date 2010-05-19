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
public class Sp32_Barrier extends Special {
    public Sp32_Barrier(){
        SpecialName="Barrier";
        SpecialID=ConstantaSp.SP_DEFENDER_BARRIER_ID;
        SPCost =110;
        BaseAcc=100;
        RangeSpecial = 2;
        AreaType = true;
        TargetEnemy = false;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);        
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            temp.SetBuff(Constanta.BUFF_STATUS_HOLY_BARRIER_ID);
        }
        
    }
}
