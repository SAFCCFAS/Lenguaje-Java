package Ejercicios;

import java.util.Scanner;

public class ConversionDeTiempo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc, conv;
        double valor, tiempo;
        String und, cambio;
        boolean control;
        do {
            System.out.println("¡Hola! Este programa te ayuda a convertir unidades de tiempo. Selecciona la unidad original y el valor para empezar."
                    + "\nFavor Elija la unida de tiempo a usar:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Día(s).\n5. Año(s).\n6. Salir");
            opc = sc.nextInt();

            if (opc == 6) {
                System.out.println("¡Hasta la proxima!");
                break;
            }
            control = true;
            do {
                switch (opc) {
                    case 1 -> {
                        und = "Segundo(s)";
                        System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                        valor = sc.nextDouble();
                        System.out.println("favor elija la unida de tiempo a pasar:\n1. Minuto(s).\n2. Hora(s).\n3. Día(s).\n4. Año(s).");
                        conv = sc.nextInt();
                        switch (conv) {
                            case 1 -> {
                                cambio = "Minuto(s)";
                                tiempo = valor / 60;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                                control = false;
                            }
                            case 2 -> {
                                cambio = "Hora(s)";
                                tiempo = valor / 3600;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                cambio = "Día(s)";
                                tiempo = valor / 86400;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                cambio = "Año(s)";
                                tiempo = valor / 31536000;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            default -> System.err.println("Error: Opción o ingreso no valido intente nuevamente");
                        }
                    }
                    case 2 -> {
                        und = "Minuto(s)";
                        System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                        valor = sc.nextDouble();
                        System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Hora(s).\n3. Día(s).\n4. Año(s).");
                        conv = sc.nextInt();
                        switch (conv) {
                            case 1 -> {
                                cambio = "Segundo(s)";
                                tiempo = valor * 60;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                                control = false;
                            }
                            case 2 -> {
                                cambio = "Hora(s)";
                                tiempo = valor / 60;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                cambio = "Día(s)";
                                tiempo = valor / 1440;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                cambio = "Año(s)";
                                tiempo = valor / 525600;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            default -> System.err.println("Error: Opción o ingreso no valido intente nuevamente");
                        }
                    }
                    case 3 -> {
                        und = "Hora(s)";
                        System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                        valor = sc.nextDouble();
                        System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Minuto(s).\n3. Día(s).\n4. Año(s).");
                        conv = sc.nextInt();
                        switch (conv) {
                            case 1 -> {
                                cambio = "Segundo(s)";
                                tiempo = valor * 3600;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                cambio = "Minuto(s)";
                                tiempo = valor * 60;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                cambio = "Día(s)";
                                tiempo = valor / 24;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                cambio = "Año(s)";
                                tiempo = valor / 8760;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            default ->{
                                System.err.println("Error: Opción o ingreso no valido intente nuevamente");
                            }
                        }
                    }
                    case 4 -> {
                        und = "Día(s)";
                        System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                        valor = sc.nextDouble();
                        System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Año(s).");
                        conv = sc.nextInt();
                        switch (conv) {
                            case 1 -> {
                                cambio = "Segundo(s)";
                                tiempo = valor * 86400;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                cambio = "Minuto(s)";
                                tiempo = valor * 1440;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                cambio = "Hora(s)";
                                tiempo = valor * 24;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                cambio = "Año(s)";
                                tiempo = valor / 365;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            default -> System.err.println("Error: Opción o ingreso no valido intente nuevamente");
                        }
                    }
                    case 5 -> {
                        und = "Año(s)";
                        System.out.println("Usted a elegido: " + und + " favor ingrese la cantidad a pasar hacia la otra unidad: ");
                        valor = sc.nextDouble();
                        System.out.println("favor elija la unida de tiempo a pasar:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Día(s).");
                        conv = sc.nextInt();
                        switch (conv) {
                            case 1 -> {
                                cambio = "Segundo(s)";
                                tiempo = valor * 31536000;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                cambio = "Minuto(s)";
                                tiempo = valor * 525600;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                cambio = "Hora(s)";
                                tiempo = valor * 8760;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                cambio = "Día(s)";
                                tiempo = valor * 365;
                                System.out.println(valor + " " + und + " pasados a " + cambio + " es igual a: " + tiempo);
                            }
                            default -> System.err.println("Error: Opción o ingreso no valido intente nuevamente");
                        }

                    }
                }
            } while (!control);
        } while (true);
    }
}