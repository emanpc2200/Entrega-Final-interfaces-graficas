/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.Inicio;

import client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author empc2
 */
public class InicioComponent implements ActionListener {
    private VistaPrincipalComponent vpc;
    private InicioTemplate it; 
    private int direccion = 0;
    private Timer timer;
    
    public InicioComponent(VistaPrincipalComponent VPC){
         this.vpc = VPC;
         it = new InicioTemplate(this);
         this.timer = new Timer(1,this);
    }
    
    public InicioTemplate getInicioTemplate(){
        return it;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(it.getBotones(1))){
            System.out.println("izquierda");
        }
        if(e.getSource().equals(it.getBotones(2))){
            System.out.println("derecha");
        }
        timer.start();
        moverImagenes();
    }
    public void moverImagenes() {
        it.getPanelMarco().setLocation(it.getPanelMarco().getX()-100, 0);
        
        
        }    
        
    }
    

