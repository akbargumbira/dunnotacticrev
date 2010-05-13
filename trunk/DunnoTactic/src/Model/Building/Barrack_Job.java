/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */
public class Barrack_Job extends Building
{
   public Barrack_Job()
   {
       Building_BaseAtribut[Building_Constanta.BUILDING_HP_ID] = 4000;
       Building_BaseAtribut[Building_Constanta.BUILDING_DEFENSE_ID] = 200;
       Building_BaseAtribut[Building_Constanta.BUILDING_BUILD_TIME_ID] = 2;
       Building_BaseAtribut[Building_Constanta.BUILDING_GOLD_PER_TURN_ID] = 50;
   }

}
