/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barra;

import client.VistaPrincipal.VistaPrincipalComponent;
import client.login.LoginComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author empc2
 */
public class BarraComponent implements ActionListener{
    private BarraTemplate barraTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private LoginComponent lc;
    
    public BarraComponent(VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.barraTemplate = new BarraTemplate(this);
    }
    public BarraComponent(LoginComponent LoComp){
        this.barraTemplate = new BarraTemplate(this);
        this.lc = LoComp;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==barraTemplate.getBotonclose()){
            if(lc.getLoginTemplate().isVisible()){
                
                lc.cerrar();
                
            }
            else{
               
                vistaPrincipalComponent.cerrar();
            }
            
            
            
        }
        if(e.getSource() ==barraTemplate.getMinimize()){
            
            if(lc.getLoginTemplate().isVisible()){
                
                lc.minimizar();
            }
            else{
               
                vistaPrincipalComponent.minimizar();
            }
            
        }
        
    }
    public BarraTemplate getBarraTemplate(){
        
        return this.barraTemplate;
    }
}
