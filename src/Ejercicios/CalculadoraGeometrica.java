package Ejercicios;

import java.util.Scanner;

public class CalculadoraGeometrica {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura = "";
        int opc, fig, conv;
        double result, valor, valor1, valor2, valor3, valor4;
        boolean subControl;

        do {
            System.out.println("Bienvenido(a) favor indicar que desea realizar:\n1. Calcular área." +
                    "\n2. Calcular perímetro.\n3. Conversión de unidades.\n4. Salir.");
            opc = sc.nextInt();
            subControl = true;
            do {
                switch (opc) {
                    case 1 -> {
                        System.out.println("Elija la figura a calcular área:\n1. Cuadrado.\n2. Rectángulo." +
                                "\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular." +
                                "\n8. Octágono.\n9. Regresa menú anterior");
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
                            subControl = false;
                        } else {

                        }
                    }
                    case 2 -> {
                        System.out.println("Elija la figura a calcular perímetro:\n1. Cuadrado.\n2. Rectángulo." +
                                "\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular." +
                                "\n8. Octágono.\n9. Regresa menú anterior.");
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
                        }
                    }
                    case 3 -> {
                        System.out.println("Elija al conversión de unidad a realizar:\n1. Longitud (m, cm, mm, km)." +
                                "\n2. Área (m², cm², km²).\n3. Ángulos (Grados a Radianes, Radianes a Grados)." +
                                "\n4. Regresar al menú principal.");
                        conv = sc.nextInt();
                        if (conv == 1) {

                        } else if (conv == 4) {
                            subControl = false;
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
