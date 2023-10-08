/**
 * 
 * @author Carlos Manuel Alvarez Lopez
 * @author Haziel Ibares Sanchez
 * @author Gustavo Sanchez Santana
 * 
*/
package Extra;

import Ejercicio2.Asignatura;
import java.util.Comparator;

public class CriterioDeOrdenamientoAsignatura implements Comparator<Asignatura> {

    @Override
    public int compare (Asignatura asignatura1, Asignatura asignatura2) {
        return asignatura1.get_Clave() - asignatura2.get_Clave();
    }

}
