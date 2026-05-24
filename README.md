# BankManager

BankManager est une petite application Java orientée objet qui simule plusieurs types de comptes bancaires : compte courant, compte d'épargne et certificat de dépôt.

## Fonctionnalités

- Classe de base `BankAccount` avec les attributs `compte` et `solde`.
- Classe `CheckingAccount` qui hérite de `BankAccount` et ajoute `limite`.
- Classe `SavingsAccount` qui hérite de `BankAccount` et ajoute un taux d'intérêt.
- Classe `COD` qui hérite de `BankAccount` et ajoute une durée en mois.
- Méthode `main` dans `Main` pour créer et tester les objets.

## Structure du projet

- `BankAccount.java` : classe parente.
- `CheckingAccount.java` : compte courant.
- `SavingsAccount.java` : compte d'épargne.
- `COD.java` : certificat de dépôt.
- `Main.java` : point d'entrée de l'application.

## Prérequis

- Java JDK 11 ou plus.
- Un terminal ou un IDE Java comme IntelliJ IDEA, Eclipse ou VS Code.


## Exemple de fonctionnement

L'application crée trois comptes bancaires, affiche leurs informations, puis modifie certains soldes pour vérifier l'accès aux attributs et l'héritage.

## Objectif pédagogique

Ce projet sert à pratiquer :
- l'héritage en Java ;
- l'encapsulation ;
- les getters et setters ;
- la création d'objets dans une méthode `main`.
