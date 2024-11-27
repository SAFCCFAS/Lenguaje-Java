package EjerciciosArrays;

import java.util.Scanner;

public class SumarElementosArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, n, suma = 0;
        int[] tam;

        System.out.println("Bienvenido(a), por favor ingrese la cantidad de números que desea almacenar en el arreglo:");
        cantidad = sc.nextInt();

        tam = new int[cantidad];

        for (int i = 0; i < tam.length; i++) {
            System.out.println("Ingrese el número de la posición " + i + ":");
            n = sc.nextInt();
        }


        sc.close();
    }
}
