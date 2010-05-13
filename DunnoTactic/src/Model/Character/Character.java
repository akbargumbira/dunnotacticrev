/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;

/**
 *
 * @author ifan
 */
public class Character {
    private CharAtribut Atribut;
    private CharAction Action;

    public Character(){
        
    }

    public Character(int ID, int RaceID, int JobID){
        Atribut = new CharAtribut(ID, RaceID, JobID);
        Action = new CharAction();
    }

    public CharAtribut GetAtribut(){
        return Atribut;
    }

    public void Move(int targetX, int targetY){
        Action.MoveFunction(Atribut, targetX, targetY);
    }

    public void Attack(int targetX,int targetY){
        Action.AttackFunction(Atribut, targetX, targetY);
    }

    public void Special(int targetX, int targetY, int ID){
        Action.SpecialFunction(Atribut, targetX, targetY, ID);
    }
}
