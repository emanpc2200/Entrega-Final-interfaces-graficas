/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barra;

import client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import services.ObjetosGraficosServices;
import services.RecursosServices;

/**
 *
 * @author empc2
 */
public class BarraTemplate extends JPanel {
    private BarraComponent bc;
    private ObjetosGraficosServices S;
    private RecursosServices R;
    private ImageIcon close,minimizar;
    private JButton bCerrar,bMinimizar;
    private JLabel name;
 
    
    
   

    public BarraTemplate(BarraComponent bc){
         this.bc = bc; 
         S = ObjetosGraficosServices.getService();
         R = RecursosServices.getService();
         CrearObjetosDecoradores();
         crearBotones();
         CrearJlabels();
         
        
         this.setSize(1280, 32);
         this.setLocation(0, 0);
         this.setVisible(true);
         this.setLayout(null);
         this.setBackground(R.getColorBase());
    }
   public void CrearObjetosDecoradores(){
       this.close = new ImageIcon("resources/images/close.png");
       this.minimizar = new ImageIcon("resources/images/minimizar.PNG");
   }
   public void crearBotones(){
       bCerrar = S.construirJButton("", 1236,0, 44, 32, null, close, null, null, null, null, "", false);
       bCerrar.addActionListener(bc);
       this.add(bCerrar);
       bMinimizar = S.construirJButton("", 1193,0, 43, 32, null, minimizar, null, null, null, null, "",false);
       bMinimizar.addActionListener(bc);
       this.add(bMinimizar);
   }
    private void CrearJlabels(){
        this.name = S.construirJLabel("Amazon Prime Video for Windows", 10, 12, 200, 9, null, null, null, null, Color.WHITE, null, "");
        this.add(name);
    }
    public JButton getBotonclose(){
        return bCerrar;
    }
    public JButton getMinimize(){
        return bMinimizar;
    }
}
