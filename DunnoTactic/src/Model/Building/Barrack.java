/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */
public class Barrack extends Building
{
    public static final int COST =100;
    public Barrack(int player, int x, int y)
    {
        super(player,x,y);
        Building_BaseAtribut[BUILDING_HP_IDX] = 20000;
        Building_BaseAtribut[BUILDING_DEFENSE_IDX] = 100;
        Building_BaseAtribut[BUILDING_BUILD_TIME_IDX] = 1;
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_IDX] = 0;
        Building_BaseAtribut[BUILDING_LEVEL_IDX]=1;
    }

    public void PerfectBuilding()
    {
        Building_BaseAtribut[BUILDING_HP_IDX]=2*Building_BaseAtribut[BUILDING_HP_IDX];
        Building_BaseAtribut[BUILDING_DEFENSE_IDX] = 2*Building_BaseAtribut[BUILDING_DEFENSE_IDX];
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_IDX]=200;
        Building_BaseAtribut[BUILDING_BUILD_TIME_IDX] = -1;
    }

    @Override
    public String toString() {
        return "Barrack :\n"+super.toString();
    }


}
