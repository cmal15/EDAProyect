/**
 * 
 * @author Carlos Manuel Alvarez Lopez
 * @author Haziel Ibares Sanchez
 * @author Gustavo Santana Sanchez
 * 
*/

/**
 * Clase que implementa la interfaz Comparator<Alumno>. 
 * Esta clase se utiliza para definir un criterio de 
 * ordenamiento personalizado para objetos de la clase Alumno.
 */

package Extra;

import Ejercicio2.Alumno;
import java.util.Comparator;

public class CriterioDeOrdenamientoAlumno implements Comparator<Alumno> {

    @Override
    public int compare (Alumno alumno1, Alumno alumno2) {
        return alumno1.get_Nombre().compareTo(alumno2.get_Nombre());
    }

}
