/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.Dip;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class main {
   
    public static void main(String[] args) {
        // Creamos un calculador de deducción y un calculador de IVA
        CalcularDeduccion calculadorDeduccion = new Deduccion();
        CalculadorIva calculadorIva = new Iva();

        // Creamos una factura y le pasamos los calculadores de deducción y de IVA
        Factura factura = new Factura(calculadorDeduccion, calculadorIva);
        factura.codigo = "F001";
        factura.fechaEmision = new Date();
        factura.importeFactura = 5000;
        factura.porcentajeDeduccion = 10;

        // Calculamos el total de la factura
        factura.calcularTotal();

        // Imprimimos los datos de la factura
        System.out.println("Código de factura: " + factura.codigo);
        System.out.println("Fecha de emisión: " + factura.fechaEmision);
        System.out.println("Importe de factura: " + factura.importeFactura);
        System.out.println("Porcentaje de deducción: " + factura.porcentajeDeduccion);
        System.out.println("Importe de deducción: " + factura.importeDeduccion);
        System.out.println("Importe de IVA: " + factura.importeIVA);
        System.out.println("Importe total: " + factura.importeTotal);
    }
}


//1.El código no cumple con el principio de Inversión de Dependencia ya que la clase Factura tiene una dependencia directa con las clases Deduccion e Iva, lo que significa que cualquier cambio en estas clases afectará a la clase Factura. Además, la clase Factura está creando instancias de estas clases dentro del método calcularTotal(), lo que aumenta el acoplamiento entre estas clases.

//2.Para cumplir con el principio de Inversión de Dependencia, podríamos utilizar una interfaz para abstraer la funcionalidad de cálculo de deducción y de IVA, y luego inyectar estas dependencias en la clase Factura a través del constructor o un método set. Esto permite que la clase Factura dependa de una abstracción en lugar de una implementación concreta, lo que hace que sea más fácil cambiar la implementación en el futuro sin afectar a la clase Factura. Por ejemplo: