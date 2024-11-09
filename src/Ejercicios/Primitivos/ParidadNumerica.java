package Ejercicios.Primitivos;

import java.util.Scanner;

public class ParidadNumerica {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Bienvenido(a), favor ingrese un número entero positivos:");

        do {
            n = sc.nextInt();
            if (n == 0) {
                System.err.println("Error: Favor ingrese número mayor a 0, intente nuevamente.");
            } else if (n % 2 == 0) {
                System.out.println("El número ingresado es par.");
            } else {
                System.out.println("El número ingresado es impar");
            }

        } while (n <= 0);
        sc.close();
    }
}
