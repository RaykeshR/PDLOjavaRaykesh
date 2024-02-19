package fr.eseo.pdlo.essais.exercices.utilisateurs;

//import fr.eseo.pdlo.exercices.utilisateurs.Annuaire;
import fr.eseo.pdlo.exercices.utilisateurs.*;

public class AnnuaireEssai {
    public static void main(String[] args) {
        Annuaire A = new Annuaire();
        System.out.println(A);
        A.ajouter(new Personne());
        System.out.println(A);System.out.println(A.supprimer(null));System.out.println(A);

        System.out.println("\najout des Personne");
        Personne Raykesh    = new Personne("Raykesh",   "Ravirooban","française",2003);
        Personne Lea        = new Personne(("Lea"),(    "LUDET"));
        Personne Senghor    = new Personne("Senghor",   "LONTSI GUIETO");
        Personne Coumba     = new Personne("Coumba",    "MBAYE");
        Personne Maxence    = new Personne("Maxence",   "KLEIN");
        Personne Teo        = new Personne("Teo",       "MEYRAT");
        Personne[] L = {Raykesh,Lea,Senghor,Coumba,Maxence,Teo};
        for (Personne R : L) {
            A.ajouter(R);
        }
        System.out.println(A);
        System.out.println();
        Senghor.setAnneeDeNaissance(2024);
        System.out.println("annee changée");
        System.out.println(Senghor);
        System.out.println(A);
        A.supprimer("LONTSI GUIETO");
        System.out.println(A);
        System.out.println("Personne Supprimer");
        A.ajouter(Senghor);
        System.out.println(A);
        System.out.println(A.chercher("LONTSI GUIETO"));
        System.out.println(A.chercher("Ravirooban"));
        System.out.println(A.chercher("ABBOUD"));
        
    }
}
