/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_super_2;

/**
 *
 * @author eduar
 */
//Porveedores is a Persona
public class Proveedores extends Persona {

    public Proveedores() {
        super();//llamada al constructor de la superclase
        this.rfc = "_____";
    }

    public Proveedores(String rfc, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }
    
    private String rfc;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public void imprimirDatos(){
        //System.out.println("");getNombre();
        //System.out.println("");getApellido();
        //System.out.println("");getEdad();
        System.out.println("RFC: "+rfc);
        super.imprimirDatos();
    }
}
