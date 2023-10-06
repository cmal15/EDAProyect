package Ejercicio2;

import java.util.List;

/**
 * @author Equipo 8
 */
public class BusquedaLineal {

    public static boolean buscarTF(List<Alumno> alumnos, List<Asignatura> asignaturas, String nombreOClaveABuscar) {
        boolean encontrado = false;

        for (Alumno alumno : alumnos) {
            if (alumno.get_Nombre().equals(nombreOClaveABuscar)) {
                System.out.println("Se encontró un alumno con el nombre: " + alumno.get_Nombre());
                System.out.println("Número de Cuenta: " + alumno.get_NumeroCuenta());
                encontrado = true;
            }
        }

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.get_Clave().equals(nombreOClaveABuscar)) {
                System.out.println("Se encontró una asignatura con la clave: " + asignatura.get_Clave());
                System.out.println("Asignatura: " + asignatura.get_Nombre());
                System.out.println("Creditos: " + asignatura.get_Creditos());
                encontrado = true;
            }
        }

        return encontrado;
    }

    public static int buscarPosicion(List<Alumno> alumnos, List<Asignatura> asignaturas, String nombreOClaveABuscar) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).get_Nombre().equals(nombreOClaveABuscar)) {
                return i;
            }
        }

        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).get_Clave().equals(nombreOClaveABuscar)) {
                return -i - 2; // Usamos un valor negativo diferente para indicar que se encontró en asignaturas
            }
        }

        return -1; // No se encontro nada
    }

    public static int buscarCoincidencias(List<Alumno> alumnos, List<Asignatura> asignaturas, String nombreOClaveABuscar) {
        int coincidencias = 0;

        for (Alumno alumno : alumnos) {
            if (alumno.get_Nombre().equals(nombreOClaveABuscar)) {
                coincidencias++;
            }
        }

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.get_Clave().equals(nombreOClaveABuscar)) {
                coincidencias++;
            }
        }

        return coincidencias;
    }

    public static Object buscarObjeto(List<Alumno> alumnos, List<Asignatura> asignaturas, String nombreOClaveABuscar) {
        for (Alumno alumno : alumnos) {
            if (alumno.get_Nombre().equals(nombreOClaveABuscar)) {
                return alumno; 
            }
        }

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.get_Clave().equals(nombreOClaveABuscar)) {
                return asignatura; 
            }
        }

        return null; 
    }

}
