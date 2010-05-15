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
public class Sp2_PhoenixTear extends Special {
    public Sp2_PhoenixTear(){
        SpecialName="Tear Phoenix";
        SpecialID=ConstantaSp.SP_BISHOP_PHOENIX_TEAR_ID;
        SPCost = 30;
        BaseAcc=100;
        RangeSpecial = 11;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        for(int i=0;i<TargetAtribut.size();++i){
            CharAtribut temp = new CharAtribut();
            temp = TargetAtribut.get(i);
            temp.ClearAllBuff();
        }
    }
}
