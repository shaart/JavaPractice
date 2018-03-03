package another;

import java.util.ArrayList;
import java.util.List;

public class HowToList {
    public static void main(String[] args) {

        ArrayList<Number> input = null;
        List<Number> output = null;

        output = process(input);


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        ArrayList<String> list2 = new ArrayList<>(list1);
        list2.add("2");
        System.out.println("list1 == list2 ? " + (list1 == list2));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        String[] arr = list2.toArray(new String[0]);
        System.out.println("Change array at foreach: ");
        for (String sa : arr) {
            System.out.print(sa + " -> ");
            sa = "value";
            System.out.println(sa);
        }
        System.out.println("Now have: ");
        for (String sa : arr) {
            System.out.print(sa + " ");
        }
        System.out.println("\nChange at for()");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> value");
            arr[i] = "value";
        }
        System.out.println("Now have array: ");
        for (String sa : arr) {
            System.out.print(sa + " ");
        }
        System.out.println("\nList: ");
        for (String sl : list2) {
            System.out.print(sl + " ");
        }
        System.out.println();
        list2.set(0, "val");
        System.out.println("Change 0 element at list to 'val'. Now have array: ");
        for (String sa : arr) {
            System.out.print(sa + " ");
        }
        System.out.println();
    }

    public static <E extends Number> List<E> process(List<E> nums) {
        return new ArrayList<>();
    }
}
