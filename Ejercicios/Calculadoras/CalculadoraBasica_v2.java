package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraBasica_v2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, operacion;
        String nombreOperacion = null;
        System.out.println("Ingrese un número:");
        n1 = leer.nextInt();
        System.out.println("Ingrese un número:");
        n2 = leer.nextInt();
        System.out.println("Los números que has ingresados son: " + n1 + " y " + n2 + ".");
        System.out.println("¿Que operación desea realizar?\n1.Suma.\n2.Resta.\n3.Multiplicación.\n4.División.");
        operacion = leer.nextInt();
        switch (operacion) {
            case 1:
                nombreOperacion = "Suma";
                System.out.println("El resultado de la " + nombreOperacion + " es: " + (n1 + n2));
                break;
            case 2:
                nombreOperacion = "Resta";
                System.out.println("El resultado de la " + nombreOperacion + " es: " + (n1 - n2));
                break;
            case 3:
                nombreOperacion = "Multiplicación";
                System.out.println("El resultado de la " + nombreOperacion + " es: " + (n1 * n2));
                break;
            case 4:
                nombreOperacion = "División";
                if (n2 == 0) {
                    System.out.println("Error: No es posible dividir entre cero.");
                } else {
                    System.out.println("El resultado de la " + nombreOperacion + " es: " + ((double) n1 / n2));
                }
                break;
            default:
                System.out.println("Operación no valida");
        }
        leer.close();
    }
}
