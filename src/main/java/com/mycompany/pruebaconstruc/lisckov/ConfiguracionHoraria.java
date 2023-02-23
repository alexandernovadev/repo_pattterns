/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaconstruc.lisckov;

/**
 *
 * @author USUARIO
 */
public class ConfiguracionHoraria implements RecursoPersistente {

    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

    

    public void save() {
         System.out.println("Configuracion usuario almacenada");
    }

    public boolean isReadOnly() {
        return true;
    }

}
