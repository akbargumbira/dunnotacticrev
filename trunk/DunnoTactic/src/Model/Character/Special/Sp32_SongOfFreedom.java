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
public class Sp32_SongOfFreedom extends Special {
    public Sp32_SongOfFreedom(){
        SpecialName="Song of Freedom";
        SpecialID=ConstantaSp.SP_BARD_SONG_OF_FREEDOM_ID;
        SPCost = 30;
        BaseAcc=100;
        RangeSpecial = 7;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);
        CharAtribut temp = new CharAtribut();
        for(int i=0;i<TargetAtribut.size();++i){
            temp = TargetAtribut.get(i);
            temp.SetBuff(Constanta.BUFF_STATUS_HOLY_GUARD_ID);
            temp.SetBuff(Constanta.BUFF_STATUS_ANGEL_BLESS_ID);
        }
    }
}
