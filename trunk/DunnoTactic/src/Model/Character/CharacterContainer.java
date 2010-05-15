/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;

import java.util.Vector;

/**
 *
 * @author ifan
 */
public class CharacterContainer extends Vector<Character> {

    public CharacterContainer() {
        super();
    }

    public synchronized Character get(int x, int y) {
        int cx,cy;
        Character c;
        for (int i=0;i<super.size();++i) {
            c = super.get(i);
            cx = c.GetAtribut().GetPositionX();
            cy = c.GetAtribut().GetPositionY();
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
            cid = c.GetAtribut().GetCharID();
            if (cid==id) {
                return c;
            }
        }
        return null;
    }



}
