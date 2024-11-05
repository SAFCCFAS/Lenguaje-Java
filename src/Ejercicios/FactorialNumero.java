package Ejercicios;

import java.util.Scanner;

public class FactorialNumero {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n,x;
        long factorial=1;
        do {
            System.out.println("Bienvenido(a), favor ingrese un número positivo para hallar su factorial:");
            n = sc.nextInt();
        } while (n <= 0);
        if (n >= 1) {
            for(x=1;x<=n;x++){
                factorial = factorial * x;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }
}