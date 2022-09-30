public class Fraction {

    private int num;
    private int den;

    public Fraction(int num) {
        this.num = num;
    }

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
    
    
}
