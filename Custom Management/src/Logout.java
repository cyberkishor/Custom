/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JOptionPane;

/**
 *
 * @author catchlrnovo
 */
public class Logout {
    Logout(){
        if ( JOptionPane.showConfirmDialog(null, "Are you Sure?", "Logout!!!",JOptionPane.OK_CANCEL_OPTION) == 0 ){
            System.exit(0);
        }
    }
}
