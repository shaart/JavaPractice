package another;

public class HowToString {
    public static void main(String[] args) {

        {
            String s = null;
            boolean condtion = false;
            if (condtion)
                s = "A";
            System.out.println(s);
            try {
//                System.out.println(s.length()); // NullPointer
                System.out.println("S = " + s.toString());
            } catch (Exception ex) {
                System.out.println("Exception on s.toString()! " + ex.toString());
            }
            s += "Z";
            System.out.println(s);
        }
        System.out.println();
        {
            int num = 4;
//            String asString = num + 1; // NOT COMPILE
        }
        {
            String s = "Hello";
            String t = new String(s);
            if ("Hello".equals(s)) System.out.println("one");
            if (t == s) System.out.println("two");
            if (t.equals(s)) System.out.println("three");
            if ("Hello" == s) System.out.println("four");
            if ("Hello" == t) System.out.println("five");
        }
        System.out.println();
        {
            String letters = "abcdef";
            System.out.println(letters);
            System.out.println(letters.length());
            System.out.println(letters.charAt(3));
//            System.out.println(letters.charAt(6)); // RUNTIME EXCEPTION
        }
        System.out.println();
        {
            String numbers = "012345678";
            System.out.println(numbers);
            System.out.println("1 3 -> \"" + numbers.substring(1, 3) + "\"");
            System.out.println("7 7 -> \"" + numbers.substring(7, 7) + "\"");
            System.out.println("7 -> \"" + numbers.substring(7) + "\"");
        }
        System.out.println();
        {
            String a = "";
            a += 2;
            a += 'c';
            a += false;
            System.out.println(a);
            if ( a == "2cfalse") System.out.println("=="); // FALSE
            if ( a.equals("2cfalse")) System.out.println("equals"); // TRUE
        }
        {
            int total = 0;
            StringBuilder letters = new StringBuilder("abcdefg");
            total += letters.substring(1, 2).length();
            total += letters.substring(6, 6).length();
//            total += letters.substring(6, 5).length();
            System.out.println(total);
        }
        System.out.println();
        {
            StringBuilder numbers = new StringBuilder("0123456789");
            numbers.delete(2, 8); // 0189
            numbers.append("-").insert(2, "+"); // 0189- -> 01+89-
            System.out.println(numbers);
        }
        System.out.println();
        {
            // StringBuilder b = "rumble"; // WONT COMPILE
            StringBuilder b = new StringBuilder("rumble");
            b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
            System.out.println(b);
        }
    }
}
