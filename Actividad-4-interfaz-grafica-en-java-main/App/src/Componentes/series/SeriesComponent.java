/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.series;

import Componentes.peliculas.PeliculasTemplate;
import client.VistaPrincipal.VistaPrincipalComponent;

/**
 *
 * @author empc2
 */
public class SeriesComponent {
    private VistaPrincipalComponent vpc;
    private SeriesTemplate st;
    public SeriesComponent(VistaPrincipalComponent VPC){
         this.vpc = VPC;
         st = new SeriesTemplate(this);
    }
    public SeriesTemplate getSeriesTemplate(){
        return st;
    }
}
