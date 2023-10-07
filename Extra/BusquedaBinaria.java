package Extra;

import Extra.CriterioDeOrdenamientoAlumno;
import Extra.CriterioDeOrdenamientoAsignatura;

import java.util.Collections;
import java.util.List;

import Ejercicio2.Alumno;
import Ejercicio2.Asignatura;

public class BusquedaBinaria {

	public static boolean isElement (List<Alumno> lista, String nombre) {
		int low = 0;
		int high = lista.size() - 1;
		Collections.sort( lista, new CriterioDeOrdenamientoAlumno() );
		boolean answer = isElement(lista, nombre, low, high);

		return(answer);
	}

	public static boolean isElement(List<Alumno> lista, String nombre, int low, int high) {
		if (high < low)
			return(false);

		int mid = (low+high)/2;
		boolean answer;

		if ( lista.get(mid).get_Nombre().compareTo(nombre) < 0 )
			answer = isElement(lista, nombre, mid+1, high);
		else if ( lista.get(mid).get_Nombre().compareTo(nombre) > 0 )
			answer = isElement(lista, nombre, low, mid-1);
		else
			return(true);

		return(answer);
	}

    public static boolean isElement (List<Asignatura> lista, int clave) {
		int low = 0;
		int high = lista.size() - 1;
		Collections.sort( lista, new CriterioDeOrdenamientoAsignatura() );
		boolean answer = isElement(lista, clave, low, high);

		return(answer);
	}

	public static boolean isElement(List<Asignatura> lista, int clave, int low, int high) {
		if (high < low)
			return(false);

		int mid = (low+high)/2;
		boolean answer;

		if ( clave > lista.get(mid).get_Clave() )
			answer = isElement(lista, clave, mid+1, high);
		else if ( clave < lista.get(mid).get_Clave() )
			answer = isElement(lista, clave, low, mid-1);
		else
			return(true);

		return(answer);
	}

}
