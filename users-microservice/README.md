

## **Users Microservice**

Este proyecto es un microservicio desarrollado en **Java 17** utilizando el marco de trabajo **Spring Boot 3**. El objetivo principal es gestionar las operaciones relacionadas con usuarios, como creación, consulta, y búsqueda por diferentes atributos. Este microservicio utiliza una arquitectura basada en **puertos y adaptadores** para mantener el código modular y fácilmente extensible.

## **Tecnologías Usadas**

### **Backend**

- **Java**: Versión 17.
- **Spring Boot**: Versión 3.3.x
    - **Spring Web**: Para crear y gestionar los controladores REST.
    - **Spring Data JPA**: Para la persistencia de datos y operaciones CRUD.
    - **Lombok**: Para evitar el código boilerplate en las clases Java.
    - **Spring DevTools**: Para facilitar el desarrollo con recarga en caliente.
- **PostgreSQL**: Base de datos relacional.
- **Docker Compose**: Para orquestar el entorno de ejecución, incluyendo la base de datos.

### **Base de Datos**

- **PostgreSQL**: Versiones recientes compatibles con Docker.
- **Docker**: Usado para contenerizar la base de datos y otros servicios si son necesarios.

---

## **Arquitectura**

El proyecto sigue una arquitectura basada en **puertos y adaptadores (hexagonal)**. Las capas principales son:

1. **Capa de dominio**:
    - Define la lógica central del negocio y entidades del dominio como `User`.
    - Interfaces como `IUserRepository` para interactuar con la infraestructura.
2. **Capa de aplicación**:
    - Casos de uso (`IUserUseCases`) que coordinan las operaciones entre la capa de dominio y la infraestructura.
3. **Capa de infraestructura**:
    - Contiene implementaciones específicas como repositorios (`PostgresUserRepository` y `PostgresUserRepositoryImpl`).
    - Controladores REST para exponer las operaciones del microservicio.

---

## **Endpoints API**

|Método HTTP|Endpoint|Descripción|Parámetros|Respuesta|
|---|---|---|---|---|
|**POST**|`/api/v1/users`|Crear un usuario|**Body**: `User`|**201**: Objeto `User` creado.|
|**GET**|`/api/v1/users`|Obtener todos los usuarios|Ninguno|**200**: Lista de objetos `User`.|
|**GET**|`/api/v1/users/{id}`|Buscar usuario por ID|**Path Variable**: `UUID id`|**200**: Objeto `User`.|
|**GET**|`/api/v1/users/email/{email}`|Buscar usuario por email|**Path Variable**: `String email`|**200**: Objeto `User`.|

### **Modelo de Usuario (`User`)**

El modelo `User` incluye los siguientes campos:

- `id` (UUID): Identificador único del usuario.
- `name` (String): Nombre del usuario.
- `email` (String): Correo electrónico.
- `password` (String): Contraseña (cifrada).

---

## **Instrucciones para Ejecutar**

### **Pre-requisitos**

1. **Java 17** o superior.
2. **Docker** y **Docker Compose** instalados.
3. **Maven** para compilar el proyecto.

### **Paso a Paso**

1. **Clonar el repositorio**:

   bash

   Copy code

   `git clone https://github.com/tu_usuario/users-microservice.git cd users-microservice`

2. **Compilar el proyecto**:

   bash

   Copy code

   `mvn clean install`

3. **Ejecutar el entorno con Docker Compose**:

   bash

   Copy code

   `docker-compose up -d`

   Este comando levantará la base de datos PostgreSQL configurada en el archivo `docker-compose.yml`.

4. **Levantar el microservicio**:

   bash

   Copy code

   `mvn spring-boot:run`

   El microservicio estará disponible en http://localhost:8080.



---

## **Contribuir**

1. Crea un **fork** del proyecto.
2. Crea una nueva rama para tus cambios:

   bash

   Copy code

   `git checkout -b feature/nueva-funcionalidad`

3. Realiza tus cambios y haz un commit:

   bash

   Copy code

   `git commit -m "Añadida nueva funcionalidad"`

4. Sube tus cambios a tu fork y crea un **Pull Request**.

---

## **Licencia**

Este proyecto está bajo la licencia MIT.