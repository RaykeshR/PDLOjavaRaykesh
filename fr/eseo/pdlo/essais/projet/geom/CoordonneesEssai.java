package fr.eseo.pdlo.essais.projet.geom;
import fr.eseo.pdlo.projet.geom.*;
class CoordonneesEssai {
    public static void main(String[] args) {
        Coordonnees c1 = new Coordonnees();
        Coordonnees c2 = new Coordonnees(1,-1);
        //Coordonnees C2 = new Coordonnees(100,200);
        System.out.println(c1.angleVers(c2));
        System.out.println(Math.toDegrees(c1.angleVers(c2)));
        System.out.println(Math.tan(-0.524));
        //System.out.println(c1.angleVers(C2));
        //System.out.println(Math.toDegrees(c1.angleVers(C2)));
    }
}
