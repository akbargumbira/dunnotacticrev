/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Map;

import Model.Building.Barrack;
import Model.Building.Blacksmith;
import Model.Building.Building;
import Model.Building.BuildingContainer;
import Model.Building.Castle;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author user
 */
public class Map implements Serializable{
    public final static int RUMPUT = 0;
    public final static int LUMPUR = 1;
    public final static int AIR = 2;
    public final static int POHON = 3;
    public final static int CASTLE1 = 4;
    public final static int CASTLE2 = 5;
    public final static int CASTLE3 = 6;
    public final static int CASTLE4 = 7;

    public final static int NO_BUILDING = 0;
    public final static int CASTLE = 1;
    public final static int BARRACK = 2;
    public final static int BLACKSMITH = 3;

    private final static String[] contentString = {
        "Rumput",
        "Lumpur",
        "Air",
        "Pohon",
        "castle1",
        "castle2",
        "castle3",
        "castle4"
    };
    
    public final static int MAX_HEIGHT = 50;
    public final static int MIN_HEIGHT = 15;
    public final static int MAX_WIDTH = 50;
    public final static int MIN_WIDTH = 15;
    
    private int width;
    private int height;
    private int numPlayer;
    private int[][] terrain;
    private int[][] building;

    private BuildingContainer building_container = new BuildingContainer();

    public Map(int numplayer) {
       this(numplayer, MIN_WIDTH, MIN_HEIGHT);
    }

    public Map(int numplayer, int width, int height) {
        this.height = height;
        this.width = width;

        terrain = new int[width][height];
        building = new int[width][height];
        FillDefault();
        this.numPlayer = numplayer;
    }

    private void FillDefault() {
        for (int i=0;i<width;++i) {
            for (int j=0;j<height;++j) {
                terrain[i][j] = 0;
                building[i][j] = 0;
            }
        }
    }

    public void SetTerrain(int x, int y, int terrain) {
        this.terrain[x][y] = terrain;
    }

    public void DelBuilding(int x, int y) {
        this.building[x][y] = 0;
        Building b = building_container.get(x, y);
        if (b!=null) {
            building_container.remove(b);
        }
    }

    public void SetBuilding(int building, int player, int x, int y, double goldFactor, double buildFactor) {
        Building b = building_container.get(x, y);

        if (b!=null) {
            building_container.remove(b);
        }

        switch (building) {
            case CASTLE : {
                b = new Castle(player,x,y,goldFactor);
                break;
            }

            case BARRACK : {
                b = new Barrack(player,x,y,goldFactor,buildFactor);
                break;
            }

            case BLACKSMITH : {
                b = new Blacksmith(player,x,y,goldFactor,buildFactor);
                break;
            }
        }

        building_container.add(b);
        this.building[x][y] = b.getBuilding_BaseAtribut(Building.BUILDING_ID_IDX);
    }


    public int GetHeight() {
        return height;
    }

    public int GetWidth() {
        return width;
    }

    public int GetNumPlayer() {
        return numPlayer;
    }

    public void SetNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public int GetTerrain(int x, int y) {
        return getTerrain()[x][y];
    }

    public Building GetBuilding(int x, int y) {
        return building_container.get(x, y);
    }

    public BuildingContainer GetBuildings() {
        return building_container;
    }

    public static String GetString(int contentnumber) {
        return contentString[contentnumber];
    }

    public static int GetTerrrainNumber(String s) {
        for (int i=0;i<contentString.length;++i) {
            if (s.equals(contentString[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean IsCastleIn(int player) {
        return building_container.IsCastleIn(player);
    }

    public void SetMapRandom()
    {
        int randterrain,randnum;
        Random rand = new Random();

        ArrayList<Point> listpoint = new ArrayList<Point>();

        for (int i=0;i<width;++i)
        {
            for (int j=0;j<height;++j)
            {
               listpoint.add(new Point(i, j));
            }
        }

        int n = width*height;
        int nterrain = n/8;
        Point p;

        /* random Air */
        for (int i=0;i<nterrain;++i)
        {
            randnum = Math.abs(rand.nextInt())%listpoint.size();
            p = listpoint.get(randnum);
            terrain[p.x][p.y] = AIR;
            listpoint.remove(randnum);
        }

        /* random pohon */
        for (int i=0;i<nterrain;++i)
        {
            randnum = Math.abs(rand.nextInt())%listpoint.size();
            p = listpoint.get(randnum);
            terrain[p.x][p.y] = POHON;
            listpoint.remove(randnum);
        }

        /* random lumpur */
        nterrain = n / 4;
        for (int i=0;i<nterrain;++i)
        {
            randnum = Math.abs(rand.nextInt())%listpoint.size();
            p = listpoint.get(randnum);
            terrain[p.x][p.y] = LUMPUR;
            listpoint.remove(randnum);
        }

        /* random castle */
        for (int i=0;i<numPlayer;++i)
        {
            randnum = Math.abs(rand.nextInt())%listpoint.size();
            p = listpoint.get(randnum);
            SetBuilding(CASTLE, i+1, p.x, p.y, 1, 0);
            listpoint.remove(randnum);
        }

        /* sisanya taro rumput */
        nterrain = listpoint.size();
        for (int i=0;i<nterrain;++i)
        {
            p = listpoint.get(i);
            terrain[p.x][p.y] = RUMPUT;
        }
    }

    public void eraseBuilding(int x, int y) {
        building[x][y] = 0;
        Building b = building_container.get(x, y);
        building_container.remove(b);
    }

    @Override
    public String toString() {
        String s = new String();
        s += "Terrain :\n";
        for (int i=0;i<width;++i) {
            for (int j=0;j<height;++j) {
                s += Integer.toString(i);
                s += ",";
                s += Integer.toString(j);
                s += " : ";
                s += Integer.toString(getTerrain()[i][j]);
                s += "\n";
            }
        }

        s += "Building :\n";
        for (int i=0;i<width;++i) {
            for (int j=0;j<height;++j) {
                s += Integer.toString(i);
                s += ",";
                s += Integer.toString(j);
                s += " : ";
                s += Integer.toString(building[i][j]);
                s += "\n";
            }
        }

        s += building_container.toString();
        return s;
    }

    /**
     * @return the terrain
     */
    public int[][] getTerrain() {
        return terrain;
    }
        
}

