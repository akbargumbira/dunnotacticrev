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
public class Sp2_ShadowBind extends Special {
    public Sp2_ShadowBind(){
        SpecialName="Shadow Bind";
        SpecialID=ConstantaSp.SP_ASSASSIN_SHADOW_BIND_ID;
        SPCost = 30;
        BaseAcc=90;
        RangeSpecial = 1;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        for(int i=0;i<TargetAtribut.size();++i){
            CharAtribut temp = new CharAtribut();
            temp = TargetAtribut.get(i);
            int Chance = BaseAcc + (KarakterAtribut.GetCurrent(Constanta.ACC_ID) - temp.GetCurrent(Constanta.EVA_ID))/4;
            Random r = new Random();
            if(r.nextInt(100)<Chance) {
                int randFactor = (90+r.nextInt(21));
                int damage=(int)((double)(KarakterAtribut.GetCurrent(Constanta.ATTACK_ID)-temp.GetCurrent(Constanta.DEF_ID))*2.5*(double)randFactor)/100;
                int HP = temp.GetCurrent(Constanta.HP_ID)-damage;
                if(HP<=0){
                    temp.SetCurrentAtribut(Constanta.HP_ID, 0);
                } else {
                    temp.SetCurrentAtribut(Constanta.HP_ID, HP);
                }
                randFactor = r.nextInt(100);
                if(randFactor<30){
                    temp.SetBuff(Constanta.BUFF_STATUS_DISABLE_ID);
                    temp.SetBuff(Constanta.BUFF_STATUS_IMMOBILIZE_ID);
                } else if(randFactor<50){
                    temp.SetBuff(Constanta.BUFF_STATUS_DISABLE_ID);
                } else if(randFactor<80){
                    temp.SetBuff(Constanta.BUFF_STATUS_IMMOBILIZE_ID);
                }
            }
        }
    }
}
