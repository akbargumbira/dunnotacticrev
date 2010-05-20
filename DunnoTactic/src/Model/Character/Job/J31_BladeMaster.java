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
public class J31_BladeMaster extends Job {
    public J31_BladeMaster(){
        FactorJob[Constanta.HP_ID]=0.1;
        FactorJob[Constanta.SP_ID]=0.1;
        FactorJob[Constanta.ATTACK_ID]=0.4;
        FactorJob[Constanta.MATTACK_ID]=-0.25;
        FactorJob[Constanta.DEF_ID]=-0.1;
        FactorJob[Constanta.MDEF_ID]=-0.15;
        FactorJob[Constanta.ACC_ID]=0.2;
        FactorJob[Constanta.EVA_ID]=0.05;
        FactorJob[Constanta.RANGE_MOVE_ID]=0.25;
        FactorJob[Constanta.RANGE_ATTACK_ID]=0;

        JobID=Constanta.JOB31_BLADE_MASTER_ID;
        JobClass=3;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_WARRIOR_CRITICAL_SLASH_ID;
        SpecialAvail[1]=ConstantaSp.SP_BLADEMASTER_HURRICANE_SWORD_ID;
        SpecialAvail[2]=ConstantaSp.SP_BLADEMASTER_SWORD_MELTING_ID;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;

        NextJob.removeAllElements();
    }
}
