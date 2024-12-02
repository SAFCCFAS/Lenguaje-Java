package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class CalculadoraAvanzadaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nombreOperacion = {"Suma", "Resta", "Multiplicación", "División", "Modulo", "Potencia", "Raíz Cuadrada"};
        String entrada;
        double[] operaciones = new double[7];
        int opc, valor = 0, valor1 = 0;

        do { //repetirá el menú hasta que se reciba un ingreso válido.
            opc = 1;
            System.out.println("Bienvenido(a), favor ingrese la opción correspondiente a la operación a realizar a continuación:");

            for (String nombre : nombreOperacion) {
                System.out.printf("%d. %s.%n", opc++, nombre);
            }
            entrada = sc.nextLine().trim();
            if (entrada.trim().isEmpty()) {
                System.err.println("Error: Favor ingresar alguna de las opciones mostrada, intente nuevamente.");
                continue;
            } else if (!entrada.matches("\\d+")) { // "\\d+" valida que la entrada sea un número entero positivo (uno o más dígitos).
                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                continue;
            }
            opc = Integer.parseInt(entrada);
            if (opc > nombreOperacion.length || opc <= 0) {
                System.err.printf("Error: Opción fuera de rango (1 - %d), intente nuevamente.%n", nombreOperacion.length);
            }
        } while (opc > nombreOperacion.length || opc <= 0); // si no hay coincidencia repetirá

        do {
            if (opc >= 1 && opc <= 7) {
                System.out.println("Opción elegida: " + nombreOperacion[opc - 1] + ", favor ingrese primera a operar:");
                entrada = sc.nextLine().trim();
                if (entrada.trim().isEmpty() || !entrada.matches("\\d+")) {
                    System.err.println("Error: Favor ingrese una cifra para continuar.");
                    continue;
                }
                valor = Integer.parseInt(entrada);
            }
            if (opc != 7) {
                System.out.println("Ingrese segunda cifra:");
                entrada = sc.nextLine().trim();
                if (entrada.trim().isEmpty() || !entrada.matches("\\d+")) {
                    System.err.println("Error: Favor ingrese una cifra para continuar.");
                    continue;
                }
                valor1 = Integer.parseInt(entrada);
            }
        } while (entrada.trim().isEmpty() || !entrada.matches("\\d+"));

        sc.close();

        switch (opc) {
            case 1 -> operaciones[0] = valor + valor1;
            case 2 -> operaciones[1] = valor - valor1;
            case 3 -> operaciones[2] = valor * valor1;
            case 4 -> {
                if (valor1 != 0) {
                    operaciones[3] = (double) valor / valor1;
                } else {
                    operaciones[3] = Double.NaN; // Manejo de división por 0
                    System.err.println("Error: División entre cero no permitida.");
                }
            }
            case 5 -> operaciones[4] = valor % valor1;
            case 6 -> operaciones[5] = Math.pow(valor, valor1);
            case 7 -> {
                if (valor < 0) {
                    operaciones[6] = Double.NaN;
                    System.err.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                } else {
                    operaciones[6] = Math.sqrt(valor);
                }
            }
        }

        System.out.println("Resultado de la operación " + nombreOperacion[opc - 1] + ":");
        if (opc == 4 || opc == 6 || opc == 7) { // Mostrar con decimales solo si la operación es de tipo flotante
            System.out.printf("%.2f%n", operaciones[opc - 1]);
        } else { // Mostrar como entero si la operación no tiene decimales
            System.out.printf("%d%n", (int) operaciones[opc - 1]);
        }

    }
}
