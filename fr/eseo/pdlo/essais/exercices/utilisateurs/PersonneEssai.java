package fr.eseo.pdlo.essais.exercices.utilisateurs;
//import fr.eseo.pdlo.*;
//import fr.eseo.pdlo.exercices.utilisateurs.*;

import fr.eseo.pdlo.exercices.utilisateurs.Personne;

public class PersonneEssai {
    public static void main(String[] args) {
        Personne Raykesh = new Personne();
        //Personne Léa,Senghor,Coumba,Maxence,Teo = new Personne();        //Personne[] L = {Raykesh,Léa,Senghor,Coumba,Maxence,Teo};
        Personne Lea= new Personne();Personne Senghor= new Personne();Personne Coumba= new Personne();Personne Maxence= new Personne();Personne Teo= new Personne();
        //Personne[] L = new Personne[6];
        Raykesh.setPrenom("Raykesh");
        Raykesh.setNom("Ravirooban");
        Raykesh.setNationalite("française");;
        Raykesh.setAnneeDeNaissance(2003);
        Lea.setPrenom("Lea  ");Senghor.setPrenom("Senghor");Coumba.setPrenom("Coumba");Maxence.setPrenom("Maxence");Teo.setPrenom("Teo");
        Lea.setNom("      LUDET");Senghor.setNom("LONTSI GUIETO");Coumba.setNom("         MBAYE");Maxence.setNom("       KLEIN");Teo.setNom("           MEYRAT");
        Personne[] L = {Raykesh,Lea,Senghor,Coumba,Maxence,Teo};

        System.out.println(Raykesh.identite());
        for (Personne R : L) {System.out.println(R.identite());Personne.incrementeNbPersonnes();}
        System.out.println(Personne.getNbPersonnes());
        System.out.println(Raykesh.userID());
        System.out.println(Raykesh.identite()+" ==> "+Raykesh.userID());
        System.out.println("Nombre de Personne  : "+Personne.getNbPersonnes());
        
        //System.out.println("Réoknveroàè");
        //System.out.println(Raykesh.clean("Réoknveroàè"));
        //System.out.println("Réoknveroàè".replaceAll("é", "e"));
        
        //for (char i : "Raykesh".toCharArray())System.out.println(i);
        
        //for (String i : "Raykesh".split(""))System.out.println(i);
        
        
    }
}
