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
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class Sp31_SwordMelting extends Special {
    public Sp31_SwordMelting(){
        SpecialName="Sword Melting";
        SpecialID=ConstantaSp.SP_BLADEMASTER_SWORD_MELTING_ID;
        SPCost =80;
        BaseAcc=90;
        RangeSpecial = 0;
        AreaType = false;
        TargetEnemy = false;
    }

    public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut){
        int SP = KarakterAtribut.GetCurrent(Constanta.SP_ID)-SPCost;
        KarakterAtribut.SetCurrentAtribut(Constanta.SP_ID, SP);

        KarakterAtribut.SetBuff(Constanta.BUFF_STATUS_SWORD_MELTING_ID);
    }
}
