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

En utilisant cette documentation on aura plus besoin de connaitre la strecture des requettes par exemple dans postman, il suffit juste d'ajouter le lien de l'open api.

![utiliser_docapi_pastman](https://user-images.githubusercontent.com/101976300/163284351-894cc350-8cc2-41a6-841d-e6da8f28c313.PNG)

Aussi on la possibilité de tester nos méthodes en utilisant swagger :

![teste avec swagger](https://user-images.githubusercontent.com/101976300/163287352-a8a26e63-13bb-4885-b3c4-d38dc6f7a9f1.PNG)

1- Pour lister les comptes avec swagger :

![get_comptes_swagger1](https://user-images.githubusercontent.com/101976300/163287411-f22d7bd1-a3d1-4f10-9ce4-fefaf8742234.PNG)

Résultat :

![get_comptes_swagger](https://user-images.githubusercontent.com/101976300/163287473-8125d8ad-8deb-479a-873b-a95de882a066.PNG)

2- Pour modifier un compte avec swagger :

![update_swagger1](https://user-images.githubusercontent.com/101976300/163287589-38e4fab5-5507-4712-bf82-d1c41df8bafd.PNG)

Résultat :

![update_swagger_resultat](https://user-images.githubusercontent.com/101976300/163287696-5daa181c-32cf-4c0c-9991-8606e3da2f05.PNG)

Si on veut créer un micro-service qui permet juste d'ajouter, supprimer, modifier et consuler c'est à dire les opérations classiques on aura pas besoin d'établir un  RestController, il suffit juste d'utiliser un module Spring Data Rest :

![teste_avec_spring data rest](https://user-images.githubusercontent.com/101976300/163288851-4ff656d9-7f1e-4d65-b16e-981dc43545c3.PNG)

Spring Data Rest nous offre pas mal de possibilités parmi les quels on trouve les projections qui nous permet de spécifier les attributs qu'on veut :

=> Pour la pojection 1 on souhaite afficher le code et le solde de compte et ignorer le type et la date de création de compte :

![projection_p1_solde_code](https://user-images.githubusercontent.com/101976300/163289472-83c3eb56-b59d-4e25-b0cb-c7257d1c0e33.PNG)

=> Pour la pojection 2 on souhaite afficher le code et le type de compte et ignorer le solde et la date de création de compte :

![projection_p2_type_code](https://user-images.githubusercontent.com/101976300/163289677-da892c3a-2a62-4dae-9ef7-c936782857f0.PNG)

On peut ajouter une méthode qui permet de renvoyer les comptes selon le type :

![methode_byType](https://user-images.githubusercontent.com/101976300/163291001-9e3b9a67-5459-4c86-bb9a-27b64851c3bb.PNG)

Si on veut effectuer des opérations metiers par exemple un virement d'un compte vers un autre, pour cela nous aurons besoin de la couche metier :






