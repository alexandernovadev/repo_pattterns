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


