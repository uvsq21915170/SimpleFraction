public class Main {
    public static void main(String[] args) throws Exception {
        Fraction f1 = new Fraction(0,1);
        assert f1.toString().equals("0/1") : "assertion 1.1 fausse";
        System.out.println(f1.toString());

        Fraction f2 = new Fraction(16, 264);

        System.out.println(f2.simplify());

        Fraction f3 = new Fraction(6, 1);
        assert "6/1".equals(f3.toString()) : "assertion 3 est fausse";

        Fraction f4 = new Fraction(2, 264).add(new Fraction(7,132));

        System.out.println(f4.simplify());

        Fraction f = new Fraction(9,4);
        assert f.add(new Fraction(4, 30)).toString().equals("143/60");

        assert f2.equals(f4) == true;

        assert f2.compareTo(f4) == 0;
        assert f2.compareTo(f1) == 1;

        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(0, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) > 1E-8;
    }
}
