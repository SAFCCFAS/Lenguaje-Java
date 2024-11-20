package Ejercicios.EstructurasDeControl;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo = true;

        System.out.println("Bienvenido(a), favor ingrese un número entero a continuación para validar si es primo:");
        num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Número ingresado no es primo.");
        } else if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("Número ingresado es primo.");
            } else {
                System.out.println("Número ingresado no es primo.");
            }
        }
    }
}
