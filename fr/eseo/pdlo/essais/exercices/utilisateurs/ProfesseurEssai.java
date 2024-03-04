package fr.eseo.pdlo.essais.exercices.utilisateurs;

import fr.eseo.pdlo.exercices.utilisateurs.Professeur;

public class ProfesseurEssai {
	public static void main(String args[]) {
		Professeur Raykesh = new Professeur("Raykesh","Ravirooban");
		//System.out.println(Raykesh.toString());
		System.out.println(Raykesh);Raykesh.ajouterCours("Raykesh");Raykesh.ajouterCours("Math_Raykesh");
		System.out.println(Raykesh);
	}
}
