<div align="center">
  
<h1 align="center"> DANNY JOSÉ JIMÉNEZ GUTIÉRREZ  </h1>
🖥️_ INGENIERO EN INFORMÁTICA _💻

[![📞 0424-281-44-55](https://img.shields.io/badge/Phone-0424--281--44--55-0078D4?style=for-the-badge&logo=phone&logoColor=white)](tel:04242814455)
[![✉️ dennaly88@gmail.com](https://img.shields.io/badge/Email-dennály88@gmail.com-EA4335?style=for-the-badge&logo=gmail&logoColor=white)](mailto:dennaly88@gmail.com)

</div>



<div align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" height="60" alt="html5 logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg" height="60" alt="css logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" height="60" alt="javascript logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="60" alt="java logo" />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/php/php-original.svg" height="60" alt="php logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/python/python-original.svg" height="60" alt="python logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" height="60" alt="mysql logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" height="60" alt="postgresql logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/microsoftsqlserver/microsoftsqlserver-plain.svg" height="60"     alt="sqlserver logo"  />  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linux/linux-original.svg" height="60" alt="linux logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/trello/trello-plain.svg" height="60" alt="trello logo"  />
</div>

###

<div align="center">
  <img src="https://img.shields.io/static/v1?message=LinkedIn&logo=linkedin&label=&color=0077B5&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="linkedin logo"  />
  <img src="https://img.shields.io/static/v1?message=Twitter&logo=twitter&label=&color=1DA1F2&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="twitter logo"  />
  <img src="https://img.shields.io/static/v1?message=Discord&logo=discord&label=&color=7289DA&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="discord logo"  />
  <img src="https://img.shields.io/static/v1?message=Twitch&logo=twitch&label=&color=9146FF&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="twitch logo"  />
  <img src="https://img.shields.io/static/v1?message=dev.to&logo=dev.to&label=&color=0A0A0A&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="devto logo"  />
  <img src="https://img.shields.io/static/v1?message=Youtube&logo=youtube&label=&color=FF0000&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="youtube logo"  />
</div>


_____________________________________________________________________________________________________________________________________________________________
## ♨️ Java y Spring Boot
📌 **Aplicación para gestionar una biblioteca de libros y categorías (CRUD + filtro por categoría).**  
🗓️ **Arquitectura:** MVC / Capas (Controller, Service, Repository), Spring Data JPA (Hibernate), Bean Validation y Thymeleaf.  
🗄️ **Base de datos:** PostgreSQL.

______________________________________________________________________________________________________________________________________________________________





---

### 📋 Requisitos
- **Java JDK** >= 17 (recomendado Java 21 LTS)
- **Maven** >= 3.8 (o usar el wrapper `./mvnw` incluido)
- **PostgreSQL** >= 14

---

### ⚙️ Instalación y ejecución

**1. Clonar el proyecto**
```bash
git clone <URL_DEL_REPOSITORIO> biblioteca-java
cd biblioteca-java
```

**2. Crear la base de datos en PostgreSQL**
```bash
sudo -u postgres psql -c "CREATE DATABASE biblioteca;"
```

**3. Configurar la conexión**
Revisa en `src/main/resources/application.properties` (o `application.yml`) que los datos coincidan con tu PostgreSQL:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/biblioteca
spring.datasource.username=postgres
spring.datasource.password=postgres

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

**4. Compilar y levantar el servidor**
```bash
./mvnw spring-boot:run
```
*(En Windows usa: `mvnw.cmd spring-boot:run`)*

👉 Abre [http://localhost:8080](http://localhost:8080) en tu navegador (redirige automáticamente a `/books`).

---

### 🔗 Endpoints

| Método | Ruta | Descripción |
| :--- | :--- | :--- |
| `GET` | `/books` | Lista los libros (paginado con `Pageable`) |
| `GET` | `/books?category={id}` | Filtra los libros por categoría |
| `POST` | `/books` | Crea un nuevo libro |
| `PUT` | `/books/{id}` | Edita un libro existente |
| `DELETE` | `/books/{id}` | Elimina un libro |
| `GET / POST / PUT / DELETE` | `/categories` | Gestión completa (CRUD) de categorías |

* **Interfaz Web (Thymeleaf + Bootstrap):** Disponible en `/books` y `/categories`. Tras crear, editar o eliminar un registro, redirige al listado con un mensaje flash (`RedirectAttributes`).
* **API REST JSON (Postman / cURL):** Las mismas operaciones están disponibles bajo `/api/books` y `/api/categories` mediante `@RestController`.

#### Ejemplo de petición con cURL:
```bash
curl -X POST http://localhost:8080/api/books \
  -H "Accept: application/json" \
  -H "Content-Type: application/json" \
  -d '{"title":"Dune","author":"Frank Herbert","publishedYear":1965,"categoryId":3}'
```

#### Códigos de estado HTTP (`ResponseEntity`):
* `200` **OK:** Petición exitosa.
* `201` **Created:** Recurso creado correctamente.
* `404` **Not Found:** Libro o categoría inexistente (`ResourceNotFoundException`).
* `409` **Conflict:** No se puede eliminar una categoría porque tiene libros asociados (`DataIntegrityViolationException`).
* `422` / `400` **Validation Error:** Error de validación en los datos enviados (`MethodArgumentNotValidException`).

---

### 🛡️ Validaciones (Jakarta Bean Validation / DTOs)
* `title`: `@NotBlank`, `@Size(min = 3)` (obligatorio, mínimo 3 caracteres).
* `author`: `@NotBlank` (obligatorio).
* `publishedYear`: `@NotNull`, `@Min(1000)` hasta el año actual (obligatorio).
* `categoryId`: `@NotNull`, debe existir en la tabla `categories`.
* `categories.name`: `@NotBlank`, `@Column(unique = true)` (obligatorio y único).

---

### 🧠 Lógica de negocio (`Service`)
* Se verifica que el libro exista antes de proceder a eliminarlo (lanza `404 Not Found` si no existe).
* Se impide eliminar una categoría que tenga libros asociados (`409 Conflict`); además, la relación `@ManyToOne` / FK en PostgreSQL restringe el borrado en cascada.

---

### 📂 Estructura relevante del proyecto (`src/main/java/com/biblioteca/`)
* **`model/` (Entidades JPA):** `Book`, `Category` (relaciones `@ManyToOne` / `@OneToMany`).
* **`dto/`:** `BookRequestDTO`, `BookResponseDTO`, `CategoryDTO`.
* **`repository/`:** `BookRepository`, `CategoryRepository` (extienden de `JpaRepository`, consulta `findByCategoryId`).
* **`service/`:** `BookService`, `CategoryService` (lógica de negocio y transacciones `@Transactional`).
* **`controller/`:** `BookController`, `CategoryController` (vistas web) y `BookRestController`, `CategoryRestController` (API JSON).
* **`exception/`:** `GlobalExceptionHandler` (`@RestControllerAdvice` para manejo centralizado de errores HTTP).
* **`resources/`:** `templates/` (vistas HTML Thymeleaf), `data.sql` (datos iniciales) y `application.properties`.
