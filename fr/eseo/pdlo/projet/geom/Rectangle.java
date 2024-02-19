package fr.eseo.pdlo.projet.geom;

public class Rectangle {
    // attribut : 
    public double largeur,hauteur;
    Coordonnees position;

    // Accessors : 
    //Getter
        //Setter
    public double getLargeur() {return largeur;}
        public void setLargeur(double largeur) {this.largeur = largeur;}
    public double getHauteur() {return hauteur;}
        public void setHauteur(double hauteur) {this.hauteur = hauteur;}
    public Coordonnees getPosition() {return position;}
        public void setPosition(Coordonnees position) {this.position = position;}

    //Constructeur : 
    public Rectangle(){
        this(new Coordonnees(),100,100);
    }
    public Rectangle(Coordonnees position,double largeur,double hauteur){
        setLargeur(largeur);
        setHauteur(hauteur);
        setPosition(position);
    }
    public Rectangle(double largeur,double hauteur){
        this(new Coordonnees(),largeur,hauteur);}
        public Rectangle(double x,double y,double largeur,double hauteur){
        this(new Coordonnees(x,y),largeur,hauteur);}
    

    // Méthode : 
    public void deplacerDe(double x,double y){getPosition().deplacerDe(x, y);}
    public void deplacerVers(double deltaX,double deltaY){getPosition().deplacerVers(deltaX, deltaY);}

    public double aire(){
        return getLargeur() * getHauteur();
    }
    
    public double perimetre(){
        return 2* (getLargeur()+getHauteur());
    }
    public String toString(){
        return "Rectangle: \u001B[31m{\u001B[30mPosition= ("+position.getX()+", "+position.getY()+")\u001B[0m, largeur=" + largeur + ", hauteur=" + hauteur + "\u001B[31m}\u001B[0m";
    }

}
