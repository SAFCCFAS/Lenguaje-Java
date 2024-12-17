package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class CalculadoraGeometricaArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] opciones = {"Calcular área", "Calcular Perímetro", "Conversión de unidades"};
        String[] nombreFiguras = {"Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Trapecio", "Rombo", "Polígono Regular", "Octágono"};
        String[] opcionConversiones = {"Longitud", "Área", "Ángulo"};
        String[][] nombreUnidades = {{"Kilómetro", "Metro", "Centímetro", "Milímetro"}, {"Grados", "Radianes"}};
        String[][] simbUnidades = {{"km", "m", "cm", "mm"}, {"km²", "m²", "cm²"}, {"°", "Rad"}};
        double[] valores = new double[4];
        String eleccion, valor;
        int opc, fig, conv, count, und;

        do { // Repetir menú hasta recibir opciones válidas
            opc = 1;
            System.out.println("Bienvenido(a), favor elija la opción a realizar a continuación:");
            for (String opcion : opciones) {
                System.out.printf("%d. %s.%n", opc++, opcion);
            }
            System.out.printf("%d. Salir.%n", opc);
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty() || !eleccion.matches("-?\\d+")) {
                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                continue;
            }
            opc = Integer.parseInt(eleccion);
            if (opc > opciones.length + 1 || opc <= 0) {
                System.err.printf("Error: Opción fuera del rango (1 - %d), intente nuevamente.%n", opciones.length + 1);
                continue;
            } else if (opc == opciones.length + 1) {
                System.out.println("Gracias por usar el programa, ¡Hasta la próxima!");
                break;
            }
            System.out.printf("Usted a elegido : %s%n", opciones[opc - 1]);
            if (opc == 1 || opc == 2) {
                do {
                    fig = 1;
                    System.out.printf("Favor elija la figura a %s:%n", opciones[opc - 1]);
                    for (String figura : nombreFiguras) {
                        System.out.printf("%d. %s.%n", fig++, figura);
                    }
                    System.out.printf("%d. Regresar al menú anterior.%n", fig);
                    eleccion = sc.nextLine();
                    if (eleccion.trim().isEmpty() || !eleccion.matches("-?\\d+")) {
                        System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                        continue;
                    }
                    fig = Integer.parseInt(eleccion);
                    if (fig > nombreFiguras.length + 1 || fig <= 0) {
                        System.err.printf("Error: Opción fuera del rango (1 - %d), intente nuevamente.%n", nombreFiguras.length + 1);
                        continue;
                    } else if (fig == nombreFiguras.length + 1) {
                        System.out.println("Regresando al menú anterior...");
                        break;
                    }
                    System.out.println("Usted a elegido: " + nombreFiguras[fig - 1]);
                    do {
                        switch (fig) {
                            case 1 -> {
                                System.out.printf("Ingrese lado del %s:%n", nombreFiguras[fig - 1]);
                                valor = sc.nextLine().trim();
                                if (!valor.matches("\\d+(\\.\\d+)?") || valor.trim().isEmpty()) {
                                    System.err.println("Error: Entrada no válida, ingrese un número.");
                                    continue;
                                }
                                valores[0] = Double.parseDouble(valor);
                                if (valores[0] <= 0) {
                                    System.err.println("Error: El valor debe ser mayor a 0, intente nuevamente.");
                                    continue;
                                }
                                if (opc == 1) {
                                    System.out.printf("El área del %s es: %s%n", nombreFiguras[fig - 1], Math.pow(valores[0], 2));
                                } else {
                                    System.out.printf("El perímetro %s es: %s%n", nombreFiguras[fig - 1], valores[0] * 4);
                                }
                            }
                            case 2 -> {
                                for (count = 0; count < 2; count++) {
                                    while (true) { // Bucle para validar cada entrada.
                                        System.out.printf("Favor ingrese %s del %s:%n", (count == 0) ? "largo" : "ancho", nombreFiguras[fig - 1]);
                                        valor = sc.nextLine().trim();
                                        if (!valor.matches("\\d+(\\.\\d+)?") || valor.trim().isEmpty()) {
                                            System.err.println("Error: Entrada no válida, ingrese un número.");
                                            continue;
                                        } else if (valor.matches("0")) {
                                            System.err.println("Error: valor ingresado debe ser mayor a 0, intente nuevamente.");
                                            continue;
                                        }
                                        valores[count] = Double.parseDouble(valor);
                                        break; // Salir del bucle cuando se reciba entrada válida.
                                    }
                                }
                                if (opc == 1) {
                                    System.out.printf("El área del %s es: %s%n", nombreFiguras[fig - 1], valores[0] * valores[1]);
                                } else {
                                    System.out.printf("El perímetro del %s es: %s%n", nombreFiguras[fig - 1], 2 * (valores[0] + valores[1]));
                                }
                            }
                            case 3 -> {
                                if (opc == 1) {
                                    for (count = 0; count < 2; count++) {
                                        while (true) {
                                            System.out.printf("Favor ingrese %s del %s:%n", (count == 0) ? "base" : "altura", nombreFiguras[fig - 1]);
                                            valor = sc.nextLine().trim();
                                            if (!valor.matches("\\d+(\\.\\d+)?") || valor.trim().isEmpty()) {
                                                System.err.println("Error: Entrada no válida, ingrese un número.");
                                                continue;
                                            } else if (valor.matches("0")) {
                                                System.err.println("Error: valor ingresado debe ser mayor a 0, intente nuevamente.");
                                                continue;
                                            }
                                            valores[count] = Double.parseDouble(valor);
                                            break;
                                        }
                                    }
                                    System.out.printf("El área del %s es: %s", nombreFiguras[fig - 1], (valores[0] * valores[1]) / 2);
                                } else {
                                    for (count = 0; count < 3; count++) {
                                        while (true) {
                                            System.out.printf("Favor ingrese lado %s del %s:%n", count + 1, nombreFiguras[fig - 1]);
                                            valor = sc.nextLine().trim();
                                            if (!valor.matches("\\d+(\\.\\d+)?") || valor.trim().isEmpty()) {
                                                System.err.println("Error: Entrada no válida, ingrese un número.");
                                                continue;
                                            } else if (valor.matches("0")) {
                                                System.err.println("Error: valor ingresado debe ser mayor a 0, intente nuevamente.");
                                                continue;
                                            }
                                            valores[count] = Double.parseDouble(valor);
                                            break;
                                        }
                                    }
                                    System.out.printf("El perímetro del %s es: %s%n", nombreFiguras[fig - 1], valores[0] + valores[1] + valores[2]);
                                }
                            }
                            case 4 -> {
                                while (true) {
                                    System.out.printf("Favor ingrese el radio del %s:%n", nombreFiguras[fig - 1]);
                                    valor = sc.nextLine();
                                    if (!valor.matches("\\d+(\\.\\d+)?") || valor.trim().isEmpty()) {
                                        System.err.println("Error: Entrada no válida, ingrese un número.");
                                        continue;
                                    } else if (valor.matches("0")) {
                                        System.err.println("Error: valor ingresado debe ser mayor a 0, intente nuevamente.");
                                        continue;
                                    }
                                    valores[0] = Double.parseDouble(valor);
                                    break;
                                }
                                if (opc == 1) {
                                    System.out.printf("El área del %s es: %s", nombreFiguras[fig - 1], Math.PI * Math.pow(valores[0], 2));
                                } else {
                                    System.out.printf("El perímetro del %s es: %s", nombreFiguras[fig - 1], 2 * Math.PI * valores[0]);
                                }
                            }
                            case 5 -> {
                                if (opc == 1) {
                                    for (count = 0; count < 3; count++) {
                                        while (true) {
                                            System.out.printf("Ingrese base %s del %s:%n", (count == 0) ? "1" : (count == 1) ? "2" : "altura", nombreFiguras[fig - 1]);
                                            valor = sc.nextLine();
                                            if (!valor.matches("\\d+(\\.\\d+)?") || valor.trim().isEmpty()) {
                                                System.err.println("Error: Entrada no válida, ingrese un número.");
                                                continue;
                                            } else if (valor.matches("0")) {
                                                System.err.println("Error: valor ingresado debe ser mayor a 0, intente nuevamente.");
                                                continue;
                                            }
                                            valores[count] = Double.parseDouble(valor);
                                            break;
                                        }
                                    }
                                    System.out.printf("El área del %s es: %s", nombreFiguras[fig - 1], (valores[0] + valores[1]) / 2 * valores[2]);
                                } else {
                                    for (count = 0; count < 4; count++) {
                                        while (true) {
                                            System.out.printf("Favor ingrese longitud de%s del %s:%n", (count == 0) ? " la base menor" : (count == 1) ? " " + "la base mayor" : (count == 2) ? "l lado izquierdo" : "l lado derecho", nombreFiguras[fig - 1]);
                                            valor = sc.nextLine();
                                            if (!valor.matches("\\d+(\\.\\d+)?") || valor.trim().isEmpty()) {
                                                System.err.println("Error: Entrada no válida, ingrese un número.");
                                                continue;
                                            } else if (valor.matches("0")) {
                                                System.err.println("Error: valor ingresado debe ser mayor a 0, intente nuevamente.");
                                                continue;
                                            }
                                            valores[count] = Double.parseDouble(valor);
                                            break;
                                        }
                                    }
                                    System.out.printf("El perímetro del %s es: %s", nombreFiguras[fig - 1], (valores[0] + valores[1] + valores[2] + valores[3]));
                                }
                            }
                        }
                        return; // con el nivel de conocimiento actual considero prudente terminar el programa este punto.
                    } while (true);
                } while (true);
            } else {
                do {
                    conv = 1;
                    System.out.printf("Favor elija la %s a realizar:%n", opciones[opc - 1]);
                    for (String conversion : opcionConversiones) {
                        System.out.printf("%d. %s (", conv++, conversion);
                        count = 0; // Contador para iterar sobre los elementos
                        for (String simbolos : simbUnidades[conv - 2]) {
                            System.out.printf("%s", simbolos);
                            if (++count < simbUnidades[conv - 2].length) {
                                System.out.print(", "); // Agregar coma excepto en el último elemento
                            }
                        }
                        System.out.println(").");
                    }
                    System.out.printf("%d. Regresar al menú anterior.%n", conv);
                    eleccion = sc.nextLine();
                    if (eleccion.trim().isEmpty() || !eleccion.matches("-?\\d+")) {
                        System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                        continue;
                    }
                    conv = Integer.parseInt(eleccion);
                    if (conv > opcionConversiones.length + 1 || conv <= 0) {
                        System.err.printf("Error: Opción fuera del rango (1 - %d), intente nuevamente.%n", opcionConversiones.length + 1);
                        continue;
                    } else if (conv == opcionConversiones.length + 1) {
                        System.out.println("Regresando al menú anterior...");
                        break;
                    }
                    System.out.println("Usted a elegido : " + opcionConversiones[conv - 1]);
                    System.out.printf("Favor indique la unidad de %s a usar:%n", opcionConversiones[conv - 1]);
                    if (conv == 1 || conv == 2) {
                        do {
                            und = 1;
                            count = 0;
                            if (conv == 1) {
                                for (String longitud : nombreUnidades[conv - 1]) {
                                    // Muestra la opción de unidad con su símbolo correspondiente e incrementa el contador `und` y `count`.
                                    System.out.printf("%d. %s (%s).%n", und++, longitud, simbUnidades[conv - 1][count]);
                                    count++;
                                }
                            } else {
                                for (String area : nombreUnidades[conv - 2]) {
                                    if (!area.equals("Milímetro")) { // Filtro para omitir "milímetro"
                                        System.out.printf("%d. %s cuadrado (%s).%n", und++, area, simbUnidades[conv - 1][count]);
                                        count++;
                                    }
                                }
                            }
                            System.out.printf("%d. Regresar al menú anterior.%n", count + 1);
                            eleccion = sc.nextLine();
                            if (eleccion.trim().isEmpty() || !eleccion.matches("-?\\d+")) {
                                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                                continue;
                            }
                            und = Integer.parseInt(eleccion);
                            if (und > count + 1 || und <= 0) {
                                System.err.printf("Error: Opción fuera del rango (1 - %d), intente nuevamente.%n", count + 1);
                            } else if (und == count + 1) {
                                System.out.println("Regresando el menú anterior...");
                                break;
                            }
                        } while (true);
                    } else {
                        do {
                            und = 1;
                            count = 0;
                            for (String angulos : nombreUnidades[conv - 2]) {
                                System.out.printf("%d. %s (%s)%n", und++, angulos, simbUnidades[conv - 1][count]);
                                count++;
                            }
                            System.out.printf("%d. Regresar al menú anterior.%n", count + 1);
                            eleccion = sc.nextLine();
                            if (eleccion.trim().isEmpty() || !eleccion.matches("-?\\d+")) {
                                System.err.println("Error: Opción ingresada no válida, intente nuevamente.");
                                continue;
                            }
                            und = Integer.parseInt(eleccion);
                            if (und > count + 1 || und <= 0) {
                                System.err.printf("Error: Opción fuera del rango (1 - %d), intente nuevamente.%n", count + 1);
                            } else if (und == count + 1) {
                                System.out.println("Regresando el menú anterior...");
                                break;
                            }
                        } while (true);
                    }
                } while (true);
            }
        } while (true);
        sc.close();
    }
}