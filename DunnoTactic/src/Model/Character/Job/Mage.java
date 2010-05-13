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
public class Mage extends Job {
    public Mage(){
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

        JobID=Constanta.JOB_MAGE_ID;
        JobClass=2;
        AttackType=Constanta.ATTACK_MATT_TYPE_ID;
    }
}
