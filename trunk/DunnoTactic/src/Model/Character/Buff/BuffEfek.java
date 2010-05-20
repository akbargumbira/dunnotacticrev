/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Buff;

import Model.Character.Constanta;
import java.io.Serializable;

/**
 *
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class BuffEfek implements Serializable{
    protected double[] FactorBuff = new double[Constanta.NUMBER_ATRIBUT];
    protected boolean[] StatusActionBuff = new boolean[3];
    protected int DurationBuff;

    public BuffEfek(){
        for (int i = 0;i<10;++i) {
            FactorBuff[i]=0;
        }
    }

    public double GetFactorBuff(int BuffID){
        return FactorBuff[BuffID];
    }

    public boolean GetStatusActionBuff(int StatusActionID) {
        return StatusActionBuff[StatusActionID];
    }

    public int GetDurationBuff(){
        return DurationBuff;
    }

    
}
