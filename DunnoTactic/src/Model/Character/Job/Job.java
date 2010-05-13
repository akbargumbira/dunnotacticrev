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
abstract public class Job {
    protected int AttackType;
    protected  int JobID;
    protected  int JobClass;
    protected  double[] FactorJob = new double[Constanta.NUMBER_ATRIBUT];

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
    
    abstract public void SetFactorJobAtribute();
    abstract public void SetJobID();
    abstract public void SetJobClass();
    abstract public void SetAttackType();
}
