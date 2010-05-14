/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Race;

import Model.Character.Constanta;

/**
 *
 * @author user
 */
public class Race {
    protected  int RaceID;
    protected  int[] BaseAtribut = new int[Constanta.NUMBER_ATRIBUT];
    protected int RaceLevel;

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

    public void UpgrageRace(){
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
}
