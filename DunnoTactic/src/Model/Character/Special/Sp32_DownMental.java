
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Special;
import Model.Character.CharAtribut;
import Model.Character.Constanta;
import java.util.Vector;
import java.util.Random;
/**
 *
 * @author ifan
 */
public class Sp32_DownMental extends Special {
    public Sp32_DownMental(){
        SpecialName="Down Mental";
        SpecialID=ConstantaSp.SP_BARD_DOWN_MENTAL_ID;
        SPCost = 30;
        BaseAcc=100;
        RangeSpecial = 7;
        AreaType = true;
        TargetEnemy = true;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);

            Random r = new Random();
            int RandFactor = r.nextInt(100);
            if(RandFactor<85){
                temp.SetBuff(Constanta.BUFF_STATUS_DOWN_MENTAL_ID);
            }
        }
    }
}
