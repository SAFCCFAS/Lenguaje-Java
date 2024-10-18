package Ejercicios;

import java.util.Scanner;

public class CalculadoraAvanzada_v1 {
    static Scanner leer = new Scanner(System.in); // variable estatica

    public static void main(String[] args) {
        double n1, n2, suma, resta, multiplicacion, division, modulo, potencia, raiz; // declaración de
                                                                                      // variables
        int operacion;
        String nombreoperacion = null;
        boolean control = true;
        do {
            System.out.println("Bienvenido(a)!, ¿Que operación desea realizar?" +
                    "\n1.Suma.\n2.Resta.\n3.Multiplicación.\n4.División.\n5.Modulo.\n6.Potencia.\n7.Raíz Cuadrada." +
                    "\n8.Salir.");
            operacion = leer.nextInt(); // inicialización de las variables

            switch (operacion) { // asignar el nombre de la operación según el ingreso
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
                    System.err.println("Error: opción o ingreso no válido intente nuevamente." +
                            "\nOpciones válidas 1 al 8");
                    break;
            }
        } while (control != false);
        System.out.println("Usted a elegido: " + nombreoperacion); // mostrar el nombre según el ingreso realizado
        for (int i = 0; i < 1; i++) { // realizar operación
            if (operacion >= 1 && operacion <= 5) {
                System.out.println("Ingrese un número");
                n1 = leer.nextDouble();
                System.out.println("Ingrese un número");
                n2 = leer.nextDouble();
                switch (operacion) {
                    case 1:
                        suma = n1 + n2;
                        System.out.println("EL resultado de la " + nombreoperacion + " es " + suma);
                        break;
                    case 2:
                        resta = n1 - n2;
                        System.out.println("EL resultado de la " + nombreoperacion + " es " + resta);
                        break;
                    case 3:
                        multiplicacion = n1 * n2;
                        System.out.println("EL resultado de la " + nombreoperacion + " es " + multiplicacion);
                        break;
                    case 4:
                        if (n2 != 0) {
                            division = n1 / n2;
                            System.out.println("El resultado de la " + nombreoperacion + " es " + division);
                        } else {
                            System.err.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                    case 5:
                        modulo = n1 % n2;
                        System.out.println("El resultado de la " + nombreoperacion + " es " + modulo);
                        break;
                }
            } else if (operacion == 6) {
                System.out.println("Ingrese número base");
                n1 = leer.nextDouble();
                System.out.println("Ingrese número exponente");
                n2 = leer.nextDouble();
                potencia = Math.pow(n1, n2);
                System.out.println("El resultado de la " + nombreoperacion + " es " + potencia);
            } else if (operacion == 7) {
                System.out.println("Ingrese un número a encontrar " + nombreoperacion);
                n1 = leer.nextDouble();
                raiz = Math.sqrt(n1);
                System.out.println("El resultado de la " + nombreoperacion + " es " + raiz);
            }
        }
    }
}
