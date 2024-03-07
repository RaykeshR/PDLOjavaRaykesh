package fr.eseo.pdlo.projet.geom;

public class Cercle extends Ellipse {
	 
    public Cercle() {
        this(new Coordonnees(), 100);
    }
 
    public Cercle(Coordonnees position, double largeur) {
        super(position, largeur, largeur);
    }
 
    public Cercle(double largeur) {
        this(new Coordonnees(), largeur);
    }
 
    public Cercle(double x, double y, double largeur) {
        this(new Coordonnees(x, y), largeur);
    }
 
    public Cercle(Coordonnees point) {
        this(point, LARGEUR_PAR_DEFAUT);
    }
 
    /*
     * On choisit d’ignorer la variable d’instance hauteur d’un Cercle et de ne
     * considérer que sa largeur . On s’assure ainsi que la hauteur et la
     * largeur sont toujours égales .
     */
    public double getHauteur() {
        return getLargeur();
    }
 
    public void setHauteur(double newHauteur) {
        setLargeur(newHauteur);
    }
}

//public class Cercle extends Ellipse{
//
//	@Override
//	public double aire() {
//		//public double aire() {return 2*Math.pi*radius*raduis;}
//		return 2*Math.PI*largeur*hauteur;
//	}
//
//	@Override
//	public double perimetre() {
//		// TODO Auto-generated method stub
//		return super.perimetre();
//	}
//	//TODO
//	//
//
//	
//}
