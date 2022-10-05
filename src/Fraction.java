
public class Fraction extends Number implements Comparable<Fraction> {

    private int num;
    private int den;

    public static final Fraction ONE = new Fraction(1,1);
    public static final Fraction ZERO = new Fraction(0,1);

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
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

    private int pgcd(int a, int b) {
        if( b == 0) return a;
        else return pgcd(b,a%b);
    }

    public Fraction simplify() {
        int pgcd = pgcd(this.den, this.num);
        int new_den = this.den/pgcd;
        int new_num = this.num/pgcd;
        return new Fraction(new_num, new_den);
    }

    public Fraction add(Fraction f) {
        int new_num;
        int new_den;
        if(this.den != f.den) {
            new_num = this.num*f.den + f.num*this.den;
            new_den = this.den*f.den;
        }
        else {
            new_num = this.num + f.num;
            new_den = this.den;
        }
        return new Fraction(new_num, new_den).simplify();
    }
    
    public boolean equals(Fraction f) {
        if(this.den == f.den && this.num == f.num) 
            return true;
        else {
            Fraction new_this = this.simplify();
            Fraction new_f = f.simplify();

            if(new_this.den == new_f.den && new_this.num == new_f.num) 
                return true;
        }
        return false;
    }

    @Override
    public int compareTo(Fraction f) {
        int new_this_num;
        int new_f_num;

        if(this.den != f.den) {
            new_this_num = this.num*f.den;
            new_f_num = f.num*this.den;
        }
        else {
            new_this_num = this.num;
            new_f_num = f.num;
        }
        if(new_this_num == new_f_num) return 0;
        if(new_this_num > new_f_num) return 1;
        return -1;
    }

    @Override
    public int intValue() {
        return this.num/this.den;
    }

    @Override
    public long longValue() {
        return (long)this.num/(long)this.den;
    }

    @Override
    public float floatValue() {
        return (float)this.num/(float)this.den;
    }

    @Override
    public double doubleValue() {
        return (double)this.num/(double)this.den;
    }

}

