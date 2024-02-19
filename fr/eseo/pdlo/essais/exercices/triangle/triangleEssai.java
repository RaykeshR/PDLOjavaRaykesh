package fr.eseo.pdlo.essais.exercices.triangle;
import fr.eseo.pdlo.exercices.triangle.Triangle;

public class triangleEssai {
    public static void main(String[] args) {
        Triangle T = new Triangle(5,5,5);
        System.out.println(T);              //Triangle : Equilatéral
        System.out.println(T.getCoteC());   //5
        T.setCotes(3, 4, 5);//3**2+4**2=9+16=25=5**5
        System.out.println(T.getType());
    }
}
