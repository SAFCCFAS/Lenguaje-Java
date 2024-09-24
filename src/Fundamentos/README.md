# Fundamentos de Java
Este `README.md` complementa los comentarios en el código y proporciona una visión general de los ejercicios y ejemplos 
básicos que cubren los fundamentos del lenguaje Java. Incluye información sobre la sintaxis básica, tipos de datos, 
variables, estructuras de control y otros conceptos esenciales.

### Contenido

**HolaMundo.java**:
   - Un programa simple que imprime `¡Hola, Mundo!` en la consola.
   - **Objetivo:** Introducir la estructura básica de un programa Java.

**TiposDeDatos.java**:
   - Ejemplos de los principales tipos de datos primitivos en Java.
   - **Objetivo**: Mostrar cómo se declaran y utilizan diferentes tipos de datos en Java, como 
   `int`, `double`, `char`, `boolean` y `String`.

### Tipos de Datos en Java

Java es un lenguaje de programación **estáticamente** y **fuertemente tipado**. Esto significa que cada tipo de 
dato (como entero, carácter, decimal, etc.) está predefinido como parte del lenguaje de programación, y todas las 
constantes o variables definidas para un programa dado deben describirse con uno de los tipos de datos de Java.

#### Clasificación de los Tipos de Datos
   Los tipos de datos en Java se dividen en dos categorías:
   
|      **Tipo de Dato**       |  **Tamaño(bits)**   |                                                      **Rango**                                                       |
|:---------------------------:|:-------------------:|:--------------------------------------------------------------------------------------------------------------------:|
|        **Primitivo**        |          -          |                                                          -                                                           |
|     **Números Enteros**     |          -          |                                                          -                                                           |
|           `byte`            |          8          |                                                      -128 a 127                                                      |
|           `short`           |         16          |                                                   -32,768 a 32,767                                                   |
|            `int`            |         32          |                                            -2,147,483,648 a 2,147,483,647                                            |
|           `long`            |         64          |                                                     ±9 Trillones                                                     |
|    **Números Decimales**    |          -          |                                                          -                                                           |
|           `float`           |         32          |                                         Aproximadamente ±3.40282347 × 10^38                                          |
|          `double`           |         64          |                                    Aproximadamente ±1.79769313486231570 × 10^308                                     |
|       **Caracteres**        |          -          |                                                          -                                                           |
|           `char`            |         16          |                                               `'\u0000'` a `'\uffff'`                                                |
|         **Lógico**          |          -          |                                                          -                                                           |
|          `boolean`          |          1          |                                                   `true` o `false`                                                   |
| **De Objecto o Referencia** |          -          |                                                          -                                                           |
|          **Texto**          |          -          |                                                          -                                                           |
|          `String`           |      variable       |                                  Usado para almacenar y manipular cadenas de texto                                   |
|         **Arrays**          |      variable       |                             Colecciones que almacenan múltiples valores del mismo tipo.                              |
|         **Clases**          |      variable       |                                Plantillas para crear objetos con atributos y métodos.                                |
|       **Interfaces**        |  Depende de la JVM  |                                    No tiene rango, define métodos a implementar.                                     |                   
|  **Enumeraciones** (enum)   |  Depende de la JVM  | Conjunto de constantes predefinidas que no se pueden modificar. Incluye solo los valores definidos al crear el enum. |



## Referencias 
* [Documentación de Oracle: Getting Started - Hello World](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html)
   