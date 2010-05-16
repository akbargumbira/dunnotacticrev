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
public class J2_Knight extends Job {
    public J2_Knight(){
        FactorJob[Constanta.HP_ID]=0.5;
        FactorJob[Constanta.SP_ID]=-0.1;
        FactorJob[Constanta.ATTACK_ID]=0;
        FactorJob[Constanta.MATTACK_ID]=0;
        FactorJob[Constanta.DEF_ID]=0;
        FactorJob[Constanta.MDEF_ID]=0;
        FactorJob[Constanta.ACC_ID]=0;
        FactorJob[Constanta.EVA_ID]=0;
        FactorJob[Constanta.RANGE_MOVE_ID]=0;
        FactorJob[Constanta.RANGE_ATTACK_ID]=0;

        JobID=Constanta.JOB2_KNIGHT_ID;
        JobClass=2;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_KNIGHT_BLOOD_CLOTING_ID;
        SpecialAvail[1]=0;
        SpecialAvail[2]=0;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;
    }
}
