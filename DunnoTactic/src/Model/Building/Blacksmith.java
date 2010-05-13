/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */
public class Blacksmith extends Building
{
    public Blacksmith()
    {
        Building_BaseAtribut[Building_Constanta.BUILDING_HP_ID] = 2000;
        Building_BaseAtribut[Building_Constanta.BUILDING_DEFENSE_ID] = 200;
        Building_BaseAtribut[Building_Constanta.BUILDING_BUILD_TIME_ID] = 3;
        Building_BaseAtribut[Building_Constanta.BUILDING_GOLD_PER_TURN_ID] = 20;
    }
}
