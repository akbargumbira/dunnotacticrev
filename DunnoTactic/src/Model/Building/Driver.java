/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

/**
 *
 * @author user
 */
public class Driver
{
    private static Building Build;
    public static void PrintBuildingAttribute()
    {
        System.out.println("HP : "+ Build.getBuilding_BaseAtribut(0));
        System.out.println("Defense : "+ Build.getBuilding_BaseAtribut(1));
        System.out.println("Gold/turn : "+ Build.getBuilding_BaseAtribut(2));
        System.out.println("BuildTime : "+ Build.getBuilding_BaseAtribut(3));
        System.out.println("IsDestroyed : "+Build.IsBuildingDestroyed());
        System.out.println();
    }

    public static void main (String args[])
    {
        Build = new Castle();
        System.out.println("Castle : ");
        PrintBuildingAttribute();
        Build = new Barrack();
        System.out.println("Castle : ");
        PrintBuildingAttribute();
        //Build = new Barrack_Job();
        System.out.println("Castle : ");
        PrintBuildingAttribute();
        Build = new Blacksmith();
        System.out.println("Castle : ");
        PrintBuildingAttribute();

     
    }

}
