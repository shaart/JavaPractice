package another;

import java.util.ArrayList;
import java.util.List;

public class HowToList {
    public static void main(String[] args) {

        ArrayList<Number> input = null;
        List<Number> output = null;

        output = process(input);
    }

    public static <E extends Number> List<E> process(List<E> nums) {
        return new ArrayList<>();
    }
}
