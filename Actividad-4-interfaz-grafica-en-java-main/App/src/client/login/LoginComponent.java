/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.login;
import Barra.BarraComponent;
import client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import client.login.LoginTemplate;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author empc2
 */
public class LoginComponent implements ActionListener{
    
    private LoginTemplate LoginTemplate;
    private VistaPrincipalComponent vPrinT;
    private BarraComponent bt;
    
    
    public LoginComponent(){
        LoginTemplate = new LoginTemplate(this);
        bt = new BarraComponent(this);
        LoginTemplate.addPanel(bt.getBarraTemplate());
 
        
    }
    
    public LoginTemplate getLoginTemplate(){
        return LoginTemplate;
    }
     public void cerrar() {
    System.exit(0);
    }

    public void minimizar() {
      this.LoginTemplate.setExtendedState(Frame.ICONIFIED);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== LoginTemplate.getEntrar()){
          entrar();
        }
        if(e.getSource()==LoginTemplate.getRegistrarme()){
            try {

            Desktop.getDesktop().browse(new URI("https://www.amazon.com/ap/register?clientContext=132-2919601-3504760&showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&language=es_ES&pageId=amzn_prime_video_desktop_us&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_encoding%3DUTF8%26location%3D%252Fref%253Ddv_auth_ret&prevRID=JP16MHABBN439W2VV6HV&openid.assoc_handle=amzn_prime_video_desktop_us&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"));} 
            
            catch (URISyntaxException ex) {

            System.out.println(ex);
            } catch (IOException ex) {
                Logger.getLogger(LoginComponent.class.getName()).log(Level.SEVERE, null, ex);
            }    
        
        }
    }
    public void entrar(){
        String usr = LoginTemplate.getUsuario().getText();
        String passwd = new String(LoginTemplate.getPassword().getPassword());
        boolean registrado = false;
        
        String[] Usuarios = new String[2]; 
        String[] claves = new String[2]; 
        Usuarios[0] = "emanpc2200";
        claves[0] = "guitar0422";
        Usuarios[1] = "CrissUD";
        claves[1] = "123456";
        for (int i = 0;i<=1;i++){
            if( Usuarios[i].equals(usr) & claves[i].equals(passwd) ){
                registrado = true;
            }
        }
        if(registrado){
            LoginTemplate.setVisible(false);
            vPrinT = new VistaPrincipalComponent();
        }
        else{
            JOptionPane.showMessageDialog(null, "Usted no se encuetra registrado");
        }
        
    }

}
