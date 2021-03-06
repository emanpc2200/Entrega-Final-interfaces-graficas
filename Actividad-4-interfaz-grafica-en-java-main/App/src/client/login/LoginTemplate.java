/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.login;

import client.login.LoginComponent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font; 
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import services.ObjetosGraficosServices;
import javax.swing.border.Border;
import services.RecursosServices;

/**
 *
 * @author Emanuel P
 */
public class LoginTemplate extends JFrame{
    private JPanel pCentral,pFondo,pBarra;
    private JLabel jlogin,jemail,jpassword,jForget,recuerdame,lLogo;
    private JTextField tfcorreo;
    private JPasswordField tfcontrasena;
    private JButton bEntrar,bRegistrarme,bCerrar;
    private JCheckBox checkSi;
    
    private LoginComponent LoginComponent;
    private ObjetosGraficosServices S;
    private RecursosServices R;
   
    
    public void crearPaneles(){
            pBarra = S.construirJPanel(0, 0, 1280, 32, null, null);
            this.add(pBarra);
    
            pCentral = S.construirJPanel(440, 150, 400, 500, Color.WHITE, R.getBborde()); 
            this.add(pCentral);
            pFondo = S.construirJPanel(0, 0, 1280, 720, Color.WHITE, null);
            this.add(pFondo);
    }        
    
    
    public void crearJFields(){
            tfcorreo = S.construirJTextField("", 40, 142, 320, 30, null, Color.WHITE, Color.BLACK, Color.BLUE, R.getBborde(), "");
            tfcorreo.setCursor(R.getCtext());
            pCentral.add(tfcorreo);
          
            tfcontrasena = S.construirJPasswordField("", 40, 200, 320, 30, null, Color.WHITE, Color.BLACK, Color.BLUE, R.getBborde(), "");
            tfcontrasena.setCursor(R.getCtext());
            pCentral.add(tfcontrasena);
            
    }
    public void crearJlabels(){
            lLogo = S.construirJLabel("", (pFondo.getWidth() - 198) / 2, 50, 198, 73, null, R.getLogo(), null, Color.WHITE, Color.BLACK, null, "");
            pFondo.add(lLogo);
            
            jlogin = S.construirJLabel("Iniciar Sesion", 40, 50, 200, 50, null, null, R.getFuente(), Color.WHITE, Color.BLACK, null, "");
            pCentral.add(jlogin);
            
            jemail =  S.construirJLabel("Dirección de e-mail o número de teléfono móvil ", 40, 110, 280, 30, null, null, null, Color.WHITE, Color.GRAY, null, "");
            pCentral.add(jemail);
            
            jpassword = S.construirJLabel("Contraseña ", 40, 170, 100, 30, null, null, null, Color.WHITE, Color.GRAY, null, "");
            pCentral.add(jpassword);
            
            jForget = S.construirJLabel("¿Has olvidado la contraseña? ", 150, 170, 200, 30, null, null, null, Color.WHITE, Color.BLUE, null, "");
            pCentral.add(jForget);

            recuerdame = S.construirJLabel("Recuérdame", 65, 367, 280, 30, null, null, null, Color.WHITE, Color.BLACK, null, "");
            pCentral.add(recuerdame);
    }
    
    public void crearJbuttons(){
            bEntrar = S.construirJButton("Iniciar Sesion", 40, 250, 320, 35, R.getCMano(), null, null, R.getColorEnfasis(), Color.BLACK, null, "", rootPaneCheckingEnabled);
            bEntrar.addActionListener(LoginComponent);
            pCentral.add(bEntrar);
            
            
            bRegistrarme = S.construirJButton("Crea tu cuenta de Amazon", 40, 400, 320, 35, R.getCMano(), null, null, R.getColorComplemento(), Color.BLACK, null, "", rootPaneCheckingEnabled);
            pCentral.add(bRegistrarme);
    }
    public void crearJCheckBox(){
            checkSi = new JCheckBox("");
            checkSi = S.construirJCheckBox("", 40, 370, 25, 25, R.getCMano(), null, Color.WHITE);
            pCentral.add(checkSi);
            
    }
    public JButton getBotonclose(){
        return bCerrar;
    }
    public JButton getEntrar(){
        return bEntrar;
    }
    public JButton getRegistrarme(){
        return bRegistrarme;
    }
    public JTextField getUsuario(){
        return tfcorreo;
    }
    public JPasswordField getPassword(){
        return tfcontrasena;
    }
    public void addPanel(JPanel p){
        pBarra.add(p);
    }
    

    
    public  LoginTemplate(LoginComponent lc){ 
            
            this.LoginComponent = lc;
            S = ObjetosGraficosServices.getService();
            R = RecursosServices.getService();
            
            
            crearPaneles();
            crearJFields();
            crearJlabels();
            crearJbuttons();
            crearJCheckBox();

            this.setLayout(null); 
            this.setUndecorated(true);
            this.setSize(1280 , 720);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.setIconImage(R.getLogoBarra().getImage());
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
    }
    
}
