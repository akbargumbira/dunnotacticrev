/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Building;

import java.util.Vector;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author  Akbar Gumbira
 *          13508106
 */
public class BuildingContainer extends Vector<Building> {

    public BuildingContainer() {
        super();
    }

    public synchronized Building get(int x, int y) {
        int bx,by;
        Building b;
        for (int i=0;i<super.size();++i) {
            b = super.get(i);
            bx = b.getBuilding_BaseAtribut(Building.BUILDING_X_IDX);
            by = b.getBuilding_BaseAtribut(Building.BUILDING_Y_IDX);
            if (bx==x && by==y) {
                return b;
            }
        }
        return null;
    }

    public synchronized Building getById(int id) {
        int bid;
        Building b;
        for (int i=0;i<super.size();++i) {
            b = super.get(i);
            bid = b.getBuilding_BaseAtribut(Building.BUILDING_ID_IDX);
            if (bid==id) {
                return b;
            }
        }
        return null;
    }

    public synchronized Building getCastle(int player) {
        Building b=null;
        for (int i=0;i<super.size();++i) {
            b = super.get(i);
            if (b.getBuilding_BaseAtribut(Building.BUILDING_PLAYER_IDX)==player) {
                return b;
            }
        }
        return b;
    }

    public boolean IsCastleIn(int player) {
        Building b;
        for (int i=0;i<super.size();++i) {
            b = super.get(i);
            if (b instanceof Castle && b.getBuilding_BaseAtribut(b.BUILDING_PLAYER_IDX)==player) {
                return true;
            }
        }
        return false;
    }

    public boolean IsBlackSmithIn(int player) {
        Building b;
        for (int i=0;i<super.size();++i) {
            b = super.get(i);
            if (b instanceof Blacksmith && b.getBuilding_BaseAtribut(b.BUILDING_PLAYER_IDX)==player) {
                return true;
            }
        }
        return false;
    }

    @Override
    public synchronized String toString() {
        String s=null;
        for (int i=0;i<super.size();++i) {
            s += super.get(i).toString();
            s +="\n";
        }
        return s;
    }

}
