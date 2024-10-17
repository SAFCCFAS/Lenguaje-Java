package Ejercicios;

import java.util.Scanner;

public class CalculadoraAvanzada_v1 {
    static Scanner leer = new Scanner(System.in); // variable estatica

    public static void main(String[] args) {
        double n1, n2, suma, resta, multiplicacion, division, modulo, potencia, raiz; // declaración de variables
        int operacion, resultado;
        String nombreoperacion= null;
        boolean control=true;
        do {
            System.out.println("Bienvenido(a)!, ¿Que operación desea realizar?" +
                    "\n1.Suma.\n2.Resta.\n3.Multiplicación.\n4.División.\n5.Modulo.\n6.Potencia.\n7.Raiz Cuadrada." +
                    "\n8.Salir.");
            operacion = leer.nextInt(); // inicialización de las variables
            if (operacion >= 1 && operacion <= 4) {
                switch (operacion) {
                    case 1:
                        nombreoperacion = "Suma";
                        break;
                    case 2:
                        nombreoperacion = "Resta";
                        break;
                    case 3:
                        nombreoperacion = "Multiplicación";
                        break;
                    case 4:
                        nombreoperacion = "División";
                        break;
                    default:
                        System.out.println("Error: opción o ingreso, válido intente nuevamente.");
                }
                System.out.println("Usted a elegido: " + nombreoperacion);

                control=false;
            }
        }while (control);
    }
}
