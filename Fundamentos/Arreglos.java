package Fundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arreglos {
    public static void main(String[] args) {
        // Sección 1: Declaración y creación de arreglos
        int[] numeros; // Declaración de arreglo.

        numeros = new int[6]; // Creación de arreglo de tamaño 6

        // Inicialización con valores
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        System.out.println("Arreglo de enteros creado y con valores:");
        // Imprimir arreglo
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Sección 2: Inicialización con valores predeterminados
        // Arreglo de enteros con inicialización explícita
        int[] numerosIniciados = {10, 20, 30, 40, 50};
        System.out.println("\nArreglo con valores predeterminados:");
        // Imprimir el arreglo
        for (int element : numerosIniciados) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Sección 3: Accediendo a los elementos de un arreglo
        int tercerNumero = numerosIniciados[2];
        System.out.println("\nEl tercer número del arreglo es: " + tercerNumero);

        // Sección 4: Moverse a través de un arreglo
        System.out.println("\nMoverse sobre el arreglo 'numerosIniciados' con un ciclo for:");
        for (int element : numerosIniciados) {
            System.out.print(element+"\t");
        }

        System.out.println("\nMoverse sobre el arreglo 'numerosIniciados' con un ciclo for mejorado:");
        for (int numero : numerosIniciados) {
            System.out.print(numero+"\t");
        }

        // Sección 5: Modificando el arreglo directamente en el main
        System.out.println("\nModificando el arreglo 'numerosIniciados' directamente en el main:");
        numerosIniciados[0] = 999;
        numerosIniciados[1] = 888;
        for (int element : numerosIniciados) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Sección 6: Arreglos Multidimensionales
        System.out.println("\nArreglo bidimensional (matriz) de 2x3:");
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Sección 7: clases arrays.
        // sort() - Ordenar un arreglo.
        int[] numerosParaOrdenar = {5, 2, 9, 1, 7};
        System.out.println("Arreglo original:");
        for (int num : numerosParaOrdenar) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(numerosParaOrdenar); // Ordenando el arreglo
        System.out.println("Arreglo ordenado:");
        for (int num : numerosParaOrdenar) {
            System.out.print(num + " ");
        }
        System.out.println();

        // binarySearch() - Buscar un elemento en un arreglo ordenado
        int index = Arrays.binarySearch(numerosParaOrdenar, 7); // Buscando el número 7
        if (index >= 0) {
            System.out.println("El índice de 7 en el arreglo es: " + index);
        } else {
            System.out.println("El número 7 no se encontró en el arreglo.");
        }

        // equals() - Comparar si dos arreglos son iguales
        int[] numerosComparar = {1, 2, 5, 7, 9}; // Un arreglo similar al ordenado
        boolean sonIguales = Arrays.equals(numerosParaOrdenar, numerosComparar);
        System.out.println("¿Los arreglos 'numerosParaOrdenar' y 'numerosComparar' son iguales? " + sonIguales);
        System.out.println();

        // fill() - Llenar un arreglo con un valor específico
        int[] arregloLleno = new int[5];
        Arrays.fill(arregloLleno, 42); // Llenando el arreglo con el valor 42
        System.out.println("Arreglo lleno con 42:");
        for (int num : arregloLleno) {
            System.out.print(num + " ");
        }
        System.out.println();

        // asList() - Convertir un arreglo a una lista
        String[] nombres = {"Ana", "Luis", "Carlos"};
        List<String> listaNombres = Arrays.asList(nombres);
        System.out.println("\nLista creada a partir del arreglo:");
        System.out.println(listaNombres);

        // Ejemplos de la clase ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("María");
        lista.add("Pedro");
        System.out.println("\nArrayList de objetos String:");
        for (String nombre : lista) {
            System.out.print(nombre + " ");
        }
        System.out.println();

        // Modificar el ArrayList
        lista.set(1, "Sofía"); // Cambia el segundo elemento
        System.out.println("ArrayList modificado:");
        for (String nombre : lista) {
            System.out.print(nombre + " ");
        }
        System.out.println();

        // Eliminar un elemento
        lista.remove("Juan");
        System.out.println("ArrayList después de eliminar 'Juan':");
        for (String nombre : lista) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}
