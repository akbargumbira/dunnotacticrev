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
public class Sp31_HalfLife extends Special {
    public Sp31_HalfLife(){
        SpecialName="Half Life";
        SpecialID=ConstantaSp.SP_ARCH_MAGE_HALF_LIFE_ID;
        SPCost =90;
        BaseAcc=75;
        RangeSpecial = 6;
        AreaType = false;
        TargetEnemy = true;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            int Chance = BaseAcc + (KarakterAtribut.GetCurrent(Constanta.ACC_ID) - temp.GetCurrent(Constanta.EVA_ID))/4;
            Random r = new Random();
            if(r.nextInt(100)<Chance) {
                int randFactor = (90+r.nextInt(21));
                int damage=temp.GetCurrent(Constanta.HP_ID)/2;
                int HP = temp.GetCurrent(Constanta.HP_ID)-damage;
                if(HP<=0){
                    temp.SetCurrentAtribut(Constanta.HP_ID, 0);
                } else {
                    temp.SetCurrentAtribut(Constanta.HP_ID, HP);
                }
            }
        }
    }
}