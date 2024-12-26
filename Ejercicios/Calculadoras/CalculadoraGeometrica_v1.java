package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, categoria, medida, simbMed, eleccion, entrada;
        int opc, fig, contar, origen, unidad, destino;
        double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, area, perimetro, conversion=0;

        while (true) { // repetir el menú hasta que se ingrese la opción correcta
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
                    while (true) { // repetir el submenú hasta que se ingrese la opción correcta
                        System.out.printf("Favor elija la figura a calcular %s", opc == 1 ? "área:\n" : "perímetro:\n");
                        System.out.println("1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.");
                        System.out.println("7. Polígono regular.\n8. Octágono.\n9. Regresa menú anterior");
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
                            case 8 -> "Octágono";
                            default -> null;
                        };
                        if (figura != null) {
                            System.out.println("Ha seleccionado: " + figura);
                            if (opc == 1) {
                                switch (fig) {
                                    case 1, 4, 8 -> {
                                        System.out.println("Favor, ingrese lado del " + figura + ":");
                                        entrada = sc.nextLine().trim();
                                        if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                            continue;
                                        } else if (entrada.equals("0")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                            continue;
                                        }
                                        valor = Double.parseDouble(entrada);
                                        area = switch (fig) {
                                            case 1 -> Math.pow(valor, 2);
                                            case 4 -> Math.PI * Math.pow(valor, 2);
                                            case 8 -> (2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2);
                                            default -> 0; // no debería llegar aquí
                                        };
                                        System.out.println("El área del " + figura + " es: " + area);
                                    }
                                    case 2, 3, 6, 7 -> {
                                        for (contar = 0; contar < 2; contar++) {
                                            while (true) {
                                                switch (fig) {
                                                    case 2 -> System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "largo" : "ancho", figura);
                                                    case 3 -> System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "base" : "altura", figura);
                                                    case 6 -> System.out.printf("Favor, ingrese diagonal %s del %s:\n", contar + 1, figura);
                                                    default -> System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "número de lados" : "largo de cada lado", figura);
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
                                                } else {
                                                    valor1 = Double.parseDouble(entrada);
                                                }
                                                break;
                                            }
                                        }
                                        area = switch (fig) {
                                            case 2 -> valor * valor1;
                                            case 3, 6 -> (valor * valor1) / 2;
                                            case 7 -> (valor * Math.pow(valor1, 2)) / (4 * Math.tan(Math.PI / valor));
                                            default -> 0; // no debería llegar aquí
                                        };
                                        System.out.println("El área del " + figura + " es: " + area);
                                    }
                                    case 5 -> {
                                        for (contar = 0; contar < 3; contar++) {
                                            while (true) {
                                                if (contar < 2) {
                                                    System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "base menor" : "base mayor", figura);
                                                } else {
                                                    System.out.printf("Favor, ingrese altura del %s:\n", figura);
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
                                                    default -> valor2 = Double.parseDouble(entrada);
                                                }
                                                break;
                                            }
                                        }
                                        area = (valor + valor1) / 2 * valor2;
                                        System.out.println("El área del " + figura + " es: " + area);
                                    }
                                }
                            } else {
                                switch (fig) {
                                    case 1, 4, 6, 8 -> {
                                        switch (fig) {
                                            case 1, 6, 8 -> medida = "longitud del lado";
                                            case 4 -> medida = "radio";
                                            default -> medida = "";
                                        }
                                        System.out.println("Favor, ingrese " + medida + " del " + figura + ":");
                                        entrada = sc.nextLine().trim();
                                        if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                            continue;
                                        } else if (entrada.equals("0")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
                                            continue;
                                        }
                                        valor = Double.parseDouble(entrada);
                                        perimetro = switch (fig) {
                                            case 1, 6 -> 4 * valor;
                                            case 4 -> 2 * Math.PI * valor;
                                            case 8 -> 8 * valor;
                                            default -> 0; // no debería llegar aquí
                                        };
                                        System.out.println("El perímetro del " + figura + " es: " + perimetro);
                                    }
                                    case 2, 7 -> {
                                        for (contar = 0; contar < 2; contar++) {
                                            while (true) {
                                                if (fig == 2) {
                                                    System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "largo" : "ancho", figura);
                                                } else {
                                                    System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "lado" : "número de lados", figura);
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
                                                } else {
                                                    valor1 = Double.parseDouble(entrada);
                                                }
                                                break;
                                            }
                                        }
                                        perimetro = switch (fig) {
                                            case 2 -> 2 * (valor + valor1);
                                            case 7 -> valor * valor1;
                                            default -> 0; // no debería llegar aquí
                                        };
                                        System.out.println("El perímetro del " + figura + " es: " + perimetro);
                                    }
                                    case 5 -> {
                                        for (contar = 0; contar < 4; contar++) {
                                            while (true) {
                                                switch (contar) {
                                                    case 0 -> System.out.printf("Favor, ingrese longitud de la base menor del %s:%n", figura);
                                                    case 1 -> System.out.printf("Favor, ingrese longitud de la base mayor del %s:%n", figura);
                                                    default -> System.out.printf("Favor, ingrese longitud del lado %s del %s:%n", (contar == 2) ? "izquierdo" : "derecho", figura);
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
                                        perimetro = valor + valor1 + valor2 + valor3;
                                        System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
                                    }
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
                        if (eleccion.isEmpty() || !eleccion.matches("[1-4]")) {
                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                            continue;
                        } else if (eleccion.equals("4")) {
                            System.out.println("Regresando al menú principal...");
                            break;
                        }
                        origen = Integer.parseInt(eleccion);
                        categoria = switch (origen) {
                            case 1 -> "Longitud";
                            case 2 -> "Área";
                            case 3 -> "Ángulos";
                            default -> null;
                        };
                        if (categoria != null) {
                            System.out.println("Ha seleccionado: " + categoria);
                            switch (origen) {
                                case 1 -> {
                                    while (true) {
                                        System.out.println("Favor elija la unidad a convertir:");
                                        System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).\n4. Milímetro (mm)");
                                        System.out.println("5. Regresar al menú anterior.");
                                        eleccion = sc.nextLine().trim();
                                        if (eleccion.trim().isEmpty() || !eleccion.matches("[1-5]")) {
                                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                            continue;
                                        } else if (eleccion.equals("5")) {
                                            System.out.println("Regresando al menú principal...");
                                            break;
                                        }
                                        unidad = Integer.parseInt(eleccion);
                                        medida = switch (unidad) {
                                            case 1 -> "Kilómetro";
                                            case 2 -> "Metro";
                                            case 3 -> "Centímetro";
                                            case 4 -> "Milímetro";
                                            default -> null;
                                        };
                                        simbMed = switch (unidad) {
                                            case 1 -> "km";
                                            case 2 -> "m";
                                            case 3 -> "cm";
                                            case 4 -> "mm";
                                            default -> null;
                                        };
                                        if (medida != null) {
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
                                                case 1 -> {
                                                    switch (destino) {
                                                        case 1 -> conversion = valor * 1000;
                                                        case 2 -> conversion = valor * 100000;
                                                        case 3 -> conversion = valor * 1000000;
                                                    }
                                                }
                                                case 2 -> {
                                                    switch (destino) {
                                                        case 1 -> conversion = valor / 1000;
                                                        case 2 -> conversion = valor * 100;
                                                        case 3 -> conversion = valor * 1000;
                                                    }
                                                }
                                                case 3 -> {
                                                    switch (destino) {
                                                        case 1 -> conversion = valor / 100000;
                                                        case 2 -> conversion = valor / 100;
                                                        case 3 -> conversion = valor * 10;
                                                    }
                                                }
                                                case 4 -> {
                                                    switch (destino) {
                                                        case 1 -> conversion = valor / 1000000;
                                                        case 2 -> conversion = valor / 1000;
                                                        case 3 -> conversion = valor / 10;
                                                    }
                                                }
                                            }
                                        }
                                        System.out.printf("La %s en %s (%s) es: %.2f%n", categoria, medida, simbMed, conversion);
                                        return;
                                    }
                                }
                                case 2 -> {
                                    while (true) {
                                        System.out.println("Favor elija la unidad a convertir:");
                                        System.out.println("1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).\n3. Centímetro cuadrado (cm²).");
                                        System.out.println("4. Regresar al menú anterior.");
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
                                            case 3 -> "Centímetro cuadrado";
                                            default -> null;
                                        };
                                        simbMed = switch (unidad) {
                                            case 1 -> "km²";
                                            case 2 -> "m²";
                                            case 3 -> "cm²";
                                            default -> null;
                                        };
                                        if (medida != null) {
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
                                                case 1 -> {
                                                    switch (destino) {
                                                        case 1 -> conversion = valor * 1000000;
                                                        case 2 -> conversion = valor * 10000000000L;
                                                    }
                                                }
                                                case 2 -> {
                                                    switch (destino) {
                                                        case 1 -> conversion = valor / 1000000;
                                                        case 2 -> conversion = valor * 10000;
                                                    }
                                                }
                                                case 3 -> {
                                                    switch (destino) {
                                                        case 1 -> conversion = valor / 10000000000L;
                                                        case 2 -> conversion = valor / 10000;
                                                    }
                                                }
                                                default -> conversion = 0;
                                            }
                                        }
                                        System.out.printf("La %s en %s (%s) es: %.2f%n", categoria, medida, simbMed, conversion);
                                        return;
                                    }
                                }
                                default -> {
                                    while (true) {
                                        System.out.println("Favor elija la unidad a convertir:\n1. Grados (°).\n2. Radianes (rad).");
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
                                        simbMed = switch (unidad) {
                                            case 1 -> "°";
                                            case 2 -> "rad";
                                            default -> null;
                                        };
                                        if (simbMed != null) {
                                            System.out.printf("Favor, ingrese el valor en %s:%n", simbMed);
                                            entrada = sc.nextLine().trim();
                                            if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                                System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                                continue;
                                            }
                                            valor = Double.parseDouble(entrada);
                                            if (unidad == 1) {
                                                conversion = valor * Math.PI / 180;
                                            } else {
                                                conversion = valor * 180 / Math.PI;
                                            }
                                        }
                                        System.out.printf("El valor en %s a (%s) es: %.2f%n", simbMed, (unidad == 1) ? "rad" : "°", conversion);
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
}