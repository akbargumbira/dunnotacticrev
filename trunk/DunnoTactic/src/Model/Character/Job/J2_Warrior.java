/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Job;

import Model.Character.Constanta;
import Model.Character.Special.ConstantaSp;

/**
 *
 * @author ifan
 */
public class J2_Warrior extends Job {
    public J2_Warrior(){
        FactorJob[Constanta.HP_ID]=0;
        FactorJob[Constanta.SP_ID]=0;
        FactorJob[Constanta.ATTACK_ID]=0;
        FactorJob[Constanta.MATTACK_ID]=0;
        FactorJob[Constanta.DEF_ID]=0;
        FactorJob[Constanta.MDEF_ID]=0;
        FactorJob[Constanta.ACC_ID]=0;
        FactorJob[Constanta.EVA_ID]=0;
        FactorJob[Constanta.RANGE_MOVE_ID]=0;
        FactorJob[Constanta.RANGE_ATTACK_ID]=0;

        JobID=Constanta.JOB_WARRIOR_ID;
        JobClass=2;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_WARRIOR_CRITICAL_SLASH_ID;
        SpecialAvail[1]=0;
        SpecialAvail[2]=0;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;
    }
}
