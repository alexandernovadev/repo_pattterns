package com.mycompany.pruebaconstruc.SRP;

import java.util.Date;

public class Main {

  public static void main(String[] args) {
      // Crear una nueva factura con un importe de 15000
      Factura factura = new Factura("F001", new Date(), 15000);
      

      // Crear una instancia de Facturador y calcular el importe total
      Facturador facturador = new Facturador();
      float importeTotal = facturador.calcularImporteTotal(factura.importeFactura, factura.porcentajeDeduccion, factura.importeIVA);

      // Actualizar los campos de la factura con los resultados de los cálculos
      factura.importeDeduccion = facturador.calculadoraDeduccion.calcularDeduccion(factura.importeFactura, factura.porcentajeDeduccion);
      factura.importeIVA = facturador.calculadoraIVA.calcularIVA(factura.importeFactura, factura.importeIVA);
      factura.importeTotal = importeTotal;

      // Imprimir la factura resultante
      System.out.println("Factura: " + factura.codigo);
      System.out.println("Fecha de emisión: " + factura.fechaEmision);
      System.out.println("Importe de la factura: " + factura.importeFactura);
      System.out.println("Porcentaje de deducción: " + factura.porcentajeDeduccion);
      System.out.println("Importe de la deducción: " + factura.importeDeduccion);
      System.out.println("Tasa de IVA: " + factura.importeIVA);
      System.out.println("Importe total: " + factura.importeTotal);
  }
}