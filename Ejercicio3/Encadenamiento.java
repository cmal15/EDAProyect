package Ejercicio3;

import java.util.LinkedList;

public class Encadenamiento{

    public void main(String[] args){
        LinkedList<LinkedList<Integer>> listas = new LinkedList<>();

        for(int i = 0; i < 15; i++){
            listas.add(new LinkedList<>());
        }

        int op, aux;

        do{
            System.out.println("1.Agregar elemento\t2.Mostrar listas\t3.Salir");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Introduce el elemento");
                    aux = sc.nextInt();
                    
                    break;
                case 2:
                    
                    break;
                default:
                    break;
            }
        }while(op != 3);

    }

}