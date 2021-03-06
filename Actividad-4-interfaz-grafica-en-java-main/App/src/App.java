/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import client.login.LoginComponent;
import javax.swing.SwingUtilities;
import client.login.LoginTemplate;

/**
 *
 * @author Emanuel P
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
            LoginComponent login = new LoginComponent();
            }
            
        };
       
        
     SwingUtilities.invokeLater(runApplication);
    }
    
}
