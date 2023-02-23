/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc;


import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author USUARIO
 */
public class Figuras {
    Vector<FiguraDibujable> figuras = new Vector<FiguraDibujable>();


public void addFigura(FiguraDibujable figura) {
    figuras.add(figura);
}

public void dibujarFiguras() {
    Enumeration<FiguraDibujable> figs = figuras.elements();
    FiguraDibujable figura;
    while (figs.hasMoreElements()) {
        figura = figs.nextElement();
        figura.dibujar();
    }
}
}
