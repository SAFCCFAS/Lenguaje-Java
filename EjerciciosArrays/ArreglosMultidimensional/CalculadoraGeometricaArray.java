package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class CalculadoraGeometricaArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] opciones = {"Calcular área", "Calcular Perímetro", "Conversión de unidades"};
        String[] nombreFiguras = {"Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Trapecio", "Rombo", "Polígono Regular", "Octágono"};
        String[] opcionConversiones = {"Longitud", "Área", "Ángulo"};
        String[][] nombreUnidades = {{"Kilómetro", "Metro", "Centímetro", "Milímetro"}, {"Cuadrado"}, {"Grados", "Radianes"}};
        String[][] cambioUnidades = new String[nombreUnidades.length - 1][2];
        String[][] simbUnidades = {{"km", "m", "cm", "mm"}, {"km²", "m²", "cm²"}, {"°", "Rad"}};
        String[][] entradaArea = {{"lado"}, {"largo", "ancho"}, {"base", "altura"}, {"radio"}, {"base mayor", "base menor", "altura"}, {"diagonal mayor", "diagonal menor"}, {"número de lados", "largo de cada lado"}, {"lado"}};
        String[][] entradaPerimetro = {{"lado"}, {"largo", "ancho"}, {"lado 1", "lado 2", "lado 3"}, {"radio"}, {"base mayor", "base menor", "lado derecho", "lado izquierdo"}, {"lado"}, {"Número de lados", "Largo de cada lado"}, {"Lado"}};
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
            ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]"); // valida si se ajusta
            // a lo buscado.
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
                                for (contar = 0; contar < (opc == 1 ? entradaArea[fig - 1].length : entradaPerimetro[fig - 1].length); contar++) {
                                    valor = opc == 1 ? entradaArea[fig - 1][contar] : entradaPerimetro[fig - 1][contar];
                                    while (true) {
                                        System.out.printf("Favor, ingrese %s del %s:%n", valor, nombreFiguras[fig - 1]);
                                        valor = sc.nextLine().trim();
                                        ingresoValido = !valor.trim().isEmpty() && valor.matches("\\d+(\\.\\d+)?");
                                        if (!ingresoValido || Double.parseDouble(valor) <= 0) {
                                            System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
                                            continue;
                                        }
                                        break;
                                    }
                                    valores[contar] = Double.parseDouble(valor);
                                }
                            }
                        }

                        areas = switch (fig) {
                            case 1 -> Math.pow(valores[0], 2);
                            case 2 -> valores[0] * valores[1];
                            case 3, 6 -> (valores[0] * valores[1]) / 2;
                            case 4 -> Math.PI * Math.pow(valores[0], 2);
                            case 5 -> ((valores[0] + valores[1]) / 2) * valores[2];
                            case 7 -> (valores[0] * Math.pow(valores[1], 2)) / (4 * Math.tan(Math.PI / valores[0]));
                            default -> (2 + 4 / Math.sqrt(2)) * Math.pow(valores[0], 2);
                        };

                        perimetros = switch (fig) {
                            case 1, 6 -> valores[0] * 4;
                            case 2 -> 2 * (valores[0] + valores[1]);
                            case 3 -> valores[0] + valores[1] + valores[2];
                            case 4 -> 2 * Math.PI * valores[0];
                            case 5 -> valores[0] + valores[1] + valores[2] + valores[3];
                            case 7 -> valores[0] * valores[1];
                            default -> valores[0] * 8;
                        };
                        System.out.printf("El %s del %s es: %.2f%n", opc == 1 ? "área" : "perímetro", nombreFiguras[fig - 1], opc == 1 ? areas : perimetros);
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
                                    for (String unidades : opc == 1 ? nombreUnidades[opc - 1] : nombreUnidades[opc - 2]) {
                                        if (opc == 1) {
                                            System.out.printf("%d. %s (%s).%n", und++, unidades, simbUnidades[opc - 1][contar]);
                                        } else if (!unidades.equals("Milímetro")) {
                                            System.out.printf("%d. %s %s (%s).%n", und++, unidades, nombreUnidades[opc - 1][0], simbUnidades[opc - 1][contar]);
                                        }
                                        contar++;
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
                                    origen = Integer.parseInt(eleccion);
                                    eleccion = opc == 1 ? nombreUnidades[opc - 1][origen - 1] : nombreUnidades[opc - 2][origen - 1] + " " + nombreUnidades[opc - 1][0];
                                    System.out.printf("Usted a elegido: %s %n", eleccion);
                                    while (true) {
                                        System.out.printf("ingrese %s en %s (%s):%n", opcionConversiones[opc - 1], eleccion, simbUnidades[opc - 1][origen - 1]);
                                        valor = sc.nextLine().trim();
                                        ingresoValido = !valor.trim().isEmpty() && valor.matches("\\d+(\\.\\d+)?");
                                        if (!ingresoValido || Double.parseDouble(valor) <= 0) {
                                            System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
                                            continue;
                                        }
                                        break;
                                    }
                                    while (true) {
                                        System.out.println("Favor, elija unidad de destino:");
                                        und = 1;
                                        contar = 0;
                                        for (String cambio : origen == 1 ? nombreUnidades[opc - 1] : nombreUnidades[opc - 2]) {
                                            if (!cambio.equals(origen == 1 ? nombreUnidades[opc - 1][0] : nombreUnidades[opc - 2][0])) {
                                                cambioUnidades[contar] = nombreUnidades[contar];
                                                System.out.printf("%d. %s.%n", und++, cambio);
                                            }
                                        }
                                        break;
                                    }
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