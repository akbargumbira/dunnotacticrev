/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */
public class Barrack_Novice extends Building
{
    public Barrack_Novice()
    {
        Building_BaseAtribut[Building_Constanta.BUILDING_HP_ID] = 3000;
        Building_BaseAtribut[Building_Constanta.BUILDING_DEFENSE_ID] = 100;
        Building_BaseAtribut[Building_Constanta.BUILDING_BUILD_TIME_ID] = 1;
        Building_BaseAtribut[Building_Constanta.BUILDING_GOLD_PER_TURN_ID] = 30;
    }
}
