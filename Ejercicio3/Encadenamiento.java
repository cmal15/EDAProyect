/**
 * 
 * @author Carlos Manuel Alvarez Lopez
 * @author Haziel Ibares Sanchez
 * @author Gustavo Sanchez Santana
 * 
*/
 package Ejercicio3;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Encadenamiento{

    public static void main(String[] args){
        List< List<Integer> > listas = new LinkedList<>();
        for (int i = 0; i < 15; i++)
            listas.add(new LinkedList<>());

        boolean variable = true;
        int opcion;
        while (variable) {
            opcion = menuUsuario();
            variable = menuUsuario(opcion, listas);
        }
    }

    public static int menuUsuario () {
        Scanner sc = new Scanner(System.in);
        limpiarPantalla();
        System.out.println("Elige una opcion:");
        System.out.println("\t1. Agregar elemento.");
        System.out.println("\t2. Mostrar solo una lista.");
        System.out.println("\t3. Mostrar todas las listas.");
        System.out.println("\t4. Buscar un elemento.");
        System.out.println("\t5. Salir.");
        int opcion = sc.nextInt();
        return(opcion);
    }
    public static boolean menuUsuario (int opcion, List<List<Integer>> listas) {
        limpiarPantalla();
        boolean constante = true;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 1 -> {
                int elemento, clave;
                System.out.print("Introduce el elemento: ");
                elemento = sc.nextInt();
                clave = Hash.hashFunction(elemento);
                encadenar(clave, elemento, listas);
                System.out.println("Valor agregado con exito.");
            }
            case 2 -> {
                int lista;
                System.out.print("Que lista quieres ver? (1-15) ");
                lista = sc.nextInt();
                imprimirLista(listas.get(lista-1), lista);
                sc.nextLine();
            }
            case 3 -> {
                System.out.println("Listas:");
                List<Integer> auxiliar;
                for (int i=0; i<15; i++) {
                    auxiliar = listas.get(i);
                    imprimirLista(auxiliar, i+1);
                }
            }
            case 4 -> {
                int elemento, clave;
                boolean auxiliar;
                System.out.print("Introduce el elemento a buscar: ");
                elemento = sc.nextInt();
                clave = Hash.hashFunction(elemento);
                auxiliar = buscar(listas.get(clave), elemento);
                if (auxiliar) {
                    System.out.println("El elemento " + elemento + " esta en la lista " + (clave+1) + ".");
                }
                else {
                    System.out.println("El elemento " + elemento + " no esta.");
                }
                sc.nextLine();
            }
            case 5 -> {
                constante = false;
            }
        }
        if (constante)
            System.out.println("\nPresiona enter para regresar al menu principal...");
        else
            System.out.println("\nGracias por usar el programa. Presiona enter para salir...");
        sc.nextLine();

        return(constante);
    }

    public static void encadenar (int clave, int elemento, List<List<Integer>> listas) {
        listas.get(clave).add(elemento);
    }

    public static void imprimirLista (List<Integer> lista, int indice) {
        if (lista.isEmpty() && indice <10) {
            System.out.println("Lista " + (indice) + " : ");
            return;
        }
        if (lista.isEmpty() && indice >=10) {
            System.out.println("Lista " + (indice) + ": ");
            return;
        }

        int tam = lista.size();
        if (indice < 10)
            System.out.print("Lista " + (indice) + " : ");
        else
            System.out.print("Lista " + (indice) + ": ");

        for (int i=0; i<tam-1; i++) {
            System.out.print(lista.get(i) + " -> ");
        }
        System.out.println(lista.get(tam-1) + ".");
    }

    public static boolean buscar (List<Integer> lista, int elemento) {
        boolean res = false;
        int tam = lista.size();
        for (int i=0; i<tam; i++) {
            if (lista.get(i) == elemento) {
                res = true;
            }
        }
        return(res);
    }

    public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla: " + e.getMessage());
        }
    }
}
