LlanquihueTourApp
Descripción

LlanquihueTourApp es una aplicación desarrollada en Java para gestionar información de tours turísticos de la agencia Llanquihue Tour.

El sistema permite cargar información desde un archivo de texto, almacenar los datos en una colección dinámica, mostrar los registros por consola, realizar filtros y efectuar búsquedas simples.

Estructura del Proyecto

Paquete model

Contiene las clases del modelo de datos:

Tour: representa un tour turístico.
Guia: representa un guía turístico.
Operador: representa un operador turístico.

Paquete data

Contiene las clases encargadas de la gestión de datos:

GestorDatos: realiza la lectura del archivo de texto y carga los tours en una colección.

Paquete ui

Contiene la interfaz de ejecución:

Main: clase principal encargada de ejecutar el programa.

Funcionalidades

Lectura de datos desde archivo .txt.
Almacenamiento de datos mediante ArrayList.
Visualización de todos los tours registrados.
Filtrado de tours con precio superior a un valor determinado.
Búsqueda simple de tours por nombre.
Manejo básico de errores mediante try-catch.
Archivo de Datos

El programa utiliza el archivo:

tours.txt

Formato de cada registro:

Nombre;Tipo;Precio

Ejemplo:

Ruta de los Lagos;Aventura;25000

Tecnologías Utilizadas
Java
IntelliJ IDEA
Colecciones (ArrayList)
Lectura de archivos con BufferedReader

Ejecución

Abrir el proyecto en IntelliJ IDEA.
Verificar que el archivo tours.txt se encuentre en la carpeta resources.
Ejecutar la clase Main.
Observar los resultados mostrados por consola.
