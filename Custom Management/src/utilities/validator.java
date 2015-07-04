/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.Date;

/**
 *
 * @author Pratik
 */
public class validator {
    String nameRegex           =   "^[a-zA-Z\\s]+";
    String alphanumericRegex   =   "[a-zA-Z0-9]+"; 
    String emailRegex          =   "[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
    String phoneRegex          =   "[0-9]+";
        
    public boolean isnull(String value) {
       return !("".equals(value) || value == null);
    }
    
    public boolean validateName( String name ) {
        return (name.matches(nameRegex));
    }
    
    public boolean validateEmail( String email ) {
        return (email.matches(emailRegex));
    }
    
    public boolean validateUsername( String username ) {
        return (username.matches(alphanumericRegex));
    }
    
    public boolean validatePhone( String phone ) {
        return (phone.matches(phoneRegex) && phone.length()>6);
    }
    
    public boolean validatePassword( String password ) {
        return  ( password.length() >6 );
    }
    
    public boolean validateConfirm( String first, String second ) {
        return ( second.equals(first) );
    }

    public boolean validateDateBeforeToday(Date CompareDate) {
        Date date = new Date();
        //System.out.println(date);
        return(date.after(CompareDate));
    }
    
    public boolean validateDateAfterToday(Date CompareDate) {
        Date date = new Date();
        //System.out.println(date);
        return(date.before(CompareDate));
    }
    
    public boolean validateIsDateBeforeDate(Date beforeDate, Date afterDate) {
        return(beforeDate.before(afterDate));
    }
    
    public boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }
    
    public boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
