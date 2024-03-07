package fr.eseo.pdlo.projet.geom;
import java.util.ArrayList;

public class Trace extends Coordonnees {
	//private Coordonnees points;
	private ArrayList<Coordonnees> points; //=new ArrayList<Rectangle>();
	

	public Trace(Coordonnees pos1, Coordonnees pos2){
		points.add(pos1);points.add(pos2);
	}

	public ArrayList<Coordonnees> getPoints() {return points;}
	public void ajouterPoint(Coordonnees pos) {points.add(pos);}
	public void setX() {}
	public void setY() {}
}
