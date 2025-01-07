package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class CalculadoraGeometricaArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] opciones = {"Calcular área", "Calcular Perímetro", "Conversión de unidades"};
        String[] nombreFiguras = {"Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Trapecio", "Rombo", "Polígono Regular", "Octágono"};
        String[] opcionConversiones = {"Longitud", "Área", "Ángulo"};
        String[][] nombreUnidades = {{"Kilómetro", "Metro", "Centímetro", "Milímetro"}, {"Cuadrado"}, {"Grados", "Radianes"}};
        String[][] simbUnidades = {{"km", "m", "cm", "mm"}, {"km²", "m²", "cm²"}, {"°", "Rad"}};
        String[][] entradaArea = {{"lado"}, {"largo", "ancho"}, {"base", "altura"}, {"radio"}, {"base mayor", "base menor", "altura"}, {"diagonal mayor", "diagonal menor"}, {"número de lados", "largo de cada lado"}, {"lado"}};
        String[][] entradaPerimetroStrings = {{"lado"}, {"largo", "ancho"}, {"lado 1", "lado 2", "lado 3"}, {"radio"}, {"base mayor", "base menor", "lado derecho", "lado izquierdo"}, {"lado"}, {"Número de lados", "Largo de cada lado"}, {"Lado"}};
        double[] valores = new double[4];
        double areas, perimetros;
        String eleccion, valor;
        int opc, fig, origen, destino, contar, und;
        boolean ingresoValido;

        while (true) {
            System.out.println("Favor elija la opción a utilizar:");
            contar = 1;
            for (String opcion : opciones) {
                System.out.printf("%d. %s.%n", contar++, opcion);
            }
            System.out.printf("%d. Salir.%n", contar);
            eleccion = sc.nextLine().trim();
            ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]"); // valida si se ajusta a lo buscado.
            if (!ingresoValido) {
                System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", opciones.length + 1);
                continue;
            } else if (Integer.parseInt(eleccion) == contar) { // terminar el bucle si coincide con la opción adicional
                System.out.println("¡Gracias por usar el programa!");
                break;
            }
            opc = Integer.parseInt(eleccion);
            System.out.printf("Usted a elegido: %s.%n", opciones[opc - 1]);
            switch (opc) {
                case 1, 2 -> {
                    while (true) {
                        fig = 1;
                        System.out.printf("Favor elija la figura a %s:%n", opciones[opc - 1]);
                        for (String figura : nombreFiguras) {
                            System.out.printf("%d. %s.%n", fig++, figura);
                        }
                        System.out.printf("%d. Regresar al menú anterior.%n", fig);
                        eleccion = sc.nextLine().trim();
                        ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + fig + "]");
                        if (!ingresoValido) {
                            System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", nombreFiguras.length + 1);
                            continue;
                        } else if (Integer.parseInt(eleccion) == fig) {
                            System.out.println("Regresando al menú anterior...");
                            break;
                        }
                        fig = Integer.parseInt(eleccion);
                        System.out.printf("Usted a elegido: %s.%n", nombreFiguras[fig - 1]);
                        switch (fig) {
                            case 1, 2, 3, 4, 5, 6, 7, 8 -> {
                                while (true) {
                                    if (opc == 1) {
                                        for (contar = 0; contar < entradaArea[fig - 1].length; contar++) {
                                            System.out.printf("Favor, ingrese %s del %s:%n", entradaArea[fig - 1][contar], nombreFiguras[fig - 1]);
                                            valor = sc.nextLine().trim();
                                            ingresoValido = !valor.trim().isEmpty() && valor.matches("\\d+(\\.\\d+)?");
                                            if (!ingresoValido || Double.parseDouble(valor) <= 0) {
                                                System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
                                                continue;
                                            }
                                            valores[contar] = Double.parseDouble(valor);
                                        }
                                    } else {
                                        for (contar = 0; contar < entradaPerimetroStrings[fig - 1].length; contar++) {
                                            System.out.printf("Favor, ingrese %s del %s:%n", entradaPerimetroStrings[fig - 1][contar], nombreFiguras[fig - 1]);
                                            valor = sc.nextLine().trim();
                                            ingresoValido = !valor.trim().isEmpty() && valor.matches("\\d+(\\.\\d+)?");
                                            if (!ingresoValido || Double.parseDouble(valor) <= 0) {
                                                System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
                                                continue;
                                            }
                                            valores[contar] = Double.parseDouble(valor);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        if (opc == 1) {
                            areas = switch (fig) {
                                case 1 -> Math.pow(valores[0], 2);
                                case 2 -> valores[0] * valores[1];
                                case 3, 6 -> (valores[0] * valores[1]) / 2;
                                case 4 -> Math.PI * Math.pow(valores[0], 2);
                                case 5 -> ((valores[0] + valores[1]) / 2) * valores[2];
                                case 7 -> (valores[0] * Math.pow(valores[1], 2)) / (4 * Math.tan(Math.PI / valores[0]));
                                default -> (2 + 4 / Math.sqrt(2)) * Math.pow(valores[0], 2);
                            };
                            System.out.printf("El área del %s es: %.2f%n", nombreFiguras[fig - 1], areas);
                        } else {
                            perimetros = switch (fig) {
                                case 1, 6 -> valores[0] * 4;
                                case 2 -> 2 * (valores[0] + valores[1]);
                                case 3 -> valores[0] + valores[1] + valores[2];
                                case 4 -> 2 * Math.PI * valores[0];
                                case 5 -> valores[0] + valores[1] + valores[2] + valores[3];
                                case 7 -> valores[0] * valores[1];
                                default -> valores[0] * 8;
                            };
                            System.out.printf("El perímetro del %s es: %.2f%n", nombreFiguras[fig - 1], perimetros);
                        }
                        return;
                    }
                }
                case 3 -> {
                    while (true) {
                        opc = 1;
                        System.out.println("Favor elija la categoria de unidad a utilizar:");
                        for (String categoria : opcionConversiones) {
                            System.out.printf("%d. %s (", opc++, categoria);
                            contar = 0;
                            for (String simbolos : simbUnidades[opc - 2]) {
                                System.out.printf("%s", simbolos);
                                if (++contar < simbUnidades[opc - 2].length) {
                                    System.out.print(", "); // Agregar coma excepto en el último elemento
                                }
                            }
                            System.out.println(").");
                        }
                        System.out.printf("%d. Regresar al menú anterior.%n", opc);
                        eleccion = sc.nextLine().trim();
                        ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + opc + "]");
                        if (!ingresoValido) {
                            System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", opcionConversiones.length + 1);
                            continue;
                        } else if (Integer.parseInt(eleccion) == opc) {
                            System.out.println("Regresando al menú anterior...");
                            break;
                        }
                        opc = Integer.parseInt(eleccion);
                        System.out.printf("Usted a elegido: %s.%n", opcionConversiones[opc - 1]);
                        System.out.printf("Favor indique la unidad de %s a usar:%n", opcionConversiones[opc - 1]);
                        switch (opc) {
                            case 1, 2 -> {
                                while (true) {
                                    und = 1;
                                    contar = 0;
                                    if (opc == 1) {
                                        for (String longitud : nombreUnidades[opc - 1]) {
                                            System.out.printf("%d. %s (%s).%n", und++, longitud, simbUnidades[opc - 1][contar]);
                                            contar++;
                                        }
                                    } else {
                                        for (String area : nombreUnidades[opc - 2]) {
                                            if (!area.equals("Milímetro")) {
                                                System.out.printf("%d. %s %s (%s).%n", und++, area, nombreUnidades[opc - 1][0], simbUnidades[opc - 1][contar]);
                                                contar++;
                                            }
                                        }
                                    }
                                    System.out.printf("%d. Regresar al menú anterior.%n", und);
                                    eleccion = sc.nextLine().trim();
                                    ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + und + "]");
                                    if (!ingresoValido) {
                                        System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", und);
                                        continue;
                                    } else if (Integer.parseInt(eleccion) == und) {
                                        System.out.println("Regresando al menú anterior...");
                                        break;
                                    }
                                    und = Integer.parseInt(eleccion);
                                    System.out.printf("Usted a elegido: %s %n", opc == 1 ? nombreUnidades[opc - 1][und - 1] : nombreUnidades[opc - 2][und - 1] + " " + nombreUnidades[opc - 1][0]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}