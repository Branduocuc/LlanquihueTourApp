# LlanquihueTourApp

Aplicación desarrollada en Java para gestionar distintas entidades y servicios turísticos relacionados con la zona de Llanquihue.

## Funcionalidades

* Registro de guías, embarcaciones y atractivos turísticos.
* Ingreso de datos mediante una interfaz gráfica con `JOptionPane`.
* Visualización de las entidades registradas en la GUI y en consola.
* Uso de una colección `ArrayList<Registrable>` para almacenar objetos de diferentes clases.
* Identificación del tipo concreto de cada entidad mediante `instanceof`.
* Validación de la capacidad de la embarcación mediante `try-catch`.

## Conceptos aplicados

El proyecto utiliza los siguientes conceptos de programación orientada a objetos:

* Encapsulamiento.
* Herencia.
* Interfaces.
* Polimorfismo.
* Sobrescritura de métodos con `@Override`.
* Colecciones genéricas con `ArrayList`.
* Ciclos `for-each`.
* Uso de `instanceof`.
* Manejo de errores con `try-catch`.
* Interfaz gráfica con `JOptionPane`.

## Interfaz Registrable

La interfaz `Registrable` define el método:

```java
String mostrarResumen();
```

Es implementada por las clases:

* `Guia`
* `Embarcacion`
* `AtractivoTuristico`

Esto permite almacenar objetos de diferentes clases dentro de una misma colección:

```java
ArrayList<Registrable> entidades;
```

## Herencia

La clase `ServicioTuristico` funciona como superclase de:

* `RutaGastronomica`
* `PaseoLacustre`
* `ExcursionCultural`

Cada subclase comparte características comunes de `ServicioTuristico` y además posee sus propios atributos.

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main`.
3. Ingresar los datos solicitados mediante las ventanas de `JOptionPane`.
4. Visualizar el resumen final en la interfaz gráfica y en la consola.
