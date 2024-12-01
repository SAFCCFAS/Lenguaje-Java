package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class CalculadoraBasicaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, opcion;
        String[] operacionesNombres = {"Suma", "Resta", "Multiplicación", "División"};
        double[] operaciones = new double[4]; // Array para almacenar los resultados de las 4 operaciones
        System.out.println("Ingrese el primer número:");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        n2 = sc.nextInt();
        System.out.println("Los números que has ingresados son: " + n1 + " y " + n2 + ".");

        System.out.println("¿Que operación desea realizar?\n1.Suma.\n2.Resta.\n3.Multiplicación.\n4.División.");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> operaciones[0] = n1 + n2;
            case 2 -> operaciones[1] = n1 - n2;
            case 3 -> operaciones[2] = n1 * n2;
            case 4 -> {
                if (n2 != 0) {
                    operaciones[3] = (double) n1 / n2;
                } else {
                    operaciones[3] = Double.NaN; // Manejo de división por 0
                    System.err.println("Error: División entre cero no permitida.");
                }
            }
            default -> {
                System.err.println("Opción no válida.");
                return; // Terminar el programa si la opción no es válida
            }
        }

        if (opcion >= 1 && opcion <= 4) {
            System.out.printf("El resultado de la %s es: ", operacionesNombres[opcion - 1]);
            if (opcion == 4 && Double.isNaN(operaciones[3])) {
                System.out.println("Error (división entre cero).");
            } else {
                System.out.printf("%.2f%n", operaciones[opcion - 1]);
            }
        }
        sc.close();
    }
}
