# TP2_Ajebli_Ahmed: Spring Boot Application with Patient Management

This project explores Spring Boot for building a patient management application, focusing on data persistence and migration between H2 and MySQL databases.

### Key Features

* **Patient Management:**
* Create, read, update,
User:	more details in partie screenshots
Model:	## TP2 Systèmes Distribués - Gestion Hospitalière avec Spring Boot

**Auteur :** Ajebli Ahmed

**Année Universitaire :** 2023-2024

### Description

Ce projet explore le développement d'une application de gestion hospitalière en utilisant Spring Boot, JPA, H2 (et migration vers MySQL), Spring Web, et Lombok. L'application gère les entités clés telles que les patients, les médecins, les rendez-vous et les consultations, et intègre des concepts d'utilisateurs et de rôles pour la gestion des permissions.

### Fonctionnalités

* **Gestion des patients:** Ajout, consultation, recherche, mise à jour et suppression de patients.
* **Gestion des médecins:** Ajout, consultation et recherche de médecins.
* **Gestion des rendez-vous:** Planification, consultation et mise à jour du statut des rendez-vous.
* **Gestion des consultations:** Enregistrement des consultations avec rapport.
* **Gestion des utilisateurs et des rôles:** Création d'utilisateurs et de rôles, attribution de rôles aux utilisateurs et authentification.
* **Migration de base de données:** Le projet montre la migration de H2 vers MySQL.
* **API REST:** Un contrôleur REST permet de récupérer la liste des patients et les détails d'un patient spécifique.

### Technologies

* **Spring Boot:** Framework pour le développement d'applications Java.
* **JPA (Java Persistence API):** API pour la persistance des données en Java.
* **H2 Database:** Base de données embarquée en mémoire.
* **MySQL:** Système de gestion de base de données relationnelle.
* **Spring Web:** Framework pour le développement d'applications web.
* **Lombok:** Bibliothèque pour réduire le code boilerplate.

### Installation & Exécution

1. Cloner le repository.
2. Configurer la base de données dans `application.properties`.
3. Exécuter l'application Spring Boot.
4. Accéder aux endpoints de l'API REST pour interagir avec l'application.

### Captures d'écran

**1. Sortie console:**
* Montrer la sortie de l'application au démarrage, affichant l'initialisation des données et les actions effectuées.
* Inclure la sortie de la commande `findAll()` affichant la liste des patients ajoutés à la base de données.
* Montrer la sortie de la recherche de patients par état de santé (malade/non malade) et par score.
* Inclure la sortie de la migration de H2 vers MySQL, confirmant le succès de l'opération.
* Afficher la sortie de la création et de l'attribution de rôles aux utilisateurs, ainsi que le résultat de l'authentification.

**2. Interface H2:**
* Afficher la table "Patient" dans la console H2 avec les données des patients insérés.
* Montrer la table "Medecin" dans la console H2 avec les données des médecins insérés.

**3. Interface phpMyAdmin:**
* Afficher la structure de la base de données "patients_db" après la migration vers MySQL.
* Montrer les données de la table "patient" dans phpMyAdmin après la migration.
* Afficher la structure de la base de données "db_users" après la migration vers MySQL.
* Montrer les données de la table "roles_users" dans phpMyAdmin après la migration.

**4. Postman:**
* Montrer la requête GET envoyée à l'URL `http://localhost:8085/patients` pour récupérer la liste des patients.
* Afficher la réponse JSON renvoyée par le serveur contenant la liste des patients.
* Montrer la requête GET envoyée à l'URL `http://localhost:8085/users/ahmed` pour rechercher un utilisateur spécifique.
* Afficher la réponse JSON renvoyée par le serveur contenant les informations de l'utilisateur.


### Conclusion

Ce TP a permis de mettre en pratique les concepts de Spring Boot, JPA et la gestion de bases de données pour développer une application de gestion hospitalière fonctionnelle.
