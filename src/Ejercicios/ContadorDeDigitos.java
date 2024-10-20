package Ejercicios;

import java.util.Scanner;

public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contar = 0;
        System.out.println("Bienvenido ingrese un número positivo");
        num = sc.nextInt();

        if (num == 0) {
            contar = 1;
            System.out.println("El número tiene " + contar + " dígito.");
        } else if (num > 0) {
            while (num > 0) {
                num = num / 10;
                contar++;
            }
            System.out.println("El número tiene " + contar + " dígito.");
        }else{
            System.out.println("Por favor, ingrese un número positivo.");
        }
    }
}
