# Fundamentos de Java
Este `README.md` complementa los comentarios en el código y proporciona una visión general de los ejercicios y ejemplos 
básicos que cubren los fundamentos del lenguaje Java. Incluye información sobre la sintaxis básica, tipos de datos, 
variables, estructuras de control y otros conceptos esenciales.

### Contenido

* [HolaMundo](#holamundojava)
* [Tipo de Datos en Java](#tipos-de-datos-en-java)
* [Variables](#variables)
* [Separadores](#Separadores)
* [Operadores](#Operadores)

#### **HolaMundo.java**:
   - Un programa simple que imprime `¡Hola, Mundo!` en la consola.
   - **Objetivo:** Introducir la estructura básica de un programa Java.

#### **TiposDeDatos.java**:
   - Ejemplos de los principales tipos de datos primitivos en Java.
   - **Objetivo**: Mostrar cómo se declaran y utilizan diferentes tipos de datos en Java, como 
   `int`, `double`, `char`, `boolean` y `String`.

### Tipos de Datos en Java

Java es un lenguaje de programación **estáticamente** y **fuertemente tipado**. Esto significa que cada tipo de 
dato (como entero, carácter, decimal, etc.) está predefinido como parte del lenguaje de programación, y todas las 
constantes o variables definidas para un programa dado deben describirse con uno de los tipos de datos de Java.

**Clasificación de los Tipos de Datos**

   Los tipos de datos en Java se dividen en dos categorías:
   1. **Tipos de Datos Primitivos**: Son tipos básicos integrados en el lenguaje. Se usan para almacenar valores 
      simples, como números, caracteres o booleanos.
   2. **Tipos de Datos No Primitivos** (o Tipos de Referencia): Estos se refieren a objetos y pueden ser clases, 
      interfaces o arreglos.
   
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

Una **variable** en Java es el nombre que se le da a un espacio en memoria donde se va a almacenar un dato específico, 
como un número, texto o valor lógico. La variable actúa como una etiqueta que te permite referirte a ese dato y 
manipularlo dentro del programa.

Las variables se declaran de la siguiente manera:

`tipo` *nombreVariable;*

**Usos Especiales**

Si bien el ejemplo anterior muestra una declaración simple, las variables en Java se pueden definir de varias maneras. 
Por ejemplo:

   - Declaración simple: `int` num;
   - Declaración múltiple: `int` n1, n2, n3;

El tipo de declaración que elijas dependerá de tus preferencias o de la conveniencia para el código que estés 
desarrollando. La declaración múltiple puede ser útil cuando necesitas varias variables del mismo tipo, simplificando 
el código.

**Reglas para Nombrar Variables**

Al declarar variables en Java, es fundamental seguir ciertas reglas y convenciones para garantizar que el código sea 
claro, legible y fácil de mantener. A continuación, aquí te indican algunas reglas importantes que debes tener en cuenta 
al momento de nombrar una variable:

1. **Nombres Descriptivos**: Utiliza nombres que describan el     propósito de la variable. Por ejemplo, `edad` 
   es más claro que `a`.

2. **Iniciar con una Letra**: Los nombres de las variables deben comenzar con una letra (a-z, A-Z) o un guion bajo (_). 
   No pueden comenzar con un número.

3. **Sin Espacios**: No se permiten espacios en los nombres de las variables. Si necesitas separar palabras, puedes usar 
   el estilo camelCase (por ejemplo, `numeroDeEstudiantes`) o guiones bajos (por ejemplo, `numero_de_estudiantes`).

4. **Palabras Reservadas**: No puedes usar palabras reservadas de Java (como `class`, `public`, `static`, etc.) como 
   nombres de variables.

5. **Sensibilidad a Mayúsculas**: Los nombres de las variables son sensibles a las mayúsculas. Por ejemplo, `numero` y 
   `Numero` se consideran dos variables diferentes.

6. **Convenciones de Nomenclatura**: Aunque no es obligatorio, es recomendable seguir las convenciones de nomenclatura 
   de Java, como usar camelCase para variables y PascalCase para clases.

7. **Sin Caracteres Especiales**: Los nombres de las variables no deben contener caracteres especiales (como `@`, `#`, 
   `-`, etc.) ni caracteres fuera del idioma inglés. Esto asegura que el código sea más legible y compatible con los 
   estándares del lenguaje.

**Importancia de las Reglas para Nombrar Variables**

Seguir estas reglas no es solo una cuestión de estilo, sino que garantiza que tu código sea comprensible tanto para ti 
como para otros programadores que lo lean. Además, algunas de estas reglas son requeridas por el lenguaje Java y no 
seguirlas generará errores de compilación. Elegir nombres claros y descriptivos para tus variables también facilita el 
mantenimiento del código y reduce errores lógicos, especialmente en proyectos más grandes.

**Asignación de variables**

La asignación es el proceso mediante el cual se le da un valor a una variable. En Java, esto se hace utilizando el 
operador de asignación `=`, que se usa para igualar la variable al valor deseado. Este proceso es fundamental porque 
permite que las variables almacenen datos que se pueden utilizar y manipular en el programa.

**Sintaxis de Asignación**

Después de declarar una variable, puedes asignarle un valor de la siguiente manera:
   *nombreVariable = valor;*

Ejemplo: si has declarado una variable entera llamada edad, puedes asignarle un valor de esta forma:

`int edad;` // Declaración

`edad = 25;` // Asignación

También puedes combinar la declaración y la asignación en una sola línea:

`int edad = 25;` // Declaración y Asignación

**Reglas para la Asignación**

1. **Tipo Compatible**: el valor asignado debe ser del mismo tipo que la variable. Por ejemplo, 
no puedes asignar un valor String a una variable int.
            
`int` numero = 10;  // Correcto: '10' es un literal entero.

`String` texto = "Hola";  // Correcto: "Hola" es una cadena de texto.

`int` numero = "Hola";  // Incorrecto: "Hola" no puede ser asignado a un 'int'.

   * **Importancia**: Esta regla ayuda a prevenir errores lógicos en el código, asegurando que las operaciones realizadas 
     con las variables sean válidas según su tipo.

2. **Valores Literales**: puedes asignar valores literales directamente, como números, caracteres o cadenas.

         char letra = 'A';  // Asignación de un carácter literal.
         boolean esVerdadero = true;  // Asignación de un valor booleano literal.
   * **Importancia**: Los literales son útiles para inicializar variables con valores conocidos en el momento de la 
     declaración.

3. **Valores por Defecto**: cuando declaras variables de tipo primitivo en el ámbito de una clase, Java les asigna 
   automáticamente un valor por defecto si no se les da uno explícitamente. Esto varía según el tipo de dato.
    Ejemplo:

       int contador; // Valor por defecto: 0
       boolean estado; // Valor por defecto: false
       char letra; // Valor por defecto: '\u0000' (carácter nulo)

   * **Importancia**: Los valores por defecto son útiles para evitar errores al usar variables no inicializadas. 
      Sin embargo, es buena práctica inicializar siempre las variables antes de usarlas.

4. **Expresiones**: puedes asignar el resultado de expresiones a una variable. Una expresión puede incluir operadores 
   aritméticos, lógicos o de comparación. 
   Ejemplo:
   
          int resultado = 5 + 10;  // Asignación del resultado de la suma.
          double promedio = (nota1 + nota2 + nota3) / 3;  // Asignación usando una expresión aritmética.

   * **Importancia**: Permite realizar cálculos y lógica en una sola línea de código, facilitando la manipulación de 
   datos.

5. **Asignación Múltiple**: puedes declarar y asignar valores a múltiples variables del mismo tipo en una sola línea, lo que 
   puede hacer que el código sea más limpio y conciso.
    Ejemplo:

       int a, b, c; // Declaración de múltiples variables.
       a = b = c = 5; // Asignación de un mismo valor a múltiples variables.

   * **Importancia**: Esta forma de asignación es útil cuando necesitas inicializar varias variables al mismo tiempo con
   el mismo valor, ahorrando espacio y mejorando la legibilidad.

6. **Asincronía y Cambios**: el valor de una variable puede cambiar durante la ejecución del programa. Puedes reasignar 
    un nuevo valor a la misma variable en cualquier momento, lo que permite la manipulación dinámica de datos.
    Ejemplo:

       int edad = 25; // Inicialmente asignado.
       edad = 30; // Reasignación del valor de la variable.

   * **Importancia**: Esta flexibilidad es fundamental para la programación, ya que permite ajustar los valores de las 
   variables en función de la lógica del programa y las interacciones del usuario.
     
7. **Uso de Operadores de Asignación Compuestos**: Java ofrece operadores de asignación compuestos que combinan una 
    operación aritmética con la asignación. Esto puede hacer que el código sea más conciso y legible.
    Ejemplo:

        int total = 10; // Inicialización.
        total += 5; // Equivalente a total = total + 5; total ahora es 15.

   * **Importancia**: Los operadores de asignación compuestos son útiles para simplificar expresiones en las que 
   necesitas modificar el valor de una variable en función de su valor actual.

**Uso de Comillas en Java**

-  **Comillas dobles** (`""`): En Java, las comillas dobles se utilizan para definir cadenas de texto (strings). 
   Un string es una secuencia de caracteres que puede incluir letras, números, espacios y otros símbolos.
   Ejemplo:

       String saludo = "¡Hola, Mundo!"; // 'saludo' es una variable de tipo String que contiene una cadena.

    * **Importancia**: El uso de comillas dobles es necesario para que el compilador reconozca que se está creando un 
      objeto de tipo String. Sin las comillas dobles, el compilador no interpretaría correctamente la secuencia de 
      caracteres como una cadena de texto.

- **Comillas simples** (`''`): Las comillas simples se utilizan para definir un solo carácter (char). Un char es un tipo 
  de dato que representa un único carácter, como una letra, un número o un símbolo.
  Ejemplo:
      
      char letra = 'A'; // 'letra' es una variable de tipo char que contiene un solo carácter.
  
  * **Importancia**: Las comillas simples son necesarias para indicar que se está trabajando con un carácter único. 
      Si se usan comillas dobles en lugar de simples, el compilador intentará interpretar la entrada como una cadena de 
      texto, lo que generará un error de tipo.

- **Números**: Los números en Java, ya sean enteros (int, long, etc.) o decimales (float, double), se representan 
  directamente como valores numéricos sin comillas. Esto se debe a que son tipos de datos primitivos y no necesitan ser 
  encapsulados para ser utilizados en cálculos o asignaciones.
  Ejemplo:

        int numero = 10; // 'numero' es una variable de tipo int que contiene un valor numérico.
        double pi = 3.14; // 'pi' es una variable de tipo double que contiene un valor decimal.

  * **Importancia**: Al no usar comillas para los números, el compilador puede reconocer y operar con ellos 
      directamente. Si se colocaran entre comillas, serían interpretados como cadenas de texto, lo que impediría 
      realizar operaciones matemáticas.

**Resumen**

* Comillas dobles (`""`): Para cadenas de texto (String).
* Comillas simples (`''`): Para caracteres individuales (char).
* Números: Se representan sin comillas, ya que son valores numéricos (enteros o decimales).

**Tipos de Variables en Java**

En Java, existen tres tipos principales de variables que se utilizan para almacenar datos:

* **Variables de Instancia (Non-Static Fields)**: Estas son variables declaradas dentro de una clase, pero fuera de 
    cualquier método, constructor o bloque. No llevan la palabra clave static.

    **Características**:
        Su valor es específico para cada instancia (objeto) de la clase, lo que significa que cada objeto puede tener un
        estado diferente.
        Se crean cuando se instancia un objeto de la clase y se destruyen cuando el objeto se destruye.
        La inicialización no es obligatoria; el valor por defecto depende del tipo de datos 
        (por ejemplo, null para String, 0 para int).


* **Variables de Clase (Static Fields)**: Se declaran de manera similar a las variables de instancia, pero llevan la 
    palabra clave static.
    
    **Características**:
        Hay una única copia de esta variable compartida entre todas las instancias de la clase, lo que significa que su 
        valor es el mismo para todos los objetos.
        Se crean cuando la clase se carga en memoria y se destruyen al final de la ejecución del programa.
        La inicialización no es obligatoria; también tiene valores por defecto según el tipo de datos.


* **Variables Locales**: Son variables que se declaran dentro de un método, constructor o bloque. No tienen una palabra 
    clave especial; su ámbito se define por su ubicación.

    **Características**:
        Son accesibles solo dentro del método donde se declaran y no desde otras partes de la clase.
        Se crean en el momento de la declaración y se destruyen cuando se sale del bloque de código.
        La inicialización es obligatoria antes de usarlas.

**Parámetros**

Además de estos tipos, los parámetros también son considerados variables, pero se utilizan para pasar datos a métodos y 
constructores. Al igual que las variables locales, su ámbito es limitado al método donde se declaran.

**Diferencias Clave**:
* Alcance:
  * Local: dentro de un método. 
  * Instancia: dentro de la clase. 
  * Estática: dentro de la clase.

* Duración:
  * Local: vida corta, solo en la ejecución del método. 
  * Instancia: vida del objeto.
  * Estática: vida del programa.

* Acceso:
  * Local: solo en el método.
  * Instancia: requiere un objeto.
  * Estática: puede ser accedida directamente desde la clase.

## Separadores

En Java, los separadores (o puntuadores) son símbolos especiales utilizados para delimitar estructuras y organizar el 
código. Estos símbolos, formados por caracteres ASCII, ayudan a definir la sintaxis básica del lenguaje, separando 
bloques, parámetros y elementos en las expresiones.

| Separador |                         Uso común                         |
|:---------:|:---------------------------------------------------------:|
|    ( )    |  Definir listas de parámetros en métodos y expresiones.   |
|    { }    |    Delimitar bloques de código, como clases y métodos.    |
|    [ ]    |          Definir y acceder a arreglos (arrays).           |
|     ;     |               Terminar sentencias de código               |
|     ,     |  Separar elementos en listas de parámetros o variables.   |
|     .     |         Acceder a métodos y atributos de objetos.         |
|    ...    |      Indicar parámetros varargs (varios parámetros).      |
|     @     |                   Usado en anotaciones.                   |
|    ::     | Referencia a métodos o constructores (method references). |

## Operadores

Los operadores en Java son símbolos que indican que se debe realizar una operación específica entre uno o más operandos 
(valores, variables, expresiones). Estos operadores permiten realizar cálculos matemáticos, operaciones lógicas y de 
asignación, manipulación de bits, entre otros. Existen 38 operadores en Java, formados por caracteres ASCII.

* **Clasificación de Operadores en Java**
  * **Operadores Aritméticos**: Permiten realizar operaciones matemáticas básicas. 
  * **Operadores Lógicos y Relacionales**: Ayudan a comparar valores y controlar el flujo del programa mediante decisiones 
    lógicas. 
  * **Operadores de Asignación**: Usados para asignar valores a variables. 
  * **Operadores Unarios**: Operan sobre un solo operando. 
  * **Operadores Bit a Bit**: Trabajan a nivel de bits sobre valores enteros. 
  * **Operadores de Shift (Desplazamiento)**: Desplazan bits a la izquierda o derecha.

|         Categoría          |             Operador             |                               Descripción                                |               Ejemplo                |
|:--------------------------:|:--------------------------------:|:------------------------------------------------------------------------:|:------------------------------------:|
|       **Asignación**       |               `=`                |                     Asigna un valor a una variable.                      |             `int x = 5;`             |
|      **Aritméticos**       |         `+, -, *, /, %`          | Suma, resta, multiplicación, división, y módulo (resto de la división).  |          `int sum = a + b;`          |
| **Incremento/Decremento**  |            `++`, `--`            |          Incrementa o decrementa en 1 el valor de una variable.          | `x++;` (postfijo) o `--y;` (prefijo) |
|      **Relacionales**      | `==`, `!=`, `>`, `<`, `>=`, `<=` |                          Comparan dos valores.                           |            `if (a == b)`             |    
|        **Lógicos**         |         `&&`, `\|\|`,`!`         |                          AND, OR y NOT lógicos.                          |            `if (x && y)`             |
|      **Condicional**       |              `? :`               |                Operador ternario para decisiones cortas.                 |    `resultado = (a > b) ? x : y;`    |
|       **Bit a Bit**        |        `&`, `\|`,`^`, `~`        |         Operadores lógicos a nivel de bits (AND, OR, XOR, NOT).          |           `int z = a & b;`           |        
| **Shift (Desplazamiento)** |        `<<`, `>>`, `>>>`         |                 Desplazan bits a la izquierda o derecha.                 |          `int z = x << 2;`           |        
|  **Asignación Compuesta**  |    `+=`,`-=`,`*=`, `/=`, `%=`    |              Combina operadores aritméticos con asignación.              |              `a += 5;`               |


## Referencias 
* [Documentación de Oracle: Getting Started - Hello World](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html)
* [Documentación de Oracle: Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
* [Geeksforgeeks: Java Data Types](https://www.geeksforgeeks.org/data-types-in-java/)
* [Documentación de Oracle: Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
* [JavaPoint: Java Variables](https://www.javatpoint.com/java-variables)
* [Java Language Specification (JLS): Chapter 3. Lexical Structure](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.10)
* [The Java™ Tutorials: Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
[Java Language Specification (JLS): Chapter 3. Separators](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.11)
* [Java Language Specification (JLS): Chapter 3. Operators](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.12)
* [The Java™ Tutorials: Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)