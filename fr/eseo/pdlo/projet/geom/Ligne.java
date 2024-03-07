package fr.eseo.pdlo.projet.geom;

public class Ligne extends Forme {

	Coordonnees C1=super.getPosition();
	Coordonnees C2;

	public Ligne() {super();
	C2=new Coordonnees(0+LARGEUR_PAR_DEFAUT,0+HAUTEUR_PAR_DEFAUT);}

	public Ligne(Coordonnees position, double largeur, double hauteur) {
		super(position, largeur, hauteur);
		C2=new Coordonnees(position.getX()+largeur,position.getY()+hauteur);
	}

	public Ligne(Coordonnees position) {super(position);}

	public Ligne(double x, double y, double largeur, double hauteur) {
		super(x, y, largeur, hauteur);
	}

	public Ligne(double largeur, double hauteur) {
		super(largeur, hauteur);
	}

	//@Override
	public double aire() {
		return 0;
	}

	//@Override
	public double perimetre() {
		return C1.distanceVers(C2);
	}

	public Coordonnees getC1() {return C1;}
		public void setC1(Coordonnees c1) {C1 = c1;}

	public Coordonnees getC2() {return C2;}
		public void setC2(Coordonnees c2) {C2 = c2;}
		
	
	public double getXMin() {return super.getMinX();}
	public double getXMax() {return super.getMaxX();}
	public double getYMin() {return super.getMinY();}
	public double getYaxn() {return super.getMaxY();}
	
	
	
	
}


