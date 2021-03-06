/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.ListaDeSeguimiento;

import Componentes.Descargas.DescargasTemplate;
import client.VistaPrincipal.VistaPrincipalComponent;

/**
 *
 * @author empc2
 */
public class ListaDeSeguimientoComponent {
    private VistaPrincipalComponent vpc;
    private ListaDeSeguimientoTemplate lt; 
    
    public ListaDeSeguimientoComponent(VistaPrincipalComponent VPC){
         this.vpc = VPC;
         this.lt = new ListaDeSeguimientoTemplate(this);
    }
    
    public ListaDeSeguimientoTemplate getListaDeSeguimientoTemplate(){
        return lt;
    }
}
