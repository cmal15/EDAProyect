/**
 * 
 * @author Carlos Manuel Alvarez Lopez
 * @author Haziel Ibares Sanchez
 * @author Gustavo Sanchez Santana
 * 
 * Modificado el 07/10/2023
 * Clase la cual contiene distintos metodos para la conversion de llaves en indices para las listas ligadas de la clase encadenamiento
 * 
*/

package Ejercicio3;

public class Hash{

    public static int hashFunction (int n) {
        return (n%15);
    }

    public static int hashFunctioncuadrado(int n){
        String s = (Integer.toString(n*n));
        int mid = s.length()/2;
        s = s.substring(mid-1, mid+1);
        return Integer.valueOf(s)%15;
    }

}
