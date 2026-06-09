[![Java CI](https://github.com/Gay-Jeremy/MyRecipe/actions/workflows/ci.yml/badge.svg)](https://github.com/Gay-Jeremy/MyRecipe/actions/workflows/ci.yml)

# MyRecipeAPI

API REST développée avec Spring Boot permettant la gestion de recettes de cuisine et de leurs ingrédients.

## Présentation

MyRecipeAPI est une application backend développée en Java avec Spring Boot. Elle expose une API REST permettant de gérer des recettes et des ingrédients via des opérations CRUD (Create, Read, Update, Delete).

Le projet utilise PostgreSQL comme base de données relationnelle et Spring Data JPA pour la persistance des données.

## Technologies utilisées

### Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL
* Lombok

### Documentation

* OpenAPI / Swagger

### Tests

* JUnit
* Mockito

### DevOps

* Docker
* Docker Compose
* GitHub Actions
* Maven

---

## Architecture du projet

```text
Controller
    ↓
Repository (DAO)
    ↓
JPA / Hibernate
    ↓
PostgreSQL
```

### Structure

```text
src/main/java/com/locMns

├── controller
│   └── IngredientController
│
├── dao
│   ├── IngredientDao
│   ├── RecetteDao
│   ├── RoleDao
│   └── UtilisateurDao
│
├── model
│   ├── Ingredient
│   ├── Recette
│   ├── Role
│   └── Utilisateur
│
└── App.java
```

---

## Fonctionnalités

### Gestion des ingrédients

* Récupération de tous les ingrédients
* Récupération d'un ingrédient par identifiant
* Création d'un ingrédient
* Modification d'un ingrédient
* Suppression d'un ingrédient

### Gestion des recettes

* Création de recettes
* Consultation des recettes
* Modification des recettes
* Suppression des recettes

---

## Installation

### Prérequis

* Java 25
* Maven
* PostgreSQL
* Docker (optionnel)

---

### Cloner le projet

```bash
git clone <url-du-repository>
cd MyRecipeAPI
```

---

### Configuration

Créer un fichier `.env` à partir du modèle fourni :

```bash
cp .example.env .env
```

Configurer les variables de connexion PostgreSQL.

---

### Lancer PostgreSQL avec Docker

```bash
docker compose up -d
```

---

### Démarrer l'application

```bash
mvn spring-boot:run
```

---

## Construction du projet

```bash
mvn clean package
```

Le fichier généré sera disponible dans :

```text
target/MyRecipeAPI-1.0-SNAPSHOT.jar
```

Exécution :

```bash
java -jar target/MyRecipeAPI-1.0-SNAPSHOT.jar
```

---

## Documentation Swagger

Une fois l'application démarrée :

```text
http://localhost:8080/swagger-ui.html
```

ou

```text
http://localhost:8080/swagger-ui/index.html
```

---

## Exemple d'API

### Récupérer tous les ingrédients

```http
GET /api/ingredient/liste
```

### Récupérer un ingrédient

```http
GET /api/ingredient/{id}
```

### Créer un ingrédient

```http
POST /api/ingredient
Content-Type: application/json

{
  "libelle": "Tomate"
}
```

### Modifier un ingrédient

```http
PUT /api/ingredient/{id}
```

### Supprimer un ingrédient

```http
DELETE /api/ingredient/{id}
```

---

## Base de données

Le projet repose sur PostgreSQL.

Entités principales :

### Ingredient

| Champ   | Type    |
| ------- | ------- |
| id      | Integer |
| libelle | String  |

### Recette

| Champ       | Type    |
| ----------- | ------- |
| id          | Integer |
| titre       | String  |
| description | String  |
| ustensile   | String  |
| image       | String  |
| etape       | String  |

---

## Pipeline CI/CD

Le projet intègre GitHub Actions afin de :

* lancer les tests automatisés ;
* construire l'application Maven ;
* construire les images Docker ;
* préparer le déploiement.

---

## Auteur

Projet réalisé dans le cadre d'un apprentissage DevOps.

---

