package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class ConversionDeTemperaturaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] unidades = {{"Celsius", "°C"}, {"Fahrenheit", "°F"}, {"Kelvin", "K"}};
        String eleccion;
        int opc;

        do { //repetir el menú hasta recibir opción válida
            opc = 1;
            System.out.print("Bienvenido(a), favor escoja la unidad a convertir:");
            for (String[] unidad : unidades) {
                System.out.printf("%n%d. ", opc++);
                for (String und : unidad) {
                    System.out.printf("%s ", und);
                }
            }
            System.out.println();
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty()||!eleccion.matches("\\d+")) { // en caso de entrada vacía
                System.err.println("Error: Favor ingresar alguna de las opciones mostrada, intente nuevamente.");
                continue;
            }
            opc = Integer.parseInt(eleccion); // convertir cadena de texto a entero
            if (opc > unidades.length || opc <= 0) { // verífica que las opciones estén dentro del menú
                System.err.printf("Error: Opción fuera de rango (1 - %d), intente nuevamente.%n", unidades.length);
            }
        } while (opc > unidades.length || opc <= 0);

        sc.close();
    }
}
