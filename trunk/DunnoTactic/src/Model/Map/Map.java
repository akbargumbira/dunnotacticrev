/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Map;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

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
    private final static String[] contentString = {
        "Rumput1",
        "Lumpur1",
        "Water",
        "pohon",
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
    private int[][] Terrain;
    private int[][] Building;
    

    public Map() {
       this.width = MIN_WIDTH;
       this.height = MIN_HEIGHT;
       Terrain = new int[width][height];
       Building = new int[width][height];
       FillDefault();
    }

    public Map(int width, int height) {
        this.height = height;
        this.width = width;

        Terrain = new int[width][height];
        FillDefault();
    }

    private void FillDefault() {
        for (int i=0;i<width;++i) {
            for (int j=0;j<height;++j) {
                Terrain[i][j] = 0;
            }
        }
    }

    public void SetContent(int x, int y, int terrain) {
        Terrain[x][y] = terrain;
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

    public Point GetCastlePosition(int number) {
        for (int i =0;i<width;++i) {
            for (int j=0;j<height;++j) {
                if (Terrain[i][j] == number) {
                    return new Point(i, j);
                }
            }
        }
        return null;
    }

    public int GetContent(int x, int y) {
        return Terrain[x][y];
    }

    public static String GetString(int contentnumber) {
        return contentString[contentnumber];
    }

    public static int GetContentNumber(String s) {
        for (int i=0;i<contentString.length;++i) {
            if (s.equals(contentString[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean IsCastleIn(int number) {
        if (GetCastlePosition(number)==null) {
            return false;
        }

        return true;
    }

    public boolean IsCastle(int number) {
        if (number >= CASTLE1 && number <= CASTLE4) {
            return true;
        }

        return false;
    }

    public void SetMapRandom()
    {
        int Castle = 4;
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
            Terrain[p.x][p.y] = AIR;
            listpoint.remove(randnum);
        }

        /* random pohon */
        for (int i=0;i<nterrain;++i)
        {
            randnum = Math.abs(rand.nextInt())%listpoint.size();
            p = listpoint.get(randnum);
            Terrain[p.x][p.y] = POHON;
            listpoint.remove(randnum);
        }

        /* random lumpur */
        nterrain = n / 4;
        for (int i=0;i<nterrain;++i)
        {
            randnum = Math.abs(rand.nextInt())%listpoint.size();
            p = listpoint.get(randnum);
            Terrain[p.x][p.y] = LUMPUR;
            listpoint.remove(randnum);
        }

        /* random castle */
        for (int i=0;i<Castle;++i)
        {
            randnum = Math.abs(rand.nextInt())%listpoint.size();
            p = listpoint.get(randnum);
            Terrain[p.x][p.y] = CASTLE1+i;
            listpoint.remove(randnum);
        }

        /* sisanya taro rumput */
        nterrain = listpoint.size();
        for (int i=0;i<nterrain;++i)
        {
            p = listpoint.get(i);
            Terrain[p.x][p.y] = RUMPUT;
        }
    }

    @Override
    public String toString() {
        String s = new String();
        for (int i=0;i<width;++i) {
            for (int j=0;j<height;++j) {
                s += Integer.toString(i);
                s += ",";
                s += Integer.toString(j);
                s += " : ";
                s += Integer.toString(Terrain[i][j]);
                s += "\n";
            }
        }
        return s;
    }


        
}

