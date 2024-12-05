package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class CalculadoraGeometricaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nombreFiguras = {"Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Trapecio", "Rombo", "Polígono Regular", "Octágono"};
        String[] opciones = {"Calcular área", "Calculara Perímetro", "Conversión de unidades"};
        String[] nombreUnidades = {"Grados", "Radianes"};
        int opc;
        String eleccion;

        do {
            System.out.println("Bienvenido(a) favor indicar opción a realizar:");
            opc = 1;
            for (String opcion : opciones) {
                System.out.printf("%d. %s%n", opc++, opcion);
            }
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty()||!eleccion.matches("-?\\d+")){
                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                continue;
            }

            opc = Integer.parseInt(eleccion);
        } while (true);
    }
}
