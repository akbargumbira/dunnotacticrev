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
public class Elf extends Race {
    public Elf(){
        BaseAtribut[Constanta.HP_ID]=2500;
        BaseAtribut[Constanta.SP_ID]=220;
        BaseAtribut[Constanta.ATTACK_ID]=380;
        BaseAtribut[Constanta.MATTACK_ID]=400;
        BaseAtribut[Constanta.DEF_ID]=210;
        BaseAtribut[Constanta.MDEF_ID]=240;
        BaseAtribut[Constanta.ACC_ID]=220;
        BaseAtribut[Constanta.EVA_ID]=180;
        BaseAtribut[Constanta.RANGE_MOVE_ID]=5;
        BaseAtribut[Constanta.RANGE_ATTACK_ID]=1;

        FactorBuilding[0]=0.2;
        FactorBuilding[1]=0.2;

        RaceID=Constanta.RACE_ELF_ID;
        RaceLevel=1;
    }
}
