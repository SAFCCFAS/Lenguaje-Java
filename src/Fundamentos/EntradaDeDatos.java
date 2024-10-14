package Fundamentos;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Favor ingresa tu nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Gracias, bienvenido(a): " + nombre + " tienes " + edad + " años!");
        entrada.close();
    }
}