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
public class Human extends Race {
    public Human(){
        BaseAtribut[Constanta.HP_ID]=800;
        BaseAtribut[Constanta.SP_ID]=100;
        BaseAtribut[Constanta.ATTACK_ID]=300;
        BaseAtribut[Constanta.MATTACK_ID]=200;
        BaseAtribut[Constanta.DEF_ID]=100;
        BaseAtribut[Constanta.MDEF_ID]=100;
        BaseAtribut[Constanta.ACC_ID]=100;
        BaseAtribut[Constanta.EVA_ID]=100;
        BaseAtribut[Constanta.RANGE_MOVE_ID]=100;
        BaseAtribut[Constanta.RANGE_ATTACK_ID]=100;

        RaceID=Constanta.RACE_HUMAN_ID;
    }
}
