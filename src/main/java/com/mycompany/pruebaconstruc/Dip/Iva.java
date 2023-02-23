/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.Dip;

/**
 *
 * @author USUARIO
 */
public class Iva implements CalculadorIva{
    
    public float calculaIva(float importeFactura) {
return (float) (importeFactura * 0.16);
}
}
