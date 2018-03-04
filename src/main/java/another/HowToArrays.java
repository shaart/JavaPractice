package another;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowToArrays {
    public static void main(String[] args) {
        {
            int[] d2[], d3[][];
            d2 = new int[1][2]; // 2D array
            d3 = new int[1][2][3]; // 3D array
        }
        {
            int[][] scores = new int[5][];
            Object[][][] cubbies = new Object[3][0][5];
//            int[][] types = new int[];
//            int[] ints = new int[];
        }
        {
            ArrayList<String> list = new ArrayList<>();
//            list.remove(0); // COMPILE OK, RUN - EXCEPTION
//            list.add(5);
        }
        System.out.println();
        {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(4);
            values.add(5);
            values.set(1, 6);
            values.remove(0);
            for (Integer v : values) System.out.print(v);
        }
        System.out.println();
        {
            List<Integer> list = Arrays.asList(10, 4, -1, 5);
            Collections.sort(list);
            Integer array[] = list.toArray(new Integer[4]);
            System.out.println(array[0]);
        }
        System.out.println();
        {
            List<String> hex = Arrays.asList("30", "8", "3A", "FF");
            Collections.sort(hex);
            int x = Collections.binarySearch(hex, "8");
            int y = Collections.binarySearch(hex, "3A");
            int z = Collections.binarySearch(hex, "4F");
            System.out.println(x + " " + y + " " + z);
        }
        System.out.println();
        {
            List<Integer> ages = new ArrayList<>();
            ages.add(Integer.parseInt("5"));
            ages.add(Integer.valueOf("6"));
            ages.add(7);
//            ages.add(null);
            for (int age : ages) System.out.print(age);
        }
    }
}
