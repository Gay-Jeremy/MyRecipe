[![Java CI](https://github.com/Gay-Jeremy/MyRecipe/actions/workflows/ci.yml/badge.svg)](https://github.com/Gay-Jeremy/MyRecipe/actions/workflows/ci.yml)

# MyRecipeAPI

API REST développée avec Spring Boot permettant la gestion d'ingrédients pour une application de recettes.

## Technologies utilisées

* Java 25
* Spring Boot 4
* Spring Data JPA
* PostgreSQL 17
* Hibernate
* Maven
* Docker & Docker Compose
* Swagger / OpenAPI
* Adminer

---

## Fonctionnalités

### Ingrédients

| Méthode | Endpoint                | Description                                 |
| ------- | ----------------------- | ------------------------------------------- |
| GET     | `/api/ingredient/liste` | Récupérer tous les ingrédients              |
| GET     | `/api/ingredient/{id}`  | Récupérer un ingrédient par son identifiant |
| POST    | `/api/ingredient`       | Créer un ingrédient                         |
| PUT     | `/api/ingredient/{id}`  | Modifier un ingrédient                      |
| DELETE  | `/api/ingredient/{id}`  | Supprimer un ingrédient                     |

---

## Lancement en local

### Prérequis

* Java 25
* Maven 3.9+
* PostgreSQL 17

### Installation

```bash
git clone <repository-url>
cd MyRecipeAPI
```

### Configuration

Créer un fichier `.env` :

```env
SPRING_PROFILES_ACTIVE=prod

SERVER_PORT=8080

DB_URL=jdbc:postgresql://localhost:5432/dataBase
DB_USERNAME=root
DB_PASSWORD=root

POSTGRES_DB=dataBase
POSTGRES_USER=root
POSTGRES_PASSWORD=root
```

### Compilation

```bash
mvn clean package
```

### Exécution

```bash
java -jar target/MyRecipeAPI-1.0-SNAPSHOT.jar
```

L'application sera disponible sur :

```text
http://localhost:8080
```

---

## Lancement avec Docker

### Construction et démarrage

```bash
docker compose up -d --build
```

### Vérification

```bash
docker ps
```

### Arrêt

```bash
docker compose down
```

---

## Services disponibles

### API

```text
http://localhost:8080
```

### Swagger UI

```text
http://localhost:8080/swagger-ui.html
```

ou

```text
http://localhost:8080/swagger-ui/index.html
```

### OpenAPI

```text
http://localhost:8080/v3/api-docs
```

### Adminer

```text
http://localhost:8081
```

Paramètres de connexion :

```text
Système : PostgreSQL
Serveur : db
Base : dataBase
Utilisateur : root
Mot de passe : root
```

---

## Structure du projet

```text
src/
├── main/
│   ├── java/com/locMns/
│   │   ├── controller/
│   │   ├── dao/
│   │   ├── model/
│   │   └── App.java
│   └── resources/
└── test/
```

---

## Variables d'environnement

| Variable               | Description             |
| ---------------------- | ----------------------- |
| SPRING_PROFILES_ACTIVE | Profil Spring actif     |
| SERVER_PORT            | Port de l'application   |
| DB_URL                 | URL PostgreSQL          |
| DB_USERNAME            | Utilisateur PostgreSQL  |
| DB_PASSWORD            | Mot de passe PostgreSQL |
| POSTGRES_DB            | Nom de la base          |
| POSTGRES_USER          | Utilisateur PostgreSQL  |
| POSTGRES_PASSWORD      | Mot de passe PostgreSQL |

---

## Déploiement

Le projet peut être déployé automatiquement via GitHub Actions :

1. Build Maven
2. Construction de l'image Docker
3. Push sur Docker Hub
4. Déploiement via SSH sur le serveur

Secrets GitHub requis :

* SERVER_HOST
* SERVER_USER
* SERVER_SSH_KEY
* REGISTRY_USER
* REGISTRY_TOKEN

---

## Auteur

Jeremy Gay


