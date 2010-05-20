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
    private double RaceFactorGold;
    
    public Castle(int player, int x, int y, double GoldPerTurnRaceFactor)
    {
        super(player,x,y);
        RaceFactorGold = GoldPerTurnRaceFactor;
        Building_BaseAtribut[BUILDING_HP_IDX] = 50000;
        Building_BaseAtribut[BUILDING_DEFENSE_IDX] = 600;
        Building_BaseAtribut[BUILDING_BUILD_TIME_IDX] = 0;
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_IDX] = 0;
        Building_BaseAtribut[BUILDING_LEVEL_IDX] = 1;
        PerfectBuilding();
    }

    public void PerfectBuilding()
    {
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_IDX] = (int)Math.ceil(RaceFactorGold*500);
        Building_BaseAtribut[BUILDING_BUILD_TIME_IDX] = -1;
    }

    @Override
    public String toString() {
        String s = new String("Castle :\n");
        return s+super.toString();
    }


    public void SetCostBuilding()
    {
        this.BuildingCost = 0;
    }

    
}
