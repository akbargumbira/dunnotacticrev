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
abstract public class Race {
    protected  int RaceID;
    protected  int[] BaseAtribut = new int[Constanta.NUMBER_ATRIBUT];

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

    abstract public void SetBaseAtributRace();
    abstract public void SetRaceID();
}
