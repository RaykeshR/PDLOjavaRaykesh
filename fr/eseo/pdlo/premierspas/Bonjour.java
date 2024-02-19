package fr.eseo.pdlo.premierspas;
class Bonjour {
    public static void main ( String [] args ){
        System .out. println (" Bonjour   cher   utilisateur ");
        if (args.length==0) {
            System.out.println("Aucun argument n'a été passé en ligne de commande");
            
        }else if (args.length==1) {
            System.out.println (" Voici l'arguments passé"+ " en ligne de commande :");
            System .out. println (" Argument : "+args[0]);            
        }else{
            System.out.println (" Voici  les "+args.length+" arguments  passés "+ "en ligne de commande :");
            for (int i=0;i< args . length ;i ++){
                System .out. println (" Argument  Numero "+ (i+1) + " : " + args [i ]);
            }
        }
    }
}
/*
javac fr\eseo\pdlo\premierspas\Bonjour.java
java fr.eseo.pdlo.premierspas.Bonjour Raykesh
 Bonjour   cher   utilisateur 
 Voici l'arguments passÃ© en ligne de commande :
 Argument : Raykesh
 */