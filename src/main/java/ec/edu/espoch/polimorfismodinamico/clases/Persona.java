/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.polimorfismodinamico.clases;

/**
 *
 * @author mundo
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String cedula;

    public Persona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }
    
    public String imprimir(){
        return "cedula: "+this.cedula+"Nombres: "+this.nombre+"Apellidos: "+this.apellido;
    }
    
    
}
