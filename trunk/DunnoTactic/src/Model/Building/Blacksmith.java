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
        Building_BaseAtribut[BUILDING_HP_ID] = 20000;
        Building_BaseAtribut[BUILDING_DEFENSE_ID] = 200;
        Building_BaseAtribut[BUILDING_BUILD_TIME_ID] = 3;
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_ID] = 0;
        Building_BaseAtribut[BUILDING_LEVEL_ID]=1;
    }

    public void PerfectBuilding()
    {
        Building_BaseAtribut[BUILDING_HP_ID]=2*Building_BaseAtribut[BUILDING_HP_ID];
        Building_BaseAtribut[BUILDING_DEFENSE_ID] = 2*Building_BaseAtribut[BUILDING_DEFENSE_ID];
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_ID]=300;
        Building_BaseAtribut[BUILDING_BUILD_TIME_ID] = -1;
    }
}