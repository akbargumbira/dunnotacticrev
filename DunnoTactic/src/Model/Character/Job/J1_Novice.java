/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Job;

import Model.Character.Constanta;

/**
 *
 * @author ifan
 */
public class J1_Novice extends Job {
    public J1_Novice(){
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

        JobID=Constanta.JOB1_NOVICE_ID;
        JobClass=1;
        AttackType=Constanta.ATTACK_MATT_TYPE_ID;
        SpecialAvail[0]=0;
        SpecialAvail[1]=0;
        SpecialAvail[2]=0;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;

        NextJob.removeAllElements();
        NextJob.add(Constanta.JOB2_KNIGHT_ID);
        NextJob.add(Constanta.JOB2_WARRIOR_ID);
        NextJob.add(Constanta.JOB2_ARCHER_ID);
        NextJob.add(Constanta.JOB2_MAGE_ID);
        NextJob.add(Constanta.JOB2_HEALER_ID);
        NextJob.add(Constanta.JOB2_NINJA_ID);
    }
}
