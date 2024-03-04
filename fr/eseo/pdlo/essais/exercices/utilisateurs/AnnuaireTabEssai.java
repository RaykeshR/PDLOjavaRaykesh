package fr.eseo.pdlo.essais.exercices.utilisateurs;

import fr.eseo.pdlo.exercices.utilisateurs.*;

public class AnnuaireTabEssai {
	public static void main(String args[]) {
		Annuaire A=new Annuaire();
		Etudiant Raykesh = new Etudiant("Raykesh","Ravirooban",2003,1);
		System.out.println(Raykesh);
		Professeur RaykeshP = new Professeur("Raykesh","Ravirooban");
		System.out.println(RaykeshP);RaykeshP.ajouterCours("Raykesh");RaykeshP.ajouterCours("Math_Raykesh");
		System.out.println(RaykeshP);
		A.ajouter(RaykeshP);
		A.ajouter(Raykesh);
		A.ajouter(new Personne("Lea","LUDET"));
		A.ajouter(new Personne("Coumba","MBAYE"));
		A.ajouter(new Personne("Maxence","KLEIN"));
		A.ajouter(new Personne("Teo","MEYRAT"));
		System.out.println(A);
		A.ajouter(new Professeur("Raykesh","Ravirooban2"));
		System.out.println(A);
		Professeur RaykeshP3 = new Professeur("Raykesh","Ravirooban3");
		//System.out.println(RaykeshP3);
		RaykeshP3.ajouterCours("Raykesh");RaykeshP3.ajouterCours("Math_Raykesh");
		A.ajouter(RaykeshP3);
		System.out.println(A);
	}
}
