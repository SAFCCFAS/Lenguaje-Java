package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class CalculadoraBasicaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, opcion;
        String[] operacionesNombres = {"Suma", "Resta", "Multiplicación", "División"};
        String eleccion;
        double[] operaciones = new double[4]; // Array para almacenar los resultados de las 4 operaciones

        do { //repetirá el menú hasta que se reciba un ingreso válido.
            opcion = 1;
            System.out.println("Bienvenido(a), favor ingrese la opción correspondiente a la operación a realizar a continuación:");

            for (String nombre : operacionesNombres) {
                System.out.printf("%d. %s.%n", opcion++, nombre);
            }
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty()) {
                System.err.println("Error: Favor ingresar alguna de las opciones mostrada, intente nuevamente.");
                continue;
            } else if (!eleccion.matches("\\d+")) { // "\\d+" valida que la entrada sea un número entero positivo (uno o más dígitos).
                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                continue;
            }
            opcion = Integer.parseInt(eleccion);
            if (opcion > operacionesNombres.length || opcion <= 0) {
                System.err.printf("Error: Opción fuera de rango (1 - %d), intente nuevamente.%n", operacionesNombres.length);
            }
        } while (opcion > operacionesNombres.length || opcion <= 0); // si no hay coincidencia repetirá


        System.out.println("Ingrese el primer número:");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        n2 = sc.nextInt();

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
