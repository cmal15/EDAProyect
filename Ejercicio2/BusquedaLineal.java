package Ejercicio2;

import java.util.List;

/**
 * @author Equipo 8
 */
public class BusquedaLineal {

    public static boolean buscar(List<Alumno> alumnos, String nombre) {
        boolean encontrado = false;

        for (Alumno alumno : alumnos) {
            if (alumno.get_Nombre().equals(nombre)) {
                System.out.println("Se encontró un alumno con el nombre: " + alumno.get_Nombre());
                System.out.println("Número de Cuenta: " + alumno.get_NumeroCuenta());
                encontrado = true;
            }
        }

        return encontrado;
    }

    public static boolean buscar(List<Asignatura> asignaturas, int clave) {
        boolean encontrado = false;


        for (Asignatura asignatura : asignaturas) {
            if (asignatura.get_Clave() == clave) {
                System.out.println("Se encontró una asignatura con la clave: " + asignatura.get_Clave());
                System.out.println("Asignatura: " + asignatura.get_Nombre());
                System.out.println("Creditos: " + asignatura.get_Creditos());
                encontrado = true;
            }
        }

        return encontrado;
    }
    
    public static int buscarPosicion(List<Alumno> alumnos, String nombre) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).get_Nombre().equals(nombre)) {
                return i;
            }
        }

        return -1; // No se encontro nada
    }

    public static int buscarPosicion(List<Asignatura> asignaturas, int clave) {

        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).get_Clave() == clave) {
                return i;
            }
        }

        return -1; // No se encontro nada
    }

    public static int buscarCoincidencias(List<Alumno> alumnos, String nombre) {
        int coincidencias = 0;

        for (Alumno alumno : alumnos) {
            if (alumno.get_Nombre().equals(nombre)) {
                coincidencias++;
            }
        }

        return coincidencias;
    }

    public static int buscarCoincidencias(List<Asignatura> asignaturas, int clave) {
        int coincidencias = 0;

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.get_Clave() == clave) {
                coincidencias++;
            }
        }

        return coincidencias;
    }

    public static Object buscarObjeto(List<Alumno> alumnos, String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.get_Nombre().equals(nombre)) {
                return alumno; 
            }
        }

        return null; 
    }

    public static Object buscarObjeto(List<Asignatura> asignaturas, int clave) {

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.get_Clave() == clave) {
                return asignatura; 
            }
        }

        return null; 
    }

}
