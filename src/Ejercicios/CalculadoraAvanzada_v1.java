package Ejercicios;

import java.util.Scanner;

public class CalculadoraAvanzada_v1 {
    static Scanner leer = new Scanner(System.in); // variable estatica

    public static void main(String[] args) {
        double n1, n2, suma, resta, multiplicacion, division, modulo, potencia, raiz; // declaración de variables
        int operacion, resultado;
        String nombreoperacion = null;
        boolean control = true;
        do {
            System.out.println("Bienvenido(a)!, ¿Que operación desea realizar?" +
                    "\n1.Suma.\n2.Resta.\n3.Multiplicación.\n4.División.\n5.Modulo.\n6.Potencia.\n7.Raíz Cuadrada." +
                    "\n8.Salir.");
            operacion = leer.nextInt(); // inicialización de las variables
            leer.nextLine();

            switch (operacion) {
                case 1:
                    nombreoperacion = "Suma";
                    control = false;
                    break;
                case 2:
                    nombreoperacion = "Resta";
                    control = false;
                    break;
                case 3:
                    nombreoperacion = "Multiplicación";
                    control = false;
                    break;
                case 4:
                    nombreoperacion = "División";
                    control = false;
                    break;
                case 5:
                    nombreoperacion = "Modulo";
                    control = false;
                    case 6:
                    nombreoperacion = "Potencia";
                    control = false;
                    break;
                    case 7:
                    nombreoperacion = "Raíz Cuadrada";
                    control = false;
                    break;
                    case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: opción o ingreso, válido intente nuevamente.");
                    break;
            }
        } while (control != false);
        System.out.println("Usted a elegido: " + nombreoperacion);
    }
}
