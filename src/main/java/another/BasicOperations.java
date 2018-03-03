package another;

import java.util.ArrayList;

public class BasicOperations {
    public static void main(String[] args) {
        double a = 1.0;
//        float b = 2.1; // need
        float b = 2.1f;
        double c = 4.0;
        float d = 0.9f;
        Float e = 0.9f;
        System.out.println("a + b = " + (a + b));
        System.out.println("(a + b) == 3.1 ? " + ((a + b) == 3.1));
        System.out.println("(a + b) == 3.1f ? " + ((a + b) == 3.1f));
        System.out.println("c - d = " + (c - d));
        System.out.println("(a + b) == (c - d) ? " + ((a + b) == (c - d)));
        System.out.println("(float)(a + b) == (float)(c - d) ? " + ((float) (a + b) == (float) (c - d)));

        double f = (1.0 / 3) * 3;
        System.out.println(f);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Float.MIN_EXPONENT);
        System.out.println(Float.MIN_NORMAL);
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(0.f);

        System.out.println(Short.MAX_VALUE);
        System.out.println((short) (Short.MAX_VALUE + 1));
        System.out.println((short) 1921222);

        long x = 5;
        long y = x = 3;
        System.out.println(x + "<-x y->" + y);

        String s = null;
        boolean condtion = false;
        if (condtion)
            s = "A";
        System.out.println(s);
        try {
//        System.out.println(s.length()); // NullPointer
            System.out.println("S = " + s.toString());
        } catch (Exception ex) {
            System.out.println("Exception on s.toString()! " + ex.toString());
        }
        s += "Z";
        System.out.println(s);
    }
}
