package Ejercicios.Primitivos;

import java.util.Scanner;

public class Factura {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cantidadProd = 0, iva = 19;
        String nombreProd, entrada;
        double precio = 0, totalIva, subTotal, totalConIva;

        do { // solicitará ingreso hasta que se reciba algún dato
            System.out.println("Bienvenido(a), favor ingrese el nombre de producto:");
            nombreProd = sc.nextLine().trim();
            if (nombreProd.isEmpty()) {
                System.err.println("El nombre no puede estar vacío, intente nuevamente.");
            }
        } while (nombreProd.isEmpty());

        do { // solicitará ingreso hasta que se reciba algún dato o este sea válido
            System.out.println("Favor ingrese cantidad comprada por el cliente:");
            entrada = sc.nextLine();
            if (entrada.isEmpty()) {
                System.err.println("La cantidad no puede estar vacía. Intente de nuevo.");
                continue;
            } else if (entrada.trim().isEmpty()) {
                System.err.println("La cantidad no es válida. Intente de nuevo.");
                continue;
            }
            cantidadProd = Integer.parseInt(entrada);
        } while (cantidadProd <= 0);

        do {
            System.out.println("Favor ingrese precio del producto:");
            entrada = sc.nextLine();
            if (entrada.isEmpty()) {
                System.err.println("La cantidad no puede estar vacía. Intente de nuevo.");
                continue;
            } else if (entrada.trim().isEmpty()) {
                System.err.println("el precio no es válido. Intente de nuevo.");
                continue;
            }
            precio = Double.parseDouble(entrada);
        } while (precio <= 0);

        subTotal = cantidadProd * precio;
        totalIva = subTotal * iva / 100;
        totalConIva = subTotal + totalIva;

        //Imprimir factura
        System.out.printf("\nFactura\nProducto: %s\nCantidad comprada: %d\nPrecio producto: $%.2f\n",nombreProd, cantidadProd, precio);
        System.out.printf("Subtotal: $%.2f\nIVA (19%%): $%.2f\nTotal Compra: $%.2f\n", subTotal, totalIva, totalConIva);

        sc.close();
    }
}
