package fr.eseo.pdlo.projet.geom;

//public class Ellipse extends Forme{
//	// Constantes de classe
//    static final double LARGEUR_PAR_DEFAUT = 100;
//    static final double HAUTEUR_PAR_DEFAUT = 100;
//    //TODO
//	@Override
//	public double aire() {
////		return Math.pi*smallDiamater*largeDiamatere;
//		return Math.PI*largeur*hauteur;
//	}
//	@Override
//	public double perimetre() {
//		return Math.PI * Math.sqrt(2*(Math.pow(getlargeur(), gethauteur())));
//	}
//    
//}
public class Ellipse extends Forme {
    public Ellipse() {
        this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
    }
 
    public Ellipse(Coordonnees position, double largeur, double hauteur) {
        super(position, largeur, hauteur);
    }
 
    public Ellipse(double largeur, double hauteur) {
        this(new Coordonnees(), largeur, hauteur);
    }
 
    public Ellipse(double x, double y, double largeur, double hauteur) {
        this(new Coordonnees(x, y), largeur, hauteur);
    }
 
    public Ellipse(Coordonnees position) {
        this(position, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
    }
 
   //implémentation des méthodes abstraites de la classe Forme
    public double aire() {
        return (Math.PI * getLargeur() * getHauteur());
    }
 
    public double perimetre() {
        return (Math.PI * Math.sqrt(2 * (Math.pow(getLargeur(), 2) + Math.pow(getHauteur(), 2))));
    }


}