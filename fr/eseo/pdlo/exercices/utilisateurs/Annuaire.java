package fr.eseo.pdlo.exercices.utilisateurs;
//import java.util.ArrayList; // import the ArrayList class
//import java.util.Hashtable;
import java.util.HashMap; // import the HashMap class

public class Annuaire {
    //private ArrayList<Personne> P =new ArrayList<Personne>(); 
    //private Personne[] P; 
    //private Hashtable<String, Personne> P = new Hashtable<>();// Dictionary<String, Personne>
    private HashMap<String, Personne> P ;//= new HashMap<String, Personne>();

    //Constructeurs : 
    public Annuaire (){
        this.P = new HashMap<String, Personne>();
    }
    public void ajouter (Personne unePersonne ){/*P.add( unePersonne );*/P.put(unePersonne.getNom(), unePersonne); }
    public Personne chercher  (String nom){return P.get(nom);}
    public Personne supprimer (String nom){return P.remove(nom);}
    public String toString(){return P.toString();}
}
