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
    private static Vector<Character> Target;
    public static void main(String[] args){
        Karakter = new Character(1,Constanta.RACE_HUMAN_ID);
        Target = new Vector();
        Target.add(Karakter);
        System.out.println("Default:");
        PrintAtributDefault();
        Karakter.JobChange(53);
        System.out.println("Current:");
        PrintAtributCurrent();
        Karakter.SpecialFunction(Karakter, Target, 56);
        System.out.println("Default:");
        PrintAtributDefault();
        System.out.println("Current:");
        PrintAtributCurrent();
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
        System.out.println(Karakter.GetAtribut().GetPositionX());
        System.out.println(Karakter.GetAtribut().GetPositionY());
    }
}
