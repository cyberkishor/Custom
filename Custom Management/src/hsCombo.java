/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author publisy
 */
public class hsCombo {
    private String code;
    private String name;
    private int size;
    private String unit;
    private int rate;
    
     public hsCombo(String code, String name,int size,String unit,int rate){
        this.code  = code; 
        this.name = name;
        this.size = size;
        this.unit = unit;
        this.rate = rate;
        
    }
    @Override
    public String toString(){
         return this.name;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public String getUnit(){
        return this.unit;
    }
    public int getRate(){
        return this.rate;
    }
    
}
