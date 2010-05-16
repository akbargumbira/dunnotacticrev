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
        SPCost = 30;
        BaseAcc=90;
        RangeSpecial = 100;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        
    }
}
