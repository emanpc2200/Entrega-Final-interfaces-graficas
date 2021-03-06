/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.NavegacionUsuario;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import services.ObjetosGraficosServices;
import services.RecursosServices;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author empc2
 */
public class NavegacionUsuarioTemplate extends JPanel {
    
    private NavegacionUsuarioComponent nUcomponent;
    private ObjetosGraficosServices S;
    private RecursosServices R;
    private ImageIcon Idescargas,iLista,iInfantil,Ihome,Ipeliculas,Iseries,iBuscar,ilogo,Idescargasb,iListab,iInfantilb,Ihomeb,Ipeliculasb,Iseriesb,iBuscarb,ilogob;
    private JButton jDescargas,jlista,jinfantil,jhome,jpeliculas,jseries;
    private Border bd,bBusqueda;
    private Color colorFont;
    private Font fuentePopciones,fuenteBusqueda;
    private JTextField buscar;
    private JLabel jBuscar,Jlogo;
    
     public NavegacionUsuarioTemplate(NavegacionUsuarioComponent nuc){

         
         this.nUcomponent = nuc;
         this.S = ObjetosGraficosServices.getService();
         this.R = RecursosServices.getService();
         
         crearObjetosDecoradores();
         crearJLabels();
         crearJTextField();
         crearJButtons();
         
         this.setSize(320, 688);
         this.setLocation(0, 0);
         this.setBackground(R.getColorBase());
         this.setLayout(null);
         this.setVisible(true);
     }
     public void crearJButtons(){
        this.jhome = S.construirJButton("   Inicio", 8, 142, 320,52,null, Ihome, fuentePopciones, null, colorFont, null, "l", false);
        jhome.addActionListener(nUcomponent);
        jhome.addMouseListener(nUcomponent);
        this.add(jhome);
        this.jseries = S.construirJButton("   Series", 8, 194, 320,52,null,Iseries , fuentePopciones, null, colorFont, null, "l", false);
        jseries.addActionListener(nUcomponent);
        jseries.addMouseListener(nUcomponent);
        this.add(jseries);
        this.jpeliculas = S.construirJButton("   Peliculas", 8, 246, 320,52,null, Ipeliculas, fuentePopciones, null, colorFont, null, "l", false);
        jpeliculas.addActionListener(nUcomponent);
        jpeliculas.addMouseListener(nUcomponent);
        this.add(jpeliculas);
        this.jinfantil = S.construirJButton("   Infantil", 8, 298, 320,52,null,iInfantil , fuentePopciones, null, colorFont, null, "l", false);
        jinfantil.addActionListener(nUcomponent);
        jinfantil.addMouseListener(nUcomponent);
        this.add(jinfantil);
        this.jDescargas = S.construirJButton("   Descargas", 8, 350, 320,52,null, Idescargas, fuentePopciones, null, colorFont, null, "l", false);
        jDescargas.addActionListener(nUcomponent);
        jDescargas.addMouseListener(nUcomponent);
        this.add(jDescargas);
        this.jlista = S.construirJButton("   Lista de Seguimiento", 8, 402, 320,52,null,iLista , fuentePopciones, null, colorFont, null, "l", false);
        jlista.addActionListener(nUcomponent);
        jlista.addMouseListener(nUcomponent);
        this.add(jlista);
        
     }
     public void crearJLabels(){
         jBuscar = S.construirJLabel("", 0, 94, 52, 40,null, iBuscar, null, null, null, null, "");
         this.add(jBuscar);
         Jlogo = S.construirJLabel("",0, 37, 320, 57, null,ilogo, null, null, null, null, "");
         this.add(Jlogo);
     }
     public void crearJTextField(){
         this.buscar = S.construirJTextField(" Buscar", 52, 94, 248, 40, fuenteBusqueda, R.getColorBase(), colorFont, colorFont, bBusqueda, "");
         this.add(buscar);
     }
     public void crearObjetosDecoradores(){
        this.Idescargas = new ImageIcon("resources/images/Descargas.png");
        this.iLista = new ImageIcon("resources/images/lista.png");
        this.iInfantil = new ImageIcon("resources/images/infantil.png");
        this.Ipeliculas = new ImageIcon("resources/images/peliculas.png");
        this.Iseries = new ImageIcon("resources/images/series.png");
        this.Ihome = new ImageIcon("resources/images/home.png");
        this.iBuscar = new ImageIcon("resources/images/buscar.png");
        this.ilogo = new ImageIcon("resources/images/logo.PNG");
        this.Idescargasb = new ImageIcon("resources/images/Descargas blanco.png");
        this.iListab = new ImageIcon("resources/images/lista blanco.png");
        this.iInfantilb = new ImageIcon("resources/images/infantil blanco.png");
        this.Ipeliculasb = new ImageIcon("resources/images/peliculas blanco.png");
        this.Iseriesb = new ImageIcon("resources/images/series blanco.png");
        this.Ihomeb = new ImageIcon("resources/images/home blanco.png"); 
        this.bd = new EmptyBorder(2,20,2,2);
        this.colorFont = new Color(129,151,164);
        this.bBusqueda = BorderFactory.createLineBorder(colorFont);
        this.fuentePopciones = new Font("Arial", 1, 18);
        this.fuenteBusqueda = new Font("Arial", 0, 18);

     }
     public JButton getBotonJhome(){
         return jhome;
     }
     public JButton getBotonJseries(){
         return jseries;
     }  
     public JButton getjpeliculas(){
         return jpeliculas;
     }
     public JButton getjinfantil(){
         return jinfantil;
     }
     public JButton getjDescargas(){
         return jDescargas;
     }    
     public Color getColorfuente(){
         return colorFont;
     }
     public JButton getjlista(){
         return jlista;
     }
     public void CambiarColorJhome(Color c){
         jhome.setForeground(c);
         jDescargas.repaint();
     }
     public void CambiarColorJseries(Color c){
         jseries.setForeground(c);
         jDescargas.repaint();
     }  
     public void CambiarColorJpeliculas(Color c){
         jpeliculas.setForeground(c);
         jDescargas.repaint();
     }
     public void CambiarColorJinfantil(Color c){
         jinfantil.setForeground(c);
         jDescargas.repaint();
     }
     public void CambiarColorjDescargas(Color c){
        jDescargas.setForeground(c);
        jDescargas.repaint();
     }    
     public void CambiarColorjlista(Color c){
         jlista.setForeground(c);
         jDescargas.repaint();
     }
     public void CambiarColorBotonHome(int num){
         if (num == 1){
             jhome.setIcon(Ihome);
         }else{
             jhome.setIcon(Ihomeb);
         }
     }
    public void CambiarColorjpeliculas(int num){
         if (num == 1){
             jpeliculas.setIcon(Ipeliculas);
         }else{
             jpeliculas.setIcon(Ipeliculasb);
         }
     }
    public void CambiarColoriLista(int num){
         if (num == 1){
             jlista.setIcon(iLista);
         }else{
             jlista.setIcon(iListab);
         }
     }
     public void CambiariInfantil(int num){
         if (num == 1){
             jinfantil.setIcon(iInfantil);
         }else{
             jinfantil.setIcon(iInfantilb);
         }
         
     }
     public void CambiarIdescargas(int num){
         if (num == 1){
             jDescargas.setIcon(Idescargas);
         }else{
            jDescargas.setIcon(Idescargasb);
         }
         
     }
     public void Cambiarjseries(int num){
         if (num == 1){
             jseries.setIcon(Iseries);
         }else{
            jseries.setIcon(Iseriesb);
         }
         
     }
     
   
     //Iseries
}
     

