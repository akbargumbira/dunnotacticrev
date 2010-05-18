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
public class J31_Ranger extends Job {
    public J31_Ranger(){
        FactorJob[Constanta.HP_ID]=0.1;
        FactorJob[Constanta.SP_ID]=-0.1;
        FactorJob[Constanta.ATTACK_ID]=0.2;
        FactorJob[Constanta.MATTACK_ID]=-0.2;
        FactorJob[Constanta.DEF_ID]=-0.1;
        FactorJob[Constanta.MDEF_ID]=-0.2;
        FactorJob[Constanta.ACC_ID]=0.3;
        FactorJob[Constanta.EVA_ID]=0.3;
        FactorJob[Constanta.RANGE_MOVE_ID]=0.2;
        FactorJob[Constanta.RANGE_ATTACK_ID]=0.15;

        JobID=Constanta.JOB31_RANGER_ID;
        JobClass=3;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_ARCHER_STRIKE_SHOT_ID;
        SpecialAvail[1]=ConstantaSp.SP_RANGER_FOCUS_SIGHT_ID;
        SpecialAvail[2]=ConstantaSp.SP_RANGER_DOUBLE_STRIKE_ID;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;
    }
}
