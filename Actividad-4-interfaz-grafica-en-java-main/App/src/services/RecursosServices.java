/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author Emanuel P
 */
public class RecursosServices {
    
  private Color colorEnfasis,colorComplemento,colorBase,colorListado;
  private Font fuente,fuenteVistaPrincipal;
  private Cursor cMano,cText;
  private Border borde;
  private ImageIcon logo,close,logoHome,logoBarra;
  static private RecursosServices servicio;

  private RecursosServices() {
    this.crearColores();
    this.crearFuentes();
    this.crearCursores();
    this.crearBordes();
    this.crearImagenes();
  }

  private void crearColores() {
    colorEnfasis = new Color(242,200,95);
    colorComplemento = new Color(234,236,239);
    colorBase = new Color(27,37,48);
    colorListado = new Color(15,23,30);
  }

  private void crearFuentes() {
     fuente = new Font("Arial", 1, 20);
     fuenteVistaPrincipal = new Font("Arial", 1, 20);
  }

  private void crearCursores() { cMano = new Cursor(Cursor.HAND_CURSOR); }

  private void crearBordes() {borde = BorderFactory.createLineBorder(Color.black);}

  private void crearImagenes() {
     logo = new ImageIcon("resources/images/PrimeVideo.PNG");
     close = new ImageIcon("resources/images/close.png");
     logoHome = new ImageIcon("resources/images/Logo.PNG");
     logoBarra = new ImageIcon("resources/images/logobarra.PNG");
  }


  public Color getColorEnfasis() { return colorEnfasis; }

  public Color getColorComplemento() { return colorComplemento; }
  
  public Color getColorBase(){return colorBase;}
  
  public Color getColorListado(){return colorListado;}

  public Font getFuente() { return fuente; }
  
  public Font getFuenteVistaPrincipal() { return fuenteVistaPrincipal; }

  public Cursor getCMano() { return cMano; }
  
   public Cursor getCtext() { return cText; }

  public Border getBborde() { return borde; }

  public ImageIcon getLogo() { return logo; }
  
  public ImageIcon getClose() { return close; }
  
  public ImageIcon getLogoBarra() { return logoBarra; }

  public static RecursosServices getService() {
    if (servicio == null) servicio = new RecursosServices();
    return servicio;
  }
  public ImageIcon getLogoHome() { return logoHome; }
}
