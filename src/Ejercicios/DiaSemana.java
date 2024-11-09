package Ejercicios;

import java.util.Scanner;

public class DiaSemana {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        String dia = "";

        do {
            System.out.println("Bienvenido(a), favor ingrese un número de 1 al 7 a continuación:");
            n = sc.nextInt();
            switch (n) {
                case 1 -> dia = "Lunes";
                case 2 -> dia = "Martes";
                case 3 -> dia = "Miércoles";
                case 4 -> dia = "Jueves";
                case 5 -> dia = "Viernes";
                case 6 -> dia = "Sábado";
                case 7 -> dia = "Domingo";
                default -> System.err.println("Error: Opción o ingreso no valido, intente nuevamente.");
            }
            if (n >= 1 && n <= 7) {
                System.out.println("El día de la semana es " + dia);
                break;
            }
        } while (true);
        sc.close();
    }
}