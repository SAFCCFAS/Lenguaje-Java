package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class CalculadoraAvanzadaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nombreOperacion = {"Suma", "Resta", "Multiplicación", "División", "Modulo", "Potencia", "Raíz Cuadrada"};
        String eleccion;
        int opc;

        do { //repetirá el menú hasta que se reciba un ingreso válido.
            opc = 1;
            System.out.println("Bienvenido(a), favor ingrese la opción correspondiente a la operación a realizar a continuación:");

            for (String nombre : nombreOperacion) {
                System.out.printf("%d. %s.%n", opc++, nombre);
            }
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty()) {
                System.err.println("Error: Favor ingresar alguna de las opciones mostrada, intente nuevamente.");
                continue;
            } else if (!eleccion.matches("\\d+")) { // "\\d+" valida que la entrada sea un número entero positivo (uno o más dígitos).
                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                continue;
            }
            opc = Integer.parseInt(eleccion);
            if (opc > nombreOperacion.length || opc <= 0) {
                System.err.printf("Error: Opción fuera de rango (1 - %d), intente nuevamente.%n", nombreOperacion.length);
            }
        } while (opc > nombreOperacion.length || opc <= 0); // si no hay coincidencia repetirá



        sc.close();
    }
}
