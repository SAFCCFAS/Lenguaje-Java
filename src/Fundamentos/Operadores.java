package Fundamentos;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 12, n2 = 3;
        //Declaración multiple y asignación
        int Suma = n1 + n2, Resta = n1 - n2, Multiplicacion = n1 * n2, Modulo = n1 % n2;
        float Division = n1 / n2; // También es válido el uso de la variable double


        System.out.println("Los número es operar son: " +n1+ " y " +n2+".");
        System.out.println("El resultado de Suma es: " + Suma + ".");
        System.out.println("El resultado de Resta es: " + Resta + ".");
        System.out.println("El resultado de Multiplicación es: " + Multiplicacion + ".");
        System.out.println("El resultado de División es: " + Division + ".");
        System.out.println("El resultado de Modulo es: " + Modulo + ".");
    }
}
