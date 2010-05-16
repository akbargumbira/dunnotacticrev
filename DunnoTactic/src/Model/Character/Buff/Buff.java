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

    public int GetDuration(){
        return BuffEfekChar.GetDurationBuff();
    }

    public void SetBuffID(int ValBuffID){
        BuffID=ValBuffID;
    }

    public void SetBuffEfek(int ValBuffID){
        if(ValBuffID<50){
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
                case Constanta.BUFF_STATUS_SILENCE_ID : {
                    BuffEfekChar = new BuffSilence();
                    BuffID=Constanta.BUFF_STATUS_SILENCE_ID;
                }
                break;
                case Constanta.BUFF_STATUS_DISABLE_ID : {
                    BuffEfekChar = new BuffDisable();
                    BuffID=Constanta.BUFF_STATUS_DISABLE_ID;
                }
                break;
                case Constanta.BUFF_STATUS_IMMOBILIZE_ID : {
                    BuffEfekChar = new BuffImmobilize();
                    BuffID=Constanta.BUFF_STATUS_IMMOBILIZE_ID;
                }
                break;
                case Constanta.BUFF_STATUS_TIME_FREEZE_ID : {
                    BuffEfekChar = new BuffTimeFreeze();
                    BuffID=Constanta.BUFF_STATUS_TIME_FREEZE_ID;
                }
                break;
                case Constanta.BUFF_STATUS_TIME_LAGGING_ID : {
                    BuffEfekChar = new BuffTimeLagging();
                    BuffID=Constanta.BUFF_STATUS_TIME_LAGGING_ID;
                }
                break;
                case Constanta.BUFF_STATUS_DOWN_MENTAL_ID : {
                    BuffEfekChar = new BuffDownMental();
                    BuffID=Constanta.BUFF_STATUS_DOWN_MENTAL_ID;
                }
                break;
                default : {

                }
                break;
            }
        } else if(ValBuffID < 100){
            switch(ValBuffID){
                case Constanta.BUFF_STATUS_BLOOD_CLOTING_ID : {
                    BuffEfekChar = new BuffBloodCloting();
                    BuffID=Constanta.BUFF_STATUS_BLOOD_CLOTING_ID;
                }
                break;
                case Constanta.BUFF_STATUS_HOLY_GUARD_ID : {
                    BuffEfekChar = new BuffHolyGuard();
                    BuffID=Constanta.BUFF_STATUS_HOLY_GUARD_ID;
                }
                break;
                case Constanta.BUFF_STATUS_ANGEL_BLESS_ID : {
                    BuffEfekChar = new BuffAngelBless();
                    BuffID=Constanta.BUFF_STATUS_ANGEL_BLESS_ID;
                }
                break;
                case Constanta.BUFF_STATUS_FLEETING_TIME_ID : {
                    BuffEfekChar = new BuffFleetingTime();
                    BuffID=Constanta.BUFF_STATUS_FLEETING_TIME_ID;
                }
                break;
                case Constanta.BUFF_STATUS_FOCUS_SIGHT_ID : {
                    BuffEfekChar = new BuffFocusSight();
                    BuffID=Constanta.BUFF_STATUS_FOCUS_SIGHT_ID;
                }
                break;
                case Constanta.BUFF_STATUS_SWORD_MELTING_ID : {
                    BuffEfekChar = new BuffSwordMelting();
                    BuffID=Constanta.BUFF_STATUS_SWORD_MELTING_ID;
                }
                break;
                default : {
                    
                }
                break;
            }
        }
    }
}
