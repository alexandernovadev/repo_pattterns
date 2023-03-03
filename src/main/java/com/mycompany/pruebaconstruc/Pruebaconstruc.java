/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebaconstruc;

/**
 *
 * @author USUARIO
 */
public class Pruebaconstruc {

    public static void main(String[] args) {
        Figuras figuras = new Figuras();
        Cuadrado c1 = new Cuadrado();
        Circulo c2 = new Circulo();
        figuras.addFigura(c1);
        figuras.addFigura(c2);
        figuras.dibujarFiguras();
    }
}


//1.:La clase Figuras no cumple el Principio OCP (Open-Closed Principle) ya que no está abierta 
//a la extensión, y para agregar una nueva figura como un triángulo, por ejemplo, 
//sería necesario modificar la clase Figuras. Además, si se desea cambiar el comportamiento 
//de dibujo de una figura, también se debería modificar la clase Figuras.



//3.Sí, la tarea realizada puede considerarse una refactorización, ya que se ha mejorado 
//el diseño de las clases para que sean más flexibles y extensibles, sin cambiar su
// comportamiento.


