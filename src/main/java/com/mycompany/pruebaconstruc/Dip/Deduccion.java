/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.Dip;

/**
 *
 * @author USUARIO
 */
public class Deduccion implements CalcularDeduccion {

    public float calculaDeduccion(float importeFactura, int porcentajeDeduccion) {
        if (importeFactura > 10000) {
            return (importeFactura * (porcentajeDeduccion + 3)) / 100;
        } else {
            return (importeFactura * porcentajeDeduccion) / 100;
        }
    }

}
