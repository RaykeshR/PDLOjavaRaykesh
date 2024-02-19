package fr.eseo.pdlo.exercices.pile;

import java.util.ArrayList;

import fr.eseo.pdlo.projet.geom.Rectangle;
/**
* La classe PileDeRectangles implémente une pile pouvant
* recevoir des instances de la classe Rectangles .
* La classe propose les fonctionnalités standard
* d’une pile , permettant de :
* <ol >
*   <li >créer une pile
*   <li > savoir si une pile est vide
*   <li > empiler un nouveau Rectangle au sommet de la pile
*   <li >dépiler le Rectangle en sommet de pile
* </ol >
* @author Raykesh Ravirooban
* @version 1.0
*/
public class PileDeRectangles {
    /*
    * La structure dynamique pour stocker l’empilement
    * de Rectangle
    * C’est une ArrayList de Rectangles
    * Cet attribut ne sert qu ’à l’implémentation
    * il doit être caché. Il est donc " private "
    */
    private ArrayList<Rectangle> L =new ArrayList<Rectangle>();
    /*
    * Créer une PileDeRectangles revient à
    * créer la structure qui
    * contiendra les Rectangles
    */
    public PileDeRectangles(){
        //...
    }
    /*
    * La PileDeRectangles est vide si la structure qui
    * contient les Rectangles à une taille nulle
    * Cette méthode doit être visible de tous .
    * Elle est donc " public "
    * @return un booléen indiquant si la pile est vide
    * ou non
    */
    public boolean estVide(){return L.isEmpty();}

    /*
    * Pour empiler un Rectangle il suffit de l’ajouter à
    * la structure de stockage de l’empilement
    * Cette méthode doit être visible de tous
    * Elle est donc " public "
    * @param le Rectangle qu ’on souhaite empiler
    */
    public void empiler(Rectangle r){L.add(r);}

    /*
    * Si la pile n’est pas vide il suffit
    * de supprimer le dernier Livre
    * et de le retourner pour le dépiler
    * Si la pile est vide la méthode provoquera
    * une erreur .
    * Cette méthode doit être visible de tous
    * Elle est donc " public "
    * @return le livre qui se trouvait au sommet
    * de la pile
    */
    public Rectangle depiler(){
        if (L.isEmpty())
            throw new RuntimeException("La pile est vide");
        return L.remove(L.size()-1);}

    public String toString(){return L.toString();}

    
    
}
