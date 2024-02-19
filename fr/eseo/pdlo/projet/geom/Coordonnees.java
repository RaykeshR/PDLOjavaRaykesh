package fr.eseo.pdlo.projet.geom;
//ls -R
public class Coordonnees {
    double x,y;
    public double getX() {return x;}
        public void setX(double x) {this.x = x;}
    public double getY() {return y;}
        public void setY(double y) {this.y = y;}
        
    public Coordonnees(double x,double y){
        this.x = x;
        this.y = y;
    }
    //Coordonnees(){}
    public Coordonnees(){
        //this.x = 0;
        //this.y = 0;
        this(0,0);
    }
    public void deplacerVers(double x, double y){
        //this.x = x;
        //this.y = y;
        setX(x);
        setY(y);
    }
    public void deplacerDe(double deltaX, double deltaY){
        //this.x += deltaX;
        //this.y += deltaY;
        setX(getX()+deltaX);
        setY(getY()+deltaY);
    }
    public double distanceVers(Coordonnees coord){
        //double absdeltaX=(this.x-coord.x)>0?(this.x-coord.x):-(this.x-coord.x);
        //double absdeltaY=(this.y-coord.y)>0?(this.y-coord.y):-(this.y-coord.y);
        //return Math.sqrt(absdeltaX*absdeltaX+absdeltaY*absdeltaY);
        return Math.sqrt(Math.pow(coord.getX()-this.getX(), 2)+Math.pow(coord.getY()-this.getY(), 2));
    }
    public double angleVers(Coordonnees coord){
        //tan(angle)=opp/adj
        //return Math.atan2(this.y-coord.y, this.x-coord.x);
        return Math.atan2(coord.y-this.y, coord.x-this.x);
    }

}
