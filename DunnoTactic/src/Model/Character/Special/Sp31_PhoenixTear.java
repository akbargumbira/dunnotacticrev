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
public class Sp31_PhoenixTear extends Special {
    public Sp31_PhoenixTear(){
        SpecialName="Tear Phoenix";
        SpecialID=ConstantaSp.SP_BISHOP_PHOENIX_TEAR_ID;
        SPCost = 90;
        BaseAcc=100;
        RangeSpecial = 5;
        AreaType = false;
        TargetEnemy = false;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            temp.ClearAllBuff();
        }
    }
}
