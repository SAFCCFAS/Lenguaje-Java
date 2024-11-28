package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class SumarElementosArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, i, suma = 0;
        int[] tam;

        do {
            System.out.println("Bienvenido(a), por favor ingrese la cantidad de números que desea almacenar en el arreglo:");
            cantidad = sc.nextInt();
            if (cantidad == 0) {
                System.err.println("Error: La cantidad debe ser mayor a 0, intente nuevamente.");
            }
        } while (cantidad <= 0);

        tam = new int[cantidad]; // Crear el arreglo de acuerdo al tamaño

        // Leer los elementos del arreglo
        for (i = 0; i < tam.length; i++) {
            System.out.println("Ingrese el número de la posición " + i + ":");
            tam[i] = sc.nextInt();
        }

        // Sumar los elementos del arreglo
        for (int num : tam) {
            suma +=num;
        }
        System.out.println("La suma total de los números ingresados es: " + suma);

        sc.close();
    }
}
