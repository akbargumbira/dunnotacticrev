/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Character.Special;
import Model.Character.CharAtribut;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author ifan
 */
abstract public class Special implements Serializable{
    protected String SpecialName;
    protected int SpecialID;
    protected int SPCost;
    protected int BaseAcc;
    protected int RangeSpecial;
    protected boolean AreaType = false;
    protected boolean TargetEnemy = false;
    
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

    @Override
    public String toString() {
        String s = new String();
        s += "Name : ";
        s += SpecialName;
        s += "\n";
        s += "SP Cost : ";
        s += Integer.toString(SPCost);
        s += "\n";
        s += "Range : ";
        if(RangeSpecial==0){
            s += "None";
        } else {
            s += Integer.toString(RangeSpecial);
        }
        s += "\n";
        s += "Target : ";
        if(AreaType==true && TargetEnemy==true){
            s += "All enemy in area range\n";
        } else if (AreaType==true && TargetEnemy==false) {
            s += "All ally in area range\n";
        } else if(AreaType==false && TargetEnemy==true){
            s += "1 Enemy in range\n";
        } else if(AreaType==false && TargetEnemy==false){
            if(RangeSpecial==0){
                s += "Self\n";
            } else {
                s += "1 Ally in range\n";
            }
        }
        s += "Accuracy : ";
        s += Integer.toString(BaseAcc);
        s += "\n";
        return s;
    }

}
