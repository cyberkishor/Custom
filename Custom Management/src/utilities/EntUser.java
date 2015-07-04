package utilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Anup
 */
public class EntUser {
    
    private int userId;
    private String userName;
    private String password;
    private String userType;
    private String status;
    
    
    public EntUser(){
    userId = 0;
    userName = "";
    password = "";
    userType = "";
    status = "";
    
   }
    
public int getUserId(){
return userId;
}
public void setUserId(int value){
userId = value;
}
public String getUserName(){
return userName;
}
public void setUserName( String value ) throws Exception{
      if (value.length() > 0){
          this.userName = value;
      }else{
          throw new Exception("Please type Username");
      }
}

public String getPassword(){
return password;
}
public void setPassword(String value) throws Exception{
if (value.length() > 0){
          this.password = value;
      }else{
          throw new Exception("Password couldn't be blank");
      }
}
public String getUserType(){
return userType;
}
public void setUserType(String value){
userType = value;
}
public String getStatus(){
return status;
}
public void setStatus(String value){
status = value;
}

}
