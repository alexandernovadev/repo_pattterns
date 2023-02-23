/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.lisckov;

/**
 *
 * @author USUARIO
 */
public class lisckov {
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
        configuracion.salvarConfiguracion();
    }
}

// 2. La clase Configuracion no cumple completamente con el Principio OCP (Open-Closed Principle) ya que no es fácilmente extensible para añadir nuevas configuraciones. Si se quisiera añadir una nueva configuración, se debería modificar el código de Configuracion para incluir una instancia de la nueva clase y su correspondiente llamada a load() y save(). Una solución más adecuada sería hacer Configuracion más flexible y extensible mediante el uso de patrones de diseño como la inyección de dependencias.
// 3. La clase Configuracion no cumple con el Principio de Liskov (LSK) ya que la clase ConfiguracionHoraria tiene un comportamiento diferente al esperado para un objeto que implementa la interfaz RecursoPersistente. Esto se debe a que ConfiguracionHoraria no implementa correctamente el método save(), el cual debería guardar la configuración en algún tipo de almacenamiento persistente, pero en su lugar lanza un error. Esto hace que no se pueda substituir la instancia de ConfiguracionHoraria por otras clases que implementen RecursoPersistente sin alterar el comportamiento de la clase Configuracion.
//5. El problema que resuelve el Principio de Liskov es la garantía de que las subclases sean compatibles con la clase base y se puedan utilizar de manera indiferente. En otras palabras, si tenemos una clase base y una subclase que la extiende, cualquier código que utilice la clase base también debería poder utilizar la subclase sin que se produzcan errores o comportamientos no esperados.

// 5.La solución propuesta es que las subclases deben mantener el mismo comportamiento que la clase base en términos de entrada, salida y excepciones. Además, deben respetar todas las precondiciones establecidas por la clase base y proporcionar todas las postcondiciones requeridas. En términos generales, el Principio de Liskov se refiere a la sustituibilidad de objetos, lo que significa que una instancia de una subclase debería poder ser utilizada en lugar de una instancia de la clase base sin alterar el comportamiento del programa. Esto ayuda a garantizar que el código sea más mantenible, escalable y robusto.




