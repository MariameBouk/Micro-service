Dans ce TP nous avons créer un micro-service qui permet la gestion des comptes, nous avons commencés par la création de l'entité JPA (Compte) que l’on pourra sauvegarder et charger depuis une base de données relationnelle en effet cette entité est corrélée à une table de la base de données, dont chaque objet instancié par cette classe indique un tuple de la table elle-même, contenant les informations de cette dernière, pour la partie DAO de micro-service nous avons créés une interface CompteRepository qui permet de fournir les opérations de base pour la gestion d'un compte, par la suite nous avons tester notre application en insérant quelque comptes dans la base de données H2, et en affichant la liste des comptes ajoutés :   

=> La liste des comptes insérés :

![find_all_compte_teste](https://user-images.githubusercontent.com/101976300/163172479-286d1017-d371-445d-b264-76edc51fc921.PNG)

=> Affichage des éléments ajoutés au niveau de la base de données H2 :

![h2-console2](https://user-images.githubusercontent.com/101976300/163272664-dd9ff3c1-7790-4a39-bb72-1e6b2c37e014.PNG)

Après nous avons passés à la création d'un RestController pour la couche web qui précise pour chaque path la méthode qui sera invoquée.

1- Tester la méthode getComptes qui renvoie la liste des comptes au format JSON en utilisant un navigateur :

![localhost_comptes](https://user-images.githubusercontent.com/101976300/163275020-d696f9b0-d6e6-42ee-b506-ac69182eccdd.PNG)


