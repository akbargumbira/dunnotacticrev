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
public class Sp32_SwordReflect extends Special {
    public Sp32_SwordReflect(){
        SpecialName="Sword Reflect";
        SpecialID=ConstantaSp.SP_PALADIN_SWORD_REFLECT_ID;
        SPCost = 30;
        BaseAcc=90;
        RangeSpecial = 100;
        AreaType = false;
        TargetEnemy = false;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        
    }
}
