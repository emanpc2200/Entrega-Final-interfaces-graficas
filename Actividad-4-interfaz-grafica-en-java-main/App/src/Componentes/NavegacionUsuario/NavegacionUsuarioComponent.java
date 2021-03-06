/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes.NavegacionUsuario;

import client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import services.ObjetosGraficosServices;
import services.RecursosServices;

/**
 *
 * @author empc2
 */
public class NavegacionUsuarioComponent implements ActionListener,MouseListener{
    private NavegacionUsuarioTemplate nUTemplate;
    private VistaPrincipalComponent vpc;
    public NavegacionUsuarioComponent(VistaPrincipalComponent VPC){
        nUTemplate = new NavegacionUsuarioTemplate(this);
        this.vpc = VPC;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vpc.mostrarComponentes(e.getActionCommand().trim());
        
    }
    public NavegacionUsuarioTemplate getNavegacionUsuarioTemplate(){
        return this.nUTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource().equals(nUTemplate.getBotonJhome())){
            nUTemplate.CambiarColorJhome(Color.WHITE);
            nUTemplate.CambiarColorBotonHome(2);
        }
        if(e.getSource().equals(nUTemplate.getBotonJseries())){
            nUTemplate.CambiarColorJseries(Color.WHITE);
            nUTemplate.Cambiarjseries(2);
        }
        if(e.getSource().equals(nUTemplate.getjpeliculas())){
            nUTemplate.CambiarColorJpeliculas(Color.WHITE);
            nUTemplate.CambiarColorjpeliculas(2);
        } 
        if(e.getSource().equals(nUTemplate.getjinfantil())){
            nUTemplate.CambiarColorJinfantil(Color.WHITE);
            nUTemplate.CambiariInfantil(2);
        } 
        if(e.getSource().equals(nUTemplate.getjlista())){
            nUTemplate.CambiarColorjlista(Color.WHITE);
            nUTemplate.CambiarColoriLista(2);
        }
        if(e.getSource().equals(nUTemplate.getjDescargas())){
            nUTemplate.CambiarColorjDescargas(Color.WHITE);
            nUTemplate.CambiarIdescargas(2);
        }             
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(nUTemplate.getBotonJhome())){
            nUTemplate.CambiarColorJhome(nUTemplate.getColorfuente());
            nUTemplate.CambiarColorBotonHome(1);
        }    
        if(e.getSource().equals(nUTemplate.getBotonJseries())){
            nUTemplate.CambiarColorJseries(nUTemplate.getColorfuente());
            nUTemplate.Cambiarjseries(1);
        }
        if(e.getSource().equals(nUTemplate.getjpeliculas())){
            nUTemplate.CambiarColorJpeliculas(nUTemplate.getColorfuente());
            nUTemplate.CambiarColorjpeliculas(1);
        } 
        if(e.getSource().equals(nUTemplate.getjinfantil())){
            nUTemplate.CambiarColorJinfantil(nUTemplate.getColorfuente());
            nUTemplate.CambiariInfantil(1);
        }
        if(e.getSource().equals(nUTemplate.getjlista())){
            nUTemplate.CambiarColorjlista(nUTemplate.getColorfuente());
            nUTemplate.CambiarColoriLista(1);
        }
        if(e.getSource().equals(nUTemplate.getjDescargas())){
            nUTemplate.CambiarColorjDescargas(nUTemplate.getColorfuente());
            nUTemplate.CambiarIdescargas(1);
        }             
        
    }
}
