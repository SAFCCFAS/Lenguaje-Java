package Ejercicios;

import java.util.Scanner;

public class SumaEnteros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, suma;
        System.out.println("Ingrese primer número a sumar");
        n1 = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese segundo número a sumar");
        n2 = leer.nextInt();
        leer.nextLine();
        suma = n1 + n2;
        System.out.println("EL resultado de la suma es: " + suma);
    }
}
