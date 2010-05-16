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
    private int[] CurrentAtribut = new int[Constanta.NUMBER_ATRIBUT];
    private int[] DefaultAtribut = new int[Constanta.NUMBER_ATRIBUT];
    private boolean[] GuardStatus = new boolean[2];
    private int[] StatusAction = new int[3];
    private int[] BuffListID = new int[3];
    private int[] BuffStatusDuration = new int[3];
    private int BuffCounter;
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
        if(JId<50){
            switch(JId){
                case Constanta.JOB1_NOVICE_ID : {
                    JobChar = new J1_Novice();
                }
                break;
                case Constanta.JOB2_KNIGHT_ID : {
                    JobChar = new J2_Knight();
                }
                break;
                case Constanta.JOB2_WARRIOR_ID : {
                    JobChar = new J2_Warrior();
                }
                break;
                case Constanta.JOB2_MAGE_ID : {
                    JobChar = new J2_Mage();
                }
                break;
                case Constanta.JOB2_ARCHER_ID : {
                    JobChar = new J2_Archer();
                }
                break;
                case Constanta.JOB2_HEALER_ID : {
                    JobChar = new J2_Healer();
                }
                break;
                case Constanta.JOB2_NINJA_ID : {
                    JobChar = new J2_Ninja();
                }
                break;
                default: {

                }
                break;
            }
        } else if(JId<100){
            switch(JId){
                case Constanta.JOB31_ARCH_KNIGHT_ID : {
                    JobChar = new J31_ArchKnight();
                }
                break;
                case Constanta.JOB31_BLADE_MASTER_ID : {
                    JobChar = new J31_BladeMaster();
                }
                break;
                case Constanta.JOB31_RANGER_ID : {
                    JobChar = new J31_Ranger();
                }
                break;
                case Constanta.JOB31_ARCH_MAGE_ID : {
                    JobChar = new J31_ArchMage();
                }
                break;
                case Constanta.JOB31_BISHOP_ID : {
                    JobChar = new J31_Bishop();
                }
                break;
                case Constanta.JOB31_ASSASSIN_ID : {
                    JobChar = new J31_Assassin();
                }
                break;
                default: {

                }
                break;
            }
        } else {
            switch(JId){
                case Constanta.JOB32_DEFENDER_ID : {
                    JobChar = new J32_Defender();
                }
                break;
                case Constanta.JOB32_PALADIN_ID : {
                    JobChar = new J32_Paladin();
                }
                break;
                case Constanta.JOB32_BARD_ID : {
                    JobChar = new J32_Bard();
                }
                break;
                case Constanta.JOB32_TIME_MAGE_ID : {
                    JobChar = new J32_TimeMage();
                }
                break;
                case Constanta.JOB32_SAGE_ID : {
                    JobChar = new J32_Sage();
                }
                break;
                case Constanta.JOB32_DARK_STALKER_ID : {
                    JobChar = new J32_DarkStalker();
                }
                break;
                default: {

                }
                break;
            }
        }
        CharID = CId;
        ClearAllBuff();
        SetFirstDefaultAtribut();
        CalculateCurrentAtribut();
    }

    public int GetCharID(){
        return CharID;
    }

    public int GetRaceID(){
        return RaceChar.GetRaceID();
    }

    public int GetJobID(){
        return JobChar.GetJobID();
    }
    
    public int GetDefault(int AtribID){
        return DefaultAtribut[AtribID];
    }

    public int GetCurrent(int AtribID){
        return CurrentAtribut[AtribID];
    }

    public int GetAttackType(){
        return JobChar.GetAttackType();
    }

    public int GetPositionX(){
        return PositionX;
    }

    public int GetPositionY(){
        return PositionY;
    }

    public int GetJobClass(){
        return JobChar.GetJobClass();
    }

    public int GetRaceLevel(){
        return RaceChar.GetRaceLevel();
    }

    public int GetSpecialAvail(int i){
        return JobChar.GetSpecialAvail(i);
    }

    public void SetCharID(int ID){
        CharID=ID;
    }

    public void SetBuff(int ID){
        boolean unset = true;
        for(int i=0;i<BuffCounter;++i){
            if(BuffListID[i]==ID){
                unset = false;
                BuffChar[i].SetBuffEfek(BuffListID[i]);
                BuffStatusDuration[i]=BuffChar[i].GetDuration();
            }
        }
        if(unset==true){
            if(BuffCounter==3){
                BuffCounter=0;
            }
            BuffListID[BuffCounter]=ID;
            BuffChar[BuffCounter].SetBuffEfek(BuffListID[BuffCounter]);
            BuffStatusDuration[BuffCounter]=BuffChar[BuffCounter].GetDuration();
            ++BuffCounter;
        }
        CalculateCurrentAtribut();   
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

    public void ClearAllBuff(){
        for(int i=0;i<3;++i) {
            BuffListID[i]=0;
            BuffChar[i].SetBuffEfek(BuffListID[i]);
        }
    }

    public void CalculateCurrentAtribut(){
        int TotalBuff=0;
        int AtribID;
        for(AtribID=0;AtribID<Constanta.NUMBER_ATRIBUT;++AtribID){
            for(int i=0;i<3;++i){
            TotalBuff = TotalBuff + (int)(BuffChar[i].GetFactorBuffChar(AtribID)*(double)DefaultAtribut[AtribID]);
        }
        CurrentAtribut[AtribID]=DefaultAtribut[AtribID]+TotalBuff;
        TotalBuff=0;
        }
    }

    public double[] GetFactorBuildingByRace(){
        return RaceChar.GetFactorBuilding();
    }

    public void Upgrade(){
        RaceChar.UpgrageRace();
        SetFirstDefaultAtribut();
        CalculateCurrentAtribut();
    }

    public void ReduceBuffDuration(){
        for(int i=0;i<3;++i){
            if(BuffStatusDuration[i]!=0){
                --BuffStatusDuration[i];
                if(BuffStatusDuration[i]==0){
                    BuffChar[i].SetBuffEfek(0);
                }
            }
        }
        CalculateCurrentAtribut();
    }

    @Override
    public String toString() {
        String s = new String();
        s += "HP : ";
        s += Integer.toString(CurrentAtribut[Constanta.HP_ID]);
        s += "\n";
        return s;
    }


}
