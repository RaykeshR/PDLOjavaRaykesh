package fr.eseo.pdlo.exercices.triangle;

public class Triangle {
    private int coteA, coteB, coteC;

    public int getCoteA() {return coteA;}
    public int getCoteB() {return coteB;}
    public int getCoteC() {return coteC;}
        public void setCoteA(int coteA) {this.coteA = coteA;}
        public void setCoteB(int coteB) {this.coteB = coteB;}
        public void setCoteC(int coteC) {this.coteC = coteC;}
    public Triangle(int coteA, int coteB, int coteC){
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }
    public int[] getCotes(){
        return new int[]{coteA, coteB, coteC}; 
    }
    public void setCotes(int a,int b ,int  c){
        setCoteA(a);
        setCoteB(b);
        setCoteC(b);
    }
    public TriangleType getType(){
        if (getCoteA() + getCoteB() <= getCoteC() || getCoteA() + getCoteC() <= getCoteB() || getCoteB() + getCoteC() <= getCoteA()) {
            return TriangleType.NON_TRIANGLE;
        } else if (getCoteA() == getCoteB() && getCoteB() == getCoteC()) {
            return TriangleType.EQUILATERAL;
        } else if (getCoteA() == getCoteB() || getCoteB() == getCoteC() || getCoteA() == getCoteC()) {
            return TriangleType.ISOCELE;
        } else {
            return TriangleType.SCALENE;
        }
    }
    public String toString(){
        return "Triangle : "+getType().toString();
    }
}
