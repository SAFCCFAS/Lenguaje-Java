# Lenguaje Java  <img src="java.ico" width="60"/>

___
Este repositorio es el resultado de mi viaje de aprendizaje en **Java** de forma independiente, un lenguaje de programación poderoso y versátil
utilizado en una amplia gama de aplicaciones, desde el desarrollo web hasta la creación de aplicaciones móviles y software empresarial.

Decidí aprender Java debido a su popularidad en la industria y su sólida comunidad de soporte. Actualmente, me encuentro en las etapas iniciales
de mi aprendizaje, explorando conceptos básicos y fundamentales. A lo largo de este proceso, he trabajado en diversos ejemplos y ejercicios prácticos
que abarcan desde los conceptos más sencillos hasta aquellos que son esenciales para comprender el lenguaje.

Mi objetivo con este repositorio es crear un recurso que no solo me ayude a repasar lo aprendido, sino que también pueda ser útil para otros que
estén interesados en comenzar su propia aventura con Java. Espero que estos ejemplos sean de ayuda y que sirvan como punto de partida para quienes
buscan aprender y practicar sus habilidades en este lenguaje.

Está organizado por temas para facilitar la práctica de diferentes conceptos clave del lenguaje.

## Instrucciones de Uso

Para compilar y ejecutar los ejemplos de Java en este repositorio, sigue estos pasos:

### Requisitos Previos

- Asegúrate de tener instalado Java en tu máquina. Puedes verificar esto ejecutando el siguiente comando en la terminal:
  
  ```bash
  java -version
  ```

Si no tienes Java instalado, puedes descargarlo e instalarlo desde la página oficial de Oracle o desde OpenJDK.

- [Página oficial de Oracle](https://www.oracle.com/java/technologies/javase-downloads.html)
- [OpenJDK](https://openjdk.java.net/)

### Compilación y Ejecución

1. **Clona el repositorio** en tu máquina local utilizando Git:

```bash
git clone https://github.com/SAFCCFAS/Lenguaje-Java.git
```

2. **Navega a la carpeta del proyecto**:

```bash
cd Lenguaje-Java
```

3. **Compila el archivo Java** que deseas ejecutar. Por ejemplo, para compilar `HolaMundo.java`

```bash
javac Fundamentos/HolaMundo.java
```

4. **Ejecuta el programa compilado**:

```bash
java HolaMundo
```

### Estructura del repositorio

La estructura está organizada en carpetas temáticas que agrupan los ejemplos según el concepto de Java que cubren.

- 📚 **Fundamentos/**: Compendio de algunos fundamentos basicos pero importantes de Java.
- 📚 **Ejercicios/**: Esta carpeta contendrá ejercicios prácticos para reforzar los conceptos aprendidos ordenados en subcarpetas correspondiente al
  tema:
	- **Cadenas**/:Carpeta dedicada a la manipulación de cadenas en Java, con ejemplos de operaciones como concatenación, subcadenas, longitud, etc.
	- **Calculadoras**/: Contiene programas con diferentes tipos de calculadoras, desde las más básicas hasta las más complejas, que incluyen
	  operaciones como potencia y raíz cuadrada.
	- **Conversiones**/: Carpeta dedicada a la conversión de tipos de datos en Java. Ejemplos incluyen conversiones entre `int`, `double`, `String` y
	  otros tipos.
	- **Primitivos**/: Ejemplos de tipos primitivos en Java, como  `int`, `long`, `float`, `double` y `boolean`.
	- **EstructurasDeControl**/: Contiene ejemplos de estructuras de control como condicionales (`if`, `switch`) y bucles (`for`, `while`).
- 📚 **EjerciciosArrays/**: Esta carpeta contiene ejercicios prácticos diseñados para reforzar los conceptos aprendidos sobre arrays. Los ejercicios
  están organizados en subcarpetas según los temas específicos.

**Descripción de carpetas y ejemplos**

1. **Fundamentos**: Aquí se encuentran los programas más básicos de Java, como "Hola Mundo", variables, tipos de datos, operadores y entre otros.

**Archivos incluidos:**

- `HolaMundo.java`: Primer programa que imprime "¡Hola, Mundo!".
- `TiposDeDatos.java`: Ejemplos de tipo de datos.
- `Variables.java`: Ejemplos de variables.
- `Operadores.java`: Uso de operadores aritméticos, relacionales y lógicos.
- `SecuenciasDeEscape.java`: Uso de las distintas secuencias de escape
- `ConversionesYContextos.java`: Ejemplos que ilustran cómo se pueden convertir entre diferentes tipos de datos en Java.
- `EstructurasDeControl.java`: Ejemplos de las estructuras de control en Java, que permiten modificar el flujo de ejecución del programa a través de
  decisiones y repeticiones.
- `EntradaDeDatos.java`: Ejemplo de ingreso de datos al programa en Java mediante el uso de la clase `Scanner`.
- `Arreglos.java`: programa con ejemplos de los diferentes arreglos y sus usos.

2. **Ejercicios**: Esta carpeta contendrá ejercicios prácticos para reforzar los conceptos aprendidos.

**Archivos incluidos:**

- `SumarEnteros.java`: Programa básico donde se solicita números a sumar al usuario.
- `ConversionDeTemperatura.java`: Programa que permite al usuario convertir temperaturas entre Celsius (°C), Fahrenheit (°F) y Kelvin (K). El usuario
  elige la unidad de entrada, ingresa la temperatura y selecciona la unidad de conversión.
- `AdivinaNumero.java`: Programa que genera un número aleatorio entre 1 y 100, y solícita al usuario que lo adivine. El programa debe indicar si el
  número ingresado es alto o bajo que el número secreto hasta que el usuario acierte.
- `ContadorDeDigitos.java`: Programa que pide un número entero positivo al usuario y cuenta la cantidad de dígitos que tiene.
- `Calculadora Geométrica`: Aplicación de consola que calcula el área y/o perímetro de figuras geométricas planas, incluyendo cuadrados, rectángulos,
  triángulos, círculos, trapecios, rombos, polígonos regulares y octágono.
- `FizzBuzz.java`: Programa que imprime números del 1 al 100, reemplazando múltiplos de 3 con "Fizz", múltiplos de 5 con "Buzz" y múltiplos de ambos
  con "FizzBuzz".
- `BuscarMaxMin.java`: Programa que solícita al usuario ingresar una cantidad definida de números enteros y determina el valor mínimo y máximo de los
  números ingresados.
- `FactorialNumero.java`: Programa que calcula el factorial de un número entero positivo ingresado por el usuario. Solicita un número y muestra el
  resultado del factorial.
- `Promedio.java`: Programa que solicita al usuario 5 números enteros para hallar el promedio de la cantidad ingresada.
- `TransformarCadena.java`: Programa que solicita al usuario una palabra o frase para pasar mayúscula y minúscula.
- `ContarCaracteres.java`: Programa que solicita al usuario una palabra o frase para contar la cantidad de caracteres que posee.
- `ParidadNUmerica.java`: Programa que solicita al usuario un número entero positivo para determinar si es par o impar.
- `DiaSemana.java`: Programa que solicita al usuario un número del 1 al 7 para mostrar el día de la semana correspondiente.
- `ClasificarEdad.java`: Programa que solicita al usuario su edad para indicar en que clasificación se encuentra.
- `TablaDeMultiplicar.java`: Programa que solicita al usuario un número entero positivo para mostrar su correspondiente tabla de multiplicar.
- `NumerosPrimos.java`: Programa que solicita al usuario un número entero para determinar si es primo o no.
- `Factura.java`: Programa donde se imprime una factura básica de compra con la información solicitada.
- `Fibonacci.java`: Programa que genera e imprime la sucesión de Fibonacci hasta el número de términos indicado por el usuario, validando que sea
  mayor a 0.
- `CalculadoraIMC.java`: Programa que realiza calculo del indice de masa corporal (IMC), según los datos solicitados al usuario y su clasificación 
  correspondiente.

> 1. **Ejercicios_v1**: programas comentados para usuarios que recién ingresados al lenguaje facilitando la lectura.
> 2. **Ejercicios_v2**: programas poco comentados para usuarios con conocimientos en la estructura del lenguaje.

- `CalculadoraBasica_v1.java` / `CalculadoraBasica_v2.java`: Calculadora con operaciones básicas (suma, resta, multiplicación, división).
- `CalculadoraAvanzada_v1.java` / `CalculadoraAvanzada_v2.java`: Calculadora avanzada que incluye más operaciones como potencia y raíz cuadrada.
- `Calculadora Geométrica_v1.java` / `Calculadora Geométrica_v1.java`: Aplicación de consola que calcula el área y/o perímetro de figuras geométricas
  planas, incluyendo cuadrados, rectángulos, triángulos, círculos, trapecios, rombos, polígonos regulares y octágono.
- `ConversionDeTiempo_v1.java`/`ConversionDeTiempo_v2.java`: Programa que pide una unidad de tiempo y un valor al usuario y devuelve las equivalencias
  en otras unidades de tiempo.

3. **EjerciciosArray**: Esta carpeta contendrá ejercicios prácticos para reforzar los conceptos aprendidos en los arrays o arreglos.

**Archivos incluidos:**

- `SumarElementosArray.java`: Solicita al usuario que ingrese el tamaño y los elementos de un array de números enteros, luego suma todos los elementos
  del array e imprime el resultado.
- `CalculadoraBasicaArray.java`: Versión de calculadora básica con uso de array.
- `CalculadoraAvanzadaArray.java`: Versión de calculadora avanzada con uso de array.
- `ConversionDeTemperaturaArray.java`: Versión de conversión de temperaturas con uso de arrays.
- `CalculadoraGeometricaArray.java`: Versión de calculadora geométrica con validaciones y uso de arreglos.
- `ConversionDeTiempoArray.java` : Versión de conversión de tiempo con validaciones y uso de arreglos.
- `TablaDeOperaciones.Java`: Programa que hace uso de arreglos unidimensionales, para operaciones básicas aritméticas a partir de un número entero y
  manipulación de cadena en array.
