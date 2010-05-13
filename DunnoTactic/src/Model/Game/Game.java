/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Game;
import Model.Character.Character;
import Model.Character.CharAtribut;
import Model.Map.Map;

/**
 *
 * @author ifan
 */
public class Game {
    private int NumPlayer;
    public static Character[][] P = new Character[4][200];
    public static Map M;

    public Game(){
        
    }

    public Character GetCharacterByID(int ID){
        int i;
        int j=0;
        CharAtribut Atribut;
        if(ID < 500){
            i=0;
        } else if(ID < 1000){
            i=1;
        } else if(ID < 1500){
            i=2;
        } else {
            i=3;
        }
        Atribut = P[i][j].GetAtribut();
        while(Atribut.GetCharID()!=ID){
            ++j;
            Atribut = P[i][j].GetAtribut();
        }
        return P[i][j];
    }
}
