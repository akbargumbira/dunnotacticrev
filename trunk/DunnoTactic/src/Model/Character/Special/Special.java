/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Special;
import Model.Character.CharAtribut;
import java.util.Vector;

/**
 *
 * @author ifan
 */
abstract public class Special {
    protected String SpecialName;
    protected int SpecialID;
    protected int SPCost;
    protected int BaseAcc;
    protected int RangeSpecial;
    public Special(){
        
    }

    public String GetSpecialName(){
        return SpecialName;
    }

    public int GetSpecialID(){
        return SpecialID;
    }

    public int GetSPCost(){
        return SPCost;
    }

    public int GetRangeSpecial(){
        return RangeSpecial;
    }
    
    abstract public void ExecuteSpecial(CharAtribut KarakterAtribut, Vector<CharAtribut> TargetAtribut);
}
