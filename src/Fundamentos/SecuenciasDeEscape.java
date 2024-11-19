package Fundamentos;

public class SecuenciasDeEscape {
    public static void main(String[] args) {
        // Ejemplo salto de linea
        System.out.println("Este es un mensaje\nque ocupa varias lineas.");

        // Ejemplo tabulación
        System.out.println("Nombre\tEdad\tCiudad");
        System.out.println("Sebastian\t29\tSoledad");

        // Ejemplo comillas en cadenas
        System.out.println("Yo le dije: \"Hola, ¡te ves genial!\"");
        System.out.println("El carácter de comilla simple es: \'");

        // Ejemplo de retroceso (borrado)
        System.out.println("Palabra antes del retroceso\bPalabra después.");

        // Ejemplo de uso de Unicode
        System.out.println("El símbolo de yen es: \u00A5");

        // Ejemplo de espacio, concatenación y tabulación
        System.out.println("Espacio: " + "abc" + "\t" + "xyz");

    }
}
