/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.infantil;

import Componentes.Inicio.InicioTemplate;
import client.VistaPrincipal.VistaPrincipalComponent;

/**
 *
 * @author empc2
 */
public class infantilComponent {
    private VistaPrincipalComponent vpc;
    private InfantilTemplate it;
    public infantilComponent(VistaPrincipalComponent VPC){
         this.vpc = VPC;
         it = new InfantilTemplate(this);
    }
    public InfantilTemplate getInfantilTemplate(){
        return it;
    }
    
}
