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
public class Sp_BloodCloting extends Special {
    public Sp_BloodCloting(){
        SetSpecialName();
        SetSpecialID();
        SetSPCost();
        SetRangeSpecial();
    }

    public void SetSpecialName(){
        SpecialName="Blood Cloting";
    }
    public void SetSpecialID(){
        SpecialID=ConstantaSp.SP_KNIGHT_BLOOD_CLOTING_ID;
    }
    public void SetSPCost(){
        SPCost = 30;
    }
    public void SetRangeSpecial(){
        RangeSpecial = 0;
    }
    public void ExecuteSpecial(CharAtribut AtributKarakter, int targetX, int targetY){
        CharAtribut TargetAtribut;
        int SP = AtributKarakter.GetCurrent(Constanta.SP_ID)-SPCost;
        AtributKarakter.SetCurrentAtribut(Constanta.SP_ID, SP);

        AtributKarakter.SetBuff(Constanta.BUFF_STATUS_BLOOD_CLOTING_ID, 3);
    }
}
