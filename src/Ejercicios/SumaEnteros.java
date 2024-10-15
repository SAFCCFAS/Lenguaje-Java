package Ejercicios;

import java.util.Scanner;

public class SumaEnteros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, suma;
        System.out.println("Ingrese primer número a sumar");
        n1 = leer.nextInt();
        System.out.println("Ingrese segundo número a sumar");
        n2 = leer.nextInt();
        suma = n1 + n2;
        System.out.println("EL resultado de la suma de " + n1 + " y " + n2 + " es: " + suma);
        leer.close();
    }
}
