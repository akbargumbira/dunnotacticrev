/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */

public class Building
{
    protected  int[] Building_BaseAtribut = new int[Building_Constanta.NUMBER_BUILDING_ATRIBUT];

    public Building()
    {

    }

    /**
     * @return the Building_BaseAtribut
     */
    public int getBuilding_BaseAtribut(int AtribBuildingID) {
        return Building_BaseAtribut[AtribBuildingID];
    }
    
    /**
     *
     * @param Building_BaseAtribut the Building_BaseAtribut to set
     */
    public void setBuilding_BaseAtribut(int[] Building_BaseAtribut) {
        this.Building_BaseAtribut = Building_BaseAtribut;
    }

    public boolean IsBuildingDestroyed()
    {
        return Building_BaseAtribut[Building_Constanta.BUILDING_HP_ID]==0;
    }

    

}
