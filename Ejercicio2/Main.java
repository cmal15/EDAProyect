package Ejercicio2;

import static Ejercicio2.BusquedaLineal.buscarCoincidencias;
import static Ejercicio2.BusquedaLineal.buscarObjeto;
import static Ejercicio2.BusquedaLineal.buscarPosicion;
import static Ejercicio2.BusquedaLineal.buscarTF;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Equipo 8
 */
public class Main {

    public static void main(String[] args) {
        List<Asignatura> Asignaturas = new ArrayList<>();
        List<Alumno> Alumnos = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        Asignaturas.add(new Asignatura(1120, "ALGEBRA", 8));
        Asignaturas.add(new Asignatura(1123, "QUIMICA", 10));
        Asignaturas.add(new Asignatura(1221, "CALCULO INTEGRAL", 8));
        Asignaturas.add(new Asignatura(1436, "PROBABILIDAD", 8));
        Asignaturas.add(new Asignatura(1227, "ESTRUCTURA DE DATOS I", 10));
        Asignaturas.add(new Asignatura(0434, "COMPILADORES", 8));
        Asignaturas.add(new Asignatura(1644, "BASE DE DATOS", 14));
        Asignaturas.add(new Asignatura(1598, "REDES DE DATOS", 14));
        Asignaturas.add(new Asignatura(1531, "INGENIERIA DE SOFTWARE", 8));
        Asignaturas.add(new Asignatura(1124, "CULTURA", 2));

        Alumnos.add(new Alumno("Juan", "123456789"));
        Alumnos.add(new Alumno("María", "987654321"));
        Alumnos.add(new Alumno("Pedro", "555555555"));
        Alumnos.add(new Alumno("Juan", "111111111"));
        Alumnos.add(new Alumno("Carlos", "777777777"));
        Alumnos.add(new Alumno("Ana", "222222222"));
        Alumnos.add(new Alumno("David", "888888888"));
        Alumnos.add(new Alumno("Isabel", "999999999"));
        Alumnos.add(new Alumno("Sofía", "444444444"));
        Alumnos.add(new Alumno("Luis", "666666666"));

        int op, op2, clave;
        String nombre;
        while (!salir) {
            System.out.println("\t\t###Menú###");
            System.out.println("1. Buscar si un elemento está presente (True/False)");
            System.out.println("2. Buscar por posicion");
            System.out.println("3. Buscar por coincidencias");
            System.out.println("4. Buscar y retornar objeto");
            System.out.println("5. Imprimir lista de alumnos");
            System.out.println("6. Imprimir lista de Asignaturas");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            
            op = leer.nextInt();
            leer.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("1. Buscar en alumnos\t2.Buscar en asignaturas");
                    op2 = leer.nextInt();
                    leer.nextLine();
                    if(op2 == 1){
                        //Buscar en alumnos retorna booleano 
                        System.out.print("Ingrese nombre del alumno a buscar: ");
                        nombre = leer.nextLine();
                        boolean encontrado = buscarTF(Alumnos, nombre);
                        System.out.println("Se encontro el elemento: " + encontrado);
                    }else{
                        //Buscar en asignaturas retorna booleano 
                        System.out.print("Ingrese la clave de la asignatura a buscar: ");
                        clave = leer.nextInt();
                        boolean encontrado = buscarTF(Asignaturas, clave);
                        System.out.println("Se encontro el elemento: " + encontrado);
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("1. Buscar en alumnos\t2.Buscar en asignaturas");
                    op2 = leer.nextInt();
                    leer.nextLine();
                    if(op2 == 1){
                        System.out.print("Ingrese el nombre del alumno a buscar: ");
                        nombre = leer.nextLine();
                        int posicion = buscarPosicion(Alumnos, nombre);
                        if (posicion != -1) {
                            System.out.println("Se encontró un alumno en la posición " + posicion + " con el nombre: " + Alumnos.get(posicion).get_Nombre());
                            System.out.println("Número de Cuenta: " + Alumnos.get(posicion).get_NumeroCuenta());
                        } else {
                            System.out.println("No se encontró ninguna coincidencia.");
                        }
                    }else{
                        System.out.print("Ingrese la clave de la asignatura a buscar: ");
                        clave = leer.nextInt();
                        int posicion = buscarPosicion(Asignaturas, clave);
                        if (posicion != -1) {
                            System.out.println("Se encontró una asignatura en la posición " + posicion + " con la clave: " + Asignaturas.get(posicion).get_Clave());
                            System.out.println("Asignatura: " + Asignaturas.get(posicion).get_Nombre());
                            System.out.println("Creditos: " + Asignaturas.get(posicion).get_Creditos());
                        } else {
                            System.out.println("No se encontró ninguna coincidencia.");
                        }
                    }                  
                    break;
                }
                case 3 -> {
                    System.out.println("1. Buscar en alumnos\t2.Buscar en asignaturas");
                    op2 = leer.nextInt();
                    leer.nextLine();
                    if(op2 == 1){
                        System.out.print("Ingrese el nombre del alumno a buscar: ");
                        nombre = leer.nextLine();
                        int coincidencias = buscarCoincidencias(Alumnos, nombre);
    
                        if (coincidencias > 0) {
                            System.out.println("Se encontraron " + coincidencias + " coincidencias.");
                        } else {
                            System.out.println("No se encontraron coincidencias.");
                        }

                    }else{
                        System.out.print("Ingrese la clave de la asignatura a buscar: ");
                        clave = leer.nextInt();
                        int coincidencias = buscarCoincidencias(Asignaturas, clave);
    
                        if (coincidencias > 0) {
                            System.out.println("Se encontraron " + coincidencias + " coincidencias.");
                        }else{
                            System.out.println("No se encontraron coincidencias.");
                        }
                    }

                    break;
                }
                case 4 -> {
                    System.out.println("1. Buscar en alumnos\t2.Buscar en asignaturas");
                    op2 = leer.nextInt();
                    leer.nextLine();
                    if(op2 == 1){
                        System.out.print("Ingrese el nombre del alumno a buscar: ");
                        nombre = leer.nextLine();
                        Object objetoEncontrado = buscarObjeto(Alumnos, nombre);
    
                        if (objetoEncontrado != null) {
                            Alumno alumnoEncontrado = (Alumno) objetoEncontrado;
                            System.out.println("Se encontró un alumno con el nombre: " + alumnoEncontrado.get_Nombre());
                            System.out.println("Número de Cuenta: " + alumnoEncontrado.get_NumeroCuenta());
                        }else{
                            System.out.println("No se encontró ninguna coincidencia.");
                        }
                    }else{
                        System.out.print("Ingrese la clave de la asignatura a buscar: ");
                        clave = leer.nextInt();
                        Object objetoEncontrado = buscarObjeto(Asignaturas, clave);
    
                        if (objetoEncontrado != null) {
                                Asignatura asignaturaEncontrada = (Asignatura) objetoEncontrado;
                                System.out.println("Se encontró una asignatura con la clave: " + asignaturaEncontrada.get_Clave());
                                System.out.println("Asignatura: " + asignaturaEncontrada.get_Nombre());
                                System.out.println("Créditos: " + asignaturaEncontrada.get_Creditos());
                        }else{
                            System.out.println("No se encontró ninguna coincidencia.");
                        }
                    }
                    break;
                }
                case 5 -> {
                    Alumno.imprimirLista(Alumnos);
                    break;
                }
                case 6 -> {
                    Asignatura.imprimirLista(Asignaturas);
                    break;
                }
                case 7 ->
                    salir = true;
                default ->
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        System.out.println(
                "¡Gracias por usar el programa!");
        leer.close();
    }

}
