/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Race;

import Model.Character.Constanta;
import java.io.Serializable;

/**
 *
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class Race implements Serializable{
    protected  int RaceID;
    protected  int[] BaseAtribut = new int[Constanta.NUMBER_ATRIBUT];
    protected int RaceLevel;
    protected double[] FactorBuilding = new double[2];

    public Race(){
        for (int i = 0;i<10;++i) {
            BaseAtribut[i]=0;
        }
    }

    public int GetBaseAtribut(int AtribID) {
        return BaseAtribut[AtribID];
    }

    public int GetRaceID(){
        return RaceID;
    }

    public int GetRaceLevel(){
        return RaceLevel;
    }

    public double[] GetFactorBuilding(){
        return FactorBuilding;
    }

    public static String getRaceName(int id) {
        String s = new String();
        switch (id) {
            case Constanta.RACE_HUMAN_ID : {
                s = "HUMAN";
                break;
            }

            case Constanta.RACE_ELF_ID : {
                s = "ELF";
                break;
            }

            case Constanta.RACE_FAIRY_ID : {
                s = "FAIRY";
                break;
            }
        }

        return s;
    }

    public void UpgradeRace(){
        double FactorUpgrade;
        switch(RaceLevel){
            case 1 : {
                FactorUpgrade = 0.1;
                ++RaceLevel;
            }
            break;
            case 2 : {
                FactorUpgrade = 0.25;
                ++RaceLevel;
            }
            break;
            case 3 : {
                FactorUpgrade = 0.35;
                ++RaceLevel;
            }
            break;
            default : {
                FactorUpgrade = 0;
            }
            break;
        }
        for(int i=0;i<Constanta.NUMBER_ATRIBUT;++i){
            BaseAtribut[i]=BaseAtribut[i]+(int)((double)BaseAtribut[i]*FactorUpgrade);
        }
    }

    @Override
    public String toString() {
        String s = new String();
        s += "Factor : \n";
        s += "HP : ";
        s += Integer.toString(BaseAtribut[Constanta.HP_ID]);
        s += "\n";
        s += "SP : ";
        s += Integer.toString(BaseAtribut[Constanta.SP_ID]);
        s += "\n";
        s += "Attack : ";
        s += Integer.toString(BaseAtribut[Constanta.ATTACK_ID]);
        s += "\n";
        s += "Magic Attack : ";
        s += Integer.toString(BaseAtribut[Constanta.MATTACK_ID]);
        s += "\n";
        s += "Defense : ";
        s += Integer.toString(BaseAtribut[Constanta.DEF_ID]);
        s += "\n";
        s += "Magic Defense : ";
        s += Integer.toString(BaseAtribut[Constanta.MDEF_ID]);
        s += "\n";
        s += "Accuracy : ";
        s += Integer.toString(BaseAtribut[Constanta.ACC_ID]);
        s += "\n";
        s += "Evasion : ";
        s += Integer.toString(BaseAtribut[Constanta.EVA_ID]);
        s += "\n";
        s += "Range Move : ";
        s += Integer.toString(BaseAtribut[Constanta.RANGE_MOVE_ID]);
        s += "\n";
        s += "Range Attack : ";
        s += Integer.toString(BaseAtribut[Constanta.RANGE_ATTACK_ID]);
        s += "\n";
        return s;
    }
}
