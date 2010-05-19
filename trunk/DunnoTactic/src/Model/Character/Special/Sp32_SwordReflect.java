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
        SPCost =130;
        BaseAcc=100;
        RangeSpecial = 3;
        AreaType = false;
        TargetEnemy = false;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            temp.SetBuff(Constanta.BUFF_STATUS_SEVEN_HEAVEN_ID);
        }
        
    }
}
