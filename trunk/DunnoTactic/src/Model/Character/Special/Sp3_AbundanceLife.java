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
public class Sp3_AbundanceLife extends Special {
    public Sp3_AbundanceLife(){
        SpecialName="Abundance Life";
        SpecialID=ConstantaSp.SP_DEFENDER_ABUNDANCE_LIFE_ID;
        SPCost = 30;
        BaseAcc=90;
        RangeSpecial = 0;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_BLOOD_CLOTING_ID);
    }
}
