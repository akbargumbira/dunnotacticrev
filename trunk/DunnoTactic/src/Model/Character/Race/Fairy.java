/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Race;

import Model.Character.Constanta;

/**
 *
 * @author ifan
 */
public class Fairy extends Race {
    public Fairy(){
        BaseAtribut[Constanta.HP_ID]=100;
        BaseAtribut[Constanta.SP_ID]=100;
        BaseAtribut[Constanta.ATTACK_ID]=100;
        BaseAtribut[Constanta.MATTACK_ID]=100;
        BaseAtribut[Constanta.DEF_ID]=100;
        BaseAtribut[Constanta.MDEF_ID]=100;
        BaseAtribut[Constanta.ACC_ID]=100;
        BaseAtribut[Constanta.EVA_ID]=100;
        BaseAtribut[Constanta.RANGE_MOVE_ID]=100;
        BaseAtribut[Constanta.RANGE_ATTACK_ID]=100;

        RaceID=Constanta.RACE_FAIRY_ID;
        RaceLevel=1;
    }
}
