package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraAvanzada_v2 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n2;

        int operacion;
        String nombreoperacion = null;
        boolean control = true;
        do {
            System.out.println("Bienvenido(a)!, ¿Que operación desea realizar?" + "\n1.Suma.\n2.Resta.\n3.Multiplicación.\n4.División.\n5.Modulo.\n6.Potencia.\n7.Raíz Cuadrada." + "\n8.Salir.");
            operacion = leer.nextInt();

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
                    break;
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
                    System.err.println("Error: opción o ingreso no válido intente nuevamente." + "\nOpciones válidas 1 al 8");
                    break;
            }
        } while (control);


        if (operacion >= 1 && operacion <= 5) {
            System.out.println("Usted a elegido: " + nombreoperacion);
            System.out.println("Ingrese un número");
            n1 = leer.nextDouble();
            System.out.println("Ingrese un número");
            n2 = leer.nextDouble();
            switch (operacion) {
                case 1:
                    System.out.println("EL resultado de la " + nombreoperacion + " es " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("EL resultado de la " + nombreoperacion + " es " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("EL resultado de la " + nombreoperacion + " es " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("El resultado de la " + nombreoperacion + " es " + (n1 / n2));
                    } else {
                        System.err.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("El resultado de la " + nombreoperacion + " es " + (n1 % n2));
                    break;
            }
        } else if (operacion == 6) {
            System.out.println("Ingrese número base");
            n1 = leer.nextDouble();
            System.out.println("Ingrese número exponente");
            n2 = leer.nextDouble();
            System.out.println("El resultado de la " + nombreoperacion + " es " + Math.pow(n1, n2));
        } else {
            System.out.println("Ingrese un número a encontrar " + nombreoperacion);
            n1 = leer.nextDouble();
            System.out.println("El resultado de la " + nombreoperacion + " es " + Math.sqrt(n1));
        }
        leer.close();
    }
}
