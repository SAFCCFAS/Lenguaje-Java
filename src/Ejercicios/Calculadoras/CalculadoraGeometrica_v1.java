package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, simbMed, cambioMed;
        int opc, fig, opc1, conv;
        double result, valor, valor1, valor2, valor3;
        boolean subControl, controlUnd;

        do { // repetir el menú hasta que se ingrese la opción correcta
            System.out.println("Bienvenido(a) favor indicar que desea realizar:\n1. Calcular área. \n2. Calcular perímetro."
                    + "\n3. Conversión de unidades.\n4. Salir.");
            opc = sc.nextInt();
            subControl = true;
            do { //repetir el submenú hasta que se ingrese la opción correcta
                switch (opc) {
                    case 1 -> {
                        System.out.println("Elija la figura a calcular área:\n1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio."
                                + "\n6. Rombo.\n7. Polígono regular.\n8. Octágono.\n9. Regresa menú anterior");
                        fig = sc.nextInt();
                        if (fig == 1) {
                            figura = "Cuadrado";
                            System.out.println("Favor, ingrese lado del " + figura + ":");
                            valor = sc.nextDouble();
                            result = Math.pow(valor, 2);
                            System.out.println("El área del " + figura + " es: " + result);
                            System.exit(0);
                        } else if (fig == 2) {
                            figura = "Rectángulo";
                            System.out.println("Favor, ingrese largo del " + figura + ":");
                            valor = sc.nextDouble();
                            System.out.println("Favor, ingrese ancho del " + figura + ":");
                            valor1 = sc.nextDouble();
                            result = valor * valor1;
                            System.out.println("El área del " + figura + " es: " + result);
                            System.exit(0);
                        } else if (fig == 3 || fig == 6) {
                            if (fig == 3){
                                figura = "Triángulo";
                                System.out.println("Favor, ingrese base del " + figura + ":");
                                valor = sc.nextDouble();
                                System.out.println("Favor, ingrese altura del " + figura + ":");
                            }else {
                                figura = "Rombo";
                                System.out.println("Favor, ingrese diagonal 1 del " + figura + ":");
                                valor = sc.nextDouble();
                                System.out.println("Favor, ingrese diagonal 2 del " + figura + ":");

                            }
                            valor1 = sc.nextDouble();
                            result = (valor * valor1) / 2;
                            System.out.println("El área del " + figura + " es: " + result);
                            System.exit(0);
                        } else if (fig == 4) {
                            figura = "Círculo";
                            System.out.println("Favor, ingrese radio del " + figura + ":");
                            valor = sc.nextDouble();
                            result = Math.PI * Math.pow(valor, 2);
                            System.out.println("El área del " + figura + " es: " + result);
                            System.exit(0);
                        } else if (fig == 5) {
                            figura = "Trapecio";
                            System.out.println("Favor, ingrese base 1 del " + figura + ":");
                            valor = sc.nextDouble();
                            System.out.println("Favor, ingrese base 2 del " + figura + ":");
                            valor1 = sc.nextDouble();
                            System.out.println("Favor, ingrese altura del " + figura + ":");
                            valor2 = sc.nextDouble();
                            result = (valor + valor1) / 2 * valor2;
                            System.out.println("El área del " + figura + " es: " + result);
                            System.exit(0);
                        } else if (fig == 7) {
                            figura = "Polígono regular";
                            System.out.println("Favor, ingrese número de lados del " + figura + ":");
                            valor = sc.nextDouble();
                            System.out.println("Favor, ingrese largo de cada lado " + figura + ":");
                            valor1 = sc.nextDouble();
                            result = (valor * Math.pow(valor1, 2)) / (4 * Math.tan(Math.PI / valor));
                            System.out.println("El área del " + figura + " es: " + result);
                            System.exit(0);
                        } else if (fig == 8) {
                            figura = "Octágono";
                            System.out.println("Favor, ingrese la longitud de un lado del " + figura + ":");
                            valor = sc.nextDouble();
                            result = (2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2);
                            System.out.println("El área del " + figura + " es: " + result);
                            System.exit(0);
                        } else if (fig == 9) {
                            subControl = false; //regresar al menú anterior
                        } else {
                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                        }
                    }
                    case 2 -> {
                        System.out.println("Elija la figura a calcular perímetro:\n1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo."
                                + "\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.\n8. Octágono.\n9. Regresa menú anterior.");
                        fig = sc.nextInt();
                        if (fig == 1 || fig == 6) {
                            figura = "Cuadrado";
                            System.out.println("Ingrese longitud del lado del " + figura);
                            valor = sc.nextDouble();
                            result = 4 * valor;
                            System.out.println("El perímetro del " + figura + " es: " + result);
                        } else if (fig == 2) {
                            figura = "Rectángulo";
                            System.out.println("Ingrese largo del " + figura);
                            valor = sc.nextDouble();
                            System.out.println("Ingrese ancho del " + figura);
                            valor1 = sc.nextDouble();
                            result = 2 * (valor + valor1);
                            System.out.println("El perímetro del " + figura + " es: " + result);
                        } else if (fig == 3) {
                            figura = "Triángulo";
                            System.out.println("Ingrese lado A del " + figura);
                            valor = sc.nextDouble();
                            System.out.println("Ingrese lado B del " + figura);
                            valor1 = sc.nextDouble();
                            System.out.println("Ingrese lado C del " + figura);
                            valor2 = sc.nextDouble();
                            result = valor + valor1 + valor2;
                            System.out.println("El perímetro del " + figura + " es: " + result);
                        } else if (fig == 4) {
                            figura = "Círculo";
                            System.out.println("Ingrese radio del " + figura);
                            valor = sc.nextDouble();
                            result = 2 * Math.PI * valor;
                            System.out.println("El perímetro del " + figura + " es: " + result);
                        } else if (fig == 5) {
                            figura = "Trapecio";
                            System.out.println("Ingrese longitud de la base menor" + figura);
                            valor = sc.nextDouble();
                            System.out.println("Ingrese longitud de la base mayor" + figura);
                            valor1 = sc.nextDouble();
                            System.out.println("Ingrese longitud del lado izquierdo" + figura);
                            valor2 = sc.nextDouble();
                            System.out.println("Ingrese longitud del lado derecho" + figura);
                            valor3 = sc.nextDouble();
                            result = valor + valor1 + valor2 + valor3;
                            System.out.println("El perímetro del " + figura + " es: " + result);
                        } else if (fig == 7) {
                            figura = "Polígono regular";
                            System.out.println("Ingrese longitud del lado del " + figura);
                            valor = sc.nextDouble();
                            System.out.println("Ingrese número de lados " + figura);
                            valor1 = sc.nextDouble();
                            result = valor * valor1;
                            System.out.println("El perímetro del " + figura + " es: " + result);
                        } else if (fig == 8) {
                            figura = "Octágono";
                            System.out.println("Ingrese longitud del lado del " + figura);
                            valor = sc.nextDouble();
                            result = 8 * valor;
                            System.out.println("El perímetro del " + figura + " es: " + result);
                        } else if (fig == 9) {
                            subControl = false;
                        } else {
                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Elija al conversión de unidad a realizar:\n1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²)."
                                + "\n3. Ángulos (Grados a Radianes, Radianes a Grados).\n4. Regresar al menú principal.");
                        opc1 = sc.nextInt();
                        controlUnd = true;
                        switch (opc1) {
                            case 1 -> {
                                do { //repetir el submenú hasta que se ingrese la opción correcta
                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm)."
                                            + "\n4. Milímetro (mm).\n5. Regresar al menú anterior.");
                                    conv = sc.nextInt();
                                    if (conv == 1) {
                                        simbMed = "km";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Metro (m).\n2. Centímetro (cm)." +
                                                "\n3. Milímetro (mm).");
                                        conv = sc.nextInt();
                                        if (conv == 1) {
                                            cambioMed = "m";
                                            result = valor * 1000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 2) {
                                            cambioMed = "cm";
                                            result = valor * 100000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 3) {
                                            cambioMed = "mm";
                                            result = valor * 1000000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        }
                                    } else if (conv == 2) {
                                        simbMed = "m";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Centímetro (cm)." +
                                                "\n3. Milímetro (mm).");
                                        conv = sc.nextInt();
                                        if (conv == 1) {
                                            cambioMed = "km";
                                            result = valor / 1000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 2) {
                                            cambioMed = "cm";
                                            result = valor * 100;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 3) {
                                            cambioMed = "mm";
                                            result = valor * 1000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        }
                                    } else if (conv == 3) {
                                        simbMed = "cm";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Metro (m)." +
                                                "\n3. Milímetro (mm).");
                                        conv = sc.nextInt();
                                        if (conv == 1) {
                                            cambioMed = "km";
                                            result = valor / 100000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 2) {
                                            cambioMed = "m";
                                            result = valor / 100;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 3) {
                                            cambioMed = "mm";
                                            result = valor * 10;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else {
                                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        }
                                    } else if (conv == 4) {
                                        simbMed = "mm";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
                                        conv = sc.nextInt();
                                        if (conv == 1) {
                                            cambioMed = "km";
                                            result = valor / 1000000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 2) {
                                            cambioMed = "m";
                                            result = valor / 1000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 3) {
                                            cambioMed = "cm";
                                            result = valor / 10;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else {
                                            System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                        }
                                    } else if (conv == 5) {
                                        controlUnd = false; //regresar al menú anterior
                                    } else {
                                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                                    }
                                } while (controlUnd);
                            }
                            case 2 -> {
                                do {
                                    System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²)."
                                            + "\n3. Centímetro cuadro (cm²).\n4. Regresar al menú anterior.");
                                    conv = sc.nextInt();
                                    if (conv == 1) {
                                        simbMed = "km²";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Metro cuadrado (m²)." +
                                                "\n2. Centímetro cuadro (cm²).");
                                        conv = sc.nextInt();
                                        if (conv == 1) {
                                            cambioMed = "m²";
                                            result = valor * 1000000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 2) {
                                            cambioMed = "cm²";
                                            result = valor * 10_000_000_000L;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        }
                                    } else if (conv == 2) {
                                        simbMed = "m²";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro cuadrado (km²)" +
                                                ".\n2. Centímetro cuadro (cm²).");
                                        conv = sc.nextInt();
                                        if (conv == 1) {
                                            cambioMed = "km²";
                                            result = valor / 1000000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 2) {
                                            cambioMed = "cm²";
                                            result = valor * 10000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        }
                                    } else if (conv == 3) {
                                        simbMed = "cm²";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("Favor, indique la unidad a que convertir:\n1. Kilómetro cuadrado (km²)." +
                                                "\n2. Metro cuadro (m²).");
                                        conv = sc.nextInt();
                                        if (conv == 1) {
                                            cambioMed = "km²";
                                            result = valor / 10_000_000_000L;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        } else if (conv == 2) {
                                            cambioMed = "cm²";
                                            result = valor / 10000;
                                            System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                            System.exit(0);
                                        }
                                    } else if (conv == 4) {
                                        controlUnd = false;
                                    }
                                } while (controlUnd);
                            }
                            case 3 -> {
                                do {
                                    System.out.println("Favor indique la unidad a convertir:\n1. Grados.\n2. Radianes.\n3. Regresar al menú anterior.");
                                    conv = sc.nextInt();
                                    if (conv == 1) {
                                        simbMed = "Grados";
                                        System.out.println("Favor, ingrese el valor en " + simbMed);
                                        valor = sc.nextDouble();
                                        cambioMed = "Radianes";
                                        result = valor * Math.PI / 180;
                                        System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                        System.exit(0);
                                    } else if (conv == 2) {
                                        simbMed = "Radianes";
                                        System.out.println("Favor, ingrese el valor en " + simbMed);
                                        valor = sc.nextDouble();
                                        cambioMed = "Grados";
                                        result = valor * 180 / Math.PI;
                                        System.out.println(valor + " " + simbMed + " a " + cambioMed + " es: " + result);
                                        System.exit(0);
                                    } else if (conv == 3) {
                                        controlUnd = false;
                                    }
                                } while (controlUnd);
                            }
                            case 4 -> subControl = false;
                            default -> System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                        }
                    }
                    case 4 -> {
                        System.out.println("¡Hasta la próxima!");
                        System.exit(0);
                    }
                    default -> {
                        System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
                        subControl = false;
                    }
                }
            } while (subControl);
        } while (true);
    }
}