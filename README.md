# LlanquihueTourApp

## Descripción

Esta semana se implementó una jerarquía de clases utilizando herencia simple para representar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour. El objetivo fue reutilizar atributos comunes mediante una superclase y especializar el comportamiento de cada tipo de servicio a través de subclases.

## Clases creadas

### Paquete model

* **ServicioTuristico:** superclase con los atributos comunes `nombre` y `duracionHoras`.
* **RutaGastronomica:** hereda de `ServicioTuristico` y agrega el atributo `numeroDeParadas`.
* **PaseoLacustre:** hereda de `ServicioTuristico` y agrega el atributo `tipoEmbarcacion`.
* **ExcursionCultural:** hereda de `ServicioTuristico` y agrega el atributo `lugarHistorico`.

### Paquete data

* **GestorServicios:** crea dos instancias de cada subclase y muestra su información mediante el método `toString()`.

### Paquete ui

* **Main:** ejecuta la aplicación llamando al método `crearServicios()` de `GestorServicios`.

## Conceptos aplicados

* Herencia simple.
* Uso de `extends`.
* Uso del constructor de la superclase mediante `super(...)`.
* Sobrescritura del método `toString()` con `@Override`.
* Organización del proyecto mediante paquetes.

## Instrucciones para ejecutar Main

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main` ubicada en el paquete `ui`.
3. Observar en la consola la información de los servicios turísticos creados por el programa.

