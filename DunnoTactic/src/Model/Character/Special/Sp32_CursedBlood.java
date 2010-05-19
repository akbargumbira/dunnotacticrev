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
public class Sp32_CursedBlood extends Special {
    public Sp32_CursedBlood(){
        SpecialName="Cursed Blood";
        SpecialID=ConstantaSp.SP_DARK_STALKER_CURSED_BLOOD_ID;
        SPCost =100;
        BaseAcc=80;
        RangeSpecial = 3;
        AreaType = true;
        TargetEnemy = true;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        int HPReduction = KarakterAtribut.GetDefault(Constanta.HP_ID)/10;
        int HPCaster = KarakterAtribut.GetCurrent(Constanta.HP_ID)-HPReduction;
        if(HPCaster<=0){
            KarakterAtribut.SetCurrentAtribut(Constanta.HP_ID, 0);
        } else {
            KarakterAtribut.SetCurrentAtribut(Constanta.HP_ID, HPCaster);
        }
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            int Chance = BaseAcc + (KarakterAtribut.GetCurrent(Constanta.ACC_ID) - temp.GetCurrent(Constanta.EVA_ID))/4;
            Random r = new Random();
            int randFactor = r.nextInt(100);
            if(randFactor<Chance) {
                randFactor = (90+r.nextInt(21));
                int HP = temp.GetCurrent(Constanta.HP_ID)-200;
                if(HP<=0){
                    temp.SetCurrentAtribut(Constanta.HP_ID, 0);
                } else {
                    temp.SetCurrentAtribut(Constanta.HP_ID, HP);
                }
                temp.SetBuff(Constanta.BUFF_STATUS_DISABLE_ID);
                temp.SetBuff(Constanta.BUFF_STATUS_SILENCE_ID);
            }
        }
    }
}
