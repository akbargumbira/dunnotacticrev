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
public class BuffPoison extends BuffEfek {
    public BuffPoison(){
        FactorBuff[Constanta.HP_ID]=-0.5;
        FactorBuff[Constanta.SP_ID]=0;
        FactorBuff[Constanta.ATTACK_ID]=0;
        FactorBuff[Constanta.MATTACK_ID]=0;
        FactorBuff[Constanta.DEF_ID]=-0.15;
        FactorBuff[Constanta.MDEF_ID]=0;
        FactorBuff[Constanta.ACC_ID]=0;
        FactorBuff[Constanta.EVA_ID]=0;
        FactorBuff[Constanta.RANGE_MOVE_ID]=0;
        FactorBuff[Constanta.RANGE_ATTACK_ID]=0;

        StatusActionBuff[Constanta.BUFF_ACTION_DISABLE_ID]=false;
        StatusActionBuff[Constanta.BUFF_ACTION_IMMOBILIZE_ID]=false;
        StatusActionBuff[Constanta.BUFF_ACTION_SILENCE_ID]=false;

        DurationBuff=5;
    }
}
