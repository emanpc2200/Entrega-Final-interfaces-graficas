/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.VistaPrincipal;

import Barra.BarraComponent;
import Componentes.Descargas.DescargasComponent;
import Componentes.Inicio.InicioComponent;
import Componentes.ListaDeSeguimiento.ListaDeSeguimientoComponent;
import Componentes.NavegacionUsuario.NavegacionUsuarioComponent;
import Componentes.infantil.infantilComponent;
import Componentes.peliculas.PeliculasComponent;
import Componentes.series.SeriesComponent;
import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author empc2
 */
public class VistaPrincipalComponent {
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private BarraComponent bt;
    private NavegacionUsuarioComponent nuc;
    private InicioComponent ic;
    private infantilComponent icomp;
    private PeliculasComponent pec;
    private SeriesComponent sct;
    private DescargasComponent dct;
    private ListaDeSeguimientoComponent lsc;
    public VistaPrincipalComponent(){
        vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        bt = new BarraComponent(this);
        vistaPrincipalTemplate.addPanelBarra(bt.getBarraTemplate());
        nuc = new NavegacionUsuarioComponent(this);
        vistaPrincipalTemplate.addPanelOpciones(nuc.getNavegacionUsuarioTemplate());
        ic = new InicioComponent(this);
        icomp = new infantilComponent(this);
        pec = new PeliculasComponent(this);
        sct = new SeriesComponent(this);
        dct = new DescargasComponent(this);
        lsc = new ListaDeSeguimientoComponent(this);
        vistaPrincipalTemplate.addPanelListado(ic.getInicioTemplate());
        
        
    }
    public void cerrar() {
        System.exit(0);
    }

    public void minimizar() {
      this.vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }
    public VistaPrincipalTemplate getVistaTemplate(){
        return this.vistaPrincipalTemplate;
    }
    public void mostrarComponentes(String comando){
        vistaPrincipalTemplate.getPanelListado().removeAll();
        switch(comando){
            case "Inicio":
                vistaPrincipalTemplate.addPanelListado(ic.getInicioTemplate());
                break;
             case "Series":
                 vistaPrincipalTemplate.addPanelListado(sct.getSeriesTemplate());
                break;
             case "Peliculas":
                 vistaPrincipalTemplate.addPanelListado(pec.getPeliculasTemplate());
                break;
              case "Infantil":
                  vistaPrincipalTemplate.addPanelListado(icomp.getInfantilTemplate());
                break;
              case "Descargas":
                 vistaPrincipalTemplate.addPanelListado(dct.getDescargasTemplate());
                break;
              case "Lista de Seguimiento":
                 vistaPrincipalTemplate.addPanelListado(lsc.getListaDeSeguimientoTemplate());
                break;               
                
        }
        vistaPrincipalTemplate.repaint();
    }
    
}
