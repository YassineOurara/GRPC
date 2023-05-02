# GRPC



#### Première Partie :

Reprendre les mêmes exemple de la démonstration vidéo pour implémenter les 4 modèles :

      Unary Model

pic1

      Server Sreaming Model

pic2

      Client Streaming Model
      
pic3

      BiDirectional Streaming Model
      
pic4      
      


#### Deuxième partie

       1. Créer un serveur Chat GRPC

pic1

      2. Tester le serveur Chat avec un client GRPC comme BloomRPC

pic2

       3. Créer un client GRPC Java
      
pic3

      
       4. Créer un client GRPC Python
      
pic4    


 


#### Troisième partie

      1. Créer un serveur JEU GRPC :
      
![Partie3_ClientsJava](https://user-images.githubusercontent.com/101317995/235791920-176b5d44-c561-4897-b630-2a73fd49e0b1.png)


- Au démarrage le serveur choisit un nombre aléatoire entre 1 et 1000. 
     - Ensuite les clients GRPC doivent deviner en compétition le nombre secret.
     - le serveur répond à chaque fois avec les éventualités suivantes :
        . Votre nombre est plus grand
        . Votre nombre est plus petit
        . BRAVO vous avez gagné et envoyer le gagnant aux clients
        . Jeu terminé, le gagnant est ""Numéro du gagnant"
