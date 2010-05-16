/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

import java.io.Serializable;

/**
 *
 * @author user
 */

abstract public class Building implements Serializable
{
    public static final String BUILDING_S = "building";
    public static final String BARRACK_S = "barrack";
    public static final String CASTLE_S = "castle";
    public static final String BLACKSMITH_S = "blacksmith";

    public static final int NUMBER_BUILDING_ATRIBUT = 9;
    public static final int BUILDING_ID_IDX = 0;
    public static final int BUILDING_PLAYER_IDX = 1;
    public static final int BUILDING_HP_IDX = 2;
    public static final int BUILDING_DEFENSE_IDX = 3;
    public static final int BUILDING_GOLD_PER_TURN_IDX = 4;
    public static final int BUILDING_BUILD_TIME_IDX = 5;
    public static final int BUILDING_LEVEL_IDX =6;
    public static final int BUILDING_X_IDX =7;
    public static final int BUILDING_Y_IDX =8;
    public static final int BLACKSMITH_COST = 20000;
    public static final int BARRACK_NOVICE_COST = 7500;
    public static final int BARRACK_JOB_COST = 9000;
    protected static int BUILDING_NEXT_ID = 1;

    protected int[] Building_BaseAtribut = new int[NUMBER_BUILDING_ATRIBUT];

    public Building(int player, int x, int y)
    {
        Building_BaseAtribut[BUILDING_ID_IDX] = BUILDING_NEXT_ID++;
        Building_BaseAtribut[BUILDING_PLAYER_IDX] = player;
        Building_BaseAtribut[BUILDING_X_IDX] = x;
        Building_BaseAtribut[BUILDING_Y_IDX] = y;
    }

    /**
     * @return the Building_BaseAtribut
     */
    public int getBuilding_BaseAtribut(int AtribBuildingID)
    {
        return Building_BaseAtribut[AtribBuildingID];
    }
    
    /**
     *
     * @param Building_BaseAtribut the Building_BaseAtribut to set
     */
    public void setBuilding_BaseAtribut(int[] Building_BaseAtribut)
    {
        this.Building_BaseAtribut = Building_BaseAtribut;
    }

    public void DecreaseBuildingBuildTime()
    {
        Building_BaseAtribut[BUILDING_BUILD_TIME_IDX] = Building_BaseAtribut[BUILDING_BUILD_TIME_IDX]-1;
    }

    // Masa membangun udah selesai, bangunan sempurna
    abstract public void PerfectBuilding();

    public void getDamage(int Damage)
    {
        int DamageReceive;
        DamageReceive = Damage-Building_BaseAtribut[BUILDING_DEFENSE_IDX];
        if (DamageReceive>0)
        {
            Building_BaseAtribut[BUILDING_HP_IDX] = Building_BaseAtribut[BUILDING_HP_IDX]-DamageReceive;
        }
        else
        {
            Building_BaseAtribut[BUILDING_HP_IDX] = Building_BaseAtribut[BUILDING_HP_IDX]-1;
        }
    }

    public boolean IsBuildingDestroyed()
    {
        return Building_BaseAtribut[BUILDING_HP_IDX]<=0;
    }

    public void UpgradeBuilding()
    {
       if (Building_BaseAtribut[BUILDING_LEVEL_IDX]==1)
       {
           for (int i=0; i<NUMBER_BUILDING_ATRIBUT-1;++i)
           {
               Building_BaseAtribut[i]=(Building_BaseAtribut[i] + (int) Math.floor(0.1 * Building_BaseAtribut[i]));
           }
           Building_BaseAtribut[BUILDING_LEVEL_IDX]=2;
       }
       else if (Building_BaseAtribut[BUILDING_LEVEL_IDX]==2)
       {
           for (int i=0; i<NUMBER_BUILDING_ATRIBUT-1;++i)
           {
               Building_BaseAtribut[i]=(Building_BaseAtribut[i] + (int) Math.floor(0.3 * Building_BaseAtribut[i]));
           }
           Building_BaseAtribut[BUILDING_LEVEL_IDX]=3;
       }
       else if (Building_BaseAtribut[BUILDING_LEVEL_IDX]==3)
       {
           for (int i=0; i<NUMBER_BUILDING_ATRIBUT-1;++i)
           {
               Building_BaseAtribut[i]=(Building_BaseAtribut[i] + (int) Math.floor(0.3 * Building_BaseAtribut[i]));
           }
           Building_BaseAtribut[BUILDING_LEVEL_IDX]=4;
       }
    }

    @Override
    public String toString() {
        String s = new String();
        s+="ID : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_ID_IDX]);
        s+="\n";

        s+="Player : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_PLAYER_IDX]);
        s+="\n";

        s+="HP : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_HP_IDX]);
        s+="\n";

        s+="Defense : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_DEFENSE_IDX]);
        s+="\n";

        s+="Gold : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_GOLD_PER_TURN_IDX]);
        s+="\n";

        s+="Building Time : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_BUILD_TIME_IDX]);
        s+="\n";

        s+="Level : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_LEVEL_IDX]);
        s+="\n";

        s+="X : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_X_IDX]);
        s+="\n";

        s+="Y : ";
        s+=Integer.toString(Building_BaseAtribut[BUILDING_Y_IDX]);
        s+="\n";

        return s;
        //return super.toString();
    }
}
