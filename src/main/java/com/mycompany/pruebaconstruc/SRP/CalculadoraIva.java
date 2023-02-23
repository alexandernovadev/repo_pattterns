/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.SRP;

/**
 *
 * @author USUARIO
 */
public class CalculadoraIva {

    public float calcularIVA(float importeFactura, float tasaIVA) {
        float importeIVA = importeFactura * tasaIVA / 100;
        return importeIVA;
    }
}
