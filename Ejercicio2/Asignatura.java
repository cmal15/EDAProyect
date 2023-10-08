/**
 * 
 * @author Carlos Manuel Alvarez Lopez
 * @author Haziel Ibares Sanchez
 * @author Gustavo Sanchez Santana
 * 
*/

/**
 * Clase que representa una Asignatura.
 * Esta clase define atributos y métodos para gestionar la información de una asignatura, 
 * incluyendo su clave, nombre y número de créditos.
 * También proporciona un método estático para imprimir una lista de asignaturas.
 * 
 * Ultima Modificacion: 07/10/2023
 */

package Ejercicio2;

import java.util.List;


public class Asignatura {
    private int clave;
    private String nombre;
    private int creditos;

    public Asignatura(int clave, String nombre, int creditos) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    public int get_Creditos() {
        return creditos;
    }

    public void set_Creditos(int creditos) {
        this.creditos = creditos;
    }
    
    public int get_Clave() {
        return clave;
    }

    public void set_Clave(int clave) {
        this.clave = clave;
    }

    public String get_Nombre() {
        return nombre;
    }

    public void set_Nombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void imprimirLista(List<Asignatura> Asignaturas) {
        for (Asignatura asignatura : Asignaturas) {
            System.out.println("Clave: " + asignatura.get_Clave());
            System.out.println("Nombre: " + asignatura.get_Nombre());
            System.out.println("Créditos: " + asignatura.get_Creditos());
            System.out.println("------------------------");
        }
    }

    
}
