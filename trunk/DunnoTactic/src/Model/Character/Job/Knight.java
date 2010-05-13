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
public class Knight extends Job {
    public Knight(){
        SetFactorJobAtribute();
        SetJobClass();
        SetJobID();
        SetAttackType();
    }

    public void SetFactorJobAtribute(){
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
    }
    public void SetJobID() {
        JobID=Constanta.JOB_KNIGHT_ID;
    }
    public void SetJobClass() {
        JobClass=2;
    }
    public void SetAttackType(){
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
    }
}
