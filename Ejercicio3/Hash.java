package Ejercicio3;

public class Hash{

    public static int hashFunction (int n) {
        return (n%15);
    }

    public static int cuadrado(int n){
        String s = (Integer.toString(n*n));
        int mid = s.length()/2;
        s = s.substring(mid-1, mid+1);
        return Integer.valueOf(s)%15;
    }

}
