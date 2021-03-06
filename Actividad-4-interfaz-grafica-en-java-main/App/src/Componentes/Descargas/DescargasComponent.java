/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.Descargas;

import Componentes.Inicio.InicioTemplate;
import client.VistaPrincipal.VistaPrincipalComponent;

/**
 *
 * @author empc2
 */
public class DescargasComponent {
    private VistaPrincipalComponent vpc;
    private DescargasTemplate dt; 
    
    public DescargasComponent(VistaPrincipalComponent VPC){
         this.vpc = VPC;
         this.dt = new DescargasTemplate(this);
    }
    
    public DescargasTemplate getDescargasTemplate(){
        return dt;
    }
    
}
