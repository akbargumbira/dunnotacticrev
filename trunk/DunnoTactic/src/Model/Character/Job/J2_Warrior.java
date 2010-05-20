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
public class J2_Warrior extends Job {
    public J2_Warrior(){
        FactorJob[Constanta.HP_ID]=0.4;
        FactorJob[Constanta.SP_ID]=-0.2;
        FactorJob[Constanta.ATTACK_ID]=0.5;
        FactorJob[Constanta.MATTACK_ID]=-0.2;
        FactorJob[Constanta.DEF_ID]=0.2;
        FactorJob[Constanta.MDEF_ID]=-0.1;
        FactorJob[Constanta.ACC_ID]=-0.1;
        FactorJob[Constanta.EVA_ID]=-0.1;
        FactorJob[Constanta.RANGE_MOVE_ID]=0;
        FactorJob[Constanta.RANGE_ATTACK_ID]=0;

        JobID=Constanta.JOB2_WARRIOR_ID;
        JobClass=2;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_WARRIOR_CRITICAL_SLASH_ID;
        SpecialAvail[1]=0;
        SpecialAvail[2]=0;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;

        NextJob.removeAllElements();
        NextJob.add(Constanta.JOB31_BLADE_MASTER_ID);
        NextJob.add(Constanta.JOB32_PALADIN_ID);
    }
}
