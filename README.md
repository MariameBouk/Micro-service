Dans ce TP nous avons créer un micro-service qui permet la gestion des comptes, nous avons commencés par la création de l'entité JPA (Compte) que l’on pourra sauvegarder et charger depuis une base de données relationnelle en effet cette entité est corrélée à une table de la base de données, dont chaque objet instancié par cette classe indique un tuple de la table elle-même, contenant les informations de cette dernière, pour la partie DAO de micro-service nous avons créés une interface CompteRepository qui permet de fournir les opérations de base pour la gestion d'un compte, par la suite nous avons tester notre application en insérant quelque comptes dans la base de données H2, et en affichant la liste des comptes ajoutés :   

=> La liste des comptes insérés :

![find_all_compte_teste](https://user-images.githubusercontent.com/101976300/163172479-286d1017-d371-445d-b264-76edc51fc921.PNG)

=> Affichage des éléments ajoutés au niveau de la base de données H2 :

![h2-console2](https://user-images.githubusercontent.com/101976300/163272664-dd9ff3c1-7790-4a39-bb72-1e6b2c37e014.PNG)

Après nous avons passés à la création d'un RestController pour la couche web qui précise pour chaque path la méthode qui sera invoquée.

1- Tester la méthode listComptes qui renvoie la liste des comptes au format JSON en utilisant un navigateur :

![localhost_comptes](https://user-images.githubusercontent.com/101976300/163275020-d696f9b0-d6e6-42ee-b506-ac69182eccdd.PNG)

2- Tester la méthode getCompte qui permet de consulter un compte selon son code : 

![localhost_get_compte](https://user-images.githubusercontent.com/101976300/163275675-9b8ba1e3-8b99-4744-8297-7a6d18d60ae3.PNG)

3- Tester la méthode save qui permet d'ajouter un compte en utiliser postman :

![ajout_compte_postman](https://user-images.githubusercontent.com/101976300/163282120-e41902a0-9dcf-4141-821f-73fc84e4f984.PNG)

4- Tester la méthode update qui permet de modifier un compte en utilisant postman :

![update_compte_postman](https://user-images.githubusercontent.com/101976300/163282307-13bcb0f8-e46a-46c9-8532-d3fb033644fe.PNG)

5- Tester la méthode delete qui permet de supprimer un compte :

![delete_compte_postman](https://user-images.githubusercontent.com/101976300/163282387-0058a62c-1ecf-44ab-984d-22c5c00605fc.PNG)

On peut également générer la documentation de notre micro-service en ajoutant une dépendance Springdoc OpenAPI UI dans le fichier xml de MAVEN :

![documentation de WS swaguer](https://user-images.githubusercontent.com/101976300/163283576-44f3abca-8918-4c1f-8724-e84e622e7942.PNG)




