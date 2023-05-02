# GRPC



#### Première Partie :

Reprendre les mêmes exemple de la démonstration vidéo pour implémenter les 4 modèles :

      Server

![Partie1-server](https://user-images.githubusercontent.com/101317995/235793046-419328f5-aa44-4fbb-b5ef-dd3960b72ca6.png)


      Unary Model
      
![Partie1-unarymodel](https://user-images.githubusercontent.com/101317995/235793346-4bca5640-243c-4b84-8e67-d48f86dcc679.png)


      CLient1 (Synchrone)

![Partie1-client1](https://user-images.githubusercontent.com/101317995/235794090-e571119e-5461-4167-b1e3-37037a6c0d15.png)


      CLient2 (Asynchrone)

![Partie1-client2](https://user-images.githubusercontent.com/101317995/235794601-cd4e26fb-197b-449f-a7ad-afbb4fac56a2.png)



      Server Sreaming Model
      
      
![Partie1-ServerSreamingModel](https://user-images.githubusercontent.com/101317995/235795258-7e71c1b4-f99c-44e4-bfdf-63a6ca3524b2.png)


![Partie1-client3](https://user-images.githubusercontent.com/101317995/235795277-3d27e0fc-cb11-47d1-b2b1-e99d13d7d6e9.png)


      Client Streaming Model
      
![Partie1-ClientStreaming](https://user-images.githubusercontent.com/101317995/235795650-aeb4e997-ae3f-4624-9f12-bd7ed33ba1f0.png)

![Partie1-client4](https://user-images.githubusercontent.com/101317995/235795701-2179ae05-d79f-4353-baf6-ce8585e74b38.png)


      BiDirectional Streaming Model
      

![Partie1-bider](https://user-images.githubusercontent.com/101317995/235796040-fa5f4521-78e6-40d0-b633-00d711cd36dd.png)
  
![Partie1-client5](https://user-images.githubusercontent.com/101317995/235796075-0d80e1a8-12c1-4443-af31-6ca452d3f9be.png)

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
      
![Partie3_server](https://user-images.githubusercontent.com/101317995/235792280-edcf6e44-196b-4b82-ac6e-c748dcf78324.png)

      
      2. Clients JAVA
      
![Partie3_ClientsJava](https://user-images.githubusercontent.com/101317995/235791920-176b5d44-c561-4897-b630-2a73fd49e0b1.png)


- Au démarrage le serveur choisit un nombre aléatoire entre 1 et 1000. 
     - Ensuite les clients GRPC doivent deviner en compétition le nombre secret.
     - le serveur répond à chaque fois avec les éventualités suivantes :
        . Votre nombre est plus grand
        . Votre nombre est plus petit
        . BRAVO vous avez gagné et envoyer le gagnant aux clients
        . Jeu terminé, le gagnant est ""Numéro du gagnant"
