/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */

abstract public class Building
{
    public static final int NUMBER_BUILDING_ATRIBUT = 5;
    public static final int BUILDING_HP_ID = 0;
    public static final int BUILDING_DEFENSE_ID = 1;
    public static final int BUILDING_GOLD_PER_TURN_ID = 2;
    public static final int BUILDING_BUILD_TIME_ID = 3;
    public static final int BUILDING_LEVEL_ID =4;
    public static final int BLACKSMITH_COST = 20000;
    public static final int BARRACK_NOVICE_COST = 7500;
    public static final int BARRACK_JOB_COST = 9000;

    protected  int[] Building_BaseAtribut = new int[NUMBER_BUILDING_ATRIBUT];

    public Building()
    {
    
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
        Building_BaseAtribut[BUILDING_BUILD_TIME_ID] = Building_BaseAtribut[BUILDING_BUILD_TIME_ID]-1;
    }

    // Masa membangun udah selesai, bangunan sempurna
    abstract public void PerfectBuilding();
   

    public void getDamage(int Damage)
    {
        int DamageReceive;
        DamageReceive = Damage-Building_BaseAtribut[BUILDING_DEFENSE_ID];
        if (DamageReceive>0)
        {
            Building_BaseAtribut[BUILDING_HP_ID] = Building_BaseAtribut[BUILDING_HP_ID]-DamageReceive;
        }
        else
        {
            Building_BaseAtribut[BUILDING_HP_ID] = Building_BaseAtribut[BUILDING_HP_ID]-1;
        }
    }

    public boolean IsBuildingDestroyed()
    {
        return Building_BaseAtribut[BUILDING_HP_ID]<=0;
    }

    public void UpgradeBuilding()
    {
       if (Building_BaseAtribut[BUILDING_LEVEL_ID]==1)
       {
           for (int i=0; i<NUMBER_BUILDING_ATRIBUT-1;++i)
           {
               Building_BaseAtribut[i]=(Building_BaseAtribut[i] + (int) Math.floor(0.1 * Building_BaseAtribut[i]));
           }
           Building_BaseAtribut[BUILDING_LEVEL_ID]=2;
       }
       else if (Building_BaseAtribut[BUILDING_LEVEL_ID]==2)
       {
           for (int i=0; i<NUMBER_BUILDING_ATRIBUT-1;++i)
           {
               Building_BaseAtribut[i]=(Building_BaseAtribut[i] + (int) Math.floor(0.3 * Building_BaseAtribut[i]));
           }
           Building_BaseAtribut[BUILDING_LEVEL_ID]=3;
       }
       else if (Building_BaseAtribut[BUILDING_LEVEL_ID]==3)
       {
           for (int i=0; i<NUMBER_BUILDING_ATRIBUT-1;++i)
           {
               Building_BaseAtribut[i]=(Building_BaseAtribut[i] + (int) Math.floor(0.3 * Building_BaseAtribut[i]));
           }
           Building_BaseAtribut[BUILDING_LEVEL_ID]=99;
       }
       else if (Building_BaseAtribut[BUILDING_LEVEL_ID]==99)
       {
           for (int i=0; i<NUMBER_BUILDING_ATRIBUT-1;++i)
           {
               Building_BaseAtribut[i]=(Building_BaseAtribut[i] + (int) Math.floor(0.4 * Building_BaseAtribut[i]));
           }
           Building_BaseAtribut[BUILDING_LEVEL_ID]=99;
       }
    }
    
}
