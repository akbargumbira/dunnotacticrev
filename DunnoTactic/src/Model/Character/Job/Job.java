/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Job;

import Model.Character.Constanta;
import java.util.Vector;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class Job implements Serializable{
    protected int AttackType;
    protected  int JobID;
    protected  int JobClass;
    protected  double[] FactorJob = new double[Constanta.NUMBER_ATRIBUT];
    protected int[] SpecialAvail = new int[5];
    protected Vector<Integer> NextJob;

    public Job(){
        for (int i = 0;i<10;++i) {
            FactorJob[i]=0;
        }
    }

    public double GetFactorJob(int AtribID){
        return FactorJob[AtribID];
    }

    public int GetJobID(){
        return JobID;
    }

    public int GetJobClass(){
        return JobClass;
    }

    public int GetAttackType(){
        return AttackType;
    }

    public int GetSpecialAvail(int Indeks){
        return SpecialAvail[Indeks];
    }

    @Override
    public String toString() {
        String s = new String();
        s += "Factor : \n";
        s += "HP : ";
        s += Double.toString(FactorJob[Constanta.HP_ID]);
        s += "\n";
        s += "SP : ";
        s += Double.toString(FactorJob[Constanta.SP_ID]);
        s += "\n";
        s += "Attack : ";
        s += Double.toString(FactorJob[Constanta.ATTACK_ID]);
        s += "\n";
        s += "Magic Attack : ";
        s += Double.toString(FactorJob[Constanta.MATTACK_ID]);
        s += "\n";
        s += "Defense : ";
        s += Double.toString(FactorJob[Constanta.DEF_ID]);
        s += "\n";
        s += "Magic Defense : ";
        s += Double.toString(FactorJob[Constanta.MDEF_ID]);
        s += "\n";
        s += "Accuracy : ";
        s += Double.toString(FactorJob[Constanta.ACC_ID]);
        s += "\n";
        s += "Evasion : ";
        s += Double.toString(FactorJob[Constanta.EVA_ID]);
        s += "\n";
        s += "Range Move : ";
        s += Double.toString(FactorJob[Constanta.RANGE_MOVE_ID]);
        s += "\n";
        s += "Range Attack : ";
        s += Double.toString(FactorJob[Constanta.RANGE_ATTACK_ID]);
        s += "\n";
        return s;
    }
    public static String GetJobNameByID(int ID){
        String name = new String();
        if(ID<50){
            switch(ID){
                case Constanta.JOB1_NOVICE_ID :{
                    name = "NOVICE";
                }
                break;
                case Constanta.JOB2_KNIGHT_ID :{
                    name = "KNIGHT";
                }
                break;
                case Constanta.JOB2_WARRIOR_ID : {
                    name = "WARRIOR";
                }
                case Constanta.JOB2_ARCHER_ID :{
                    name = "ARCHER";
                }
                break;
                case Constanta.JOB2_MAGE_ID :{
                    name = "MAGE";
                }
                break;
                case Constanta.JOB2_HEALER_ID:{
                    name = "HEALER";
                }
                break;
                case Constanta.JOB2_NINJA_ID :{
                    name = "NINJA";
                }
                break;
                default:{

                }
                break;
            }
        } else if(ID<100){
            switch(ID){
                case Constanta.JOB31_ARCH_KNIGHT_ID :{
                    name = "ARCH KNIGHT";
                }
                break;
                case Constanta.JOB31_BLADE_MASTER_ID : {
                    name = "BLADE MASTER";
                }
                case Constanta.JOB31_RANGER_ID :{
                    name = "RANGER";
                }
                break;
                case Constanta.JOB31_ARCH_MAGE_ID :{
                    name = "ARCH MAGE";
                }
                break;
                case Constanta.JOB31_BISHOP_ID:{
                    name = "BISHOP";
                }
                break;
                case Constanta.JOB31_ASSASSIN_ID :{
                    name = "ASSASSIN";
                }
                break;
                default:{

                }
                break;
            }
        } else {
            switch(ID){
                case Constanta.JOB32_DEFENDER_ID :{
                    name = "DEFENDER";
                }
                break;
                case Constanta.JOB32_PALADIN_ID : {
                    name = "PALADIN";
                }
                case Constanta.JOB32_BARD_ID :{
                    name = "BARD";
                }
                break;
                case Constanta.JOB32_TIME_MAGE_ID :{
                    name = "TIME MAGE";
                }
                break;
                case Constanta.JOB32_SAGE_ID:{
                    name = "SAGE";
                }
                break;
                case Constanta.JOB32_DARK_STALKER_ID :{
                    name = "DARK STALKER";
                }
                break;
                default:{

                }
                break;
            }
        }
        return name;
    }

    public Vector<Integer> GetNextJobAvail(){
        return NextJob;
    }
}
