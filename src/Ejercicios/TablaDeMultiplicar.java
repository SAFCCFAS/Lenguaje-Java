package Ejercicios;

import java.util.Scanner;

public class TablaDeMultiplicar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, resultado;
        System.out.println("Bienvenido(a), favor ingrese un número entero positivo para mostrar la tabla de multiplicar:");
        n = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            resultado = i * n;
            System.out.println(n + " x " + i + " = " + resultado);
        }
        sc.close();
    }
}
