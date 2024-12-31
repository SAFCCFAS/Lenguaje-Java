package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, categoria, medida, simbMed, eleccion, entrada;
        int opc, fig, contar, origen, unidad, destino, limite;
        double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, area, perimetro, conversion;

        while (true) {
            System.out.println("Bienvenido(a) favor indicar que desea realizar:");
            System.out.println("1. Calcular área. \n2. Calcular perímetro.\n3. Conversión de unidades.\n4. Salir.");
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
                System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                continue;
            } else if (eleccion.equals("4")) {
                System.out.println("¡Hasta la próxima!");
                break;
            }
            opc = Integer.parseInt(eleccion);

            switch (opc) {
                case 1, 2 -> {
                    while (true) {
                        System.out.println("Favor, elija la figura a calcular " + (opc == 1 ? "área" : "perímetro"));
                        System.out.println("1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.");
                        System.out.println("8. Octágono.\n9. Regresa menú anterior");
                        eleccion = sc.nextLine().trim();
                        if (eleccion.trim().isEmpty() || !eleccion.matches("[1-9]")) {
                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                            continue;
                        } else if (eleccion.equals("9")) {
                            System.out.println("Regresando al menú anterior...");
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

                        System.out.println("Usted a elegido " + figura);
                        switch (fig) {
                            case 1, 4, 8 -> {
                                switch (fig) {
                                    case 1 -> System.out.println("Favor, ingrese lado del " + figura + ":");
                                    case 4 -> System.out.println("Favor, ingrese radio del " + figura + ":");
                                    default -> System.out.println("Favor, ingrese la longitud de un lado del " + figura + ":");
                                }
                                entrada = sc.nextLine().trim();
                                if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                    System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                    continue;
                                } else if (entrada.equals("0")) {
                                    System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                    continue;
                                }
                                valor = Double.parseDouble(entrada);
                                if (opc == 1) {
                                    area = switch (fig) {
                                        case 1 -> Math.pow(valor, 2);
                                        case 4 -> (Math.PI * Math.pow(valor, 2));
                                        default -> ((2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2));
                                    };
                                    System.out.printf("El área del %s es: %.2f%n", figura, area);
                                } else {
                                    perimetro = switch (fig) {
                                        case 1 -> (4 * valor);
                                        case 4 -> (2 * Math.PI * valor);
                                        default -> (8 * valor);
                                    };
                                    System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
                                }
                            }
                            case 2, 6, 7 -> {
                                limite = switch (fig) {
                                    case 2 -> 2; // Rectángulo: siempre requiere largo y ancho
                                    case 6 -> (opc == 1) ? 2 : 1; // Rombo: dos diagonales para área, un lado para perímetro
                                    case 7 -> 2; // Polígono regular: número de lados y largo de cada uno
                                    default -> 2; // Otras figuras por defecto (si se agregan más)
                                };
                                for (contar = 0; contar < limite; contar++) {
                                    while (true) {
                                        switch (fig) {
                                            case 2 -> System.out.printf("Favor, ingrese %s %s:%n", (contar == 0) ? "largo" : "ancho", figura);
                                            case 6 -> {
                                                if (opc == 1) {
                                                    System.out.printf("Favor, ingrese diagonal %d del %s:%n", contar + 1, figura);
                                                } else {
                                                    if (contar == 0) {
                                                        System.out.printf("Favor, ingrese longitud de largo del %s:%n", figura);
                                                    }
                                                }
                                            }
                                            default ->
                                                    System.out.printf("Favor, ingrese %s del %s:%n", (contar == 0) ? "número de lados" : "largo de cada lado", figura);
                                        }
                                        entrada = sc.nextLine().trim();
                                        if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                            continue;
                                        } else if (entrada.equals("0")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                            continue;
                                        }
                                        if (contar == 0) {
                                            valor = Double.parseDouble(entrada);
                                        } else if (contar == 1) {
                                            valor1 = Double.parseDouble(entrada);
                                        }
                                        break;
                                    }
                                }
                                if (opc == 1) {
                                    area = switch (fig) {
                                        case 2 -> (valor * valor1);
                                        case 6 -> ((valor * valor1) / 2);
                                        default -> ((valor * Math.pow(valor1, 2)) / (4 * Math.tan(Math.PI / valor)));
                                    };
                                    System.out.printf("El área del %s es: %.2f%n", figura, area);
                                } else {
                                    perimetro = switch (fig) {
                                        case 2 -> (2 * (valor + valor1));
                                        case 6 -> (valor * 4);
                                        default -> (valor * valor1);
                                    };
                                    System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
                                }
                            }
                            case 3, 5 -> {
                                for (contar = 0; contar < (opc == 1 ? (fig == 3 ? 2 : 3) : (fig == 3 ? 3 : 4)); contar++) {
                                    while (true) {
                                        if (fig == 3) {
                                            if (opc == 1) {
                                                System.out.printf("Favor, ingrese %s del %s:%n", (contar == 0) ? "base" : "altura", figura);
                                            } else {
                                                System.out.printf("Favor, ingrese lado %d del %s:%n", contar + 1, figura);
                                            }
                                        } else {
                                            if (opc == 1) {
                                                System.out.printf("Favor, ingrese %s del %s:%n", (contar == 0) ? "base" : "altura", figura);
                                            } else {
                                                switch (contar) {
                                                    case 0 -> System.out.printf("Favor, ingrese longitud de la base menor del %s:%n", figura);
                                                    case 1 -> System.out.printf("Favor, ingrese longitud de la base mayor del %s:%n", figura);
                                                    default ->
                                                            System.out.printf("Favor, ingrese longitud del lado %s del %s:%n", (contar == 2) ? "izquierdo" : "derecho", figura);
                                                }
                                            }
                                        }
                                        entrada = sc.nextLine().trim();
                                        if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                            continue;
                                        } else if (entrada.equals("0")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                            continue;
                                        }
                                        switch (contar) {
                                            case 0 -> valor = Double.parseDouble(entrada);
                                            case 1 -> valor1 = Double.parseDouble(entrada);
                                            case 2 -> valor2 = Double.parseDouble(entrada);
                                            default -> valor3 = Double.parseDouble(entrada);
                                        }
                                        break;
                                    }
                                }
                                if (opc == 1) {
                                    area = switch (fig) {
                                        case 3 -> ((valor * valor1) / 2);
                                        default -> (((valor + valor1) / 2) * valor2);
                                    };
                                    System.out.printf("El área del %s es: %.2f%n", figura, area);
                                } else {
                                    perimetro = switch (fig) {
                                        case 3 -> (valor + valor1 + valor2);
                                        default -> (valor + valor1 + valor2 + valor3);
                                    };
                                    System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
                                }
                            }
                        }
                        return; // en este punto es mejor terminar el programa para no hacer el código más complejo.
                    }
                }
                case 3 -> {
                    while (true) {
                        System.out.println("Elija la categoría de unidades a convertir:");
                        System.out.println("1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²).\n3. Ángulos (Grados a Radianes, Radianes a Grados).");
                        System.out.println("4. Regresar al menú principal.");
                        eleccion = sc.nextLine().trim();
                        if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                            continue;
                        } else if (eleccion.equals("4")) {
                            System.out.println("Regresando al menú anterior...");
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
                            case 1 -> {
                                while (true) {
                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro (km).\n2. Metro (m).");
                                    System.out.println("3. Centímetro (cm).\n4. Milímetro (mm).\n5. Regresar al menú anterior.");
                                    eleccion = sc.nextLine().trim();
                                    if (eleccion.trim().isEmpty() || !eleccion.matches("[1-5]")) {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        continue;
                                    } else if (eleccion.equals("5")) {
                                        System.out.println("Regresando al menú anterior...");
                                        break;
                                    }
                                    unidad = Integer.parseInt(eleccion);
                                    medida = switch (unidad) {
                                        case 1 -> "Kilómetro";
                                        case 2 -> "Metro";
                                        case 3 -> "Centímetro";
                                        default -> "Milímetro";
                                    };
                                    simbMed = switch (unidad) {
                                        case 1 -> "km";
                                        case 2 -> "m";
                                        case 3 -> "cm";
                                        default -> "mm";
                                    };

                                    System.out.printf("Favor, ingrese la %s en %s (%s):%n", categoria, medida, simbMed);
                                    entrada = sc.nextLine().trim();
                                    if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                        System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                        continue;
                                    } else if (entrada.equals("0")) {
                                        System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                        continue;
                                    }
                                    valor = Double.parseDouble(entrada);
                                    System.out.println("Favor, indique la unidad a de destino:");
                                    switch (unidad) {
                                        case 1 -> System.out.println("1. Metro (m).\n2. Centímetro (cm).\n3. Milímetro (mm).");
                                        case 2 -> System.out.println("1. Kilómetro (km).\n2. Centímetro (cm).\n3. Milímetro (mm).");
                                        case 3 -> System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Milímetro (mm).");
                                        default -> System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
                                    }
                                    eleccion = sc.nextLine().trim();
                                    if (eleccion.isEmpty() || !eleccion.matches("[1-3]")) {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        continue;
                                    }
                                    destino = Integer.parseInt(eleccion);
                                    switch (unidad) {
                                        case 1 -> conversion = switch (destino) {
                                            case 1 -> valor * 1000;
                                            case 2 -> valor * 100_000;
                                            default -> valor * 1_000_000;
                                        };
                                        case 2 -> conversion = switch (destino) {
                                            case 1 -> valor / 1000;
                                            case 2 -> valor * 100;
                                            default -> valor * 1000;
                                        };
                                        case 3 -> conversion = switch (destino) {
                                            case 1 -> valor / 1_000_000;
                                            case 2 -> valor / 100;
                                            default -> valor * 10;
                                        };
                                        case 4 -> conversion = switch (destino) {
                                            case 1 -> valor / 1_000_000;
                                            case 2 -> valor / 1_000;
                                            default -> valor / 10;
                                        };
                                        default -> conversion = 0;
                                    }
                                    System.out.printf("%.2f %s a %s es: %.2f%n", valor, simbMed, medida, conversion);
                                    return;

                                }
                            }
                            case 2 -> {
                                while (true) {
                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).");
                                    System.out.println("3. Centímetro cuadrado (cm²).\n4. Regresar al menú anterior.");
                                    eleccion = sc.nextLine().trim();
                                    if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        continue;
                                    } else if (eleccion.equals("4")) {
                                        System.out.println("Regresando al menú anterior...");
                                        break;
                                    }
                                    unidad = Integer.parseInt(eleccion);
                                    medida = switch (unidad) {
                                        case 1 -> "Kilómetro cuadrado";
                                        case 2 -> "Metro cuadrado";
                                        default -> "Centímetro cuadrado";
                                    };
                                    simbMed = switch (unidad) {
                                        case 1 -> "km²";
                                        case 2 -> "m²";
                                        default -> "cm²";
                                    };

                                    System.out.printf("Favor, ingrese la %s en %s (%s):%n", categoria, medida, simbMed);
                                    entrada = sc.nextLine().trim();
                                    if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                        System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                        continue;
                                    } else if (entrada.equals("0")) {
                                        System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                        continue;
                                    }
                                    valor = Double.parseDouble(entrada);
                                    System.out.println("Favor, indique la unidad a de destino:");
                                    switch (unidad) {
                                        case 1 -> System.out.println("1. Metro cuadrado (m²).\n2. Centímetro cuadrado (cm²).");
                                        case 2 -> System.out.println("1. Kilómetro cuadrado (km²).\n2. Centímetro cuadrado (cm²).");
                                        default -> System.out.println("1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).");
                                    }
                                    eleccion = sc.nextLine().trim();
                                    if (eleccion.isEmpty() || !eleccion.matches("[1-2]")) {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        continue;
                                    }
                                    destino = Integer.parseInt(eleccion);
                                    switch (unidad) {
                                        case 1 -> conversion = switch (destino) {
                                            case 1 -> valor * 1_000_000;
                                            default -> valor * 10_000_000;
                                        };
                                        case 2 -> conversion = switch (destino) {
                                            case 1 -> valor / 1_000_000;
                                            default -> valor * 10_000;
                                        };
                                        case 3 -> conversion = switch (destino) {
                                            case 1 -> valor / 10_000_000;
                                            default -> valor / 10_000;
                                        };
                                        default -> conversion = 0;
                                    }
                                    System.out.printf("%.2f %s a %s es: %.2f%n", valor, simbMed, medida, conversion);
                                    return;

                                }
                            }
                            default -> {
                                while (true) {
                                    System.out.println("Favor indique la unidad a convertir:\n1. Grados.\n2. Radianes.");
                                    System.out.println("3. Regresar al menú anterior.");
                                    eleccion = sc.nextLine().trim();
                                    if (eleccion.trim().isEmpty() || !eleccion.matches("[1-3]")) {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        continue;
                                    } else if (eleccion.equals("3")) {
                                        System.out.println("Regresando al menú anterior...");
                                        break;
                                    }
                                    unidad = Integer.parseInt(eleccion);
                                    medida = (unidad == 1) ? "Grados" : "Radianes";
                                    simbMed = (unidad == 1) ? "°" : "rad";

                                    System.out.printf("Favor, ingrese el valor en %s (%s):%n", medida, simbMed);
                                    entrada = sc.nextLine().trim();
                                    if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                        System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                        continue;
                                    } else if (entrada.equals("0")) {
                                        System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                        continue;
                                    }
                                    valor = Double.parseDouble(entrada);
                                    if (unidad == 1) {
                                        System.out.printf("%.2f %s a Radianes (rad) es: %.2f%n", valor, simbMed, Math.toRadians(valor));
                                    } else {
                                        System.out.printf("%.2f %s a Grados (°) es: %.2f%n", valor, simbMed, Math.toDegrees(valor));
                                    }
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