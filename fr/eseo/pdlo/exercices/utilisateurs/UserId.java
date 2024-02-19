package fr.eseo.pdlo.exercices.utilisateurs;
class UserId {
    public static void main(String[] args) {
        //un nom, un prénom, une nationalité et, éventuellement, une année de naissance
        Personne User = new Personne();
        
        if (args.length>0) 
            User.setNom(args[0]);
        if (args.length>1) 
            User.setPrenom(args[1]);
        if (args.length>2) 
            User.setNationalite(args[2]);
        if (args.length>3) 
            User.setAnneeDeNaissance(Integer.parseInt(args[3]));
        System.out.println(User.identite()+" ==> "+User.userID());

    }
}
