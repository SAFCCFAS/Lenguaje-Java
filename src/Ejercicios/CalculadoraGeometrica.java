package Ejercicios;

import java.util.Scanner;

public class CalculadoraGeometrica {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura, simbMed,cambioMed;
        int opc, fig, opc1, conv;
        double result, valor, valor1, valor2, valor3;
        boolean subControl, controlUnd;

        do { // repetir el menú hasta que se ingrese la opción correcta
            // se usa """ para escribir en bloque de texto
            System.out.println("""
                    Bienvenido(a) favor indicar que desea realizar:
                    1. Calcular área.
                    2. Calcular perímetro.
                    3. Conversión de unidades.
                    4. Salir.""");
            opc = sc.nextInt();
            subControl = true;
            do { //repetir el submenú hasta que se ingrese la opción correcta
                switch (opc) {
                    case 1 -> {
                        System.out.println("""
                                Elija la figura a calcular área:
                                1. Cuadrado.
                                2. Rectángulo.
                                3. Triángulo.
                                4. Círculo.
                                5. Trapecio.
                                6. Rombo.
                                7. Polígono regular.
                                8. Octágono.
                                9. Regresa menú anterior""");
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
                        } else if (fig == 3) {
                            figura = "Triángulo";
                            System.out.println("Favor, ingrese base del " + figura + ":");
                            valor = sc.nextDouble();
                            System.out.println("Favor, ingrese altura del " + figura + ":");
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
                        } else if (fig == 6) {
                            figura = "Rombo";
                            System.out.println("Favor, ingrese diagonal 1 del " + figura + ":");
                            valor = sc.nextDouble();
                            System.out.println("Favor, ingrese diagonal 2 del " + figura + ":");
                            valor1 = sc.nextDouble();
                            result = (valor * valor1) / 2;
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
                            System.err.println("Error: Opción o ingreso no válido, opciones validas 1 a 9.");
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                Elija la figura a calcular perímetro:
                                1. Cuadrado.
                                2. Rectángulo.
                                3. Triángulo.
                                4. Círculo.
                                5. Trapecio.
                                6. Rombo.
                                7. Polígono regular.
                                8. Octágono.
                                9. Regresa menú anterior.""");
                        fig = sc.nextInt();
                        if (fig == 1) {
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
                        } else if (fig == 6) {
                            figura = "Rombo";
                            System.out.println("Ingrese longitud del lado del " + figura);
                            valor = sc.nextDouble();
                            result = 4 * valor;
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
                            System.err.println("Error: Opción o ingreso no válido, opciones validas 1 a 9.");
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                Elija al conversión de unidad a realizar:
                                1. Longitud (m, cm, mm, km).
                                2. Área (m², cm², km²).
                                3. Ángulos (Grados a Radianes, Radianes a Grados).
                                4. Regresar al menú principal.""");
                        opc1 = sc.nextInt();
                        controlUnd = true;
                        switch (opc1) {
                            case 1 -> {
                                do { //repetir el submenú hasta que se ingrese la opción correcta
                                    System.out.println("""
                                            Favor indique la unidad a convertir:
                                            1. Kilómetro (km).
                                            2. Metro (m).
                                            3. Centímetro (cm).
                                            4. Milímetro (mm).
                                            5. Regresar al menú anterior.""");
                                    conv = sc.nextInt();
                                    if (conv == 1) {
                                        simbMed = "km";
                                        System.out.println("Favor, ingrese la longitud en " + simbMed);
                                        valor = sc.nextDouble();
                                        System.out.println("""
                                                Favor, indique la unidad a que convertir:
                                                1. Metro (m).
                                                2. Centímetro (cm).
                                                3. Milímetro (mm).""");
                                        conv = sc.nextInt();
                                        if (conv == 1){
                                            cambioMed = "m";
                                            result = valor * 1000;
                                            System.out.println(+valor+" "+simbMed+" a "+cambioMed + " es: "+result);
                                            System.exit(0);
                                        }
                                    } else if (conv == 5) {
                                        controlUnd = false; //regresar al menú anterior
                                    }
                                } while (controlUnd);
                            }
                            case 2 -> {
                                do {
                                    System.out.println("""
                                            Favor indique la unidad a convertir:
                                            1. Kilómetro cuadrado (km²).
                                            2. Metro cuadrado (m²).
                                            3. Centímetro cuadro (cm²).
                                            4. Regresar al menú anterior.""");
                                    conv = sc.nextInt();
                                    if (conv == 4) {
                                        controlUnd = false;
                                    }
                                } while (controlUnd);
                            }
                            case 3 -> {
                                do {
                                    System.out.println("""
                                            Favor indique la unidad a convertir:
                                            1. Grados.
                                            2. Radianes.
                                            3. Regresar al menú anterior.""");
                                    conv = sc.nextInt();
                                    if (conv == 3) {
                                        controlUnd = false;
                                    }
                                } while (controlUnd);
                            }
                            case 4 -> subControl = false;
                            default -> System.err.println("Error: Opción o ingreso no válido, opciones validas 1 a 4.");
                        }
                    }
                    case 4 -> {
                        System.out.println("¡Hasta la próxima!");
                        System.exit(0);
                    }
                    default -> {
                        System.err.println("Error: Opción o ingreso no válido, opciones validas 1 a 4.");
                        subControl = false;
                    }
                }
            } while (subControl);
        } while (true);
    }
}
