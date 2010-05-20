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
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class Sp32_TimeWarp extends Special {
    public Sp32_TimeWarp(){
        SpecialName="Time Warp";
        SpecialID=ConstantaSp.SP_TIME_MAGE_TIME_WARP_ID;
        SPCost = 80;
        BaseAcc=100;
        RangeSpecial = 3;
        AreaType = false;
        TargetEnemy = true;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            temp.SetBuff(Constanta.BUFF_STATUS_FLEETING_TIME_ID);
        }
    }
}
