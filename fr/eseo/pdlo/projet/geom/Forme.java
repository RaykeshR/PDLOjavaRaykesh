package fr.eseo.pdlo.projet.geom;

public abstract class Forme {
	/*
	* La classe abstraite Forme définit des constantes de classe publiques . On y accédera de la façon suivante :
	* Forme . LARGEUR_PAR_DEFAUT et Forme . HAUTEUR_PAR_DEFAUT
	*/
	public final static double LARGEUR_PAR_DEFAUT =100;
	public final static double HAUTEUR_PAR_DEFAUT =150;
	

	/* Les variables d’instances privées de la classe
	* abstraite
	*/
	private double largeur;
	private double hauteur;
	private Coordonnees position ;
	
	//Constructeur : 
	public Forme() {
		//largeur=LARGEUR_PAR_DEFAUT;
		//hauteur=HAUTEUR_PAR_DEFAUT;
		//position=new Coordonnees();
		this(new Coordonnees (), LARGEUR_PAR_DEFAUT ,HAUTEUR_PAR_DEFAUT );
	}
	//abstract Forme(Coordonnees position,double largeur, double hauteur);
	public Forme( Coordonnees position,double largeur, double hauteur) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.position = position;
	}
	//abstract Forme(double largeur, double hauteur);
	public Forme(double largeur, double hauteur) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public Forme ( Coordonnees position ){this ( position , LARGEUR_PAR_DEFAUT , HAUTEUR_PAR_DEFAUT );}
	public Forme ( double x, double y, double largeur , double hauteur ){
		this ( new Coordonnees (x,y), largeur , hauteur );
	}
	
	
	// Getter et Setter	
	//abstract public double getPosition();
		//abstract public void setPosition(Coordonnees position);
	
	/*
	* Les méthodes d’instances de la classe abstraite Forme seront héritées par les sous-classes de Forme .
	* Ces dernières pourront donc les utiliser .
	*/
	public Coordonnees getPosition (){return position ;}
		public void setPosition ( Coordonnees position ){this . position = position ;}
	
//	abstract public double getLargeur();
//		abstract public void setLargeur(double x);
//	abstract public double getHauteur();
//		abstract public void setHauteur(double y);
		
	public double getLargeur() {return largeur;}
		public void setLargeur(double largeur) {this.largeur = largeur;}
	public double getHauteur() {return hauteur;}
		public void setHauteur(double hauteur) {this.hauteur = hauteur;}
		
//	abstract public double getX();
//		abstract public void setX(double x);
//	abstract public double getY();
//		abstract public void setY(double y);
	public double getX() {return position.getX();}	
		public void setX(double x) {position.setX(x);};
	public double getY() {return position.getY();};
		public void setY(double y) {position.setY(y);};
	
	public double getMaxX() {return (getX() + getLargeur());}
    public double getMaxY() {return (getY() + getHauteur());}
    public double getMinX() {return (getX());}
    public double getMinY() {return getY();}
		
		
		
		
//	public void deplacerDe(double x,double y);
//	public void deplacerVers(double deltaX,double deltaY);
	public void deplacerVers(double x, double y) {
        getPosition().deplacerVers(x, y);
    }
 
    public void deplacerDe(double deltaX, double deltaY) {
        getPosition().deplacerDe(deltaX, deltaY);
    }
	
	/*
	* Dé claration des mé thodes abstraites de la classe .
	* Seules les signatures des méthodes abstraites
	* doivent être spécifiées.
	*/
	abstract public double aire();
	abstract public double perimetre();

	
	@Override
	public String toString() {
        return ("[ " + this.getClass().getSimpleName() + "] " + " pos : (" + getX() + " ," + getY() + ")" + " dim "+ getLargeur() + " x " + getHauteur() + "périmètre :" + perimetre() + " aire : " + aire());
    }
	
	//... // Définition des autres méthodes d’instances concrètes
		
	
	

	
	
}
