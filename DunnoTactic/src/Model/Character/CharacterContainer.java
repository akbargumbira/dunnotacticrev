/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author ifan
 */
public class CharacterContainer extends Vector<Character> implements Serializable {

    public CharacterContainer() {
        super();
    }

    public synchronized Character get(int x, int y) {
        int cx,cy;
        Character c;
        for (int i=0;i<super.size();++i) {
            c = super.get(i);
            cx = c.getX();
            cy = c.getY();
            if (cx==x && cy==y) {
                return c;
            }
        }
        return null;
    }

    public synchronized Character getById(int id) {
        int cid;
        Character c;
        for (int i=0;i<super.size();++i) {
            c = super.get(i);
            cid = c.getID();
            if (cid==id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public synchronized String toString() {
        String s = new String();
        for (int i=0;i<super.size();++i) {
            s += super.get(i).toString();
            s += "\n";
        }
        return s;
    }
}
