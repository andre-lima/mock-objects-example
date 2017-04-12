# mock-objects-example
Mock objects example for Java

## Dans MAIN:
On crée le fichier et un FileWriter.

Après, on crée un FileWriterWrapper et on lui donne le FileWriter comme paramètre. 
   - Dans le programmer normale, le FW et le FWWrapper font la même chose.
   - Dans les tests, au lieu d'envoier un FW, ou va envoyer un MockFileWriter
   
Ensuite, on appelle le methode write du FWW et une méthode de JavaGenerator 
   - Dans le programmer normale, tout va être écrit dans un fichier txt
   - Dans les tests, on compare le texte de sortie avec du résultat attendu.

## La Classe FileWriterWrapper
Ne fait que copier les fonctionnalités de FileWriter qu'on a besoin.

## La Classe MockFileWriter
Extends FileWriterWrapper et Overrides le méthode write pour pouvoir concaténer des Strings ou lieu de les écrire dans le fichier.

## La Classe JavaGenerator
Les méthodes ici prennent un FWW comme paramètre.
   - Puisque le MockFileWriter extends de FWW, on peut aussi envoyer un MFW comme paramètre. Ça va être utile au moment d'écrire les tests.
