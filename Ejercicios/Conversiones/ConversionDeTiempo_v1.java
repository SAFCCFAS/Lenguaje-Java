package Ejercicios.Conversiones;

import java.util.Scanner;

public class ConversionDeTiempo_v1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc, conv = 0;
        double valor, tiempo;
        String und = null, undDestino;

        while (true) { // Bucle para el primer menú.
            System.out.println("¡Hola! Este programa te ayuda a convertir unidades de tiempo, por favor selecciona la unidad original y el valor para empezar.");
            System.out.println("1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Día(s).\n5. Año(s).\n6. Salir.");
            opc = sc.nextInt();
            if (opc == 6) { // Salir del programa
                System.out.println("¡Hasta la próxima!");
                break;
            } else if (opc >= 1 && opc <= 5) {
                switch (opc) {
                    case 1 -> und = "Segundo(s)";
                    case 2 -> und = "Minuto(s)";
                    case 3 -> und = "Hora(s)";
                    case 4 -> und = "Día(s)";
                    case 5 -> und = "Año(s)";
                }
                System.out.println("Usted a elegido: " + und);
                System.out.println("Favor a continuación ingresa cantidad de " + und + " a pasar");
                break; // Salida del primer menú.
            } else {
                System.err.println("Opción o ingreso no válido intente nuevamente");
            }
        }

        valor = sc.nextDouble();
        do { // Bucle segundo menú.
            switch (opc) {
                case 1 -> {
                    System.out.println("Elija unidad de tiempo para el cambio:\n1. Minuto(s).\n2. Hora(s).\n3. Día(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    if (conv >= 1 && conv <= 4) { // Cambio de las unidades.
                        switch (conv) {
                            case 1 -> {
                                undDestino = "Minuto(s)";
                                tiempo = valor / 60;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                undDestino = "Hora(s)";
                                tiempo = valor / 3600;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                undDestino = "Día(s)";
                                tiempo = valor / 86400;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                undDestino = "Año(s)";
                                tiempo = valor / 31536000;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                        }
                    } else {
                        System.err.println("Opción o ingreso no válido intente nuevamente");
                    }
                }
                case 2 -> {
                    System.out.println("Elija unidad de tiempo para el cambio:\n1. Segundo(s).\n2. Hora(s).\n3. Día(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    if (conv >= 1 && conv <= 4) {
                        switch (conv) {
                            case 1 -> {
                                undDestino = "Segundo(s)";
                                tiempo = valor * 60;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                undDestino = "Hora(s)";
                                tiempo = valor / 60;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                undDestino = "Día(s)";
                                tiempo = valor / 1440;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                undDestino = "Año(s)";
                                tiempo = valor / 525600;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                        }
                    } else {
                        System.err.println("Opción o ingreso no válido intente nuevamente");
                    }
                }
                case 3 -> {
                    System.out.println("Elija unidad de tiempo para el cambio:\n1. Segundo(s).\n2. Minuto(s).\n3. Día(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    if (conv >= 1 && conv <= 4) {
                        switch (conv) {
                            case 1 -> {
                                undDestino = "Segundo(s)";
                                tiempo = valor * 3600;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                undDestino = "Minuto(s)";
                                tiempo = valor * 60;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                undDestino = "Día(s)";
                                tiempo = valor / 24;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                undDestino = "Año(s)";
                                tiempo = valor / 8760;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                        }
                    } else {
                        System.err.println("Opción o ingreso no válido intente nuevamente");
                    }
                }
                case 4 -> {
                    System.out.println("Elija unidad de tiempo para el cambio:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Año(s).");
                    conv = sc.nextInt();
                    if (conv >= 1 && conv <= 4) {
                        switch (conv) {
                            case 1 -> {
                                undDestino = "Segundo(s)";
                                tiempo = valor * 86400;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                undDestino = "Minuto(s)";
                                tiempo = valor * 1440;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                undDestino = "Hora(s)";
                                tiempo = valor * 24;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                undDestino = "Año(s)";
                                tiempo = valor / 365;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                        }
                    } else {
                        System.err.println("Opción o ingreso no válido intente nuevamente");
                    }
                }
                case 5 -> {
                    System.out.println("Elija unidad de tiempo para el cambio:\n1. Segundo(s).\n2. Minuto(s).\n3. Hora(s).\n4. Día(s).");
                    conv = sc.nextInt();
                    if (conv >= 1 && conv <= 4) {
                        switch (conv) {
                            case 1 -> {
                                undDestino = "Segundo(s)";
                                tiempo = valor * 31536000;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 2 -> {
                                undDestino = "Minuto(s)";
                                tiempo = valor * 525600;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 3 -> {
                                undDestino = "Hora(s)";
                                tiempo = valor * 8760;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                            case 4 -> {
                                undDestino = "Día(s)";
                                tiempo = valor * 365;
                                System.out.println(valor + " pasado a " + undDestino + " es igual a: " + tiempo);
                            }
                        }
                    } else {
                        System.err.println("Opción o ingreso no válido intente nuevamente");
                    }
                }
                default -> System.err.println("Opción o ingreso no válido intente nuevamente");
            }
        } while (!(conv >= 1 && conv <= 4));
        sc.close();
    }
}