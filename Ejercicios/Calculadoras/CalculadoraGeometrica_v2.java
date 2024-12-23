package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, simbMed, cambioMed;
        int opc, fig, contar, opc1, conv;
        double valor = 0, valor1 = 0, valor2=0, valor3=0, area, perimetro;
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
                                for (contar = 0; contar < 2; contar++) {
                                    while (true) {
                                        switch (fig) {
                                            case 2 -> System.out.printf("Favor, ingrese %s %s:%n", (contar == 0) ? "largo" : "ancho", figura);
                                            case 6 -> {
                                                if (opc == 1) {
                                                    System.out.printf("Favor, ingrese diagonal %d del %s:%n", contar + 1, figura);
                                                } else {
                                                    if (contar == 0) {
                                                        System.out.printf("Favor, ingrese longitud de largo del %s:%n", figura);
                                                    } else {
                                                        break;
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
                                        } else {
                                            valor1 = Double.parseDouble(entrada);
                                        }
                                        break;
                                    }
                                }
                                if (opc == 1) {
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
                    }
                    return;
                }
            }
        }

    }
}

//        while (true) { // repetir el menú hasta que se ingrese la opción correcta
//            System.out.println("Bienvenido(a) favor indicar que desea realizar:");
//            System.out.println("1. Calcular área. \n2. Calcular perímetro.\n3. Conversión de unidades.\n4. Salir.");
//            eleccion = sc.nextLine().trim();
//            if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
//                System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                continue;
//            }
//            opc = Integer.parseInt(eleccion);
//            do {
//                switch (opc) {
//                    case 1, 2 -> {
//                        System.out.printf("Favor, elija la figura a calcular %s:%n", opc == 1 ? "área" : "perímetro");
//                        System.out.println("1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.");
//                        System.out.println("8. Octágono.\n9. Regresa menú anterior");
//                        fig = sc.nextInt();
//                        figura = null;
//                        switch (fig) {
//                            case 1 -> figura = "Cuadrado";
//                            case 2 -> figura = "Rectángulo";
//                            case 3 -> figura = "Triángulo";
//                            case 4 -> figura = "Círculo";
//                            case 5 -> figura = "Trapecio";
//                            case 6 -> figura = "Rombo";
//                            case 7 -> figura = "Polígono regular";
//                            case 8 -> figura = "Octágono";
//                        }
//                        if (figura != null) {
//                            System.out.printf("Usted a elegido %s%n", figura);
//                            switch (fig){
//                                case 1,4,8->{
//                                    switch (fig){
//                                        case 1 -> System.out.printf("Favor, ingrese lado del %s:%n", figura);
//                                        case 4 -> System.out.printf("Favor, ingrese radio del %s:%n", figura);
//                                        default -> System.out.printf("Favor, ingrese la longitud de un lado del %s:%n", figura);
//                                    }
//                                    entrada = sc.nextLine().trim();
//                                    if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
//                                        System.err.println("Error: Ingreso no válido, favor ingrese un número.");
//                                        continue;
//                                    }
//                                    valor = Double.parseDouble(entrada);
//                                    if (opc ==1){
//                                        area = switch (fig){
//                                            case 1 -> (int) Math.pow(valor, 2);
//                                            case 4 -> (int) (Math.PI * Math.pow(valor, 2));
//                                            case 8 -> (int) ((2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2));
//                                            default -> 0;
//                                        };
//                                        System.out.printf("El área del %s es: %d%n", figura, area);
//                                    }
//                                    else {
//                                        perimetro = switch (fig){
//                                            case 1 -> (int) (4 * valor);
//                                            case 4 -> (int) (2 * Math.PI * valor);
//                                            case 8 -> (int) (8 * valor);
//                                            default -> 0;
//                                        };
//                                        System.out.printf("El perímetro del %s es: %d%n", figura, perimetro);
//                                    }
//                                }
//
//                            }
//                        } else if (fig == 9) {
//                            System.out.println("Regresando al menú anterior...");
//                            break;
//                        }
//                        return;
/// /                            case 1 -> {
/// /                                System.out.println("Favor, ingrese lado del " + figura + ":");
/// /                                valor = sc.nextDouble();
/// /                                System.out.println("El área del " + figura + " es: " + Math.pow(valor, 2));
/// /                            }
/// /                            case 2 -> {
/// /                                System.out.println("Favor, ingrese largo del " + figura + ":");
/// /                                valor = sc.nextDouble();
/// /                                System.out.println("Favor, ingrese ancho del " + figura + ":");
/// /                                valor1 = sc.nextDouble();
/// /                                System.out.println("El área del " + figura + " es: " + valor * valor1);
/// /                            }
/// /                            case 3, 6 -> {
/// /                                if (fig == 3) {
/// /                                    System.out.println("Favor, ingrese base del " + figura + ":");
/// /                                    valor = sc.nextDouble();
/// /                                    System.out.println("Favor, ingrese altura del " + figura + ":");
/// /                                } else {
/// /                                    System.out.println("Favor, ingrese diagonal 1 del " + figura + ":");
/// /                                    valor = sc.nextDouble();
/// /                                    System.out.println("Favor, ingrese diagonal 2 del " + figura + ":");
/// /                                }
/// /                                valor1 = sc.nextDouble();
/// /                                System.out.println("El área del " + figura + " es: " + (valor * valor1) / 2);
/// /                            }
/// /                            case 4 -> {
/// /                                System.out.println("Favor, ingrese radio del " + figura + ":");
/// /                                valor = sc.nextDouble();
/// /                                System.out.println("El área del " + figura + " es: " + Math.PI * Math.pow(valor, 2));
/// /                            }
/// /                            case 5 -> {
/// /                                System.out.println("Favor, ingrese base 1 del " + figura + ":");
/// /                                valor = sc.nextDouble();
/// /                                System.out.println("Favor, ingrese base 2 del " + figura + ":");
/// /                                valor1 = sc.nextDouble();
/// /                                System.out.println("Favor, ingrese altura del " + figura + ":");
/// /                                valor2 = sc.nextDouble();
/// /                                System.out.println("El área del " + figura + " es: " + (valor + valor1) / 2 * valor2);
/// /                            }
/// /                            case 7 -> {
/// /                                System.out.println("Favor, ingrese número de lados del " + figura + ":");
/// /                                valor = sc.nextDouble();
/// /                                System.out.println("Favor, ingrese largo de cada lado " + figura + ":");
/// /                                valor1 = sc.nextDouble();
/// /                                System.out.println("El área del " + figura + " es: " + (valor * Math.pow(valor1, 2)) / (4 * Math.tan(Math.PI / valor)));
/// /                            }
/// /                            case 8 -> {
/// /                                System.out.println("Favor, ingrese la longitud de un lado del " + figura + ":");
/// /                                valor = sc.nextDouble();
/// /                                System.out.println("El área del " + figura + " es: " + (2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2));
/// /                            }
/// /                            case 9 -> {
/// /                                break;
/// /                            }
/// /                            default ->
/// /                                    System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//
//                    }
//                    case 0 -> {
//                        System.out.println("Elija la figura a calcular perímetro:\n1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo." + "\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.\n8. Octágono.\n9. Regresa menú anterior.");
//                        fig = sc.nextInt();
//                        switch (fig) {
//                            case 1, 6 -> {
//                                figura = "Cuadrado";
//                                System.out.println("Ingrese longitud del lado del " + figura);
//                                valor = sc.nextDouble();
//                                System.out.println("El perímetro del " + figura + " es: " + 4 * valor);
//                            }
//                            case 2 -> {
//                                figura = "Rectángulo";
//                                System.out.println("Ingrese largo del " + figura);
//                                valor = sc.nextDouble();
//                                System.out.println("Ingrese ancho del " + figura);
//                                valor1 = sc.nextDouble();
//                                System.out.println("El perímetro del " + figura + " es: " + 2 * (valor + valor1));
//                            }
//                            case 3 -> {
//                                figura = "Triángulo";
//                                System.out.println("Ingrese lado A del " + figura);
//                                valor = sc.nextDouble();
//                                System.out.println("Ingrese lado B del " + figura);
//                                valor1 = sc.nextDouble();
//                                System.out.println("Ingrese lado C del " + figura);
//                                valor2 = sc.nextDouble();
//                                System.out.println("El perímetro del " + figura + " es: " + (valor + valor1 + valor2));
//                            }
//                            case 4 -> {
//                                figura = "Círculo";
//                                System.out.println("Ingrese radio del " + figura);
//                                valor = sc.nextDouble();
//                                System.out.println("El perímetro del " + figura + " es: " + 2 * Math.PI * valor);
//                            }
//                            case 5 -> {
//                                figura = "Trapecio";
//                                System.out.println("Ingrese longitud de la base menor " + figura);
//                                valor = sc.nextDouble();
//                                System.out.println("Ingrese longitud de la base mayor " + figura);
//                                valor1 = sc.nextDouble();
//                                System.out.println("Ingrese longitud del lado izquierdo " + figura);
//                                valor2 = sc.nextDouble();
//                                System.out.println("Ingrese longitud del lado derecho " + figura);
//                                valor3 = sc.nextDouble();
//                                System.out.println("El perímetro del " + figura + " es: " + (valor + valor1 + valor2 + valor3));
//                            }
//                            case 7 -> {
//                                figura = "Polígono regular";
//                                System.out.println("Ingrese longitud del lado del " + figura);
//                                valor = sc.nextDouble();
//                                System.out.println("Ingrese número de lados " + figura);
//                                valor1 = sc.nextDouble();
//                                System.out.println("El perímetro del " + figura + " es: " + valor * valor1);
//                            }
//                            case 8 -> {
//                                figura = "Octágono";
//                                System.out.println("Ingrese longitud del lado del " + figura);
//                                valor = sc.nextDouble();
//                                System.out.println("El perímetro del " + figura + " es: " + 8 * valor);
//                            }
//                            case 9 -> {
//                                break;
//                            }
//                            default -> System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                        }
//                        return;
//                    }
//                    case 3 -> {
//                        System.out.println("Elija al conversión de unidad a realizar:\n1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²)." + "\n3. Ángulos (Grados a Radianes, Radianes a Grados).\n4. Regresar al menú principal.");
//                        opc1 = sc.nextInt();
//                        switch (opc1) {
//                            case 1 -> {
//                                OUTER:
//                                do {
//                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).\n4. Milímetro (mm).\n5. Regresar al menú anterior.");
//                                    conv = sc.nextInt();
//                                    switch (conv) {
//                                        case 1 -> {
//                                            simbMed = "km";
//                                            System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            System.out.println("Favor, indique la unidad a que convertir:\n1. Metro (m).\n2. Centímetro (cm).\n3. Milímetro (mm).");
//                                            conv = sc.nextInt();
//                                            switch (conv) {
//                                                case 1 -> {
//                                                    cambioMed = "m";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 1000);
//                                                }
//                                                case 2 -> {
//                                                    cambioMed = "cm";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 100000);
//                                                }
//                                                case 3 -> {
//                                                    cambioMed = "mm";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 1000000);
//                                                }
//                                                default -> {
//                                                }
//                                            }
//                                            return;
//                                        }
//                                        case 2 -> {
//                                            simbMed = "m";
//                                            System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Centímetro (cm).\n3. Milímetro (mm).");
//                                            conv = sc.nextInt();
//                                            switch (conv) {
//                                                case 1 -> {
//                                                    cambioMed = "km";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 1000);
//                                                }
//                                                case 2 -> {
//                                                    cambioMed = "cm";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 100);
//                                                }
//                                                case 3 -> {
//                                                    cambioMed = "mm";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 1000);
//                                                }
//                                            }
//                                            return;
//                                        }
//                                        case 3 -> {
//                                            simbMed = "cm";
//                                            System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Milímetro (mm).");
//                                            conv = sc.nextInt();
//                                            switch (conv) {
//                                                case 1 -> {
//                                                    cambioMed = "km";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 100000);
//                                                }
//                                                case 2 -> {
//                                                    cambioMed = "m";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 100);
//                                                }
//                                                case 3 -> {
//                                                    cambioMed = "mm";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 10);
//                                                }
//                                                default ->
//                                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                                            }
//                                            return;
//                                        }
//                                        case 4 -> {
//                                            simbMed = "mm";
//                                            System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
//                                            conv = sc.nextInt();
//                                            switch (conv) {
//                                                case 1 -> {
//                                                    cambioMed = "km";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 1000000);
//                                                }
//                                                case 2 -> {
//                                                    cambioMed = "m";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 1000);
//                                                }
//                                                case 3 -> {
//                                                    cambioMed = "cm";
//                                                    System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 10);
//                                                }
//                                                default ->
//                                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                                            }
//                                        }
//                                        case 5 -> {
//                                            break OUTER; //regresar al menú anterior
//                                        }
//                                        default -> System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                                    }
//                                    return;
//                                } while (true);
//                            }
//                            case 2 -> {
//                                do {
//                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).\n3. Centímetro cuadro (cm²).\n4. Regresar al menú anterior.");
//                                    conv = sc.nextInt();
//                                    switch (conv) {
//                                        case 1 -> {
//                                            simbMed = "km²";
//                                            System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            System.out.println("Favor, indique la unidad a que convertir:\n1. Metro cuadrado (m²).\n2. Centímetro cuadro (cm²).");
//                                            conv = sc.nextInt();
//                                            if (conv == 1) {
//                                                cambioMed = "m²";
//                                                System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 1000000);
//                                            } else if (conv == 2) {
//                                                cambioMed = "cm²";
//                                                System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 10_000_000_000L);
//                                            }
//                                            return;
//                                        }
//                                        case 2 -> {
//                                            simbMed = "m²";
//                                            System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro cuadrado (km²).\n2. Centímetro cuadro (cm²).");
//                                            conv = sc.nextInt();
//                                            if (conv == 1) {
//                                                cambioMed = "km²";
//                                                System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 1000000);
//                                            } else if (conv == 2) {
//                                                cambioMed = "cm²";
//                                                System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 10000);
//                                            }
//                                            return;
//                                        }
//                                        case 3 -> {
//                                            simbMed = "cm²";
//                                            System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro cuadrado (km²).\n2. Metro cuadro (m²).");
//                                            conv = sc.nextInt();
//                                            if (conv == 1) {
//                                                cambioMed = "km²";
//                                                System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 10_000_000_000L);
//                                            } else if (conv == 2) {
//                                                cambioMed = "cm²";
//                                                System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor / 10000);
//                                            }
//                                            return;
//                                        }
//                                        case 4 -> {
//                                            break;
//                                        }
//                                    }
//
//                                } while (true);
//                            }
//                            case 3 -> {
//                                do {
//                                    System.out.println("Favor indique la unidad a convertir:\n1. Grados.\n2. Radianes.\n3. Regresar al menú anterior.");
//                                    conv = sc.nextInt();
//                                    switch (conv) {
//                                        case 1 -> {
//                                            simbMed = "Grados";
//                                            System.out.println("Favor, ingrese el valor en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            cambioMed = "Radianes";
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * Math.PI / 180);
//                                        }
//                                        case 2 -> {
//                                            simbMed = "Radianes";
//                                            System.out.println("Favor, ingrese el valor en " + simbMed);
//                                            valor = sc.nextDouble();
//                                            cambioMed = "Grados";
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + valor * 180 / Math.PI);
//                                        }
//                                        case 3 -> {
//                                            break;
//                                        }
//                                    }
//                                } while (true);
//                            }
//                            case 4 -> {
//                                return;
//                            }
//                            default -> System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                        }
//                    }
//                    case 4 -> {
//                        System.out.println("¡Hasta la próxima!");
//                        return;
//                    }
//                    default -> System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                }
//            } while (true);
//        }
