public class   ex_20220808025 {
    public static void main(String[] args) {
        // Exercise One
        System.out.println("a  a^2  a^3");
        for (int a = 1; a <= 4; a++) {
            int aSquare = a * a;
            int aCube = a * a * a;
            System.out.println(a + "  " + aSquare + "   " + aCube);
        }
        // Exercise Two
        double  a = 9.5;
        double  b = 4.5;
        double  c = 2.5;
        int  d = 3;
        double e = 45.5;
        double f = 3.5;
        double g = a * b - c * d;
        double h = e - f;
        double Result = g / h;

        System.out.println( "Result = " + Result );

        // Exercise Three
        double transaction1 = 4 * ( 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double transaction2 = 4 * ( 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        System.out.println("Result of the transaction1 is =" + transaction1);
        System.out.println("Result of the transaction2 is =" + transaction2);

        // Exercise Four
        double pi = transaction1 + transaction2 / 2;
        double r = 5.5;
        double perimeter = 2 * pi * r;
        double area = pi * r * r;
        System.out.println(" The perimeter of circle is =" + perimeter);
        System.out.println(" The area of circle is =" + area);

        // Exercise Five
        double x = ((44.5*.55)-(50.2*5.9))/((3.4*.55)-(50.2*2.1));
        double y = ((3.4*5.9)-(44.5*2.1))/((3.4*.55)-(50.2*2.1));
        double m = x;
        double n = y;
        System.out.println( "x=" + m);
        System.out.println( "y=" + n);
        double E = (3.4 * m) + (50.2 * n);
        double F = (2.1 * m) + (.55 * n);
        System.out.println(" E=" + E);
        System.out.println( "F=" + F);

    }
}