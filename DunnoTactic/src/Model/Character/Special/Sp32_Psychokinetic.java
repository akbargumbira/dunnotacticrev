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
public class Sp32_Psychokinetic extends Special {
    public Sp32_Psychokinetic(){
        SpecialName="Psychokinetic";
        SpecialID=ConstantaSp.SP_SAGE_PSYCHOKINETIC_ID;
        SPCost = 30;
        BaseAcc=80;
        RangeSpecial = 7;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        boolean success = false;
        Random r = new Random();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            int RandFactor = r.nextInt(100);
            if(RandFactor<70) {
                int SPReduction = temp.GetDefault(Constanta.SP_ID)/4;
                int HPReduction = SPReduction*4;
                int HP = temp.GetCurrent(Constanta.HP_ID)-HPReduction;
                SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPReduction;
                if(SP<=0){
                    temp.SetCurrentAtribut(Constanta.SP_ID, 0);
                } else {
                    temp.SetCurrentAtribut(Constanta.SP_ID, SP);
                }
                if(HP<=0){
                    temp.SetCurrentAtribut(Constanta.HP_ID, 0);
                } else {
                    temp.SetCurrentAtribut(Constanta.HP_ID, HP);
                }
                success = true;
            }
            if(success = false){
                int HPfailed = temp.GetCurrent(Constanta.HP_ID)-100;
                if(HPfailed<=0){
                    temp.SetCurrentAtribut(Constanta.HP_ID, 0);
                } else {
                    temp.SetCurrentAtribut(Constanta.HP_ID, HPfailed);
                }
            }
            success = false;
        }
    }
}
