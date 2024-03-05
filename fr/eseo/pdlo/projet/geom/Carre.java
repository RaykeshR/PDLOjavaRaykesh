package fr.eseo.pdlo.projet.geom;

public class Carre extends Rectangle {

	// Accessors : 
    //Getter
        //Setter 
        
	@Override
	public double getLargeur() {return super.getLargeur();}
		@Override
		public void setLargeur(double largeur) {super.setLargeur(largeur);super.setHauteur(hauteur);}
	@Override
	public double getHauteur() {return super.getHauteur();}
		@Override
		public void setHauteur(double hauteur) {super.setLargeur(largeur);super.setHauteur(hauteur);}
//	@Override
//	public Coordonnees getPosition() {return super.getPosition();}
//		@Override
//		public void setPosition(Coordonnees position) {super.setPosition(position);}

	
	//Constructeur : 
    public Carre(){
        //this(new Coordonnees(),100,100);
        super(LARGEUR_PAR_DEFAUT,LARGEUR_PAR_DEFAUT);
    }
    public Carre(Coordonnees position,double cote){
        setLargeur(cote);
        setHauteur(cote);
        setPosition(position);
    }
    public Carre(double cote){
        this(new Coordonnees(),cote,cote);}
    public Carre(double x,double y,double cote){
        this(new Coordonnees(x,y),cote,cote);}
        
    
    
    public Carre(Coordonnees position,double largeur,double hauteur){
        setLargeur(largeur);
        setHauteur(hauteur);
        setPosition(position);
    }
    public Carre(double largeur,double hauteur){
        this(new Coordonnees(),largeur,hauteur);}
    public Carre(double x,double y,double largeur,double hauteur){
        this(new Coordonnees(x,y),largeur,hauteur);}
	
	
	
		
    //TODO
}
