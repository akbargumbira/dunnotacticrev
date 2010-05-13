/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Special;
import Model.Character.CharAtribut;
import Model.Character.Constanta;

/**
 *
 * @author ifan
 */
public class Sp_BloodCloting extends Special {
    public Sp_BloodCloting(){
        SpecialName="Blood Cloting";
        SpecialID=ConstantaSp.SP_KNIGHT_BLOOD_CLOTING_ID;
        SPCost = 30;
        RangeSpecial = 0;
    }
    
    public void ExecuteSpecial(CharAtribut AtributKarakter, int targetX, int targetY){
        CharAtribut TargetAtribut;
        int SP = AtributKarakter.GetCurrent(Constanta.SP_ID)-SPCost;
        AtributKarakter.SetCurrentAtribut(Constanta.SP_ID, SP);

        AtributKarakter.SetBuff(Constanta.BUFF_STATUS_BLOOD_CLOTING_ID);
    }
}
