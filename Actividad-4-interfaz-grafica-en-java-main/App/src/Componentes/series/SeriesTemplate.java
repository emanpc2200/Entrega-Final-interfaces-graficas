/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.series;

import Componentes.peliculas.PeliculasComponent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import services.ObjetosGraficosServices;
import services.RecursosServices;

/**
 *
 * @author empc2
 */
public class SeriesTemplate extends JPanel{
    private SeriesComponent sc;
    private ObjetosGraficosServices S;
    private RecursosServices R;
    private ImageIcon des;
    private JLabel desca;
    
    public SeriesTemplate(SeriesComponent sc){
        this.sc = sc;
        this.S = ObjetosGraficosServices.getService();
        this.R = RecursosServices.getService();
         crearElementos();
         this.add(desca);
         this.setSize(960, 688);
         this.setLocation(0, 0);
         this.setBackground(R.getColorListado());
         this.setLayout(null);
         this.setVisible(true);
    }
    public void crearElementos(){
        this.des = new ImageIcon("resources/images/animaciones/series.PNG");
        this.desca = S.construirJLabel("", 0, 0, 960, 688,null, des, null, null, null, null, "");
    }
}
