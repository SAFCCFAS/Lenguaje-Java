package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opciones, figura, categoria, medidaOrigen, medidaDestino, simbMed, eleccion, entrada, rangoValido;
        int opcion, fig, contar, origen, destino, unidad, limite;
        double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, area, perimetro, conversion;
        boolean ingresoValido;

        while (true) {
            System.out.println("Bienvenido(a), favor elija la opción a utilizar:\n1. Calcular Área.\n2. Calcular Perímetro.\n3. Conversión de unidades.");
            System.out.println("4. Salir.");
            eleccion = sc.nextLine().trim();
            rangoValido = "[1-4]";
            ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches(rangoValido);
            if (!ingresoValido) {
                System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                continue;
            } else if (Integer.parseInt(eleccion) == 4) {
                System.out.println("¡Gracias por usar el programa!");
                break;
            }
            opcion = Integer.parseInt(eleccion);
            opciones = opcion == 1 ? "calcular área" : opcion == 2 ? "calcular perímetro" : "conversión de unidades";
            System.out.printf("Usted a elegido: %s.%n", opciones);
            switch (opcion) {
                case 1, 2 -> {
                    while (true) {
                        System.out.printf("Favor, elija la figura a %s.%n", opciones);
                        System.out.println("1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.");
                        System.out.println("8. Octágono.\n9. Regresa menú anterior");
                        eleccion = sc.nextLine().trim();
                        rangoValido = "[1-9]";
                        ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches(rangoValido);
                        if (!ingresoValido) {
                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                            continue;
                        } else if (Integer.parseInt(eleccion) == 9) {
                            System.out.println("Regresando el menú anterior...");
                            break;
                        }
                        fig = Integer.parseInt(eleccion);
                        figura = switch (fig) {
                            case 1 -> "Cuadrado";
                            case 2 -> "Rectángulo";
                            case 3 -> "Triángulo";
                            case 4 -> "Círculo";
                            case 5 -> "Trapecio";
                            case 6 -> "Rombo";
                            case 7 -> "Polígono regular";
                            default -> "Octágono";
                        };
                        System.out.printf("Usted a elegido: %s.%n", figura);
                        switch (fig) {
                            case 1, 2, 3, 4, 5, 6, 7, 8 -> {
                                limite = switch (fig) {
                                    case 1, 4, 8 -> 1;
                                    case 2, 7 -> 2;
                                    case 3 -> opcion == 1 ? 2 : 3;
                                    case 5 -> opcion == 1 ? 3 : 4;
                                    case 6 -> opcion == 1 ? 2 : 1;
                                    default -> 0;
                                };
                                for (contar = 0; contar < limite; contar++) {
                                    while (true) {
                                        System.out.print("Favor ingrese ");
                                        switch (fig) {
                                            case 1 -> System.out.printf("lado del %s:%n", figura);
                                            case 2, 7 -> {
                                                if (fig == 2) {
                                                    System.out.printf("%s %s:%n", contar == 0 ? "largo" : "ancho", figura);
                                                } else {
                                                    System.out.printf("%s del %s:%n", contar == 0 ? "número de lados" : "largo de cada largo", figura);
                                                }
                                            }
                                            case 4 -> System.out.printf("radio del %s:%n", figura);
                                            case 3, 5 -> {
                                                if (fig == 3) {
                                                    if (opcion == 1) {
                                                        System.out.printf("%s del %s:%n", contar == 0 ? "base" : "altura", figura);
                                                    } else {
                                                        System.out.printf("lado %d del %s:%n", contar + 1, figura);
                                                    }
                                                } else {
                                                    if (opcion == 1) {
                                                        System.out.printf("%s del %s:%n", contar == 0 ? "base mayor" : contar == 1 ? "base menor" : "altura", figura);
                                                    } else {
                                                        System.out.print("longitud ");
                                                        if (contar <= 1) {
                                                            System.out.printf("de la base %s del %s:%n", contar == 1 ? "mayor" : "menor", figura);
                                                        } else {
                                                            System.out.printf("del lado %s del %s:%n", contar == 2 ? "derecho" : "izquierdo", figura);
                                                        }
                                                    }
                                                }
                                            }
                                            case 6 -> {
                                                if (opcion == 1) {
                                                    System.out.printf("diagonal %d del %s:%n", contar + 1, figura);
                                                } else {
                                                    System.out.printf("longitud del largo del %s%n", figura);
                                                }
                                            }
                                            default -> System.out.printf("longitud del lado del %s:%n", figura);
                                        }
                                        entrada = sc.nextLine().trim();
                                        ingresoValido = !entrada.isEmpty() && entrada.matches("\\d+(\\.\\d+)?");
                                        if (!ingresoValido || Double.parseDouble(entrada) <= 0) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                            continue;
                                        }
                                        break;
                                    }
                                    switch (contar) {
                                        case 0 -> valor = Double.parseDouble(entrada);
                                        case 1 -> valor1 = Double.parseDouble(entrada);
                                        case 2 -> valor2 = Double.parseDouble(entrada);
                                        default -> valor3 = Double.parseDouble(entrada);
                                    }
                                }
                                area = switch (fig) {
                                    case 1 -> Math.pow(valor, 2);
                                    case 2 -> valor * valor1;
                                    case 3, 6 -> (valor * valor1) / 2;
                                    case 4 -> Math.PI * Math.pow(valor, 2);
                                    case 5 -> ((valor + valor1) / 2) * valor2;
                                    case 7 -> valor * Math.pow(valor1, 2) / (4 * Math.tan(Math.PI / valor));
                                    default -> (2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2);
                                };

                                perimetro = switch (fig) {
                                    case 1, 6 -> 4 * valor;
                                    case 2 -> 2 * (valor + valor1);
                                    case 3 -> valor + valor1 + valor2;
                                    case 4 -> 2 * Math.PI * valor;
                                    case 5 -> valor + valor1 + valor2 + valor3;
                                    case 7 -> valor * valor1;
                                    default -> 8 * valor;
                                };
                                System.out.printf("El %s del %s es: %.2f%n", opcion == 1 ? "área" : "perímetro", figura, opcion == 1 ? area : perimetro);
                                return;
                            }
                        }
                    }
                }
                case 3 -> {
                    while (true) {
                        System.out.println("Favor elija la categoría de unidad a convertir:\n1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²).");
                        System.out.println("3. Ángulos (Grados a Radianes, Radianes a Grados).\n4. Regresar al menú principal.");
                        eleccion = sc.nextLine().trim();
                        rangoValido = "[1-4]";
                        ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches(rangoValido);
                        if (!ingresoValido) {
                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                            continue;
                        } else if (Integer.parseInt(eleccion) == 4) {
                            System.out.println("Regresando el menú anterior...");
                            break;
                        }
                        origen = Integer.parseInt(eleccion);
                        categoria = switch (origen) {
                            case 1 -> "Longitud";
                            case 2 -> "Área";
                            default -> "Ángulos";
                        };
                        System.out.println("Usted a elegido " + categoria);
                        switch (origen) {
                            case 1, 2 -> {
                                while (true) {
                                    System.out.println("Favor indique la unidad a convertir:");
                                    switch (origen) {
                                        case 1 -> {
                                            System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).\n4. Milímetro (mm).");
                                            System.out.println("5. Regresar al menú anterior.");
                                            rangoValido = "[1-5]";
                                        }
                                        case 2 -> {
                                            System.out.println("1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²)\n3. Centímetro cuadrado (cm²).");
                                            System.out.println("4. Regresar al menú anterior.");
                                            rangoValido = "[1-4]";
                                        }
                                    }
                                    eleccion = sc.nextLine().trim();
                                    ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches(rangoValido);
                                    if (!ingresoValido) {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        continue;
                                    } else if ((origen == 1 && eleccion.equals("5")) || (origen == 2 && eleccion.equals("4"))) {
                                        System.out.println("Regresando al menú principal...");
                                        break;
                                    }
                                    unidad = Integer.parseInt(eleccion);
                                    medidaOrigen = switch (unidad) {
                                        case 1 -> origen == 1 ? "Kilómetro" : "Kilómetro cuadrado";
                                        case 2 -> origen == 1 ? "Metro" : "Metro cuadrado";
                                        case 3 -> origen == 1 ? "Centímetro" : "Centímetro cuadrado";
                                        default -> "Milímetro";
                                    };
                                    simbMed = switch (unidad) {
                                        case 1 -> origen == 1 ? "km" : "km²";
                                        case 2 -> origen == 1 ? "m" : "m²";
                                        case 3 -> origen == 1 ? "cm" : "cm²";
                                        default -> "mm";
                                    };
                                    System.out.printf("Usted a elegido: %s.%n", medidaOrigen);
                                    while (true) {
                                        System.out.printf("Favor, ingrese %s en %s (%s):%n", categoria, medidaOrigen, simbMed);
                                        entrada = sc.nextLine().trim();
                                        ingresoValido = !entrada.trim().isEmpty() && entrada.matches("\\d+(\\.\\d+)?");
                                        if (!ingresoValido || Double.parseDouble(entrada) <= 0) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                            continue;
                                        }
                                        valor = Double.parseDouble(entrada);
                                        break;
                                    }
                                    while (true) {
                                        System.out.println("Favor, indique la unidad a de destino:");
                                        if (origen == 1) {
                                            switch (unidad) {
                                                case 1 -> System.out.println("1. Metro (m).\n2. Centímetro (cm).\n3. Milímetro (mm).");
                                                case 2 -> System.out.println("1. Kilómetro (km).\n2. Centímetro (cm).\n3. Milímetro (mm).");
                                                case 3 -> System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Milímetro (mm).");
                                                default -> System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
                                            }
                                            rangoValido = "[1-3]";
                                        } else {
                                            switch (unidad) {
                                                case 1 -> System.out.println("1. Metro cuadrado (m²).\n2. Centímetro cuadrado (cm²).");
                                                case 2 -> System.out.println("1. Kilómetro cuadrado (km²).\n2. Centímetro cuadrado (cm²).");
                                                default -> System.out.println("1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).");
                                            }
                                            rangoValido = "[1-2]";
                                        }
                                        eleccion = sc.nextLine().trim();
                                        ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches(rangoValido);
                                        if (!ingresoValido) {
                                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                            continue;
                                        }
                                        destino = Integer.parseInt(eleccion);
                                        break;
                                    }
                                    if (origen == 1) {
                                        medidaDestino = switch (unidad) {
                                            case 1 -> destino == 1 ? "Metro" : destino == 2 ? "Centímetro" : "Milímetro"; // De Kilómetro a otras
                                            case 2 -> destino == 1 ? "Kilómetro" : destino == 2 ? "Centímetro" : "Milímetro"; // De Metro a otras
                                            case 3 -> destino == 1 ? "Kilómetro" : destino == 2 ? "Metro" : "Milímetro"; // De Centímetro a otras
                                            default -> destino == 1 ? "Kilómetro" : destino == 2 ? "Metro" : "Centímetro"; // De Milímetro a otras
                                        };
                                        conversion = switch (unidad) {
                                            case 1 -> destino == 1 ? valor * 1000 : destino == 2 ? valor * 100000 : valor * 1000000;
                                            case 2 -> destino == 1 ? valor / 1000 : destino == 2 ? valor * 100 : valor * 1000;
                                            case 3 -> destino == 1 ? valor / 100000 : destino == 2 ? valor / 100 : valor * 10;
                                            default -> destino == 1 ? valor / 1000000 : destino == 2 ? valor / 1000 : valor / 10;
                                        };
                                    } else {
                                        medidaDestino = switch (unidad) {
                                            case 1 -> destino == 1 ? "Metro cuadrado" : "Centímetro cuadrado";
                                            case 2 -> destino == 2 ? "Kilómetro cuadrado" : "Centímetro cuadrado";
                                            default -> destino == 3 ? "Kilómetro cuadrado" : "Metro cuadrado";
                                        };
                                        conversion = switch (unidad) {
                                            case 1 -> destino == 1 ? valor * 1_000_000 : valor * 10_000_000;
                                            case 2 -> destino == 2 ? valor * 1_000_000 : valor * 10_000;
                                            default -> destino == 3 ? valor * 10_000_000 : valor * 10_000;
                                        };
                                    }
                                    System.out.printf("%.2f %s a %s es: %.3f%n", valor, simbMed, medidaDestino, conversion);
                                    return;
                                }
                            }
                            case 3 -> {
                                while (true) {
                                    System.out.println("Favor indique la unidad a convertir:\n1. Grados.\n2. Radianes.\n3. Regresar al menú anterior.");
                                    rangoValido = "[1-3]";
                                    eleccion = sc.nextLine().trim();
                                    ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches(rangoValido);
                                    if (!ingresoValido) {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        continue;
                                    } else if (eleccion.equals("3")) {
                                        System.out.println("Regresando al menú anterior...");
                                        break;
                                    }
                                    unidad = Integer.parseInt(eleccion);
                                    medidaOrigen = unidad == 1 ? "Grados" : "Radianes";
                                    simbMed = unidad == 1 ? "°" : "rad";
                                    while (true) {
                                        System.out.printf("Favor, ingrese el valor en %s (%s):%n", medidaOrigen, simbMed);
                                        entrada = sc.nextLine().trim();
                                        ingresoValido = !entrada.trim().isEmpty() && entrada.matches("\\d+(\\.\\d+)?");
                                        if (!ingresoValido || Double.parseDouble(entrada) <= 0) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                            continue;
                                        }
                                        valor = Double.parseDouble(entrada);
                                        break;
                                    }
                                    medidaDestino = unidad == 1 ? "Radianes" : "Grados";
                                    simbMed = unidad == 1 ? "rad" : "°";
                                    System.out.printf("Pasando a %s...%n", medidaDestino);
                                    conversion = unidad == 1 ? Math.toRadians(valor) : Math.toDegrees(valor);
                                    System.out.printf("%.2f %s a %s (%s) es: %.2f%n", valor, medidaOrigen, medidaDestino, simbMed, conversion);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}