package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, categoria, medida, simbMed;
        int opc, fig, contar, origen, unidad, destino;
        double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, area, perimetro;
        String eleccion, entrada;

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
                        figura = null;
                        switch (fig) {
                            case 1 -> figura = "Cuadrado";
                            case 2 -> figura = "Rectángulo";
                            case 3 -> figura = "Triángulo";
                            case 4 -> figura = "Círculo";
                            case 5 -> figura = "Trapecio";
                            case 6 -> figura = "Rombo";
                            case 7 -> figura = "Polígono regular";
                            case 8 -> figura = "Octágono";
                        }
                        if (figura != null) {
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
                                    }
                                    valor = Double.parseDouble(entrada);
                                    if (opc == 1) {
                                        area = switch (fig) {
                                            case 1 -> Math.pow(valor, 2);
                                            case 4 -> (Math.PI * Math.pow(valor, 2));
                                            case 8 -> ((2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2));
                                            default -> 0;
                                        };
                                        System.out.printf("El área del %s es: %.2f%n", figura, area);
                                    } else {
                                        perimetro = switch (fig) {
                                            case 1 -> (4 * valor);
                                            case 4 -> (2 * Math.PI * valor);
                                            case 8 -> (8 * valor);
                                            default -> 0;
                                        };
                                        System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
                                    }
                                }
                                case 2, 6, 7 -> {
                                    int limite = switch (fig) {
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
                                    } if (opc == 1) {
                                        area = switch (fig) {
                                            case 2 -> (valor * valor1);
                                            case 6 -> ((valor * valor1) / 2);
                                            case 7 -> ((valor * Math.pow(valor1, 2)) / (4 * Math.tan(Math.PI / valor)));
                                            default -> 0;
                                        };
                                        System.out.printf("El área del %s es: %.2f%n", figura, area);
                                    } else {
                                        perimetro = switch (fig) {
                                            case 2 -> (2 * (valor + valor1));
                                            case 6 -> (valor * 4);
                                            case 7 -> (valor * valor1);
                                            default -> 0;
                                        };
                                        System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
                                    }
                                } case 3, 5 -> {
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
                                                    if (contar == 0) {
                                                        System.out.printf("Favor, ingrese longitud de la base menor del %s:%n", figura);
                                                    } else if (contar == 1) {
                                                        System.out.printf("Favor, ingrese longitud de la base mayor del %s:%n", figura);
                                                    } else {
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
                                            if (contar == 0) {
                                                valor = Double.parseDouble(entrada);
                                            } else if (contar == 1) {
                                                valor1 = Double.parseDouble(entrada);
                                            } else if (contar == 2) {
                                                valor2 = Double.parseDouble(entrada);
                                            } else {
                                                valor3 = Double.parseDouble(entrada);
                                            }
                                            break;
                                        }
                                    }
                                    if (opc == 1) {
                                        area = switch (fig) {
                                            case 3 -> ((valor * valor1) / 2);
                                            case 5 -> (((valor + valor1) / 2) * valor2);
                                            default -> 0;
                                        };
                                        System.out.printf("El área del %s es: %.2f%n", figura, area);
                                    } else {
                                        perimetro = switch (fig) {
                                            case 3 -> (valor + valor1 + valor2);
                                            case 5 -> (valor + valor1 + valor2 + valor3);
                                            default -> 0;
                                        };
                                        System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
                                    }
                                }
                            }
                        } return; // en este punto es mejor terminar el programa para no hacer el código más complejo.
                    }
                } case 3 -> {
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
                        categoria = null;
                        switch (origen) {
                            case 1 -> categoria = "Longitud";
                            case 2 -> categoria = "Área";
                            case 3 -> categoria = "Ángulos";
                        }
                        if (categoria != null) {
                            System.out.println("Usted a elegido " + categoria);
                            if (origen == 1) {
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
                                    medida = null;
                                    simbMed = null;
                                    switch (unidad) {
                                        case 1 -> {
                                            medida = "Kilómetro";
                                            simbMed = "km";
                                        }
                                        case 2 -> {
                                            medida = "Metro";
                                            simbMed = "m";
                                        }
                                        case 3 -> {
                                            medida = "Centímetro";
                                            simbMed = "cm";
                                        }
                                        case 4 -> {
                                            medida = "Milímetro";
                                            simbMed = "mm";
                                        }
                                    }
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
                                        System.out.println("Favor, indique la unidad a de destino:");
                                        if (unidad == 1) {
                                            System.out.println("1. Metro (m).\n2. Centímetro (cm).\n3. Milímetro (mm).");
                                        } else if (unidad == 2) {
                                            System.out.println("1. Kilómetro (km).\n2. Centímetro (cm).\n3. Milímetro (mm).");
                                        } else if (unidad == 3) {
                                            System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Milímetro (mm).");
                                        } else {
                                            System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
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
                                                    case 1 -> System.out.printf("%.2f %s a Metro (m) es: %.2f%n", valor, simbMed, valor * 1000);
                                                    case 2 ->
                                                            System.out.printf("%.2f %s a Centímetro (cm) es: %.2f%n", valor, simbMed, valor * 100000);
                                                    case 3 ->
                                                            System.out.printf("%.2f %s a Milímetro (mm) es: %.2f%n", valor, simbMed, valor * 1000000);
                                                }
                                            }
                                            case 2 -> {
                                                switch (destino) {
                                                    case 1 -> System.out.printf("%.2f %s a Kilómetro (km) es: %.2f%n", valor, simbMed, valor / 1000);
                                                    case 2 -> System.out.printf("%.2f %s a Centímetro (cm) es: %.2f%n", valor, simbMed, valor * 100);
                                                    case 3 -> System.out.printf("%.2f %s a Milímetro (mm) es: %.2f%n", valor, simbMed, valor * 1000);
                                                }
                                            }
                                            case 3 -> {
                                                switch (destino) {
                                                    case 1 ->
                                                            System.out.printf("%.2f %s a Kilómetro (km) es: %.2f%n", valor, simbMed, valor / 100000);
                                                    case 2 -> System.out.printf("%.2f %s a Metro (m) es: %.2f%n", valor, simbMed, valor / 100);
                                                    case 3 -> System.out.printf("%.2f %s a Milímetro (mm) es: %.2f%n", valor, simbMed, valor * 10);
                                                }
                                            }
                                            case 4 -> {
                                                switch (destino) {
                                                    case 1 ->
                                                            System.out.printf("%.2f %s a Kilómetro (km) es: %.2f%n", valor, simbMed, valor / 1000000);
                                                    case 2 -> System.out.printf("%.2f %s a Metro (m) es: %.2f%n", valor, simbMed, valor / 1000);
                                                    case 3 -> System.out.printf("%.2f %s a Centímetro (cm) es: %.2f%n", valor, simbMed, valor / 10);
                                                }
                                            }
                                        }
                                        return;
                                    }
                                }
                            } else if (origen == 2) {
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
                                    medida = null;
                                    simbMed = null;
                                    switch (unidad) {
                                        case 1 -> {
                                            medida = "Kilómetro cuadrado";
                                            simbMed = "km²";
                                        }
                                        case 2 -> {
                                            medida = "Metro cuadrado";
                                            simbMed = "m²";
                                        }
                                        case 3 -> {
                                            medida = "Centímetro cuadrado";
                                            simbMed = "cm²";
                                        }
                                    }
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
                                        System.out.println("Favor, indique la unidad a de destino:");
                                        if (unidad == 1) {
                                            System.out.println("1. Metro cuadrado (m²).\n2. Centímetro cuadrado (cm²).");
                                        } else if (unidad == 2) {
                                            System.out.println("1. Kilómetro cuadrado (km²).\n2. Centímetro cuadrado (cm²).");
                                        } else {
                                            System.out.println("1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).");
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
                                                    case 1 ->
                                                            System.out.printf("%.2f %s a Metro cuadrado (m²) es: %.2f%n", valor, simbMed, valor * 1000000);
                                                    case 2 ->
                                                            System.out.printf("%.2f %s a Centímetro cuadrado (cm²) es: %.2f%n", valor, simbMed, valor * 10_000_000_000L);
                                                }
                                            }
                                            case 2 -> {
                                                switch (destino) {
                                                    case 1 ->
                                                            System.out.printf("%.2f %s a Kilómetro cuadrado (km²) es: %.2f%n", valor, simbMed, valor / 1000000);
                                                    case 2 ->
                                                            System.out.printf("%.2f %s a Centímetro cuadrado (cm²) es: %.2f%n", valor, simbMed, valor * 10000);
                                                }
                                            }
                                            case 3 -> {
                                                switch (destino) {
                                                    case 1 ->
                                                            System.out.printf("%.2f %s a Kilómetro cuadrado (km²) es: %.2f%n", valor, simbMed, valor / 10_000_000_000L);
                                                    case 2 ->
                                                            System.out.printf("%.2f %s a Metro cuadrado (m²) es: %.2f%n", valor, simbMed, valor / 10000);
                                                }
                                            }
                                        }
                                        return;
                                    }
                                }
                            } else {
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
                                    medida = null;
                                    simbMed = null;
                                    switch (unidad) {
                                        case 1 -> {
                                            medida = "Grados";
                                            simbMed = "°";
                                        }
                                        case 2 -> {
                                            medida = "Radianes";
                                            simbMed = "rad";
                                        }
                                    }
                                    if (medida != null) {
                                        System.out.printf("Favor, ingrese el valor en %s (%s):%n", medida, simbMed);
                                        entrada = sc.nextLine().trim();
                                        if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
                                            System.err.println("Error: Ingreso no válido, favor ingrese un número.");
                                            continue;
                                        }
                                        valor = Double.parseDouble(entrada);
                                        System.out.println("Favor, indique la unidad a de destino:");
                                        if (unidad == 1) {
                                            System.out.println("1. Radianes.\n2. Grados.");
                                        } else {
                                            System.out.println("1. Grados.\n2. Radianes.");
                                        }
                                        eleccion = sc.nextLine().trim();
                                        if (eleccion.isEmpty() || !eleccion.matches("[1-2]")) {
                                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                            continue;
                                        }
                                        destino = Integer.parseInt(eleccion);
                                        if (unidad == 1) {
                                            switch (destino) {
                                                case 1 -> System.out.printf("%.2f %s a Radianes es: %.2f%n", valor, simbMed, valor * Math.PI / 180);
                                                case 2 -> System.out.printf("%.2f %s a Grados es: %.2f%n", valor, simbMed, valor * 180 / Math.PI);
                                            }
                                        } else {
                                            switch (destino) {
                                                case 1 -> System.out.printf("%.2f %s a Grados es: %.2f%n", valor, simbMed, valor * 180 / Math.PI);
                                                case 2 -> System.out.printf("%.2f %s a Radianes es: %.2f%n", valor, simbMed, valor * Math.PI / 180);
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
    }
}