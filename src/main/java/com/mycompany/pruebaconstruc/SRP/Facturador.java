/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.SRP;

/**
 *
 * @author USUARIO
 */
public class Facturador {

    CalculadoraDeduccion calculadoraDeduccion;
    CalculadoraIva calculadoraIVA;

    public Facturador() {
        this.calculadoraDeduccion = new CalculadoraDeduccion();
        this.calculadoraIVA = new CalculadoraIva();
    }

    public float calcularImporteTotal(float importeFactura, int porcentajeDeduccion, float tasaIVA) {
        float importeDeduccion = calculadoraDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        float importeIVA = calculadoraIVA.calcularIVA(importeFactura, tasaIVA);
        float importeTotal = importeFactura - importeDeduccion + importeIVA;
        return importeTotal;
    }
}
//1. Para cumplir con el principio SRP, se podría separar la responsabilidad de calcular el total de la factura en distintas clases. Por ejemplo, una clase Factura que contenga únicamente los datos de la factura, una clase Deduccion que se encargue de calcular el importe de la deducción en base al importe de la factura y otra clase IVA que se encargue de calcular el importe del IVA en base al importe de la factura. De esta forma, cada clase tendría una única responsabilidad y podrían ser modificadas de forma independiente si fuera necesario.
///* 2.Si el IVA cambia del 16 al 18%, tendríamos que modificar la clase CalculadoraIVA para que calcule el IVA en base a la nueva tasa de IVA:
/*
public class CalculadoraIVA {
public float calcularIVA(float importeFactura, float tasaIVA) {
float importeIVA = importeFactura * tasaIVA / 100;
return importeIVA;
}
}

Y tendríamos que modificar la creación de la instancia de la clase Facturador para que use la nueva tasa de IVA:

Facturador facturador = new Facturador(18);

//3.si las facturas de código 0 no se les aplica el IVA, se podría crear una nueva clase llamada "CalculadorDeImporteSinIVA" que se encargue de calcular el importe total de las facturas sin aplicar el IVA en caso de que el código de la factura sea 0. De esta manera, se separaría la responsabilidad de aplicar o no el IVA en una clase diferente y la clase Factura tendría una única responsabilidad que sería calcular el importe base de la factura.

*/
