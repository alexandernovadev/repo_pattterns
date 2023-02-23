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
public class Factura {

    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;
    private CalcularDeduccion calculadorDeduccion;
    private CalculadorIva calculadorIva;

    public Factura(CalcularDeduccion calculadorDeduccion, CalculadorIva calculadorIva) {
        this.calculadorDeduccion = calculadorDeduccion;
        this.calculadorIva = calculadorIva;
    }

// Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        importeDeduccion = calculadorDeduccion.calculaDeduccion(importeFactura, porcentajeDeduccion);
        // Calculamos el IVA
        importeIVA = calculadorIva.calculaIva(importeFactura);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
