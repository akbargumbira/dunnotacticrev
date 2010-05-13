/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Buff;

import Model.Character.Constanta;

/**
 *
 * @author ifan
 */
public class Buff {
    private int BuffID;
    private BuffEfek BuffEfekChar;

    public Buff(){
        BuffEfekChar = new BuffNothing();
    }

    public double GetFactorBuffChar(int AtribID){
        return BuffEfekChar.GetFactorBuff(AtribID);
    }

    public int GetBuffID(){
        return BuffID;
    }

    public void SetBuffID(int ValBuffID){
        BuffID=ValBuffID;
    }

    public void SetBuffEfek(int ValBuffID){
        switch(ValBuffID){
            case 0 : {
                BuffEfekChar = new BuffNothing();
            }
            break;
            case Constanta.BUFF_STATUS_POISON_ID : {
                BuffEfekChar = new BuffPoison();
                BuffID=Constanta.BUFF_STATUS_POISON_ID;
            }
            break;
            default : {

            }
            break;
        }
    }
}
