package fr.eseo.pdlo.projet.geom;

public class FormeComposee extends Forme {
	private Forme[] formes;

	public Forme[] getFormes() {
		return formes;
	}

	public FormeComposee(Forme[] lesFormes) {
		formes =lesFormes;
	}
	public void ajouter(Forme forme) {
		formes=new Forme[formes.length+1];
		int i=0;
		for (Forme form : formes) {
			//...
			formes[i++]=form;
		}
		formes[formes.length-1]=forme;
	}
	public void setX(double x) {super.setX(x);}
	public void setY(double y) {super.setY(y);}
	public void setPosition(Coordonnees pos) {super.setPosition(pos);}
	
	@Override
	public void setLargeur(double largeur) {super.setLargeur(largeur);}

	@Override
	public void setHauteur(double hauteur) {super.setHauteur(hauteur);}

	@Override
	public void deplacerVers(double x, double y) {super.deplacerVers(x, y);}

	@Override
	public void deplacerDe(double deltaX, double deltaY) {super.deplacerDe(deltaX, deltaY);}

	@Override
	public String toString() {return super.toString();}

	@Override
	public double aire() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 0;
	}



}
