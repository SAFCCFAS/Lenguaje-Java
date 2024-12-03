package Ejercicios.Conversiones;

import java.util.Scanner;

public class ConversionDeTemperatura {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int und, conv;
        double temp, cambioUnidad;
        boolean control = true;
        String nombreUnidad = null, simbUnd = null, newUnd = null;

        do {
            System.out.println("Bienvenido(a), favor indique la unidad de temperatura a convertir. \n1. Celsius (°C)." +
                    "\n2. Fahrenheit (°F). \n3. Kelvin (K). \n4. Salir.");
            und = leer.nextInt();
            switch (und) {
                case 1 -> {
                    nombreUnidad = "Celsius (°C)";
                    simbUnd = "°C";
                    control = false;
                }
                case 2 -> {
                    nombreUnidad = "Fahrenheit (°F)";
                    simbUnd = "°F";
                    control = false;
                }
                case 3 -> {
                    nombreUnidad = "Kelvin (K)";
                    simbUnd = "K";
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
            temp = leer.nextDouble(); // dado que las temperaturas no son siempre cifras cerradas se optó por double
            System.out.println("Usted a ingresado: " + temp + simbUnd + "\nIndique unidad a convertir");
            if (und == 1) {
                System.out.println("1. Fahrenheit (°F) ó 2. Kelvin (K).");
                conv = leer.nextInt();
                switch (conv) { // realizar las conversiones según el caso
                    case 1 -> {
                        nombreUnidad = "Fahrenheit (°F)";
                        newUnd = "°F";
                        cambioUnidad = temp * 9 / 5 + 32;
                        System.out.println(temp + " " + simbUnd + " a " + nombreUnidad + " es " + cambioUnidad + " " + newUnd);
                        // mostrar el resultado de la conversión
                    }
                    case 2 -> {
                        nombreUnidad = "Kelvin (K)";
                        newUnd = "K";
                        cambioUnidad = temp + 273.15;
                        System.out.println(temp + " " + simbUnd + " a " + nombreUnidad + " es " + cambioUnidad + " " + newUnd);
                    }
                    default -> System.err.println("Error: Ingreso u opción no válida, opciones válidas 1 y 2");
                }
            } else if (und == 2) {
                System.out.println("1. Celsius (°C) ó 2. Kelvin (K).");
                conv = leer.nextInt();
                switch (conv) {
                    case 1 -> {
                        nombreUnidad = "Celsius (°C)";
                        newUnd = "°C";
                        cambioUnidad = (temp - 32) * 5 / 9;
                        System.out.println(temp + " " + simbUnd + " a " + nombreUnidad + " es " + cambioUnidad + " " + newUnd);
                    }
                    case 2 -> {
                        nombreUnidad = "Kelvin (K)";
                        newUnd = "K";
                        cambioUnidad = (temp - 32) * 5 / 9 + 273.15;
                        System.out.println(temp + " " + simbUnd + " a " + nombreUnidad + " es " + cambioUnidad + " " + newUnd);
                    }
                    default -> System.err.println("Error: Ingreso u opción no válida, opciones válidas 1 y 2");
                }
            } else if (und == 3) {
                System.out.println("1. Celsius (°C) ó 2. Fahrenheit (°F)");
                conv = leer.nextInt();
                switch (conv) {
                    case 1 -> {
                        nombreUnidad = "FCelsius (°C)";
                        newUnd = "°C";
                        cambioUnidad = temp - 273.15;
                        System.out.println(temp + " " + simbUnd + " a " + nombreUnidad + " es " + cambioUnidad + " " + newUnd);
                    }
                    case 2 -> {
                        nombreUnidad = "Fahrenheit (°F)";
                        newUnd = "°F";
                        cambioUnidad = (temp - 273.15) * 9 / 5 + 32;
                        System.out.println(temp + " " + simbUnd + " a " + nombreUnidad + " es " + cambioUnidad + " " + newUnd);
                    }
                    default -> System.err.println("Error: Ingreso u opción no válida, opciones válidas 1 y 2");
                }
            }
        }
        leer.close();
    }
}
