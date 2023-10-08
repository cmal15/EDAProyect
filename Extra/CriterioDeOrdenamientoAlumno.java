/**
 * 
 * @author Carlos Manuel Alvarez Lopez
 * @author Haziel Ibares Sanchez
 * @author Gustavo Sanchez Santana
 * 
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
