package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, categoria, medida, simbMed, eleccion, entrada;
        int opc, fig, contar, origen, unidad, destino;
        double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, area, perimetro;

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
                    while (true) { //repetir el submenú hasta que se ingrese la opción correcta
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
                                                if (fig == 2) {
                                                    System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "largo" : "ancho", figura);
                                                } else if (fig == 3) {
                                                    System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "base" : "altura", figura);
                                                } else if (fig == 6) {
                                                    System.out.printf("Favor, ingrese diagonal %s del %s:\n", contar + 1, figura);
                                                } else {
                                                    System.out.printf("Favor, ingrese %s del %s:\n", contar == 0 ? "número de lados" : "largo de cada lado", figura);
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
                                                if (contar == 0) {
                                                    valor = Double.parseDouble(entrada);
                                                } else if (contar == 1) {
                                                    valor1 = Double.parseDouble(entrada);
                                                } else {
                                                    valor2 = Double.parseDouble(entrada);
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
                                }
                            }
                        }
                        return; // en este punto es mejor terminar el programa para no hacer el código más complejo.
                    }
                }
                case 3 -> {
                    while (true){
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
                        if (categoria!=null){
                            System.out.println("Ha seleccionado: " + categoria);
                            if (origen==1){
                                
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}

//                    case 3 -> {
//                        System.out.println("Elija al conversión de unidad a realizar:\n1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²)." + "\n3. Ángulos (Grados a Radianes, Radianes a Grados).\n4. Regresar al menú principal.");
//                        opc1 = sc.nextInt();
//                        controlUnd = true;
//                        switch (opc1) {
//                            case 1 -> {
//                                do { //repetir el submenú hasta que se ingrese la opción correcta
//                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm)." + "\n4. Milímetro (mm).\n5. Regresar al menú anterior.");
//                                    conv = sc.nextInt();
//                                    if (conv == 1) {
//                                        simbMed = "km";
//                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Metro (m).\n2. Centímetro (cm)." + "\n3. Milímetro (mm).");
//                                        conv = sc.nextInt();
//                                        if (conv == 1) {
//                                            cambioMed = "m";
//                                            result = valor * 1000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 2) {
//                                            cambioMed = "cm";
//                                            result = valor * 100000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 3) {
//                                            cambioMed = "mm";
//                                            result = valor * 1000000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        }
//                                    } else if (conv == 2) {
//                                        simbMed = "m";
//                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Centímetro (cm)." + "\n3. Milímetro (mm).");
//                                        conv = sc.nextInt();
//                                        if (conv == 1) {
//                                            cambioMed = "km";
//                                            result = valor / 1000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 2) {
//                                            cambioMed = "cm";
//                                            result = valor * 100;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 3) {
//                                            cambioMed = "mm";
//                                            result = valor * 1000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        }
//                                    } else if (conv == 3) {
//                                        simbMed = "cm";
//                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Metro (m)." + "\n3. Milímetro (mm).");
//                                        conv = sc.nextInt();
//                                        if (conv == 1) {
//                                            cambioMed = "km";
//                                            result = valor / 100000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 2) {
//                                            cambioMed = "m";
//                                            result = valor / 100;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 3) {
//                                            cambioMed = "mm";
//                                            result = valor * 10;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else {
//                                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                                        }
//                                    } else if (conv == 4) {
//                                        simbMed = "mm";
//                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
//                                        conv = sc.nextInt();
//                                        if (conv == 1) {
//                                            cambioMed = "km";
//                                            result = valor / 1000000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 2) {
//                                            cambioMed = "m";
//                                            result = valor / 1000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 3) {
//                                            cambioMed = "cm";
//                                            result = valor / 10;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else {
//                                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                                        }
//                                    } else if (conv == 5) {
//                                        controlUnd = false; //regresar al menú anterior
//                                    } else {
//                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                                    }
//                                } while (controlUnd);
//                            }
//                            case 2 -> {
//                                do {
//                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²)." + "\n3. Centímetro cuadro (cm²).\n4. Regresar al menú anterior.");
//                                    conv = sc.nextInt();
//                                    if (conv == 1) {
//                                        simbMed = "km²";
//                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Metro cuadrado (m²)." + "\n2. Centímetro cuadro (cm²).");
//                                        conv = sc.nextInt();
//                                        if (conv == 1) {
//                                            cambioMed = "m²";
//                                            result = valor * 1000000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 2) {
//                                            cambioMed = "cm²";
//                                            result = valor * 10_000_000_000L;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        }
//                                    } else if (conv == 2) {
//                                        simbMed = "m²";
//                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro cuadrado (km²)" + ".\n2. Centímetro cuadro (cm²).");
//                                        conv = sc.nextInt();
//                                        if (conv == 1) {
//                                            cambioMed = "km²";
//                                            result = valor / 1000000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 2) {
//                                            cambioMed = "cm²";
//                                            result = valor * 10000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        }
//                                    } else if (conv == 3) {
//                                        simbMed = "cm²";
//                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro cuadrado (km²)." + "\n2. Metro cuadro (m²).");
//                                        conv = sc.nextInt();
//                                        if (conv == 1) {
//                                            cambioMed = "km²";
//                                            result = valor / 10_000_000_000L;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        } else if (conv == 2) {
//                                            cambioMed = "cm²";
//                                            result = valor / 10000;
//                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                            System.exit(0);
//                                        }
//                                    } else if (conv == 4) {
//                                        controlUnd = false;
//                                    }
//                                } while (controlUnd);
//                            }
//                            case 3 -> {
//                                do {
//                                    System.out.println("Favor indique la unidad a convertir:\n1. Grados.\n2. Radianes.\n3. Regresar al menú anterior.");
//                                    conv = sc.nextInt();
//                                    if (conv == 1) {
//                                        simbMed = "Grados";
//                                        System.out.println("Favor, ingrese el valor en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        cambioMed = "Radianes";
//                                        result = valor * Math.PI / 180;
//                                        System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                        System.exit(0);
//                                    } else if (conv == 2) {
//                                        simbMed = "Radianes";
//                                        System.out.println("Favor, ingrese el valor en " + simbMed);
//                                        valor = sc.nextDouble();
//                                        cambioMed = "Grados";
//                                        result = valor * 180 / Math.PI;
//                                        System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
//                                        System.exit(0);
//                                    } else if (conv == 3) {
//                                        controlUnd = false;
//                                    }
//                                } while (controlUnd);
//                            }
//                            case 4 -> subControl = false;
//                            default -> System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                        }
//                    }
//                    case 4 -> {
//                        System.out.println("¡Hasta la próxima!");
//                        System.exit(0);
//                    }
//                    default -> {
//                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
//                        subControl = false;
//                    }
//                }
//            } while (subControl);