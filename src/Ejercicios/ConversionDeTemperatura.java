package Ejercicios;

import java.util.Scanner;

public class ConversionDeTemperatura {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int und, conv;
        double temp;
        boolean control = true;
        String nombreUnidad = null, simb = null;

        do {
            System.out.println("Bienvenido(a), favor indique la unidad de temperatura a convertir. \n1. Celsius (°C)." +
                    "\n2. Fahrenheit (°F). \n3. Kelvin (K). \n4. Salir.");
            und = leer.nextInt();
            switch (und) {
                case 1 -> {
                    nombreUnidad = "Celsius (°C)";
                    simb = "°C";
                    control = false;
                }
                case 2 -> {
                    nombreUnidad = "Fahrenheit (°F)";
                    simb = "°F";
                    control = false;
                }
                case 3 -> {
                    nombreUnidad = "Kelvin (K)";
                    simb = "K";
                    control = false;
                }
                case 4 -> {
                    System.out.println("Hasta la próxima");
                    System.exit(0);
                }
                default -> System.err.println("Error: Ingreso u opción no válida, opciones válidas 1 al 4");
            }
            if (nombreUnidad != null) {
                System.out.println("Usted a elegido: " + nombreUnidad);
            }
        } while (control);
        if (und >= 1 && und <= 3) {
            System.out.println("Ingrese temperatura en " + nombreUnidad);
            temp = leer.nextDouble();
            System.out.println("Usted a ingresado: " + temp + simb + "\nIndique unidad a convertir");
            if (und == 1) {
                System.out.println("1. Fahrenheit (°F) ó 2. Kelvin (K).");
                conv = leer.nextInt();
            } else if (und == 2) {
                System.out.println("1. Celsius (°C) ó 2. Kelvin (K).");
                conv = leer.nextInt();
            } else if (und == 3) {
                System.out.println("1. Celsius (°C) ó 2. Fahrenheit (°F)");
                conv = leer.nextInt();
            }
        }
    }
}
