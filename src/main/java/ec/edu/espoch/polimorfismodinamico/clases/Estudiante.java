/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.polimorfismodinamico.clases;

/**
 *
 * @author mundo
 */
public class Estudiante extends Persona{
    
    private int codigoEstudiantes;

    public Estudiante(int codigoEstudiantes, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.codigoEstudiantes = codigoEstudiantes;
    }
    
    @Override
    public String imprimir(){
        return super.imprimir()+"Codigo del Estudiantes: "+this.codigoEstudiantes;
    }
    
    
    
}
