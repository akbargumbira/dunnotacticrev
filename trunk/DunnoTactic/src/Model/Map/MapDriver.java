/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Map;

/**
 *
 * @author  Rezan Achmad
 *          13508104
 */
public class MapDriver {
    public static void main(String[] args) {
        Map m = new Map(2, 5, 5);
        m.SetTerrain(0, 0, 6);
        System.out.println(m);
    }
}
