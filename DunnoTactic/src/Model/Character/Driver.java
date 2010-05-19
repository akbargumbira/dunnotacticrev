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
public class Driver {
    private static Character Karakter;
    private static Character Karakter2;
    private static CharacterContainer Target;
    public static void main(String[] args){
        Karakter = new Character(Constanta.RACE_HUMAN_ID, 1);
        Karakter2 = new Character(Constanta.RACE_FAIRY_ID, 1);
        Target = new CharacterContainer();
        Target.add(Karakter);
        Target.add(Karakter2);
        System.out.println("Default:");
        PrintAtributDefault();
        Karakter.JobChange(53);
        System.out.println("Current:");
        PrintAtributCurrent();
        Karakter.SpecialFunction(Karakter, Target, 56);
        System.out.println("Karakter1:");
        System.out.println("Default:");
        PrintAtributDefault();
        System.out.println("Current:");
        PrintAtributCurrent();
        System.out.println("Karakter2:");
        System.out.println("Default:");
        PrintAtributDefault2();
        System.out.println("Current:");
        PrintAtributCurrent2();
//        Karakter.ReduceBuffDuration();
//        Karakter.ReduceBuffDuration();
//        Karakter.ReduceBuffDuration();
//        Karakter.ReduceBuffDuration();
//        System.out.println("Current:");
//        PrintAtributCurrent();
////        Karakter.SpecialFunction(Karakter, Target,6);
////        System.out.println("Current after blood:");
////        PrintAtributCurrent();
////        System.out.println("Position:");
////        PrintPosition();
////        Karakter.Move(20, 20);
////        PrintPosition();
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
        System.out.println(Karakter.getX());
        System.out.println(Karakter.getY());
    }

    public static void PrintAtributDefault2(){
        for(int i=0;i<Constanta.NUMBER_ATRIBUT;++i){
            System.out.println(Karakter2.GetAtribut().GetDefault(i));
        }
    }
    
    public static void PrintAtributCurrent2(){
        for(int i=0;i<Constanta.NUMBER_ATRIBUT;++i){
            System.out.println(Karakter2.GetAtribut().GetCurrent(i));
        }
    }
    public static void PrintPosition2(){
        System.out.println(Karakter.getX());
        System.out.println(Karakter.getY());
    }
}
