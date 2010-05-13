/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character;
import Model.Character.Race.*;
import Model.Character.Job.*;
import Model.Character.Buff.Buff;

/**
 *
 * @author ifan
 */
public class CharAtribut {
    private int CharID;
    private int RaceID;
    private int JobID;
    private int JobClass;
    private int AttackType;
    private int[] CurrentAtribut = new int[Constanta.NUMBER_ATRIBUT];
    private int[] DefaultAtribut = new int[Constanta.NUMBER_ATRIBUT];
    private int[] StatusAction = new int[3];
    private int[] BuffList = new int[3];
    private int[] BuffStatusDuration = new int[3];
    private int BuffCounter;
    private int[] SpecialList = new int[5];
    private int PositionX;
    private int PositionY;
    private Race RaceChar;
    private Job JobChar;
    private Buff[] BuffChar = new Buff[3];

    public CharAtribut(){
        for(int i = 0; i<3;++i){
            BuffChar[i]=new Buff();
        }
    }

    public CharAtribut(int CId, int RId, int JId){
        for(int i = 0; i<3;++i){
            BuffChar[i]=new Buff();
        }
        CharID = CId;
        switch(RId){
            case Constanta.RACE_HUMAN_ID : {
                RaceChar = new Human();
            }
            break;
            case Constanta.RACE_ELF_ID : {
                RaceChar = new Elf();
            }
            break;
            case Constanta.RACE_FAIRY_ID : {
                RaceChar = new Fairy();
            }
            break;
            default: {

            }
            break;
        }
        switch(JId){
            case Constanta.JOB_NOVICE_ID : {
                JobChar = new Novice();
            }
            break;
            case Constanta.JOB_KNIGHT_ID : {
                JobChar = new Knight();
            }
            break;
            case Constanta.JOB_WARRIOR_ID : {
                JobChar = new Warrior();
            }
            break;
            case Constanta.JOB_MAGE_ID : {
                JobChar = new Mage();
            }
            break;
            case Constanta.JOB_ARCHER_ID : {
                JobChar = new Archer();
            }
            break;
            case Constanta.JOB_HEALER_ID : {
                JobChar = new Healer();
            }
            break;
            case Constanta.JOB_NINJA_ID : {
                JobChar = new Ninja();
            }
            break;
            default: {
                
            }
            break;
        }
        RaceID=RaceChar.GetRaceID();
        JobID=JobChar.GetJobID();
        JobClass=JobChar.GetJobClass();
        AttackType=JobChar.GetAttackType();
        ClearAllBuff();
        SetFirstDefaultAtribut();
        SetFirstCurrentAtribut();
        
    }

    public int GetCharID(){
        return CharID;
    }
    
    public int GetDefault(int AtribID){
        return DefaultAtribut[AtribID];
    }

    public int GetCurrent(int AtribID){
        for(int i=0;i<3;++i){
            if(BuffStatusDuration[i]!=0){
                BuffChar[i].SetBuffEfek(BuffList[i]);
            }
        }
        int TotalBuff=0;
        for(int i=0;i<3;++i){
            TotalBuff = TotalBuff + (int)(BuffChar[i].GetFactorBuffChar(AtribID)*(double)CurrentAtribut[AtribID]);
        }
        CurrentAtribut[AtribID]=CurrentAtribut[AtribID]+TotalBuff;
        return CurrentAtribut[AtribID];
    }

    public int GetAttackType(){
        return AttackType;
    }

    public int GetPositionX(){
        return PositionX;
    }

    public int GetPositionY(){
        return PositionY;
    }

    public void SetCharID(int ID){
        CharID=ID;
    }

    public void SetAttackType(int Type){
        AttackType=Type;
    }

    public void SetBuff(int ID, int Duration){
        if(BuffCounter==3){
            BuffCounter=0;
        }
        BuffList[BuffCounter]=ID;
        BuffStatusDuration[BuffCounter]=Duration;
    }
    
    public void SetPositionXY(int X, int Y){
        PositionX = X;
        PositionY = Y;
    }

    public void SetCurrentAtribut(int AtribID, int Val){
        CurrentAtribut[AtribID]=Val;
    }

    public void SetFirstDefaultAtribut(){
        for(int i=0;i<Constanta.NUMBER_ATRIBUT;++i){
            DefaultAtribut[i]=RaceChar.GetBaseAtribut(i)+(int)((double)RaceChar.GetBaseAtribut(i)*JobChar.GetFactorJob(i));
        }
    }

    public void SetFirstCurrentAtribut(){
        for(int i=0;i<Constanta.NUMBER_ATRIBUT;++i){
            CurrentAtribut[i]=DefaultAtribut[i];
        }
    }

    public void ClearAllBuff(){
        for(int i=0;i<3;++i) {
            BuffList[i]=0;
            BuffChar[i].SetBuffEfek(BuffList[i]);
        }
    }
}
