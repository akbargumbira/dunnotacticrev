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
public class J32_Bard extends Job {
    public J32_Bard(){
        FactorJob[Constanta.HP_ID]=0.2;
        FactorJob[Constanta.SP_ID]=0.3;
        FactorJob[Constanta.ATTACK_ID]=-0.1;
        FactorJob[Constanta.MATTACK_ID]=0.3;
        FactorJob[Constanta.DEF_ID]=0.1;
        FactorJob[Constanta.MDEF_ID]=0.2;
        FactorJob[Constanta.ACC_ID]=0;
        FactorJob[Constanta.EVA_ID]=0.2;
        FactorJob[Constanta.RANGE_MOVE_ID]=0;
        FactorJob[Constanta.RANGE_ATTACK_ID]=-0.2;

        JobID=Constanta.JOB32_DEFENDER_ID;
        JobClass=3;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_ARCHER_STRIKE_SHOT_ID;
        SpecialAvail[1]=ConstantaSp.SP_BARD_SONG_OF_FREEDOM_ID;
        SpecialAvail[2]=ConstantaSp.SP_BARD_DOWN_MENTAL_ID;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;

        NextJob.removeAllElements();
    }
}
