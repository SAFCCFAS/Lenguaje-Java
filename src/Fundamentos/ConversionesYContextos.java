package Fundamentos;

public class ConversionesYContextos {
    public static void main(String[] args) {
        String numeroCadena = "100";
        String numeroCadena1 = "2";
        //conversión a tipo int
        int n1 = Integer.parseInt(numeroCadena);
        int n2 = Integer.parseInt(numeroCadena1);

        int suma = n1 + n2;

        System.out.println(suma);

        double decimal = n1; //conversión a decimal
        System.out.println(decimal);

        char caracter = numeroCadena1.charAt(0); // conversión a tipo char desde un String
        System.out.println("El carácter es: " + caracter);

        char letra = (char)n1; // conversión a tipo char desde un int
        System.out.println(letra);
    }
}
