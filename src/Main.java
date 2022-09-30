public class Main {
    public static void main(String[] args) throws Exception {
        Fraction f1 = new Fraction();
        assert "0/1".equals(f1.toString()) : "assertion 1 : faux";
        System.out.println(f1.toString());

        Fraction f2 = new Fraction(34, 45);
        assert "0/1".equals(f2.toString()) : "assertion 2 : faux";
        System.out.println(f2.toString());

        Fraction f3 = new Fraction(6);
        assert "0/1".equals(f3.toString()) : "assertion 3 : faux";
        System.out.println(f3.toString());
    }
}
