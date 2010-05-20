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
        BaseAtribut[Constanta.HP_ID]=2700;
        BaseAtribut[Constanta.SP_ID]=200;
        BaseAtribut[Constanta.ATTACK_ID]=450;
        BaseAtribut[Constanta.MATTACK_ID]=380;
        BaseAtribut[Constanta.DEF_ID]=250;
        BaseAtribut[Constanta.MDEF_ID]=200;
        BaseAtribut[Constanta.ACC_ID]=180;
        BaseAtribut[Constanta.EVA_ID]=130;
        BaseAtribut[Constanta.RANGE_MOVE_ID]=4;
        BaseAtribut[Constanta.RANGE_ATTACK_ID]=1;

        FactorBuilding[0]=0.2;
        FactorBuilding[1]=0.25;
        
        RaceID=Constanta.RACE_HUMAN_ID;
        RaceLevel=1;
    }
}
