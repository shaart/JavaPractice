package another;

public class HowToAbstractClass {

    private void fly() {
        System.out.println("abs");
    }

    public static void main(String[] args) {
        HowToAbstractClass ac = new P();
        ac.fly();
        P p = new P();
        p.fly();
    }
}

class P extends HowToAbstractClass {
    protected void fly() {
        System.out.println("p");
    }
}