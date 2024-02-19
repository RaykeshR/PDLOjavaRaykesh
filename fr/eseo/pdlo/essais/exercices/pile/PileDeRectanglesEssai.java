package fr.eseo.pdlo.essais.exercices.pile;

import fr.eseo.pdlo.exercices.pile.PileDeRectangles;
import fr.eseo.pdlo.projet.geom.Rectangle;

public class PileDeRectanglesEssai {
    public static void main(String[] args) {
        PileDeRectangles PileR = new PileDeRectangles();
        //TODO: implement
        System.out.println(PileR);
        //System.out.println(PileR.depiler());
        PileR.empiler(new Rectangle(0,0,100,50));
        System.out.println(PileR);
        PileR.empiler(new Rectangle(5,5,10,10));
        System.out.println(PileR);
        PileR.empiler(new Rectangle(-50,-50,100,100));
        System.out.println(PileR);
        PileR.empiler(new Rectangle(99,99,99,99));
        System.out.println(PileR);
        PileR.empiler(new Rectangle(9999,9999,9999,9999));
        System.out.println(PileR);
        System.out.println("R : \n\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(PileR.depiler());
        }
        PileR.empiler(new Rectangle(1,1,100,10));
        PileR.empiler(new Rectangle(5,5,500,50));
        test(PileR);
    }
    static void test(PileDeRectangles PileR){
        while (PileR.estVide() == false) {
            //System.out.print(PileR.depiler().getClass().getName() + " ");
            System.out.print(PileR.depiler() + " || ");
        }
    }
}
