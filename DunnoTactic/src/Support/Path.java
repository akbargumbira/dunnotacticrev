/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Support;
import Model.Character.Constanta;
import java.awt.Point;

/**
 *
 * @author ifan
 */
public class Path {

    public void SetAreaMove(int RangeMove, int RaceID, Point Init ,int[][] MapTerrain, boolean[][] MapBuilding, boolean[][] MapPlayer, int[][] MapArea){
        int factorX;
        int factorY;
        int x;
        int y;

        int i;
        int j;
        int looping;

        if(MapTerrain[Init.x][Init.y]==1 && RaceID!=Constanta.RACE_FAIRY_ID) {
                MapArea[Init.x][Init.y]=1;
        } else {
                MapArea[Init.x][Init.y]=0;
        }
        for(looping=1;looping<=2;++looping) {
            for(i=1;i<=RangeMove;++i) {
                // Kuadran 1 dan 3
                factorY=-i;
                for(factorX=0;factorX<i;++factorX) {
                    // kuadran 1
                    x = Init.x+factorX-1;
                    y = Init.y+factorY-1;
                    if(x>=0 && y>=0 && x<MapTerrain.length && y<MapTerrain[0].length) {
                        GetDistanceMove(RangeMove, RaceID, MapTerrain[x][y], MapPlayer[x][y], MinAround(x, y, MapArea));
                    }
                    // kuadran 3
                    x = Init.x-factorX-1;
                    y = Init.y-factorY-1;
                    if(x>=0 && y>=0 && x<MapTerrain.length && y<MapTerrain[0].length) {
                        GetDistanceMove(RangeMove, RaceID, MapTerrain[x][y], MapPlayer[x][y], MinAround(x, y, MapArea));
                    }
                    ++factorY;
                }
                // Kuadran 2 dan 4
                factorX=i;
                for(factorY=0;factorY<i;++factorY) {
                    // kuadran 4
                    x = Init.x+factorX-1;
                    y = Init.y+factorY-1;
                    if(x>=0 && y>=0 && x<MapTerrain.length && y<MapTerrain[0].length) {
                        GetDistanceMove(RangeMove, RaceID, MapTerrain[x][y], MapPlayer[x][y], MinAround(x, y, MapArea));
                    }
                    // kuadran 2
                    x = Init.x-factorX-1;
                    y = Init.y-factorY-1;
                    if(x>=0 && y>=0 && x<MapTerrain.length && y<MapTerrain[0].length) {
                        GetDistanceMove(RangeMove, RaceID, MapTerrain[x][y], MapPlayer[x][y], MinAround(x, y, MapArea));
                    }
                    --factorX;
                }
            }
        }
    }

    private int MinAround(int x, int y, int[][] Matriks){
        int Minimum;
        if (x-1<0 && y-1<0) {
            Minimum = Min2(Matriks[x][y+1],Matriks[x+1][y]);
        } else
        if(x-1<0) {
            Minimum = Min2(Min2(Matriks[x][y-1],Matriks[x][y+1]), Matriks[x+1][y]);
        } else
        if(y-1<0) {
            Minimum = Min2(Matriks[x][y+1], Min2(Matriks[x-1][y],Matriks[x+1][y]));
        } else if(x>=Matriks.length && y>=Matriks[0].length) {
            Minimum = Min2(Matriks[x-1][y],Matriks[x][y-1]);
        } else if(x>=Matriks.length) {
            Minimum = Min2(Min2(Matriks[x][y+1],Matriks[x][y-1]),Matriks[x-1][y]);
        } else if(y>=Matriks[0].length) {
            Minimum = Min2(Min2(Matriks[x-1][y],Matriks[x+1][y]),Matriks[x][y-1]);
        }
        else {
                Minimum = Min2(Min2(Matriks[x][y-1],Matriks[x][y+1]), Min2(Matriks[x-1][y],Matriks[x+1][y]));
        }
        return Minimum;
    }

    private int Min2(int x1, int x2){
        if(x1<x2){
            return x1;
        } else {
            return x2;
        }
    }
    
    private int GetDistanceMove(int RangeMove, int RaceID, int TerrainID, boolean PassAblePlayer, int MinAroundVal) {
        int val;
        if(PassAbleTerrain(TerrainID, RaceID) && PassAblePlayer==true && MinAroundVal < RangeMove) {
            if(TerrainID==1) {
                if(MinAroundVal==RangeMove-1) {
                    val=99;
                } else {
                    val=MinAroundVal + 2;
                }
            } else {
                val=MinAroundVal + 1;
            }
        } else {
            val=99;
        }
        return val;
    }

    private boolean PassAbleTerrain(int TerrainID, int RaceID){
        boolean pass;
        if(RaceID==Constanta.RACE_FAIRY_ID){
            pass = true;
        } else {
            if(TerrainID==2 || TerrainID == 3){
                pass = false;
            } else {
                pass = true;
            }
        }
        return pass;
    }

    public void SetAreaAttack(Point Init, int range, int[][] MapArea) {
        int i;
        int j;
        int factor;

        for(i=Init.x-range;i<=Init.x+range;++i) {
            factor=range-Math.abs(Init.x-i);
            for(j=Init.y-factor;j<=Init.y+factor;++j) {
                if(i>0 && j>0 && i<=MapArea.length && j<=MapArea[0].length) {
                    MapArea[i-1][j-1]=Math.abs(Init.x-i)+Math.abs(Init.y-j);
                }
            }
        }
    }
}
