package Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Extra.BusquedaBinaria.isElement;
import Ejercicio2.Alumno;
import Ejercicio2.Asignatura;

public class Principal {

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
        Asignaturas.add(new Asignatura(1434, "COMPILADORES", 8));
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
        Alumnos.add(new Alumno("Sofia", "444444444"));
        Alumnos.add(new Alumno("Luis", "666666666"));

        //Buscar en alumnos retorna booleano
        String nombre;
        System.out.print("Ingrese nombre del alumno a buscar: ");
        nombre = leer.nextLine();
        boolean encontrado = isElement(Alumnos, nombre);
        Alumno.imprimirLista(Alumnos);
        System.out.println((encontrado?"Si":"No") +" se encontro al alumno");

        //Buscar en asignaturas retorna booleano
        int clave;
        System.out.print("Ingrese clave de la asignatura a buscar: ");
        clave = leer.nextInt();
        encontrado = isElement(Asignaturas, clave);
        Asignatura.imprimirLista(Asignaturas);
        System.out.println((encontrado?"Si":"No") +" se encontro a la asignatura");
    }
}


