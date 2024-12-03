package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class ConversionDeTemperaturaArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] unidades = {{"Celsius", "°C"}, {"Fahrenheit", "°F"}, {"Kelvin", "K"}};
        String[][] cambioUnidades = new String[unidades.length - 1][2];
        String eleccion;
        int opc, destino;
        double temperatura;
        double[][] conversiones = { // Definir el array de conversiones
                {1, 273.15},  // Celsius a Kelvin
                {9.0 / 5, 32},  // Celsius a Fahrenheit
                {5.0 / 9, -32},  // Fahrenheit a Celsius
                {5.0 / 9, 255.37}, // Fahrenheit a Kelvin
                {1, -273.15},  // Kelvin a Celsius
                {9.0 / 5, -459.67}  // Kelvin a Fahrenheit
        };
        do { //repetir el menú hasta recibir opción válida.
            opc = 1; // iniciar variable para el menú y reinicio.
            System.out.print("Bienvenido(a), favor escoja la unidad a convertir:");
            for (String[] unidad : unidades) {
                System.out.printf("%n%d. ", opc++);
                for (String und : unidad) {
                    System.out.printf("%s ", und);
                }
            }
            System.out.printf("%n%d. Salir%n", opc);
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty() || !eleccion.matches("\\d+")) { // en caso de entrada vacía.
                System.err.println("Error: Favor ingresar alguna de las opciones mostrada, intente nuevamente.");
                continue;
            }
            opc = Integer.parseInt(eleccion); // convertir cadena de texto a entero
            if (opc > unidades.length + 1 || opc <= 0) { // verífica que las opciones estén dentro del menú
                System.err.printf("Error: Opción fuera de rango (1 - %d), intente nuevamente.%n", unidades.length + 1);
            } else if (opc == unidades.length + 1) { // Opción para salir.
                System.out.println("Gracias por utilizar el programa. ¡Hasta luego!");
            } else {
                System.out.printf("Usted a elegido: %s (%s). ", unidades[opc - 1][0], unidades[opc - 1][1]);
            }
        } while (opc > unidades.length + 1 || opc <= 0 || !eleccion.matches("\\d+"));

        System.out.printf("%nFavor ingrese la temperatura en (%s) %n", unidades[opc - 1][1]);
        temperatura = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Usted ha ingresado: %.2f %s%n", temperatura, unidades[opc - 1][1]);

        do {
            //llenar el array con las unidades restantes.
            destino = 0;
            for (int i = 0; i < unidades.length; i++) {
                if (i != (opc - 1)) { // omitir la unidad de origen.
                    cambioUnidades[destino] = unidades[i];
                    destino++;
                }
            }

            System.out.println("Favor elija la unidad de destino: ");
            for (int i = 0; i < cambioUnidades.length; i++) {
                System.out.printf("%d. %s (%s)%n", i + 1, cambioUnidades[i][0], cambioUnidades[i][1]);
            }
            eleccion = sc.nextLine().trim();
            if (eleccion.trim().isEmpty() || !eleccion.matches("\\d+")) { // en caso de entrada vacía o no válida.
                System.err.println("Error: Favor ingresar alguna de las opciones mostrada, intente nuevamente.");
                continue;
            }
            destino = Integer.parseInt(eleccion);
            if (destino > cambioUnidades.length || destino <= 0) { // verífica que las opciones estén dentro del menú
                System.err.printf("Error: Opción fuera de rango (1 - %d), intente nuevamente.%n", cambioUnidades.length);
            } else {
                System.out.printf("Usted a elegido: %s (%s). ", cambioUnidades[destino - 1][0], cambioUnidades[destino - 1][1]);
            }
        } while (destino <= 0 || destino > cambioUnidades.length || !eleccion.matches("\\d+"));

        // Realizar la conversión usando las fórmulas definidas en el array
        int origenIndex = opc - 1;
        int destinoIndex = destino - 1;
        double factor = conversiones[origenIndex * 2 + destinoIndex][0];  // Factor de conversión
        double desplazamiento = conversiones[origenIndex * 2 + destinoIndex][1];  // Desplazamiento

        // Realizar la conversión y mostrar el resultado
        double resultado = temperatura * factor + desplazamiento;
        String unidadDestino = cambioUnidades[destino - 1][0];
        System.out.printf("La temperatura convertida es: %.2f %s%n", resultado, unidadDestino);

        sc.close();
    }
}
