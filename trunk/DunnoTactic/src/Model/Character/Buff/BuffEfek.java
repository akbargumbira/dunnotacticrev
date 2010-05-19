/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Buff;

import Model.Character.Constanta;

/**
 *
 * @author ifan
 */
public class BuffEfek {
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

    @Override
    public String toString() {
        String s = new String();
        s += "Factor : \n";
        s += "HP : ";
        s += Double.toString(FactorBuff[Constanta.HP_ID]);
        s += "\n";
        s += "SP : ";
        s += Double.toString(FactorBuff[Constanta.SP_ID]);
        s += "\n";
        s += "Attack : ";
        s += Double.toString(FactorBuff[Constanta.ATTACK_ID]);
        s += "\n";
        s += "Magic Attack : ";
        s += Double.toString(FactorBuff[Constanta.MATTACK_ID]);
        s += "\n";
        s += "Defense : ";
        s += Double.toString(FactorBuff[Constanta.DEF_ID]);
        s += "\n";
        s += "Magic Defense : ";
        s += Double.toString(FactorBuff[Constanta.MDEF_ID]);
        s += "\n";
        s += "Accuracy : ";
        s += Double.toString(FactorBuff[Constanta.ACC_ID]);
        s += "\n";
        s += "Evasion : ";
        s += Double.toString(FactorBuff[Constanta.EVA_ID]);
        s += "\n";
        s += "Range Move : ";
        s += Double.toString(FactorBuff[Constanta.RANGE_MOVE_ID]);
        s += "\n";
        s += "Range Attack : ";
        s += Double.toString(FactorBuff[Constanta.RANGE_ATTACK_ID]);
        s += "\n";
        return s;
    }
}
