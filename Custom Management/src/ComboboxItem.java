

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kishor
 */
public class ComboboxItem {
    private String code;
    private String name;
    
     public ComboboxItem(String code, String name){
        this.code  = code; 
        this.name = name;
        
    }
     
    
     public ComboboxItem(String code){
        this.code  = code; 
    }
     
    @Override
    public String toString(){
         return this.name;
    }
    
    public String getCode(){
        return this.code;
    }
    
}
