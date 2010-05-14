/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

import java.util.logging.Level;

/**
 *
 * @author user
 */
public class Castle extends Building
{
    public Castle()
    {
      Building_BaseAtribut[BUILDING_HP_ID] = 50000;
      Building_BaseAtribut[BUILDING_DEFENSE_ID] = 600;
      Building_BaseAtribut[BUILDING_BUILD_TIME_ID] = 0;
      Building_BaseAtribut[BUILDING_GOLD_PER_TURN_ID] = 300;
      Building_BaseAtribut[BUILDING_LEVEL_ID] = 1;
    }

    public void PerfectBuilding()
    {
        Building_BaseAtribut[BUILDING_BUILD_TIME_ID] = -1;
    }
}
