/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Buff;
import Model.Character.Constanta;
/**
 *
 * @author ifan
 */
public class BuffHolyGuard extends BuffEfek {
    public BuffHolyGuard(){
        FactorBuff[Constanta.HP_ID]=0;
        FactorBuff[Constanta.SP_ID]=0;
        FactorBuff[Constanta.ATTACK_ID]=0;
        FactorBuff[Constanta.MATTACK_ID]=0;
        FactorBuff[Constanta.DEF_ID]=0.3;
        FactorBuff[Constanta.MDEF_ID]=0.3;
        FactorBuff[Constanta.ACC_ID]=0;
        FactorBuff[Constanta.EVA_ID]=0;
        FactorBuff[Constanta.RANGE_MOVE_ID]=0;
        FactorBuff[Constanta.RANGE_ATTACK_ID]=0;

        StatusActionBuff[Constanta.ACTION_DISABLE_ID]=false;
        StatusActionBuff[Constanta.ACTION_IMMOBILIZE_ID]=false;
        StatusActionBuff[Constanta.ACTION_SILENCE_ID]=false;

        DurationBuff=3;
    }
}
