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
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class Sp31_VenomSmoke extends Special {
    public Sp31_VenomSmoke(){
        SpecialName="Venom Smoke";
        SpecialID=ConstantaSp.SP_ASSASSIN_VENOM_SMOKE_ID;
        SPCost =90;
        BaseAcc=90;
        RangeSpecial = 4;
        AreaType = true;
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
                int damage=(int)((double)(KarakterAtribut.GetCurrent(Constanta.ATTACK_ID)-temp.GetCurrent(Constanta.DEF_ID))*2*(double)randFactor)/100;
                int HP = temp.GetCurrent(Constanta.HP_ID)-damage;
                if(HP<=0){
                    temp.SetCurrentAtribut(Constanta.HP_ID, 0);
                } else {
                    temp.SetCurrentAtribut(Constanta.HP_ID, HP);
                }
                randFactor = r.nextInt(100);
                if(randFactor<90){
                    temp.SetBuff(Constanta.BUFF_STATUS_POISON_ID);
                }
            }
        }
    }
}
