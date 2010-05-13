/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */
public class Castle extends Building
{
    public Castle()
    {
      Building_BaseAtribut[Building_Constanta.BUILDING_HP_ID] = 5000;
      Building_BaseAtribut[Building_Constanta.BUILDING_DEFENSE_ID] = 500;
      Building_BaseAtribut[Building_Constanta.BUILDING_BUILD_TIME_ID] = 0;
      Building_BaseAtribut[Building_Constanta.BUILDING_GOLD_PER_TURN_ID] = 10;
    }
}
