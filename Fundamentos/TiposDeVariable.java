package Fundamentos;

public class TiposDeVariable {
    /* Variable de instancia: puede ser usada por los objetos de la clase
    String nombre = Sebastian; -> Variable de instancia: puede ser usada por los objetos de la clase*/

    static String mensajeEstatico = "Hola!, bienvenido"; // Variable estática: compartida entre todas las instancias

    public static void main(String[] args) {
        String mensaje = mensajeEstatico; // Variable local: solo accesible dentro del método main.
        String persona = "Sebastian"; // otra variable local.

        System.out.println(mensaje+" "+persona); //mostrar en consola.

    }
}