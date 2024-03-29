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
public class J31_ArchKnight extends Job {
    public J31_ArchKnight(){
        FactorJob[Constanta.HP_ID]=0.2;
        FactorJob[Constanta.SP_ID]=-0.25;
        FactorJob[Constanta.ATTACK_ID]=0.25;
        FactorJob[Constanta.MATTACK_ID]=-0.2;
        FactorJob[Constanta.DEF_ID]=0.2;
        FactorJob[Constanta.MDEF_ID]=-0.2;
        FactorJob[Constanta.ACC_ID]=0.2;
        FactorJob[Constanta.EVA_ID]=0.1;
        FactorJob[Constanta.RANGE_MOVE_ID]=0;
        FactorJob[Constanta.RANGE_ATTACK_ID]=0;

        JobID=Constanta.JOB31_ARCH_KNIGHT_ID;
        JobClass=3;
        AttackType=Constanta.ATTACK_ATT_TYPE_ID;
        SpecialAvail[0]=ConstantaSp.SP_KNIGHT_BLOOD_CLOTING_ID;
        SpecialAvail[1]=ConstantaSp.SP_ARCH_KNIGHT_SWORD_FURY_ID;
        SpecialAvail[2]=ConstantaSp.SP_ARCH_KNIGHT_SHOCKWAVE_ID;
        SpecialAvail[3]=0;
        SpecialAvail[4]=0;

        NextJob.removeAllElements();
    }
}
