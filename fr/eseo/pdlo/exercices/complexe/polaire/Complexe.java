package fr.eseo.pdlo.exercices.complexe.polaire;

public class Complexe extends fr.eseo.pdlo.exercices.complexe.cartesien.Complexe{
    private double module;
    private double argument;

    // Constructeur :
    public Complexe(){}//this(0,0);
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
            this.module = arg1 ;
            this.argument = arg2;
        }else{
            this.module = Math.sqrt(Math.pow(arg1,2)+Math.pow(arg2,2));
            this.argument = Math.atan2(arg2,arg1);}
    }
    //TODO

//Getters and Setters

public double getImaginaire() {return module*Math.sin(argument); }
public double getReelle()     {return module*Math.cos(argument); }
    public void setImaginaire(double imaginaire) {}
    public void setReelle    (double reelle    ) {}


public double getModule  (){return this.module;}
public double getArgument(){return this.argument;}
    public void setModule  (double mod){this.module=mod;}
    public void setArgument(double ard){this.argument=ard;}


}
