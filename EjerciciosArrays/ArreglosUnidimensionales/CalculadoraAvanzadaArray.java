package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class CalculadoraAvanzadaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nombreOperacion = {"Suma", "Resta", "Multiplicación", "División", "Modulo", "Potencia", "Raíz Cuadrada"};
        String eleccion;
        int opc = 1;
        do {
            opc = 1;
            System.out.println("Bienvenido(a), favor ingrese la opción correspondiente a la operación a realizar a continuación:");

            for (String nombre : nombreOperacion) {
                System.out.printf("%d. %s.%n", opc++, nombre);
            }
            eleccion = sc.nextLine().trim();
            if (eleccion.isEmpty() || eleccion.trim().isEmpty()) {
                System.err.println("No puede ir vacía");
                continue;
            }
            opc = Integer.parseInt(eleccion);
        } while (opc <= 0);
    }
}
