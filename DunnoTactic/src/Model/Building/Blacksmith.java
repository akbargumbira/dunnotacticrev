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

    private double RaceFactorGold;
    public Blacksmith(int player, int x, int y, double BuildTimeRaceFactor, double GoldPerTurnRaceFactor)
    {
        super(player,x,y);
        RaceFactorGold = GoldPerTurnRaceFactor;
        Building_BaseAtribut[BUILDING_HP_IDX] = 20000;
        Building_BaseAtribut[BUILDING_DEFENSE_IDX] = 200;
        Building_BaseAtribut[BUILDING_BUILD_TIME_IDX] = (int)Math.ceil(BuildTimeRaceFactor*10);
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_IDX] = 0; //pas baru ngebuild ini di 0 in harusnya
        Building_BaseAtribut[BUILDING_LEVEL_IDX]=1;
    }

    public void PerfectBuilding()
    {
        Building_BaseAtribut[BUILDING_HP_IDX]=2*Building_BaseAtribut[BUILDING_HP_IDX];
        Building_BaseAtribut[BUILDING_DEFENSE_IDX] = 2*Building_BaseAtribut[BUILDING_DEFENSE_IDX];
        Building_BaseAtribut[BUILDING_GOLD_PER_TURN_IDX]=(int)Math.ceil(RaceFactorGold*200);
        Building_BaseAtribut[BUILDING_BUILD_TIME_IDX] = -1;
    }

    public void SetCostBuilding()
    {
        this.BuildingCost = BLACKSMITH_COST;
    }

    @Override
    public String toString() {
        return "BlackSmith:\n"+super.toString();
    }
}