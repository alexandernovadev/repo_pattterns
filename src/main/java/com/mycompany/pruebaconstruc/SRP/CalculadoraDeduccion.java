/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.SRP;

/**
 *
 * @author USUARIO
 */
public class CalculadoraDeduccion {

    public float calcularDeduccion(float importeFactura, int porcentajeDeduccion) {
        float importeDeduccion = 0;
        if (importeFactura > 10000) {
            importeDeduccion = (importeFactura * porcentajeDeduccion + 3) / 100;
        } else {
            importeDeduccion = (importeFactura * porcentajeDeduccion) / 100;
        }
        return importeDeduccion;
    }

}
