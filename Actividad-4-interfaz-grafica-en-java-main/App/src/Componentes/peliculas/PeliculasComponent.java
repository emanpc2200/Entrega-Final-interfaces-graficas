/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.peliculas;

import Componentes.infantil.InfantilTemplate;
import client.VistaPrincipal.VistaPrincipalComponent;

/**
 *
 * @author empc2
 */
public class PeliculasComponent {
    private VistaPrincipalComponent vpc;
    private PeliculasTemplate pt;
    public PeliculasComponent(VistaPrincipalComponent VPC){
         this.vpc = VPC;
         this.pt = new PeliculasTemplate(this);
    }
     public PeliculasTemplate getPeliculasTemplate(){
        return pt;
    }
}
