/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_9_super_2;

/**
 *
 * @author eduar
 */
public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante ("22550341", "Rubén Eduardo", "Muñoz Nieto", 18);
        estudiante.imprimirDatos();    
        //system.out.println("No de Control: "+estudiante.getNoControl());
        
        Maestros maestros = new Maestros("0218181", "Rubén", "Hernández", 41);
        maestros.imprimirDatos();
        System.out.println("Plaza es: "+maestros.getPlaza());
        
        Proveedores proveedores = new Proveedores ("MUNR0412219383","Carlos", "Dominguez", 55);
        proveedores.imprimirDatos();
        System.out.println("El RFC es: " +proveedores.getRfc());
        
        
    }
}
