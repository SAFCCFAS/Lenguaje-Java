package Ejercicios;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner recibir = new Scanner(System.in);
        /* Genera un número aleatorio entre 0 y 99, lo asigna a 'random', y declara las variables 'num' e 'intentos'
        para almacenar el número ingresado por el usuario y el número de intentos.*/
        int random = (int) (Math.random() * 100), num, intentos = 0;
        do {
            intentos++;
            System.out.println("Por favor ingresa un número:");
            num = recibir.nextInt();
            if (random < num) {
                System.out.println("Un poco más bajo.");
            } else if (random > num) {
                System.out.println("Un poco más alto.");
            }
        } while (num != random);
        System.out.println("Felicidades, lo has conseguido en " + intentos + " intentos.");
        recibir.close();
    }
}
