package Ejercicios;

import java.util.Scanner;

public class BuscarMaxMin {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n, min, max, cantidad;

		do {
			System.out.println("Ingrese la cantidad de números enteros a comparar (debe ser mayor que cero):");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);

		// Lee el primer número para iniciar min y max
		System.out.println("Ingrese número 1: ");
		n = sc.nextInt();
		min = n;
		max = n;
		for (int i = 2; i <= cantidad; i++) { // Continuamos con el ciclo para los siguientes números
			System.out.println("Ingrese número " + i);
			n = sc.nextInt();

			// Actualiza min y max si el nuevo número es menor o mayor
			if (n < min) {
				min = n;
			}
			if (n > max) {
				max = n;
			}
		}
		// Muestra los resultados
		System.out.println("El número mínimo es: " + min);
		System.out.println("El número máximo es: " + max);
		sc.close();
	}
}
