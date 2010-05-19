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
public class Sp32_ManaLeak extends Special {
    public Sp32_ManaLeak(){
        SpecialName="Mana Leak";
        SpecialID=ConstantaSp.SP_SAGE_MANA_LEAK_ID;
        SPCost = 30;
        BaseAcc=60;
        RangeSpecial = 7;
        AreaType = true;
        TargetEnemy = true;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        Random r = new Random();
        boolean success = false;
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            int RandFactor = r.nextInt(100);
            if(RandFactor<60){
                temp.SetCurrentAtribut(Constanta.SP_ID, 0);
                success = true;
            }
            if(success==false){
                int damageSP = temp.GetCurrent(Constanta.SP_ID)/2;
                int SPNow = temp.GetCurrent(Constanta.SP_ID)-damageSP;
                temp.SetCurrentAtribut(Constanta.SP_ID, SPNow);
            }
            success = false;
        }
    }
}
