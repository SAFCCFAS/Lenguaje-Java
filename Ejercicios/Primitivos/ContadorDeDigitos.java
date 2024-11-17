package Ejercicios.Primitivos;

import java.util.Scanner;

public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contar = 0;
        System.out.println("Bienvenido ingrese un número positivo");
        num = sc.nextInt();
        // Verificar si número es 0
        if (num == 0) {
            contar = 1; // Lo tomará como 1
            System.out.println("El número tiene " + contar + " dígito.");
        } else if (num > 0) {
            // Contará los dígitos si el número es mayor que 0
            while (num > 0) {
                num = num / 10;
                contar++;
            }
            System.out.println("El número tiene " + contar + " dígito.");
        } else {
            // En caso de negativos
            System.out.println("Por favor, ingrese un número positivo.");
        }
        sc.close();
    }
}
