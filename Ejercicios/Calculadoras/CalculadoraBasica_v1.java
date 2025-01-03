package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraBasica_v1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, operacion, suma, resta, multiplicacion, resultado; // declaración de variables a usar
        double division;
        String nombreOperacion;
        System.out.println("Ingrese un número:"); // solicitud de números
        n1 = leer.nextInt();
        System.out.println("Ingrese un número:");
        n2 = leer.nextInt();
        System.out.println("Los números que has ingresados son: " + n1 + " y " + n2 + ".");
        System.out.println("¿Que operación desea realizar?\n1.Suma.\n2.Resta.\n3.Multiplicación.\n4.División.");
        operacion = leer.nextInt();
        switch (operacion) {
            case 1 -> {
                nombreOperacion = "Suma";
                suma = n1 + n2;
                resultado = suma;
                System.out.println("El resultado de la " + nombreOperacion + " es: " + resultado);
            }
            case 2 -> {
                nombreOperacion = "Resta";
                resta = n1 - n2;
                resultado = resta;
                System.out.println("El resultado de la " + nombreOperacion + " es: " + resultado);
            }
            case 3 -> {
                nombreOperacion = "Multiplicación";
                multiplicacion = n1 * n2;
                resultado = multiplicacion;
                System.out.println("El resultado de la " + nombreOperacion + " es: " + resultado);
            }
            case 4 -> {
                nombreOperacion = "División";
                if (n2 == 0) {
                    System.out.println("Error: No es posible dividir entre cero.");
                } else {
                    division = (double) n1 / n2; //casting a double
                    System.out.println("El resultado de la " + nombreOperacion + " es: " + division);
                }
            }
            default -> System.out.println("Operación no valida");
        }
        leer.close();
    }
}
