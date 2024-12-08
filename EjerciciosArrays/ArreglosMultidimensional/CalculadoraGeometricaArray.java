package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class CalculadoraGeometricaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] opciones = {"Calcular área", "Calcular Perímetro", "Conversión de unidades"};
        String[] nombreFiguras = {"Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Trapecio", "Rombo", "Polígono Regular", "Octágono"};
        String[] opcionConversiones = {"Longitud", "Área", "Ángulo"};
        String[][] nombreUnidades = {{"Kilómetro", "Metro", "Centímetro","Milímetro"}, {"Grados","Radianes"}};
        String[][] simbUnidades = {{"km", "m", "cm", "mm"}, {"km²", "m²", "cm²"}, {"°", "Rad"}};
        double[] valores = new double[4];
        String eleccion;
        int opc, fig, conv, count,und;

        do {
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
                    } else if (fig == nombreFiguras.length + 1) {
                        System.out.println("Regresando al menú anterior...");
                        break;
                    }
                } while (true);
            } else {
                do {
                    conv = 1;
                    System.out.printf("Favor elija la %s a realizar:%n", opciones[opc - 1]);
                    for (String conversion : opcionConversiones) {
                        System.out.printf("%d. %s (", conv++, conversion);
                        count=0;
                        for (String simbolos : simbUnidades[conv - 2]) {
                            System.out.printf("%s", simbolos);
                            if (++count<simbUnidades[conv-2].length){
                                System.out.print(", ");
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
                    System.out.println("Usted a elegido : "+opcionConversiones[conv-1]);
                    if (conv == 1||conv==2) {
                        do {
                            und=1;
                            System.out.printf("Favor indique la unidad de %s a usar:%n",opcionConversiones[conv-1]);
                            if (conv==1){
                                for (String[] nombre:nombreUnidades){
                                    System.out.printf("%d. %n",und++);
                                }
                            }
                            eleccion=sc.nextLine();
                            und=Integer.parseInt(eleccion);
                        } while (true);
                    }
                } while (true);
            }
        } while (true);
    }
}
