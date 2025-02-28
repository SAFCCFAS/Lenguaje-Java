package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, altura, imc;
		String entrada, clasificacion;
		boolean ingresoValido;

		while (true) {
			System.out.println("Bienvenido(a) a la calculadora de IMC, por favor ingrese su peso en kilogramos:");
			entrada = sc.nextLine();
			ingresoValido = !entrada.trim().isEmpty() && entrada.matches("\\d+(\\.\\d+)?");
			if (!ingresoValido || Double.parseDouble(entrada) <= 0) {
				System.out.println("Por favor ingrese un valor válido para el peso.");
				continue;
			}
			break;
		}
		peso = Double.parseDouble(entrada);
		while (true) {
			System.out.println("Por favor ingrese su altura en metros ó centímetros:");
			entrada = sc.nextLine();
			ingresoValido = !entrada.trim().isEmpty() && entrada.matches("\\d+(\\.\\d+)?");
			if (!ingresoValido || Double.parseDouble(entrada) <= 0) {
				System.out.println("Por favor ingrese un valor válido para la altura.");
				continue;
			}
			break;
		}
		altura = Double.parseDouble(entrada);
		sc.close();
		altura = altura < 10 ? altura : altura / 100;
		imc = peso / Math.pow(altura, 2);
		if (imc < 18.5) {
			clasificacion = "Bajo peso";
		} else if (imc < 24.9) {
			clasificacion = "Peso normal";
		} else if (imc < 29.9) {
			clasificacion = "Sobrepeso";
		} else {
			clasificacion = "Obesidad";
		}
		System.out.printf("Su IMC es %.2f y su clasificación actual es %s.\n", imc, clasificacion);
	}
}
