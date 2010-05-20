/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Job;

import Model.Character.Constanta;
import Model.Character.Special.ConstantaSp;

/**
 *
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class J2_Ninja extends Job {
    public J2_Ninja(){
        FactorJob[Constanta.HP_ID]=0.15;
        FactorJob[Constanta.SP_ID]=0.1;
        FactorJob[Constanta.ATTACK_ID]=0.1;
        FactorJob[Constanta.MATTACK_ID]=-0.1;
        FactorJob[Constanta.DEF_ID]=-0.2;
        FactorJob[Constanta.MDEF_ID]=-0.1;
        FactorJob[Constanta.ACC_ID]=0.3;
        FactorJob[Constanta.EVA_ID]=0.4;
        FactorJob[Constanta.RANGE_MOVE_ID]=0.5;
        FactorJob[Constanta.RANGE_ATTACK_ID]=2;

        JobID=Constanta.JOB2_NINJA_ID;
        JobClass=2;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_NINJA_THROW_KUNAI_ID;
        SpecialAvail[1]=0;
        SpecialAvail[2]=0;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;

        NextJob.removeAllElements();
        NextJob.add(Constanta.JOB31_ASSASSIN_ID);
        NextJob.add(Constanta.JOB32_DARK_STALKER_ID);
    }
}
