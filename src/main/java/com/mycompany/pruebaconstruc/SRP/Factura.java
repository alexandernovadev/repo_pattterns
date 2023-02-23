/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.SRP;

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
// Método que calcula el total de la factura

    public Factura(String codigo, Date fechaEmision, float importeFactura) {
    this.codigo = codigo;
    this.fechaEmision = fechaEmision;
    this.importeFactura = importeFactura;
}
   
}
