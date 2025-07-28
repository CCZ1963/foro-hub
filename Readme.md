## 🔧 1. Practicando Spring Framework, API REST y SOLID: Challenge Foro Hub

<center><img src="Changelle_foro_hub.png" /></center>

ForoHub es una API REST desarrollada con Spring Framework para gestionar un foro de discusión. Los usuarios pueden crear, leer, actualizar y eliminar tópicos (CRUD). La API está diseñada siguiendo las mejores prácticas del modelo REST, e incluye validaciones, autenticación/autorización y una base de datos relacional para la persistencia de la información.

La API esta centrada específicamente en los tópicos, y debe permitir a los usuarios:
* Crear un nuevo tópico;
* Mostrar todos los tópicos creados;
* Mostrar un tópico específico;
* Actualizar un tópico;
* Eliminar un tópico.

Los objetivo con este challenge es implementar una API REST con las siguientes funcionalidades:

* API con rutas implementadas siguiendo las mejores prácticas del modelo REST.
* Validaciones realizadas según las reglas de negocio.
* Implementación de una base de datos relacional para la persistencia de la información.
* Servicio de autenticación/autorización por medio de JWT.
* Documentación con Swagger.

## 🛠️ 2. Tecnologías Utilizadas

| TECNOLOGÍA          | PROPÓSITO                                 |
| ------------------- | ----------------------------------------- |
| Java 24             | Lenguaje principal                        |
| Spring Boot 3.x     | Framework para desarrollo rápido          |
| Spring Security     | Seguridad, autenticación y autorización   |
| JWT (Java JWT)      | Tokens de autenticación                   |
| Spring Data JPA     | Persistencia con base de datos relacional |
| Springdoc OpenAPI\| | Documentación automática de la API        |
| PostgreSQL          | Base de datos                             |

## 📦 3. Configuración Inicial

### 🧱 3.1. Crear proyecto Spring Boot

- **Project** : Maven
- **Language** : Java
- **Spring Boot Version** : 3.x
- **Dependencies** :
    - Spring Web
    - Spring Data JPA
    - Flyway Migration
    - Spring Security
    - Springdoc OpenAPI UI (springdoc-openapi-starter-webmvc-ui)
    - PostgreSQL Driver (o H2 para desarrollo)
    -

### 📁3.2. Estructura del Proyecto

<center><img src="Estructura_del_proyecto.png" /></center>

