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
public class Sp31_FocusSight extends Special {
    public Sp31_FocusSight(){
        SpecialName="FocusSight";
        SpecialID=ConstantaSp.SP_RANGER_FOCUS_SIGHT_ID;
        SPCost = 70;
        BaseAcc=100;
        RangeSpecial = 0;
        AreaType = false;
        TargetEnemy = false;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_FOCUS_SIGHT_ID);
    }
}
