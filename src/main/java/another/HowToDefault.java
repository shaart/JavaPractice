package another;

interface AA {
    default int dod() {
        return 0;
    }
}

class A implements AA {
}

class B extends A {
}

public class HowToDefault {
    public static void main(String[] args) {
        AA aa = new B();
        System.out.println(aa.dod());
    }
}
