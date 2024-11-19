package Ejercicios.Primitivos;

import java.util.Scanner;

public class FactorialNumero {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n,x; // 'n' es el número ingresado por el usuario y 'x' se usa en el ciclo for
        long factorial=1; //Dado que el factorial puede ser un número extenso se obtará por long
        do {
            System.out.println("Bienvenido(a), favor ingrese un número positivo para hallar su factorial:");
            n = sc.nextInt(); // Lee el número ingresado por el usuario
        } while (n <= 0); // Si el número es negativo o cero, el ciclo se repite
        if (n >= 1) { // Si el número es mayor o igual a 1, se procede con el cálculo del factorial
            for(x=1;x<=n;x++){
                factorial = factorial * x; // Se va multiplicando el factorial por cada número desde 1 hasta n
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
        sc.close();
    }
}