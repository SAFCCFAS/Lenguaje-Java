package Ejercicios.Cadenas;

import java.util.Scanner;

public class TransformarCadena {
    static Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
//test git
=======

>>>>>>> 438dcf53b5109db52e4aac891e7d828c2accc0b3
    public static void main(String[] args) {
        String texto, mayus, minus;
        System.out.println("Bienvenido(a), favor ingresa una palabra o frase a continuación:");
        texto = sc.nextLine();

        mayus = texto.toUpperCase();
        minus = texto.toLowerCase();
        System.out.println("El texto ingreso en mayúscula es: " + mayus);
        System.out.println("El texto ingreso en minúscula es: " + minus);
    }
}
