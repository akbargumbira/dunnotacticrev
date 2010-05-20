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
public class J32_Sage extends Job {
    public J32_Sage(){
        FactorJob[Constanta.HP_ID]=0.1;
        FactorJob[Constanta.SP_ID]=0.25;
        FactorJob[Constanta.ATTACK_ID]=0;
        FactorJob[Constanta.MATTACK_ID]=0.15;
        FactorJob[Constanta.DEF_ID]=0.2;
        FactorJob[Constanta.MDEF_ID]=0.1;
        FactorJob[Constanta.ACC_ID]=0.2;
        FactorJob[Constanta.EVA_ID]=0;
        FactorJob[Constanta.RANGE_MOVE_ID]=0;
        FactorJob[Constanta.RANGE_ATTACK_ID]=0;

        JobID=Constanta.JOB32_DEFENDER_ID;
        JobClass=3;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_HEALER_HEALING_PRAY_ID;
        SpecialAvail[1]=ConstantaSp.SP_SAGE_MANA_LEAK_ID;
        SpecialAvail[2]=ConstantaSp.SP_SAGE_PSYCHOKINETIC_ID;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;
    }
}
