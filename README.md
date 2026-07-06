LlanquihueTourApp
Descripción

LlanquihueTourApp es una aplicación desarrollada en Java para gestionar servicios turísticos de la agencia Llanquihue Tour.

El sistema permite organizar distintos tipos de servicios, como rutas gastronómicas, paseos lacustres y excursiones culturales, usando una estructura orientada a objetos. Además, permite almacenar estos servicios en una misma colección y mostrar su información de forma dinámica por consola.

Funcionalidades
Registro de distintos tipos de servicios turísticos.
Gestión de servicios mediante una colección genérica.
Visualización de la información de cada servicio por consola.
Organización de servicios según su tipo:
Rutas gastronómicas.
Paseos lacustres.
Excursiones culturales.
Uso de un gestor para cargar y mostrar los servicios disponibles.
Estructura del proyecto
src
├── data
│   ├── GestorDatos.java
│   └── GestorServicios.java
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   ├── Guia.java
│   ├── Operador.java
│   └── Tour.java
└── ui
    └── Main.java
Tecnologías y conceptos utilizados
Java.
Programación orientada a objetos.
Herencia.
Polimorfismo.
Sobrescritura de métodos.
Colecciones genéricas.
Uso de List y ArrayList.
Recorrido con for-each.
Organización por paquetes.
Funcionamiento

La aplicación utiliza una clase principal llamada ServicioTuristico, desde la cual se derivan distintos tipos de servicios turísticos.

Cada servicio tiene su propia forma de mostrar información, pero todos pueden almacenarse en una misma lista gracias al uso de polimorfismo.

El gestor de servicios carga distintos servicios turísticos y luego los recorre para mostrar su información en consola.

Ejecución

Para ejecutar el proyecto:

Abrir el proyecto en IntelliJ IDEA.
Ejecutar la clase Main, ubicada en el paquete ui.
Revisar los servicios mostrados en la consola.
Ejemplo de salida
=== SERVICIOS TURÍSTICOS ===
Ruta Gastronómica: Sabores del Sur, Duración: 4 horas, Paradas: 5
Ruta Gastronómica: Ruta Tradiciones, Duración: 3 horas, Paradas: 4
Paseo Lacustre: Lago Llanquihue, Duración: 2 horas, Embarcación: Catamarán
Paseo Lacustre: Lago Todos los Santos, Duración: 3 horas, Embarcación: Lancha
Excursión Cultural: Patrimonio Chilote, Duración: 5 horas, Lugar histórico: Iglesia de Castro
Estado del proyecto

El sistema se encuentra funcional en consola y permite representar diferentes servicios turísticos de manera organizada, flexible y extensible para futuras mejoras.
