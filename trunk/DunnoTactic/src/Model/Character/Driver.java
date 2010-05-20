/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;
import Model.Character.Special.ConstantaSp;

/**
 *
 * @author  Mukhammad Ifanto
 *          13508110
 */
public class Driver {
    private static Character Karakter;
    private static Character Karakter2;
    private static CharacterContainer Target;
    public static void main(String[] args){
        Karakter = new Character(Constanta.RACE_HUMAN_ID, 1);
        Karakter2 = new Character(Constanta.RACE_FAIRY_ID, 1);
        Target = new CharacterContainer();
        Target.add(Karakter2);
        System.out.println("Karakter 1:");
        System.out.println(Karakter.GetAtribut().toString());
        System.out.println("Karakter 2:");
        System.out.println(Karakter2.GetAtribut().toString());
        System.out.println("Karakter 1 upgrade job dark stalker, 2 ke mage");
        Karakter.JobChange(Constanta.JOB32_DARK_STALKER_ID);
        Karakter2.JobChange(Constanta.JOB2_MAGE_ID);
        System.out.println("Karakter 1:");
        System.out.println(Karakter.GetAtribut().toString());
        System.out.println("Karakter 2:");
        System.out.println(Karakter2.GetAtribut().toString());
        System.out.println("Karakter 2 attack karakter 1");
        Karakter2.AttackPlayer(Karakter2, Karakter);
        System.out.println("Karakter 1:");
        System.out.println(Karakter.GetAtribut().toString());
        System.out.println("Karakter 1 special oblivion");
        Karakter.SpecialFunction(Karakter, Target, ConstantaSp.SP_DARK_STALKER_OBLIVION_ID);
        System.out.println("Karakter 2:");
        System.out.println(Karakter2.GetAtribut().toString());
    }
}
