package fr.eseo.pdlo.exercices.utilisateurs;

public class Personne {
    // Constantes de classe
    static final String NATIONALITE_PAR_DEFAUT = "française";

    // Variables de classe
    static int nbPersonnes;

    // Variables d'instance
    String nom;
    String prenom;
    int anneeDeNaissance;
    String nationalite;

    public Personne (){}
    /**
    * Constructeur permettant de créer des instances
    * de Personne dont on connait le nom , le prénom
    * et l’année de naissance
    */
    public Personne (String prenom, String nom, String nationalite, int anneeDeNaissance ){
        // Initialisation de l’attribut nom avec la
        // valeur de l’argument nom
        this .nom=nom;
        // Initialisation de l’attribut prenom avec la
        // valeur de l’argument prenom
        this . prenom = prenom ;
        // Initialisation de l’attribut nationalite
        // avec la valeur de l’argument nationalite
        this . nationalite = nationalite ;
        // Initialisation de l’attribut anneeDeNaissance
        // avec la valeur de l’argument anneeDeNaissance
        this . anneeDeNaissance = anneeDeNaissance ;
        // Incrémentation du nombre d’instance
        // de la classe 
        Personne . incrementeNbPersonnes ();
    }


    /**
    * Constructeur permettant de créer des instances de
    * Personne dont on connait le nom et le prénom.
    * Les instances créées ont une année de naissance
    * initialis ée à 0 pour indiquer l’absence de valeur
    * de cette information .
    */
    public Personne ( String prenom , String nom ){
        setNom (nom );
        setPrenom ( prenom );
        setAnneeDeNaissance (0);
        /*
        * NATIONALITE_PAR_DEFAUT é tant une constante de
        * classe , c’est à la classe qu ’on doit demander sa
        * valeur .
        */
        setNationalite ( Personne.NATIONALITE_PAR_DEFAUT );
        Personne . incrementeNbPersonnes ();
    }


    // Méthodes
    // Accesseurs et Mutateurs
    public String getNom () {return this . nom ;}

    public void setNom ( String nom ) {
        // affecte l’argument " nom " à
        // son attribut "nom " ( this . nom)
        this . nom = nom ;
    }

    public String getPrenom () {return this . prenom ;}

    public void setPrenom ( String prenom ) {
        // affecte l’argument " prenom "
        // à son attribut " prenom " ( this . prenom )
        this . prenom = prenom ;
    }

    public int getAnneeDeNaissance () {return this . anneeDeNaissance ;}

    public void setAnneeDeNaissance ( int anneeDeNaissance ) {
        // affecte l’argument " anneeDeNaissance "
        // à son attribut
        //" anneeDeNaissance " ( this . anneeDeNaissance )
        this . anneeDeNaissance = anneeDeNaissance ;
    }

    public String getNationalite () {return this . nationalite ;}

    public void setNationalite ( String nationalite ) {
        this . nationalite = nationalite ;
    }
    // Autres méthodes //
    // Mé thodes de classe
        
    public static int getNbPersonnes (){return nbPersonnes ;}
        
    public static void incrementeNbPersonnes (){nbPersonnes ++;}

    // Méthodes d’instance
    public int age( int annee ){
        // Retourne l ’\^{a}ge de la Personne l’annee donn ée
        // le jour de son anniversaire .
        return annee - getAnneeDeNaissance ();
    }

    public String identite(){
        //<prénom > <nom > - Né(e): <ann ée> Nationalité: <nationalit é>
        return getPrenom()+" "+getNom()+"\t - Ne(e): "+getAnneeDeNaissance()+" Nationalite: "+getNationalite();
    }
    public String userID(){
        //String username=...;
        if(clean(getNom()).length()<=5 && clean(getPrenom()).length()>3){
            return clean(getNom())                                   +clean(getPrenom()).substring(0,3)+(""+getAnneeDeNaissance()+"000").substring(2,4);
        }else if(clean(getNom()).length()<=5 && clean(getPrenom()).length()<=3){
            return clean(getNom())                                   +clean(getPrenom())                                   +(""+getAnneeDeNaissance()+"000").substring(2,4);
        }else if(clean(getNom()).length()>5 && clean(getPrenom()).length()<=3){
            return clean(getNom()).substring(0,5)+clean(getPrenom())                                   +(""+getAnneeDeNaissance()+"000").substring(2,4);
        }
        //if(clean(getNom()).length()>5 && clean(getPrenom()).length()>3)
            return clean(getNom()).substring(0,5)+clean(getPrenom()).substring(0,3)+(""+getAnneeDeNaissance()+"000").substring(2,4);
        
    }
    //ABBOUSam88
    String clean(String username){
        if(username==null)return "";
        String user=username.toLowerCase();
        String[][] L = {{" ",""},{"'",""},{"’",""},{"\"",""},{"[é,è,ê,ë]","e"},{"ô","o"},{"û","u"},{"ù","u"},{"à","a"},{"ï","i"},{"î","i"},{"ç","c"},};
        for (String[] i : L) {
            user=user.replaceAll(i[0], i[1]);
        }
        return user;
    }
    public String toString(){
        //return getPrenom()+" "+getNom()+" - Ne(e): "+getAnneeDeNaissance()+" Nationalite: "+getNationalite()+"userID:"+userID();}//return identite()+userID();}
        String S="";
        S+=(getPrenom()==null || clean(getPrenom()).equals(""))?"":getPrenom()+" " ;if(S.equals("Raykesh "))S="\u001B[36m"+S+"\u001B[0m";
        S+=(getNom   ()==null || clean(getNom())=="")?"":getNom()+" - " ;
        S+=(getAnneeDeNaissance()==0)?"":"\u001B[46mNe(e): "+getAnneeDeNaissance()+" \u001B[0m" ;
        S+=(getNationalite()==null || clean(getNationalite())=="")?"":"Nationalite: "+getNationalite() ;
        S+=(userID()==null || userID().equals("00"))?"":"\u001B[30m userID: "+userID()+" \u001B[0m" ;
        return S;
    }
}