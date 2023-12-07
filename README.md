# Plateforme de Gestion Client-Voiture basée sur l'Architecture Microservices

## Résumé

Ce projet est une application reposant sur une architecture de microservices pour la gestion des clients et des véhicules. Une passerelle coordonne les requêtes entre ces microservices, chacun ayant sa propre base de données dédiée pour la gestion des informations spécifiques.

## Composants Microservices

### Microservice Client

**Responsabilités :** Gestion des informations liées aux clients.

**Technologies Utilisées :**
- Spring Boot : Développement du microservice.
- MySQL : Base de données relationnelle pour stocker les informations clients.
- Hibernate : Couche de persistance des données.

### Microservice Voiture

**Responsabilités :** Gestion des informations relatives aux véhicules.

**Technologies Utilisées :**
- Spring Boot : Développement du microservice.
- MySQL : Base de données relationnelle pour stocker les informations sur les véhicules.
- Hibernate : Couche de persistance des données.

## Fonctionnalités

### Microservice Client

- Création, mise à jour et suppression de clients.
- Récupération des informations d'un client spécifique.

### Microservice Voiture

- Création, mise à jour et suppression de voitures.
- Récupération des voitures d'un client spécifique.

## Instructions d'exécution du Projet

1. Cloner le référentiel depuis GitHub.
2. Configurer les bases de données dans les fichiers `application.yml` de chaque microservice.
3. Exécuter les microservices et la passerelle en utilisant votre IDE ou la ligne de commande.
