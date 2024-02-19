package fr.eseo.pdlo.exercices.complexe.cartesien;
import java.lang.Math;

public class Complexe {
    private double reelle;
    private double imaginaire;

    // Constructeur :
    public Complexe(){}//this(0,0);
    public Complexe(double reelle, double imaginaire){this.reelle = reelle;this.imaginaire=imaginaire;}
    /*
    * Si estPolaire == true
    * arg1 est le module et arg2 est l’argument
    * du complexe à créer
    * sinon
    * arg1 est la partie réelle et
    * arg2 est la partie imaginaire
    * du complexe à créer
    */
    public Complexe ( boolean estPolaire , double arg1 , double arg2 ){
        if (estPolaire){
            this.reelle = arg1*Math.cos(arg2);
            this.imaginaire = arg1*Math.sin(arg2);
        }else{
            this.reelle = arg1;
            this.imaginaire = arg2;
        }
    }
    
    //Getters and Setters

    public double getImaginaire() {return this.imaginaire;}
    public double getReelle() {return this.reelle;}
        public void setImaginaire(double imaginaire) {this.imaginaire = imaginaire;}
        public void setReelle    (double reelle    ) {this.reelle = reelle;}
    

    public double getModule  (){return Math.sqrt(Math.pow(getReelle(),2)+Math.pow(getImaginaire(),2));}
    public double getArgument(){return Math.atan2(getImaginaire(), getReelle());}
        public void setModule  (double mod){
            //puissent changer leurs modules (en maintenant leurs arguments constants) ;
            double ard = getArgument();
            setReelle(mod * Math.cos(ard));
            setImaginaire(mod * Math.sin(ard));
        }
        public void setArgument(double ard){
            //puissent changer leurs arguments (en maintenant leurs modules constants) ;
            double mod = getModule();
            setReelle(mod * Math.cos(ard));
            setImaginaire(mod * Math.sin(ard));
        }

    @Override
    public String toString() { return this.getReelle() + " + " + this.getImaginaire() + "i ";}


    /**
     * @author Raykesh
     * @return Somme : (a+bi)+(c+di)=(a+c),(b+d)
     * @param nombre complexe à additioner @version 1.000.000.000.015 @since 1.000.000.000.013 @exception TODO @see #Complexe @deprecated X @throws Exception 
     */
    public Complexe plus(Complexe autre){ 
        return new Complexe(this.getReelle() + autre.getReelle(),  this.getImaginaire() + autre.getImaginaire());
    }
    /**
     * Produit : (a+bi)*(c+di)=ac-bd+i(ad+bc)
     * @param autre le nombre complexe avec lequel on veut effectuer le produit
     * @return le resultat du produit entre ce nombre complexe et l'autre nombre 
     */
    public Complexe fois(Complexe autre){
        //double R = this.getReelle()*autre.getReelle() - this.getImaginaire()*autre.getImaginaire();
        //double I = this.getReelle()*autre.getImaginaire() + this.getImaginaire()*autre.getReelle();
        //Complexe resultat = new Complexe(R, I);
        //return resultat;
        return new Complexe(this.getReelle()*autre.getReelle() - this.getImaginaire()*autre.getImaginaire(), this.getReelle()*autre.getImaginaire() + this.getImaginaire()*autre.getReelle());
    }
    public String formeCanonique (){
        if  (this.getImaginaire()==0)
            return ""+this.getReelle();
        else
            if  (this.getReelle()==0)
                return getImaginaire()+"i";
            else
                return toString();
    }
    public void afficheInfo () {
        System.out.print("Forme algebrique : ");
        System.out.println(toString());
        System.out.print("Forme Canonique : ");
        System.out.println(formeCanonique());

        System.err.print("\tPartie Reelle : ");
        System.err.println(getReelle());
        System.err.print("\tPartie Imaginaire : ");
        System.err.println(getImaginaire());

        System.out.print("\u001B[30m");
        System.out.print(" \t\t\tModule : ");
        System.out.print(getModule());
        System.out.print("\t (au carre : "+Math.pow(getModule(),2)+")");
        System.out.println("\u001B[36m");
        System.out.print(" \t\t\tArgument : ");
        System.out.print(getArgument());
        System.out.print("\t (en degre : "+Math.toDegrees(getArgument())+")");
        System.out.println("\u001B[0m");
    }
    public void afficheInfo (String C) {
        System.out.print ("\n"+C+" : \n");
        afficheInfo();
    }
    
}
