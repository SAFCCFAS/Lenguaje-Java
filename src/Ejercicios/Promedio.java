package Ejercicios;

import java.util.Scanner;

public class Promedio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int v1, v2, v3, v4, v5;
        float prom;

        System.out.println("Bienvenido(a) favor ingrese 5 números enteros para hallar el promedio:");

        System.out.println("Ingrese primer número:");
        v1 = sc.nextInt();
        System.out.println("Ingrese segundo número:");
        v2 = sc.nextInt();
        System.out.println("Ingrese tercer número:");
        v3 = sc.nextInt();
        System.out.println("Ingrese cuarto número:");
        v4 = sc.nextInt();
        System.out.println("Ingrese quinto número:");
        v5 = sc.nextInt();
        prom = (float) (v1 + v2 + v3 + v4 + v5) / 5;
        System.out.println("El promedio de los números ingresado es: "+prom);
    }
}
