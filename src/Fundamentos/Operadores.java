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

        // Operadores lógicos
        boolean esMayorYDistinto = (n1 > n2) && (n1 != n2);
        boolean esMayorODistinto = (n1 > n2) || (n1 != n2);
        boolean esMenorYDistinto = (n1 < n2) && (n1 != n2);
        boolean esMenorODistinto = (n1 < n2) || (n1 != n2);
        boolean noEsIgual = !(n1 == n2);

        // Operador condicional (ternario)
        String resultadoCondicional = (n1 > n2) ? "primer número es mayor que el segundo" : "primer número es menor que el segundo" ;

        // Operadores bit a bit
        int bitAnd = n1 & n2;
        int bitOr = n1 | n2;
        int bitXor = n1 ^ n2;
        int complemento = ~n1;

        // Operadores de desplazamiento (shift)
        int moverIzquierda = n1 << 2;
        int moverDerecha = n2 >> 1;
        int moverDerechaSinSigno = n2 >>> 1;

        // Operadores de asignación conpuesta
        int sumaCompuesta = 10;
        sumaCompuesta += 7;
        int multiplicacionCompuesta = 3;
        multiplicacionCompuesta *= 3;

        // Resultado de los operadores
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
        System.out.println("Primer número es mayor y distinto al segundo: "+esMayorYDistinto+ ".");
        System.out.println("Primer número es mayor o distinto al segundo: "+esMayorODistinto+ ".");
        System.out.println("Primer número es menor y distinto al segundo: "+esMenorYDistinto+ ".");
        System.out.println("Primer número es menor o distinto al segundo: "+esMenorODistinto+ ".");
        System.out.println("Primer número No es igual al segundo: " +noEsIgual+ ".");
        System.out.println("Resultado del operador tenario: " +resultadoCondicional+".");
        System.out.println("AND a nivel de bits: " + bitAnd + ".");
        System.out.println("OR a nivel de bits: " + bitOr + ".");
        System.out.println("XOR a nivel de bits: " + bitXor + ".");
        System.out.println("Complemento a nivel de bits: " + complemento + ".");
        System.out.println("Desplazamiento a la izquierda: " + moverIzquierda + ".");
        System.out.println("Desplazamiento a la derecha: " + moverDerecha + ".");
        System.out.println("Desplazamiento a la derecha sin signo: " + moverDerechaSinSigno + ".");
        System.out.println("Asignación compuesta (+=): " + sumaCompuesta + ".");
        System.out.println("Asignación compuesta (*=): " + multiplicacionCompuesta + ".");

    }
}
