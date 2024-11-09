package Ejercicios.EstructurasDeControl;

import java.util.Scanner;

public class ClasificarEdad {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int edad;

        System.out.println("Bienvenido(a), por favor, ingrese su edad para determinar su clasificación:");
        edad = sc.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres niño(a).");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres adolescente.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto");
        } else if (edad >= 65) {
            System.out.println("Eres adulto mayor");
        } else {
            System.err.println("Error: Edad inválida.");
        }

        sc.close();
    }
}
