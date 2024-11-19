package Fundamentos;

public class EstructurasDeControl {
    public static void main(String[] args) {
        // Estructura if-else
        int x = 10;
        if (x == 0) {
            System.out.println("x es cero");
        } else if (x % 2 == 0) {
            System.out.println("x es par");
        } else {
            System.out.println("x es impar");
        }

        // Estructura switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }

        // Bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("Recorrido for: " + i);
        }

        // Bucle while
        int y = 0;
        while (y < 5) {
            System.out.println("Recorrido while: " + y);
            y++;
        }

        // Bucle do-while
        int z = 5;
        do {
            System.out.println("Recorrido do-while: " + z);
            z--;
        } while (z > 0);

        // Uso de break y continue en bucles
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // Saltar la iteración cuando i es 3
            }
            if (i == 4) {
                break; // Detener el bucle cuando i es 4
            }
            System.out.println("Control de bucles: " + i);
        }
    }
}
