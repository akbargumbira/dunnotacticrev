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
   public static final int COST =100;
   public Barrack_Job()
   {
       Building_BaseAtribut[BUILDING_HP_ID] = 25000;
       Building_BaseAtribut[BUILDING_DEFENSE_ID] = 200;
       Building_BaseAtribut[BUILDING_BUILD_TIME_ID] = 2;
       Building_BaseAtribut[BUILDING_GOLD_PER_TURN_ID] = 0;
       Building_BaseAtribut[BUILDING_LEVEL_ID]=1;
   }

    public void PerfectBuilding()
    {
        Building_BaseAtribut[BUILDING_HP_ID]=2*Building_BaseAtribut[BUILDING_HP_ID];
        Building_BaseAtribut[BUILDING_DEFENSE_ID] = 2*Building_BaseAtribut[BUILDING_DEFENSE_ID];
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_ID]=400;
        Building_BaseAtribut[BUILDING_BUILD_TIME_ID] = -1; // Agar pas tiap endturn dan ngecek tiap bangunan BUILD_TIME = 0 gak manggil method ini lagi bangunan yang dah manggil method ini
    }
}
