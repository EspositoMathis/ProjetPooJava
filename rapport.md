# Partie A : Modélisation par héritage  
## R1
**Question** : Pourquoi mettre les attributs en private ? Quel est l'intérêt de passer par des getters/setters ?  
**Réponse** : On utilise le mot-clé private pour protéger les données de l'objet (principe d'encapsulation). Passer par des getters/setters permet de garder le contrôle sur ces données : on peut ainsi empêcher des valeurs incohérentes (comme des PV négatifs) et autoriser la lecture seule si nécessaire.
## R2
**Question** : Pourquoi nbCanardsCrees est-il static ?  
**Réponse** : Il doit être static pour être partagé par toutes les instances de la class (c’est un compteur global).

## R3 
**Question** : À quoi sert l'appel à super(...) dans les sous-classes ?  
**Réponse** : super sert à appeler le constructeur du parent pour initialiser les attributs communs.

## R4
**Question** : Expliquez comment le mécanisme de etreAttaqueePar permet de déterminer le multiplicateur.  
**Réponse** : L'attaquant envoie son instance (this) à la cible. La cible possède plusieurs versions de la méthode etreAttaqueePar (surcharge). Java choisit alors automatiquement la méthode qui correspond au type réel de l'attaquant pour appliquer le bon multiplicateur.

## R5 
**Question** : Que se passe-t-il si on veut ajouter un type "Électrique" ?  
**Réponse** : Pour ajouter le type "Électrique", il faudrait :  
- Créer la classe CanardElectrique.
- Modifier la classe mère pour ajouter etreAttaqueePar(CanardElectrique).
- Modifier toutes les classes existantes (Feu, Eau, Plante, Normal) pour implémenter cette nouvelle méthode.

##  R6
**Question** : Comment l'Arène peut-elle faire combattre des canards sans connaître leur type réel ?  
**Réponse** : C'est possible grâce au polymorphisme. L'Arène manipule tous les canards comme des CanardDeCombat (la classe mère). Lorsqu'elle appelle la méthode attaquer(), Java exécute automatiquement la version spécifique au type réel du canard (Feu, Eau, etc.) sans que l'Arène ait besoin de le connaître.

# Partie B : Refactorisation : composition et Enum
## R7 
**Question** : En quoi l'utilisation d'une Enum pour les types simplifie-t-elle le code ?  
**Réponse** : L'Enum centralise toute la logique des types. On regroupe les multiplicateurs dans une seule méthode au lieu de les éparpiller dans chaque classe, ce qui rend le code plus lisible.

## R8
**Question** : Est-il plus facile d'ajouter le type "Électrique" ici ?  
**Réponse** : Oui, il suffit d'ajouter "ELECTRIQUE" dans l'Enum et de mettre à jour sa table de dégâts. On n'a pas besoin de modifier les autres classes du projet.

## R9
**Question** : Quel est l'intérêt de la classe EspeceCanard ?  
**Réponse** : Elle permet de partager les données communes (PV de base, attaque) entre plusieurs canards. Cela évite de dupliquer ces informations en mémoire pour chaque nouvelle instance.

## R10
**Question** : Pourquoi la composition est-elle considérée comme plus souple ?  
**Réponse** : La composition est plus flexible car on peut changer les caractéristiques d'un objet en plein vol (en changeant sa référence d'espèce), alors que l'héritage fige le type de l'objet à sa création.

## R11
**Question** : Pourquoi utiliser Combattant dans les listes plutôt que Canard ?  
**Réponse** : Cela permet de rendre le code universel. L'Arène peut faire combattre n'importe quel objet (Canard, Robot, etc.) du moment qu'il respecte le contrat de l'interface Combattant.

## R12
**Question** : Comment gérer le comportement du CanardConfus sans héritage ?  
**Réponse** : On ajouterait simplement un attribut d'état (ex: boolean estConfus) dans la classe Canard. On évite ainsi de créer une sous-classe entière pour un simple changement de comportement.
