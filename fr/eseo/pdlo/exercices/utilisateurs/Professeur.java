package fr.eseo.pdlo.exercices.utilisateurs;
import java.util.ArrayList;

public class Professeur extends Personne{
	private ArrayList<String> cours ;
	public Professeur(String prenom, String nom, String nationalite, int anneeDeNaissance){
        //this . nom = nom;
        //this . prenom = prenom ;
        //this . nationalite = nationalite ;
        //this . anneeDeNaissance = anneeDeNaissance ;
        //Personne . incrementeNbPersonnes ();
		super(prenom,nom,nationalite,anneeDeNaissance);
        cours =new ArrayList<String>();
	}
	public Professeur(String prenom, String nom){cours =new ArrayList<String>();}
	public void ajouterCours (String cours) {this.cours.add(cours);}
	//public ArrayList<Personne> getCours() {return L;}
	public ArrayList<String> getCours() {return cours;}
	
	public void setCours(ArrayList<String> cours) {
		this.cours = cours;
	}
	@Override
	public String toString() {
		return "Professeur "+cours;
	}
	
	//public void setL(ArrayList<Personne> l) {cours = l;}

}
