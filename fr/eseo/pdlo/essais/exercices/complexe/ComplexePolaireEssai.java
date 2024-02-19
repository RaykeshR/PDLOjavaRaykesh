package fr.eseo.pdlo.essais.exercices.complexe;
import fr.eseo.pdlo.exercices.complexe.polaire.Complexe;

public class ComplexePolaireEssai {
    public static void main(String[] args) {
        //Complexe C = new Complexe();
        Complexe C = new Complexe(true,1,1);
        C.afficheInfo();
        C = new Complexe(true,Math.sqrt(2),Math.toRadians(45));
        C.afficheInfo("C");
    }
}
