package another;

public class AbstractClass {

    private void fly() {
        System.out.println("abs");
    }

    public static void main(String[] args) {
        AbstractClass ac = new P();
        ac.fly();
        P p = new P();
        p.fly();
    }
}

class P extends AbstractClass {
    protected void fly() {
        System.out.println("p");
    }
}