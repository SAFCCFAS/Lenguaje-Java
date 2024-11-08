package Ejercicios;

import java.util.Scanner;

public class TransformarCadena {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String texto, mayus, minus;
        System.out.println("Bienvenido(a), favor ingresa una palabra o frase a continuación:");
        texto = sc.nextLine();

        mayus = texto.toUpperCase();
        minus = texto.toLowerCase();
        System.out.println("El texto ingreso en a mayúscula es: " + mayus);
        System.out.println("El texto ingreso en a minúscula es: " + minus);
    }
}
