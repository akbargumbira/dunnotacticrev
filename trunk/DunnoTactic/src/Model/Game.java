/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import Model.Building.Building;
import Model.Character.Character;
import Model.Character.CharacterContainer;
import Model.Map.Map;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author ifan
 */
public class Game implements Serializable
{

    public static final int INIT_GOLD = 400;
    private Map map;
    private Vector<Integer> vrace;
    private int[] gold;
    private int[][] charactermap;
    private CharacterContainer characters;
    private int playerturn = 1;

    public Game(Map map, Vector<Integer> vrace)
    {
        this.map = map;
        this.vrace = vrace;

        /* inisiate gold */
        gold = new int[map.GetNumPlayer()];
        for (int i=0;i<gold.length;++i) {
            gold[i] = INIT_GOLD;
        }

        charactermap = new int[map.GetWidth()][map.GetHeight()];
        characters = new CharacterContainer();
        InitCharacter();
        System.out.println(characters);
    }

    private void InitCharacter() {
        Character c=null;
        Building b;
        int x,y;
        for (int i=0;i<getVrace().size();++i) {
            c = new Character(getVrace().get(i), i+1);
            b = getMap().GetBuildings().getCastle(i+1);
            x = b.getBuilding_BaseAtribut(Building.BUILDING_X_IDX);
            y = b.getBuilding_BaseAtribut(Building.BUILDING_Y_IDX);
            c.setLocation(x, y);
            getCharactermap()[x][y] = c.getID();
            getCharacters().add(c);
        }
    }

    /**
     * @return the map
     */
    public Map getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(Map map) {
        this.map = map;
    }

    /**
     * @return the vrace
     */
    public Vector<Integer> getVrace() {
        return vrace;
    }

    /**
     * @param vrace the vrace to set
     */
    public void setVrace(Vector<Integer> vrace) {
        this.vrace = vrace;
    }

    /**
     * @return the charactermap
     */
    public int[][] getCharactermap() {
        return charactermap;
    }

    /**
     * @param charactermap the charactermap to set
     */
    public void setCharactermap(int[][] charactermap) {
        this.setCharactermap(charactermap);
    }

    /**
     * @return the characters
     */
    public CharacterContainer getCharacters() {
        return characters;
    }

    /**
     * @param characters the characters to set
     */
    public void setCharacters(CharacterContainer characters) {
        this.characters = characters;
    }

    /**
     * @return the playerturn
     */
    public int getPlayerturn() {
        return playerturn;
    }

    /**
     * @param playerturn the playerturn to set
     */
    public void setPlayerturn(int playerturn) {
        this.playerturn = playerturn;
    }

    public int getGold(int player) {
        return gold[player-1];
    }

    public void setGold(int player, int gold) {
        this.gold[player-1] = gold;
    }
}
