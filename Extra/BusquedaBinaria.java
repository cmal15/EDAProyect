package Extra;

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

	public static int firstIndexOfElement (List<Alumno> lista, String nombre) {
		Collections.sort( lista, new CriterioDeOrdenamientoAlumno() );
        int low = 0;
        int high = lista.size() - 1;
        int indice = -1;
        int mid;

        while (low <= high) {
            mid = (high + low) / 2;

            if (lista.get(mid).get_Nombre().compareTo(nombre) == 0) {
                indice = mid;
                high = mid - 1;
            } else if ( lista.get(mid).get_Nombre().compareTo(nombre) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return indice;
    }

	public static int lastIndexOfElement (List<Alumno> lista, String nombre) {
		Collections.sort( lista, new CriterioDeOrdenamientoAlumno() );
        int low = 0;
        int high = lista.size() - 1;
        int indice = -1;
        int mid;

        while (low <= high) {
            mid = (high + low) / 2;

            if (lista.get(mid).get_Nombre().compareTo(nombre) == 0) {
                indice = mid;
                low = mid + 1;
            } else if (lista.get(mid).get_Nombre().compareTo(nombre) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return indice;
    }

	public static int firstIndexOfElement (List<Asignatura> lista, int clave) {
		Collections.sort( lista, new CriterioDeOrdenamientoAsignatura() );
        int low = 0;
        int high = lista.size() - 1;
        int indice = -1;
        int mid;

        while (low <= high) {
            mid = (high + low) / 2;

            if (lista.get(mid).get_Clave() == clave) {
                indice = mid;
                high = mid - 1;
            } else if ( clave < lista.get(mid).get_Clave() ) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return indice;
    }

	public static int lastIndexOfElement (List<Asignatura> lista, int clave) {
		Collections.sort( lista, new CriterioDeOrdenamientoAsignatura() );
        int low = 0;
        int high = lista.size() - 1;
        int indice = -1;
        int mid;

        while (low <= high) {
            mid = (high + low) / 2;

            if (lista.get(mid).get_Clave() == clave) {
                indice = mid;
                low = mid + 1;
            } else if (clave < lista.get(mid).get_Clave()) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return indice;
    }

	public static int timesElement (List<Alumno> lista, String nombre) {
		int aux = lastIndexOfElement(lista, nombre);
		int aux2 = firstIndexOfElement(lista, nombre);
		if (aux2==-1 && aux==-1)
			return(0);
		else
			return (1+aux-aux2);
    }

	public static int timesElement (List<Asignatura> lista, int clave) {
		int aux = lastIndexOfElement(lista, clave);
		int aux2 = firstIndexOfElement(lista, clave);
		if (aux2==-1 && aux==-1)
			return(0);
		else
			return (1+aux-aux2);
    }

	public static Alumno getElement (List<Alumno> lista, String nombre) {
		// Esta funcion solo es una capa de abstraccion para el usuario,
		// pues la funcion real requiere los parametros que se observan a continuacion
		int low = 0;
		int high = lista.size() - 1;
		Collections.sort( lista, new CriterioDeOrdenamientoAlumno() );
		Alumno alumno = getElement(lista, nombre, low, high);

		return(alumno);
	}

	public static Alumno getElement(List<Alumno> lista, String nombre, int low, int high) {
		if (high < low)
			return(null);

		int mid = (low+high)/2;
		Alumno alumno;

		if ( lista.get(mid).get_Nombre().compareTo(nombre) < 0 )
			alumno = getElement(lista, nombre, mid+1, high);
		else if ( lista.get(mid).get_Nombre().compareTo(nombre) > 0 )
			alumno = getElement(lista, nombre, low, mid-1);
		else
			return(lista.get(mid));

		return(alumno);
	}

	public static Asignatura getElement (List<Asignatura> lista, int clave) {
		// Esta funcion solo es una capa de abstraccion para el usuario,
		// pues la funcion real requiere los parametros que se observan a continuacion
		int low = 0;
		int high = lista.size() - 1;
		Asignatura asignatura = getElement(lista, clave, low, high);

		return(asignatura);
	}

	public static Asignatura getElement(List<Asignatura> lista, int clave, int low, int high) {
		if (high < low)
			return(null);

		int mid = (low+high)/2;
		Asignatura asignatura;

		if (clave > lista.get(mid).get_Clave() )
			asignatura = getElement(lista, clave, mid+1, high);
		else if (clave < lista.get(mid).get_Clave() )
			asignatura = getElement(lista, clave, low, mid-1);
		else
			return(lista.get(mid));

		return(asignatura);
	}

}

