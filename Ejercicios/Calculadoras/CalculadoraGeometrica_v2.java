package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, simbMed, cambioMed;
        int opc, fig, opc1, conv;
        double valor, valor1, valor2, valor3;
        String eleccion;

        while (true) {
            System.out.println("Bienvenido(a) favor indicar que desea realizar:");
            System.out.println("1. Calcular área. \n2. Calcular perímetro.\n3. Conversión de unidades.\n4. Salir.");
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
                System.err.println("Por favor, ingrese una opción válida.");
                continue;
            }
            opc = Integer.parseInt(eleccion);
            do {
                if (opc == 1 || opc == 2) {
                    System.out.printf("Indique la figura geométrica a la que desea calcular el %s:\n", opc == 1 ? "área" : "perímetro");
                    System.out.println("1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.");
                    System.out.println("8. Octágono.\n9. Regresa menú anterior");
                } else {
                    System.out.println("Indique la conversión que desea realizar:");
                    System.out.println("1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²).\n3. Ángulos (Grados a Radianes, Radianes a Grados).");
                    System.out.println("4. Regresar al menú principal.");
                }
                eleccion = sc.nextLine().trim();
                if (eleccion.trim().isEmpty() || (opc == 1 || opc == 2) && !eleccion.matches("[1-9]") || (opc == 3) && !eleccion.matches("[1-4]")) {
                    System.err.println("Por favor, ingrese una opción válida.");
                    continue;
                }
                if (opc == 1 || opc == 2) {
                    fig = Integer.parseInt(eleccion);
                    if (fig == 9) {
                        break;
                    }
                    if (fig < 1 || fig > 9) {
                        System.err.println("Por favor, ingrese una opción válida.");
                    }
                } else {
                    conv = Integer.parseInt(eleccion);
                    if (conv == 4) {
                        break;
                    }
                    if (conv < 1 || conv > 4) {
                        System.err.println("Por favor, ingrese una opción válida.");
                    }
                }
            } while (true);
            if (opc == 4) {
                System.out.println("Gracias por utilizar el programa.");
                break;
            }
            break;
        }
    }
}