/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author publisy
 */
package smusemiv.connection;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class connection {
    private static Connection con;
    
    PreparedStatement pst = null;
    
    public static Connection getConnection() {
        try {
            String url      = "jdbc:mysql://localhost/smude_4th";
            String driver   = "com.mysql.jdbc.Driver";
            String username = "root";
            String password = "kishor";
                   
            try {
                Class.forName(driver);
                try {
                    con = DriverManager.getConnection(url, username, password);
                } catch (SQLException ex) {
                    // log an exception. fro example:
                    JOptionPane.showMessageDialog(null, "Error: Failed to create the database connection!!!");
                }
            } catch (ClassNotFoundException ex) {
                // log an exception. for example:
                JOptionPane.showMessageDialog(null, "Error: Driver not found!!!");
            }
            return con;
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error: Connection file error!!!");
            return con;
        }
    }
    
    public static void main(String args[]) {
        con = connection.getConnection();            
    }
    
    public static ResultSet dbSelectProc( String procedure, String [] params ) throws SQLException{
        String statement = "{ call "+ procedure +"(";
        for(int i=0; i < params.length ;i++){
           if (i+1 == params.length) {
               statement +="?";
           }
           else {
               statement +="?, ";
           }      
           
        }
        statement += ") }";
        
        //System.out.println(statement);
        
        CallableStatement proc = con.prepareCall(statement);
        for(int i=0; i < params.length ;i++){
            proc.setString(i+1,params[i]);
            //System.out.println(params[i]);
        }
        return proc.executeQuery();
    }
    
    public static int dbExecuteProc( String procedure, String [] params ) throws SQLException{
        String statement = "{ call "+ procedure +"(";
        for(int i=0; i < params.length ;i++){
           if (i+1 == params.length) {
               statement +="?";
           }
           else {
               statement +="?, ";
           }      
           
        }
        statement += ") }";
        
        CallableStatement proc = con.prepareCall(statement);
        for(int i=0; i < params.length ;i++){
            proc.setString(i+1,params[i]);
        }
        return proc.executeUpdate();
    }
    
    public static ResultSet dbSelect( String sql, String [] params ) throws SQLException{
        PreparedStatement pst;
        //System.out.println(sql);
        pst = con.prepareStatement(sql);
        for(int i=0; i < params.length ;i++){
            pst.setString(i+1,params[i]);
        }
        //displayResultSet(pst.executeQuery());
        return pst.executeQuery();
    }
    
    public static int dbExecuteReturnID(String sql, String [] params ) throws SQLException{
        PreparedStatement pst;
        //System.out.println(sql);
        pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        for(int i=0; i < params.length ;i++){
            //System.out.println(params[i]);
            pst.setString(i+1,params[i]);
        }
        
        int numero = pst.executeUpdate();
        
        ResultSet rs = pst.getGeneratedKeys();
        int ID = 0;
        
        if (rs.next()){
            ID=rs.getInt(1);
        }        
        
        return ID;
        
    }
    
    public static int dbExecute(String sql, String [] params ) throws SQLException{
        PreparedStatement pst;
        //System.out.println(sql);
        pst = con.prepareStatement(sql);
        for(int i=0; i < params.length ;i++){
            //System.out.println(params[i]);
            pst.setString(i+1,params[i]);
        }
        return pst.executeUpdate();
    }
    
    public static void displayResultSet(ResultSet rs ) throws SQLException{
        ResultSetMetaData rsmd = rs.getMetaData();
                
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = rs.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }
    }
}