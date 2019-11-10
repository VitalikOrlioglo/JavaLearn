package basics.j2_types_operators;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        // arithmetic basics;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (b--));
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

        // comparison basics;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        // bitwise basics;
        int e = 60;	/* 60 = 0011 1100 */
        int f = 13;	/* 13 = 0000 1101 */
        int g = 0;

        g = e & f;       /* bitwise and 12 = 0000 1100 */
        System.out.println("e & f = " + g );

        g = e | f;       /* bitwise or 61 = 0011 1101 */
        System.out.println("e | f = " + g );

        g = e ^ f;       /* XOR 49 = 0011 0001 */
        System.out.println("e ^ f = " + g );

        g = ~e;          /* bitwise complement -61 = 1100 0011 */
        System.out.println("~e = " + g );

        g = e << 2;     /* left shift 240 = 1111 0000 */
        System.out.println("e << 2 = " + g );

        g = e >> 2;     /* right shift 215 = 1111 */
        System.out.println("e >> 2  = " + g );

        g = e >>> 2;     /* zero right shift 215 = 0000 1111 */
        System.out.println("e >>> 2 = " + g );


        // logical basics;
        boolean i = true;
        boolean j = false;

        System.out.println("i && j = " + (i&&j)); // and

        System.out.println("i || j = " + (i||j) ); // or

        System.out.println("!(i && j) = " + !(i && j)); // logical not


        // Assignment basics;
        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= a = " + c );

        c &= a ;
        System.out.println("c &= 2  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );


        // Ternary operator or conditional operator (? :)
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );

        // instanceof
        String name = "Олег";
        // Следующее верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println( result );



        String foo = "a string";
        String bar = "a string"; // bar будет указывать на тот же объект что и foo
        String baz = new String("a string"); // Чтобы гарантированно создать новую строку надо вызвать конструктор
        System.out.println("foo == bar ? " + (foo == bar)); // == сравнивает ссылки на объекты
        System.out.println("foo равен bar ? " + (foo.equals(bar))); // Метод equals служит для проверки двух объектов на равенство
        System.out.println("foo == baz ? " + (foo == baz));
        System.out.println("foo равен baz ? " + (foo.equals(baz)));
    }
}
