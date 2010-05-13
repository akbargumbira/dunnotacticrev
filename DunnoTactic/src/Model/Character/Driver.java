/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;

/**
 *
 * @author ifan
 */
public class Driver {
    private static Character Karakter;
    public static void main(String[] args){
        Karakter = new Character(1,Constanta.RACE_HUMAN_ID,Constanta.JOB_ARCHER_ID);
        System.out.println("Default:");
        PrintAtributDefault();
        Karakter.Attack(20, 20);
        System.out.println("Current:");
        PrintAtributCurrent();
        Karakter.Special(20, 20, 1);
        System.out.println("Current after heal:");
        PrintAtributCurrent();
        System.out.println("Position:");
        PrintPosition();
        Karakter.Move(20, 20);
        PrintPosition();
    }

    public static void PrintAtributDefault(){
        for(int i=0;i<Constanta.NUMBER_ATRIBUT;++i){
            System.out.println(Karakter.GetAtribut().GetDefault(i));
        }
    }
    public static void PrintAtributCurrent(){
        for(int i=0;i<Constanta.NUMBER_ATRIBUT;++i){
            System.out.println(Karakter.GetAtribut().GetCurrent(i));
        }
    }
    public static void PrintPosition(){
        System.out.println(Karakter.GetAtribut().GetPositionX());
        System.out.println(Karakter.GetAtribut().GetPositionY());
    }
}
