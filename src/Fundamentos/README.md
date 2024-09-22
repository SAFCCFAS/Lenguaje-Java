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
   
|    **Primitivos**     | **Tamaño(bits)** |                     **Rango**                     |
|:---------------------:|:----------------:|:-------------------------------------------------:|
|  **Números Enteros**  |        -         |                         -                         |
|        `byte`         |        8         |                    -128 a 127                     |
|        `short`        |        16        |                 -32,768 a 32,767                  |
|         `int`         |        32        |          -2,147,483,648 a 2,147,483,647           |
|        `long`         |        64        |                   ±9 Trillones                    |
| **Números Decimales** |        -         |                         -                         |
|        `float`        |        32        |        Aproximadamente ±3.40282347 × 10^38        |
|       `double`        |        64        |   Aproximadamente ±1.79769313486231570 × 10^308   |
|    **De Objecto**     |        -         |                         -                         |
|       **Texto**       |        -         |                         -                         |
|       `String`        |     variable     | Usado para almacenar y manipular cadenas de texto |




|                          |                                                             |                                                                                  |                                                    |
|:------------------------:|:-----------------------------------------------------------:|:--------------------------------------------------------------------------------:|----------------------------------------------------|
|        **Arrays**        | Colecciones que almacenan múltiples valores del mismo tipo. |                       Pueden ser de cualquier tipo de dato                       |                                                    |
|        **Clases**        |   Plantillas para crear objetos con atributos y métodos.    |                                                                                  |
|      **Interfaces**      |        Contratos que las clases pueden implementar.         |            No pueden contener implementación, solo métodos abstractos            |
| **Enumeraciones** (enum) |                Conjunto fijo de constantes.                 |                 Facilita la definición de constantes con nombre                  |
| **7. Tipos Especiales**  |
|                          |                           **Var**                           |          Permite la inferencia de tipos locales (Java 10 en adelante).           | Uso en la declaración de variables                 |
|                          |                       **Anotaciones**                       |               Proporcionan información adicional sobre el código.                | Usadas para agregar metadatos                      |
|                          |                     **Tipos genéricos**                     | Permiten definir clases y métodos con tipos que se especificarán posteriormente. | Proporciona flexibilidad y reutilización de código |
   1. **Tipos de Datos Primitivos**:
   - `boolean`: Representa un valor verdadero o falso.
   - `char`: Almacena un único carácter.
   - `int`: Almacena un número entero.
   - `short`: Almacena un número entero más pequeño.
   - `byte`: Almacena un número entero muy pequeño.
   - `long`: Almacena un número entero grande.
   - `float`: Almacena un número decimal simple.
   - `double`: Almacena un número decimal doble.

   2. **Tipos de Datos No Primitivos** (o Tipos de Datos de Objeto):
   - `String`: Almacena cadenas de texto.
   - `Array`: Almacena una colección de elementos del mismo tipo.



## Referencias 
* [Documentación de Oracle: Getting Started - Hello World](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html)
   