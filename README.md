# GRPC



=> Première Partie :
Reprendre les mêmes exemple de la démonstration vidéo pour implémenter les 4 modèles :
- Unary Model
- Server Sreaming Model
- Client Streaming Model
- BiDirectional Streaming Model
Pour le cas d'une conversion de monnaie

=> Deuxième partie
 1. Créer un serveur Chat GRPC
 2. Tester le serveur Chat avec un client GRPC comme BloomRPC
 3. Créer un client GRPC Java
 4. Créer un client GRPC Python

=> Troisième partie
 1. Créer un serveur JEU GRPC :
     - Au démarrage le serveur choisit un nombre aléatoire entre 1 et 1000. 
     - Ensuite les clients GRPC doivent deviner en compétition le nombre secret.
     - le serveur répond à chaque fois avec les éventualités suivantes :
        . Votre nombre est plus grand
        . Votre nombre est plus petit
        . BRAVO vous avez gagné et envoyer le gagnant aux clients
        . Jeu terminé, le gagnant est ""Numéro du gagnant"
