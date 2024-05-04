# Ejercicio Técnico - Gestión de Productos

Este proyecto es una aplicación de gestión de productos desarrollada en Java con Spring Boot. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre productos, como crear un nuevo producto, actualizar un producto existente, consultar productos por ID o nombre, y eliminar un producto.

## Tecnologías Utilizadas

- Java 21
- Spring Boot
- H2 Database (base de datos en memoria)

## Instalación y Ejecución

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/LautaJimenez/EjercicioTecnico.git

2. Importar el proyecto en tu IDE favorito (por ejemplo, VSCode, IntelliJ IDEA, Eclipse).
3. Configurar el proyecto para que utilice la base de datos H2 en memoria. Puedes encontrar la configuración en el archivo application.properties.
4. Ejecutar la aplicación desde tu IDE.
5. Una vez que la aplicación esté en ejecución, puedes probar los endpoints utilizando Postman u otra herramienta similar. Aquí tienes algunos ejemplos de endpoints disponibles:
  
  - POST /productos: Agregar un nuevo producto.
  - GET /productos/id/{id}: Obtener un producto por su ID.
  - GET /productos/name/{name}: Obtener un producto por su nombre.
  - GET /productos: Obtener todos los productos ordenados por precio.
  - POST /productos/{id}: Actualizar un producto por su ID.
  - DELETE /productos/{id}: Eliminar un producto por su ID.
