/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.Inicio;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import services.ObjetosGraficosServices;
import services.RecursosServices;

/**
 *
 * @author empc2
 */
public class InicioTemplate extends JPanel{
    private InicioComponent ic;
    private ObjetosGraficosServices S;
    private ImageIcon im1,im2,im3,im4,im5,im6,im7,im8,im9;
    private JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9;
    private RecursosServices R;
    private ImageIcon imagenP;
    private JPanel panelMarco;
    private JButton deplazarDerecha,desplazarIzquierda;
    private ImageIcon des;
    private JLabel desca;
    
    public InicioTemplate(InicioComponent ic){
        this.ic = ic;
        this.S = ObjetosGraficosServices.getService();
        this.R = RecursosServices.getService();
        this.panelMarco =S.construirJPanel(0, 0, 8640, 191, new Color(0,0,0,0), null);
        crearBotones();
        crearDecoradores();
        crearLabels();
        this.add(desca);
         this.add(panelMarco);
         this.setSize(960, 688);
         this.setLocation(0, 0);
         this.setBackground(R.getColorListado());
         this.setLayout(null);
         this.setVisible(true);
    }
    public void crearDecoradores(){
        this.im1 = new ImageIcon("resources/images/animaciones/aqua.PNG");
        this.im2 = new ImageIcon("resources/images/animaciones/good.PNG");
        this.im3 = new ImageIcon("resources/images/animaciones/boys.PNG");
        this.im4 = new ImageIcon("resources/images/animaciones/elfin.PNG");
        this.im5 = new ImageIcon("resources/images/animaciones/vampire.PNG");
        this.im6 = new ImageIcon("resources/images/animaciones/jhon.PNG");
        this.im7 = new ImageIcon("resources/images/animaciones/tiburon.PNG");
        this.im8 = new ImageIcon("resources/images/animaciones/hotel.PNG");
        this.im9 = new ImageIcon("resources/images/animaciones/rampage.PNG");
        this.des = new ImageIcon("resources/images/animaciones/inicio.PNG");
        this.desca = S.construirJLabel("", 0, 191, 953, 493,null, des, null, null, null, null, "");
    }
    public void crearLabels(){
       j1 = S.construirJLabel("", 0, 0, 960, 191,null, im1, null, null, null, null, "");
       panelMarco.add(j1);
       j2 = S.construirJLabel("", 960, 0, 960, 191,null, im2, null, null, null, null, "");
       panelMarco.add(j2);
       j3 = S.construirJLabel("", 1920, 0, 960, 191,null, im3, null, null, null, null, "");
       panelMarco.add(j3);      
       j4 = S.construirJLabel("", 2880, 0, 960, 191,null, im4, null, null, null, null, "");
       panelMarco.add(j4);
       j5 = S.construirJLabel("", 3840, 0, 960, 191,null, im5, null, null, null, null, "");
       panelMarco.add(j5);
       j6 = S.construirJLabel("", 4800, 0, 960, 191,null, im6, null, null, null, null, "");
       panelMarco.add(j6);
       j7 = S.construirJLabel("", 5760, 0, 960, 191,null, im7, null, null, null, null, "");
       panelMarco.add(j7);
       j8 = S.construirJLabel("", 6720, 0, 960, 191,null, im8, null, null, null, null, "");
       panelMarco.add(j8);
       j9 = S.construirJLabel("", 7680, 0, 960, 191,null, im9, null, null, null, null, "");
       panelMarco.add(j9);       
    }                                         
    public void crearBotones(){
    desplazarIzquierda = S.construirJButton("", 0, 73, 44, 44,null, null, null, new Color(0,0,0,0), null, null, "", false);
    desplazarIzquierda.addActionListener(ic);
    this.add(desplazarIzquierda);
    deplazarDerecha = S.construirJButton("", 916, 73, 44, 44,null, null, null, new Color(0,0,0,0), null, null, "", false);
    deplazarDerecha.addActionListener(ic);
    this.add(deplazarDerecha);
    }
    public JButton getBotonIzquierda(){
        return desplazarIzquierda;
    }
    public JButton getBotonDerecha(){
        return deplazarDerecha;
    }
    public JButton getBotones(int num){
        if (num == 1){
            return desplazarIzquierda;
        }
        if (num == 2){
            return deplazarDerecha;
        }
        else{
            return null;
        }
    }
    public JPanel getPanelMarco(){
        return panelMarco;
    }
}
