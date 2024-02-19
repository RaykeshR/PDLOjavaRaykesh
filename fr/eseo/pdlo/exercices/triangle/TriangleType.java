package fr.eseo.pdlo.exercices.triangle;

public enum TriangleType {
    SCALENE (" Scalène"),
    ISOCELE (" Isocèle"),
    EQUILATERAL ("Equilatéral"),  //("Îquilatéral"),
    NON_TRIANGLE ("Non triangle ");
    private String typeTriangle ;//...
    private TriangleType ( String typeTriangle ) {
        this.typeTriangle = typeTriangle;//...
    }
    @Override
    public String toString (){
        return typeTriangle;//...
    }
}
