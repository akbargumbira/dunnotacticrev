/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Race;

import Model.Character.Constanta;

/**
 *
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class Fairy extends Race {
    public Fairy(){
        BaseAtribut[Constanta.HP_ID]=2200;
        BaseAtribut[Constanta.SP_ID]=300;
        BaseAtribut[Constanta.ATTACK_ID]=350;
        BaseAtribut[Constanta.MATTACK_ID]=500;
        BaseAtribut[Constanta.DEF_ID]=200;
        BaseAtribut[Constanta.MDEF_ID]=260;
        BaseAtribut[Constanta.ACC_ID]=210;
        BaseAtribut[Constanta.EVA_ID]=160;
        BaseAtribut[Constanta.RANGE_MOVE_ID]=6;
        BaseAtribut[Constanta.RANGE_ATTACK_ID]=1;

        FactorBuilding[0]=0.3;
        FactorBuilding[1]=0.3;
        
        RaceID=Constanta.RACE_FAIRY_ID;
        RaceLevel=1;
    }
}
