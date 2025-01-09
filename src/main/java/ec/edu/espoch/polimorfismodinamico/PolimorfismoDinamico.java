/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.polimorfismodinamico;

import ec.edu.espoch.polimorfismodinamico.clases.Estudiante;

/**
 *
 * @author mundo
 */
public class PolimorfismoDinamico {

    public static void main(String[] args) {
        Estudiante objEstudiante = new Estudiante(3057 , "Jirleidy Raquel ", "Santos Muentes ", "0931790331 ");
        System.out.println("Datos del estudiante: ");
        System.out.println(objEstudiante.imprimir());
    }
}
