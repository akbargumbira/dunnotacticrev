/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Job;

import Model.Character.Constanta;

/**
 *
 * @author user
 */
public class Job {
    protected int AttackType;
    protected  int JobID;
    protected  int JobClass;
    protected  double[] FactorJob = new double[Constanta.NUMBER_ATRIBUT];
    protected int[] SpecialAvail = new int[5];

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
}
