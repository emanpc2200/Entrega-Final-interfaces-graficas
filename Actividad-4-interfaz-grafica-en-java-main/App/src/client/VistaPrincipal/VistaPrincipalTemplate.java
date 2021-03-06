/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.VistaPrincipal;


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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import services.ObjetosGraficosServices;
import javax.swing.border.Border;
import services.RecursosServices;

/**
 *
 * @author Emanuel P
 */
public class VistaPrincipalTemplate extends JFrame{
    private VistaPrincipalComponent vc;
    private ObjetosGraficosServices S;
    private RecursosServices R;
    private JButton inicio,series,peliculas,infantil,deplazarDerecha,desplazarIzquierda;
    private JLabel lLogo;
    private JPanel pBarra,pOpciones,pListado;
    private JScrollPane sPanel;
    
    
   

    public VistaPrincipalTemplate(VistaPrincipalComponent vC){
         this.vc = vC;
         S = ObjetosGraficosServices.getService();
         R = RecursosServices.getService();
         crearPaneles();
         //crearBotones();
         crearJlabels();
         
         //crearJlabels();
        
         this.setLayout(null); 
         this.setUndecorated(true);
         this.setSize(1280 , 720);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setIconImage(R.getLogoBarra().getImage());
         this.setVisible(true);
    }
    public void crearPaneles(){
            this.pBarra = S.construirJPanel(0, 0, 1280, 32, null, null);
            this.add(pBarra);
            this.pOpciones = S.construirJPanel(0, 32, 320, 688, null, null);
            pOpciones.setVisible(true);
            this.add(pOpciones);
            this.pListado = S.construirJPanel(320, 32, 960, 688, null, null);
            this.add(pListado);
           
    }
    
    public void crearJlabels(){
    }
    public void crearBotones(){

    }
    
    public void addPanelBarra(JPanel p){
        pBarra.add(p);
    }
    public void addPanelOpciones(JPanel p){
        pOpciones.add(p);
    }
    public JPanel getPanelOpciones(){
        return pOpciones;
    }
    public void addPanelListado(JPanel p){
        pListado.add(p);
    }
    public JPanel getPanelListado(){
        return pListado;
    }
    
}
