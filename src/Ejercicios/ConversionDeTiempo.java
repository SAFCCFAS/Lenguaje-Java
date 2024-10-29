package Ejercicios;

import java.util.Scanner;

public class ConversionDeTiempo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opc, conv = 0;
        double valor = 0, tiempo;
        String und="", cambio;
        boolean control = true;
        do {
            System.out.println("¡Hola! Este programa te ayuda a convertir unidades de tiempo. Selecciona la unidad original y el valor para empezar." +
                    "\nFavor elija la unida de tiempo a usar:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Día(s).\n5. Año(s).\n6. Salir");
            opc = sc.nextInt();
            if (opc == 6) {
                System.out.println("¡Hasta la proxima!");
                break;
            }
            switch (opc) {
                case 1 -> {
                    und = "Segundo(s)";
                    System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                    valor = sc.nextDouble();
                    System.out.println("favor elija la unida de tiempo a pasar:\n1. Minuto(s).\n2. Hora(s).\n3. Día(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    control = false;
                }
                case 2 -> {
                    und = "Minuto(s)";
                    System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                    valor = sc.nextDouble();
                    System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Hora(s).\n3. Día(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    control = false;
                }
                case 3->{
                    und = "Hora(s)";
                    System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                    valor = sc.nextDouble();
                    System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Minuto(s).\n3. Día(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    control = false;
                }
                case 4 ->{
                    und = "Día(s)";
                    System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                    valor = sc.nextDouble();
                    System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    control = false;
                }
                case 5->{
                    und = "Año(s)";
                    System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                    valor = sc.nextDouble();
                    System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Día(s).");
                    conv = sc.nextInt();
                    control = false;
                }
            }
        } while (control);
    }
}