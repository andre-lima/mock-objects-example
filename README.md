# EXEMPLE MOCK OBJECTS

## Dans MAIN:
On crée le fichier et un FileWriter.

Après, on crée un FileWriterWrapper et on lui donne le FileWriter comme paramètre. 
   - Dans le programmer normale, le FW et le FWWrapper font la même chose.
   - Dans les tests, au lieu d'envoier un FW, ou va envoyer un MockFileWriter
   
Ensuite, on appelle le methode write du FWW et une méthode de JavaGenerator 
   - Dans le programmer normale, tout va être écrit dans un fichier txt
   - Dans les tests, on compare le texte de sortie avec du résultat attendu.

## La classe FileWriterWrapper
Ne fait que copier les fonctionnalités de FileWriter qu'on a besoin.

## La classe MockFileWriter
Extends FileWriterWrapper et Overrides le méthode `write` pour pouvoir concaténer des Strings ou lieu de les écrire dans le fichier.

## La classe JavaGenerator
Les méthodes ici prennent un FWW comme paramètre.
   - Puisque le MockFileWriter extends de FWW, on peut aussi envoyer un MFW comme paramètre. Ça va être utile au moment d'écrire les tests.

Cette classe a des méthodes pour écrire des choses (code Java) sur un FWW passé en paramètre.
   - Si on passe le MFW, il va l'utiliser en place du FWW.

## La classe JavaGeneratorTest
Dans le méthode de test, on crée un MFW et on le passe en paramètre à JavaGenerator.

Ensuite, on compare avec le résultat attendu.
