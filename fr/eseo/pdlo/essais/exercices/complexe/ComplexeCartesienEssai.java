package fr.eseo.pdlo.essais.exercices.complexe;

import fr.eseo.pdlo.exercices.complexe.cartesien.Complexe;

public class ComplexeCartesienEssai {
    public static void main(String[] args) {
        Complexe C = new Complexe();
        System.out.println(C);
        C = new Complexe(1,1);
        System.out.println(C);
        System.out.println("\n Module : ");
        System.out.println(C.getModule());
        System.out.println(Math.sqrt(2));
        System.out.println("\n Argument : ");
        System.out.println(C.getArgument());
        System.out.println(Math.toDegrees(C.getArgument()));
        test(C);
        C = new Complexe(1,1);
        test(C);


        System.out.println("setModule : \n");System.out.println(C);C.setModule(2);
        //System.out.print("\u001B[30m");
        //System.out.print(" Module : ");
        //System.out.println(C.getModule());
        //System.out.print("\u001B[36m");
        //System.out.print(" Argument : ");
        //System.out.println(C.getArgument());
        //System.out.print("\u001B[0m");
        test(C);
        System.out.println(C);
        C.setModule(Math.sqrt(2));
        System.out.println(C);
        System.out.println("setArgument : \n");System.out.println(C);C.setArgument(Math.toRadians(90));
        //System.out.print("\u001B[30m");
        //System.out.print(" Module : ");
        //System.out.println(C.getModule());
        //System.out.print("\u001B[36m");
        //System.out.print(" Argument : ");
        //System.out.println(C.getArgument());
        //System.out.print("\u001B[0m");
        test(C);
        System.out.println(C);
        System.out.println(" : \n");
        if (false){
            C = new Complexe(1,-1);
            System.out.println(C);
            System.out.println("\n Module : ");
            System.out.println(C.getModule());
            System.out.println("\n Argument : ");
            System.out.println(C.getArgument());
            System.out.println(Math.toDegrees(C.getArgument()));
            System.out.println(-180+Math.toDegrees(C.getArgument()));}
        //TODO
        C = new Complexe(2,2);
        System.out.println(C);
        System.out.println("\n Module : ");
        System.out.println(C.getModule());
        System.out.println("\n Argument : ");
        System.out.println(C.getArgument());
        System.out.println(Math.toDegrees(C.getArgument()));
        System.out.println(-180+Math.toDegrees(C.getArgument()));

        System.out.print("Raykesh\r");
        System.out.print(" Raykesh\r");System.out.print(" Raykesh\r");System.out.print(" Raykesh\r");
        System.out.print(" \r \n \r");
        System.out.println(" \n");
        System.out.println(" \n\n\n\n\n\n\n");
        C = new Complexe(1,1);
        System.out.println(C);
        test(C);
        C.setModule(2*(Math.sqrt(2)));
        System.out.println(C);
        test(C);
        //C.setModule((Math.sqrt(2)));
        //C = new Complexe(1,1);
        C.setArgument(0);
        System.out.println(C);
        test(C);
        C.setArgument(3.1415926535897932384626433832795028841971693993751058);
        System.out.println(C);
        test(C);
        System.err.println(C.toString());
        Complexe C1,C2,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,Ci,CR,i,j;
        C = new Complexe(1,1);
        C2 = new Complexe(2,2);C1=new Complexe(5,5);Ci=new Complexe(0,1);CR=new Complexe(5,0);i=new Complexe(0,1);j=new Complexe(0,1);
        // System.out.println(C.plus(C2));
        // System.out.println(C1);
        // System.out.println(C1.fois(i));
        // System.out.println(C1.fois(i).fois(i));
        // System.out.println(Ci.fois(i));

        // System.out.println(C1.formeCanonique());
        // System.out.println(C1.fois(i).formeCanonique());
        // System.out.println(C1.fois(i).fois(i).formeCanonique());
        // System.out.println(Ci.fois(i).formeCanonique());
        // System.out.println(CR.formeCanonique());
        // System.out.println(i.formeCanonique());
        System.out.println();
        C.afficheInfo();
        C1.afficheInfo("C1");
        C2.afficheInfo("C2");
        i.afficheInfo("i");
        C8 = new Complexe(true,1,3.14/4);
        C8.afficheInfo("C8 en Polaire");
        C9 = new Complexe(true,Math.sqrt(2),3.1415926535897932384626433832795028841971693993751058/4);
        C9.afficheInfo("C9 en Polaire");
    }
    // module et argument de C
    static void test(Complexe C){
        System.out.print("\u001B[30m");
        System.out.print(" Module : ");
        System.out.print(C.getModule());
        System.out.print("\t (au carre : "+Math.pow(C.getModule(),2)+")");
        System.out.println("\u001B[36m");
        System.out.print(" Argument : ");
        System.out.print(C.getArgument());
        System.out.print("\t (en degre : "+Math.toDegrees(C.getArgument())+")");
        System.out.println("\u001B[0m");
    }
}
//javac fr\eseo\pdlo\essais\exercices\complexe\ComplexeCartesienEssai.java
//java fr.eseo.pdlo.essais.exercices.complexe.ComplexeCartesienEssai
//javac fr\eseo\pdlo\essais\exercices\complexe\ComplexeCartesienEssai.java ; java fr.eseo.pdlo.essais.exercices.complexe.ComplexeCartesienEssai
