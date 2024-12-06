package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class CalculadoraGeometricaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] opciones = {"Calcular área", "Calcular Perímetro", "Conversión de unidades"};
        String[] nombreFiguras = {"Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Trapecio", "Rombo", "Polígono Regular", "Octágono"};
        String[] opcionConversiones = {"Longitud", "Área", "Ángulo"};
        String[][] unidades = {{"Kilómetro", "km"}};
        //System.out.println("Elija al conversión de unidad a realizar:\n1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²).\n3. Ángulos (Grados a Radianes, Radianes a Grados).\n4. Regresar al menú principal.");
        int opc, fig;
        String eleccion;

        do {
            System.out.println("Bienvenido(a) favor indicar opción a realizar:");
            opc = 1;
            for (String opcion : opciones) {
                System.out.printf("%d. %s.%n", opc++, opcion);
            }
            System.out.printf("%d. Salir.%n", opc);
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty() || !eleccion.matches("-?\\d+")) {
                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                continue;
            }
            opc = Integer.parseInt(eleccion);
            if (opc > opciones.length + 1 || opc <= 0) {
                System.err.printf("Error: Opción fuera de rango (1 - %d), intente nuevamente.%n", opciones.length + 1);
            } else if (opc == opciones.length + 1) {
                System.out.println("Gracias por usar el programa, ¡hasta pronto!");
                break;
            }
            System.out.printf("Usted a elegido: %s.%n", opciones[opc - 1]);
            do {
                fig = 1;
                if (opc == 1 || opc == 2) {
                    System.out.printf("Favor elija la figura a %s%n", opciones[opc - 1]);
                    for (String figura : nombreFiguras) {
                        System.out.printf("%d. %s%n", fig++, figura);
                    }
                    System.out.printf("%d. Regresar al menú anterior.%n", fig);
                } else {
                    System.out.printf("Favor elija la %s a realizar:%n", opciones[opc - 1]);
                    for (String conversion : opcionConversiones) {
                        System.out.printf("%d. %s%n", fig++, conversion);
                    }
                }
                eleccion = sc.nextLine();
                fig = Integer.parseInt(eleccion);
            } while (true);
        } while (true);

    }
}
