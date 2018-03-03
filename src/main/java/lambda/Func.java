package lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Func {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.forEach(el -> System.out.println("Hello, " + el));

        Function<Integer, String> intToString = (s) -> s.toString();
        UnaryOperator<Integer> sqr = i -> {
            System.out.println("sqr");
            return i * i;
        };
        UnaryOperator<Integer> add20 = i -> {
            System.out.println("add20");
            return i + 20;
        };
        Function<String, String> makeString = s -> {
            System.out.println("makeString");
            return String.format("%s (%d)", s, s.length());
        };
        Function<String, String> printResult = s -> {
            System.out.println("printResult");
            System.out.println(s);
            return s;
        };

        intToString.compose(sqr).andThen(makeString).andThen(printResult).compose(add20).apply(32);

        intToString.compose((Integer i) -> {
            System.out.println("c1");
            return i;
        }).andThen((String s) -> {
            System.out.println("a1");
            return s;
        }).compose((Integer i) -> {
            System.out.println("c2");
            return i;
        }).andThen((String s) -> {
            System.out.println("a2");
            return s;
        }).compose((Integer i) -> {
            System.out.println("c3");
            return i;
        }).andThen((String s) -> {
            System.out.println("a3");
            return s;
        }).apply(32);
    }
}
