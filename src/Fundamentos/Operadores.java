package Fundamentos;

public class Operadores {
    public static void main(String[] args) {
        //Declaración y asignación multiples
        int n1 = 12, n2 = 3;

        //operadores aritméticos
        int Suma = n1 + n2, Resta = n1 - n2, Multiplicacion = n1 * n2, Modulo = n1 % n2;
        float Division = n1 / n2; // También es válido el uso de la variable double

        // Operadores de incremento y decremento
        int incremento = ++n1; // Pre-incremento: incrementa antes de usar el valor; se usa sufijo en estructuras de control
        int decremento = --n2; // Pre-decremento: decrementa antes de usar el valor

        // Operadores relacionales
        boolean esMayor = n1 > n2; // ¿n1 es mayor que n2?
        boolean esMenor = n1 < n2; // ¿n1 es menor que n2?
        boolean esIgual = n1 == n2; // ¿n1 es igual a n2?


        System.out.println("Los número es operar son: " + n1 + " y " + n2 + ".");
        System.out.println("El resultado de Suma es: " + Suma + ".");
        System.out.println("El resultado de Resta es: " + Resta + ".");
        System.out.println("El resultado de Multiplicación es: " + Multiplicacion + ".");
        System.out.println("El resultado de División es: " + Division + ".");
        System.out.println("El resultado de Modulo es: " + Modulo + ".");
        System.out.println("Incremento del primer número: " + incremento + ".");
        System.out.println("Decremento del segundo número: " + decremento + ".");
        System.out.println("El primer número es mayor que el segundo: " + esMayor + ".");
        System.out.println("El primer número es menor que el segundo: " + esMenor + ".");
        System.out.println("el primer número es igual al segundo: " + esIgual + ".");


    }
}
