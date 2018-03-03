package another;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HowToIterableAndIterators {
    public static void main(String[] args) {
        MyInts ints = new MyInts(1, 100);
        for (Integer i : ints) {
            System.out.println(i);
        }
    }
}

class MyInts implements Iterable<Integer> {
    private Integer start = 0;
    private Integer end = 100;

    public MyInts() {
    }

    public MyInts(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new X2Iterator(start, end);
    }
}

class X2Iterator implements Iterator<Integer> {
    private Integer start = 0;
    private Integer end = 100;
    private Integer next;
    private Integer current;

    public X2Iterator() {
        next = start;
    }

    public X2Iterator(Integer start, Integer end) {
        this.start = start;
        this.end = end;
        next = start;
    }

    @Override
    public boolean hasNext() {
        return (next != null && next <= end && next >= start && next != 0);
    }

    @Override
    public Integer next() {
        if (this.hasNext()) {
            current = next;
            next <<= 1;

            return current;
        }
        throw new NoSuchElementException();
    }
}