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
    private int[] CurrentAtribut = new int[Constanta.NUMBER_ATRIBUT];
    private int[] DefaultAtribut = new int[Constanta.NUMBER_ATRIBUT];
    private boolean[] StatusAction = new boolean[3];
    private int[] BuffListID = new int[3];
    private int[] BuffStatusDuration = new int[3];
    private int BuffCounter;
    private Race RaceChar;
    private Job JobChar;
    private Buff[] BuffChar = new Buff[3];

    public CharAtribut(){
        for(int i = 0; i<3;++i){
            BuffChar[i]=new Buff();
        }
    }

    public CharAtribut(int RId){
        this();
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
        StatusAction[0]=false;
        StatusAction[1]=false;
        StatusAction[2]=false;
        JobChar = new J1_Novice();
        SetFirstDefaultAtribut();
        CalculateCurrentAtribut();
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

    public int GetJobClass(){
        return JobChar.GetJobClass();
    }

    public int GetRaceLevel(){
        return RaceChar.GetRaceLevel();
    }

    public int GetSpecialAvail(int i){
        return JobChar.GetSpecialAvail(i);
    }

    public boolean IsImmobilize(){
        return StatusAction[Constanta.ACTION_IMMOBILIZE_ID];
    }

    public boolean IsDisable(){
        return StatusAction[Constanta.ACTION_DISABLE_ID];
    }

    public boolean IsSilence(){
        return StatusAction[Constanta.ACTION_SILENCE_ID];
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
        UpdateStatusActionBuffed();
        CalculateCurrentAtributBuffed();
    }

    public void UpdateStatusActionBuffed(){
        boolean StatusSilence = false;
        boolean StatusDisable = false;
        boolean StatusImmobilize = false;
        for(int i=0;i<BuffCounter;++i){
            if(BuffChar[i].GetStatusActionBuffChar(Constanta.ACTION_DISABLE_ID)==true){
                StatusAction[Constanta.ACTION_DISABLE_ID]=true;
                StatusDisable=true;
            } else
            if(BuffChar[i].GetStatusActionBuffChar(Constanta.ACTION_IMMOBILIZE_ID)==true){
                StatusAction[Constanta.ACTION_IMMOBILIZE_ID]=true;
                StatusImmobilize=true;
            } else if(BuffChar[i].GetStatusActionBuffChar(Constanta.ACTION_SILENCE_ID)==true){
                StatusAction[Constanta.ACTION_SILENCE_ID]=true;
                StatusSilence=true;
            }   
        }
        if(StatusImmobilize==false){
            StatusAction[Constanta.ACTION_IMMOBILIZE_ID]=false;
        }
        if(StatusDisable==false){
            StatusAction[Constanta.ACTION_DISABLE_ID]=false;
        }
        if(StatusImmobilize==false){
            StatusAction[Constanta.ACTION_IMMOBILIZE_ID]=false;
        }
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

    public void CalculateCurrentAtributBuffed(){
        int TotalBuff=0;
        int AtribID;
        for(AtribID=2;AtribID<Constanta.NUMBER_ATRIBUT;++AtribID){
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

    public void UpgradeJob(int JId){
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
        ClearAllBuff();
        SetFirstDefaultAtribut();
        CalculateCurrentAtribut();
    }

    public void Upgrade(){
        RaceChar.UpgradeRace();
        ClearAllBuff();
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
        UpdateStatusActionBuffed();
        CalculateCurrentAtributBuffed();
    }

    public int GetRangeMove(){
        return CurrentAtribut[Constanta.RANGE_MOVE_ID];
    }

    @Override
    public String toString() {
        String s = new String();
        s += "HP : ";
        s += Integer.toString(CurrentAtribut[Constanta.HP_ID]);
        s += "\n";
        s += "SP : ";
        s += Integer.toString(CurrentAtribut[Constanta.SP_ID]);
        s += "\n";
        s += "Attack : ";
        s += Integer.toString(CurrentAtribut[Constanta.ATTACK_ID]);
        s += "\n";
        s += "Magic Attack : ";
        s += Integer.toString(CurrentAtribut[Constanta.MATTACK_ID]);
        s += "\n";
        s += "Defense : ";
        s += Integer.toString(CurrentAtribut[Constanta.DEF_ID]);
        s += "\n";
        s += "Magic Defense : ";
        s += Integer.toString(CurrentAtribut[Constanta.MDEF_ID]);
        s += "\n";
        s += "Accuracy : ";
        s += Integer.toString(CurrentAtribut[Constanta.ACC_ID]);
        s += "\n";
        s += "Evasion : ";
        s += Integer.toString(CurrentAtribut[Constanta.EVA_ID]);
        s += "\n";
        s += "Range Move : ";
        s += Integer.toString(CurrentAtribut[Constanta.RANGE_MOVE_ID]);
        s += "\n";
        s += "Range Attack : ";
        s += Integer.toString(CurrentAtribut[Constanta.RANGE_ATTACK_ID]);
        s += "\n";
        if(IsSilence()==true){
            s += "SILENCED\n";
        }
        if(IsDisable()==true){
            s += "DISABLED\n";
        }
        if(IsImmobilize()==true){
            s += "IMMOBILIZED\n";
        }
        return s;
    }


}
