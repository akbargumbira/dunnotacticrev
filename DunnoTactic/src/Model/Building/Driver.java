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
    private static BuildingContainer C = new BuildingContainer();

    public static void main (String args[])
    {
        Build = new Castle(1, 0, 1, 0.1);
        C.add(Build);
        Build = new Barrack(2,0, 0, 0.2, 0.3);
        C.add(Build);
        Build = new Blacksmith(3, 0, 2, 0.2, 0.3);
        Build = new Blacksmith(3, 0, 2, 0.1, 0.4);
        C.add(Build);


        System.out.println(C.get(0, 2));

    }

}
