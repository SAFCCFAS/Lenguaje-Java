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
   1. **Tipos de Datos Primitivos**: Son tipos básicos integrados en el lenguaje. Se usan para almacenar valores simples, como números, caracteres o booleanos.
   2. **Tipos de Datos No Primitivos** (o Tipos de Referencia): Estos se refieren a objetos y pueden ser clases, interfaces o arreglos.
   
|      **Tipo de Dato**       | **Tamaño(bits)**  |                            **Rango**                            |
|:---------------------------:|:-----------------:|:---------------------------------------------------------------:|
|        **Primitivo**        |         -         |                                -                                |
|     **Números Enteros**     |         -         |                                -                                |
|           `byte`            |         8         |                           -128 a 127                            |
|           `short`           |        16         |                        -32,768 a 32,767                         |
|            `int`            |        32         |                 -2,147,483,648 a 2,147,483,647                  |
|           `long`            |        64         |                          ±9 Trillones                           |
|    **Números Decimales**    |         -         |                                -                                |
|           `float`           |        32         |               Aproximadamente ±3.40282347 × 10^38               |
|          `double`           |        64         |          Aproximadamente ±1.79769313486231570 × 10^308          |
|       **Caracteres**        |         -         |                                -                                |
|           `char`            |        16         |                     `'\u0000'` a `'\uffff'`                     |
|         **Lógico**          |         -         |                                -                                |
|          `boolean`          |         1         |                        `true` o `false`                         |
| **De Objecto o Referencia** |         -         |                                -                                |
|          **Texto**          |         -         |                                -                                |
|          `String`           |     variable      |        Usado para almacenar y manipular cadenas de texto        |
|         **Arrays**          |     variable      |   Colecciones que almacenan múltiples valores del mismo tipo.   |
|         **Clases**          |     variable      |     Plantillas para crear objetos con atributos y métodos.      |
|       **Interfaces**        | Depende de la JVM |          No tiene rango, define métodos a implementar.          |                   
|  **Enumeraciones** (enum)   | Depende de la JVM | Conjunto de constantes predefinidas que no se pueden modificar. |

## Variables

**Variables.java**:
   - Un programa que muestra cómo declarar y utilizar variables en Java.
   - **Objetivo**: Ilustrar cómo se pueden almacenar y manipular diferentes tipos de datos en memoria.


Una **variable** en Java es el nombre que se le da a un espacio en memoria donde se va a almacenar un dato específico, como un número, texto o valor lógico. La variable actúa como una etiqueta que te permite referirte a ese dato y manipularlo dentro del programa.

Las variables se declaran de la siguiente manera:

`tipo` *nombreVariable;*

**Usos Especiales**

Si bien el ejemplo anterior muestra una declaración simple, las variables en Java se pueden definir de varias maneras. Por ejemplo:

   - Declaración simple: `int` num;
   - Declaración múltiple: `int` n1, n2, n3;

El tipo de declaración que elijas dependerá de tus preferencias o de la conveniencia para el código que estés desarrollando. La declaración múltiple puede ser útil cuando necesitas varias variables del mismo tipo, simplificando el código.

**Reglas para Nombrar Variables**

Al declarar variables en Java, es fundamental seguir ciertas reglas y convenciones para garantizar que el código sea claro, legible y fácil de mantener. A continuación, aquí te indican algunas reglas importantes que debes tener en cuenta al momento de nombrar una variable:

1. **Nombres Descriptivos**: Utiliza nombres que describan el     propósito de la variable. Por ejemplo, `edad` es más claro que `a`.

2. **Iniciar con una Letra**: Los nombres de las variables deben comenzar con una letra (a-z, A-Z) o un guion bajo (_). No pueden comenzar con un número.

3. **Sin Espacios**: No se permiten espacios en los nombres de las variables. Si necesitas separar palabras, puedes usar el estilo camelCase (por ejemplo, `numeroDeEstudiantes`) o guiones bajos (por ejemplo, `numero_de_estudiantes`).

4. **Palabras Reservadas**: No puedes usar palabras reservadas de Java (como `class`, `public`, `static`, etc.) como nombres de variables.

5. **Sensibilidad a Mayúsculas**: Los nombres de las variables son sensibles a las mayúsculas. Por ejemplo, `numero` y `Numero` se consideran dos variables diferentes.

6. **Convenciones de Nomenclatura**: Aunque no es obligatorio, es recomendable seguir las convenciones de nomenclatura de Java, como usar camelCase para variables y PascalCase para clases.

7. **Sin Caracteres Especiales**: Los nombres de las variables no deben contener caracteres especiales (como `@`, `#`, `-`, etc.) ni caracteres fuera del idioma inglés. Esto asegura que el código sea más legible y compatible con los estándares del lenguaje.





## Referencias 
* [Documentación de Oracle: Getting Started - Hello World](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html)
* [Documentación de Oracle: Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
* [Geeksforgeeks: Java Data Types](https://www.geeksforgeeks.org/data-types-in-java/)
* [Documentación de Oracle: Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
* [JavaPoint: Java Variables](https://www.javatpoint.com/java-variables)