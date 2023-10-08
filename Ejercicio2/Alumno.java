/**
 * 
 * @author Carlos Manuel Alvarez Lopez
 * @author Haziel Ibares Sanchez
 * @author Gustavo Sanchez Santana
 * 
*/

/**
 * Clase que representa a un Alumno.
 * Esta clase define atributos y métodos para gestionar la información de un alumno, 
 * incluyendo su nombre y número de cuenta.
 * También proporciona un método estático para imprimir una lista de alumnos.
 */

//Ultima modificacion: 07/10/2023

package Ejercicio2;

import java.util.List;

/**
 * @author Equipo 8
 */
public class Alumno {

    private String Nombre;
    private String numeroCuenta;

    public Alumno(String Nombre, String numeroCuenta) {
        this.Nombre = Nombre;
        this.numeroCuenta = numeroCuenta;
    }

    public String get_Nombre() {
        return Nombre;
    }

    public void set_Nombre(String nombre) {
        this.Nombre = nombre;
    }

    public String get_NumeroCuenta() {
        return numeroCuenta;
    }

    public void set_NumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public static void imprimirLista(List<Alumno> listaAlumnos) {
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Nombre: " + alumno.get_Nombre());
            System.out.println("Número de Cuenta: " + alumno.get_NumeroCuenta());
            System.out.println("------------------------");
        }
    }


}
