package Ejercicios.EstructurasDeControl;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma, valor = 0, valor1 = 1;

        do { // Validar que el usuario introduzca un número mayor a 0
            System.out.println("Bienvenido(a), favor ingrese la cantidad de números a mostrar en la sucesión:");
            n = sc.nextInt();

            if (n == 0) {
                System.err.println("Error: el número debe ser mayor a 0, intente nuevamente.");
            }
        } while (n <= 0);

		// Manejar el caso de un solo término
		if (n == 1) {
			System.out.print("0"); // Imprime solo el primer número
		} else {
			System.out.print("0, 1");  // Imprime los dos primeros números
		}

		for (int i = 3; i <= n; i++) {
			suma = valor + valor1; // Calcular el siguiente número
			System.out.print(", " +suma);
			valor = valor1; // Actualizar el primer número
			valor1 = suma;  // Actualizar el segundo número
		}
        sc.close();
    }

}