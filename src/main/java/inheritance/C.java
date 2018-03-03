package inheritance;

public class C extends B {
    // ~~ FIELDS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // == FINAL STATIC =============================
    final static int statID = 3;
    final static int _defFinStat = statID;
    private final static int _privFinStat = statID;
    protected final static int _protFinStat = statID;
    public final static int _pubFinStat = statID;
    // == FINAL ====================================
    final int ID = statID;
    final int _defFin = this.ID;
    private final int _privFin = this.ID;
    protected final int _protFin = this.ID;
    public final int _pubFin = this.ID;
    // == STATIC ===================================
    static int _defStat = statID;
    private static int _privStat = statID;
    protected static int _protStat = statID;
    public static int _pubStat = statID;

    // == COMMON ===================================
    int _def = this.ID;
    private int _priv = this.ID;
    protected int _prot = this.ID;
    public int _pub = this.ID;

    // ~~ METHODS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // == COMMON ===================================
    int def() {
        return this.ID;
    }

    private int priv() {
        return this.ID;
    }

    protected int prot() {
        return this.ID;
    }

    public int pub() {
        return this.ID;
    }

    // == FINAL ====================================
    private final int privFin() {
        return this.ID;
    }

//    final int defFin() {
//        return this.ID;
//    }
//
//    protected final int protFin() {
//        return this.ID;
//    }
//
//    public final int pubFin() {
//        return this.ID;
//    }

    // == STATIC ===================================
    static int defStat() {
        return statID;
    }

    private static int privStat() {
        return statID;
    }

    protected static int protStat() {
        return statID;
    }

    public static int pubStat() {
        return statID;
    }

    // == FINAL STATIC =============================

    private final static int privFinStat() {
        return statID;
    }

//    final static int defFinStat() {
//        return statID;
//    }
//
//    protected final static int protFinStat() {
//        return statID;
//    }
//
//    public final static int pubFinStat() {
//        return statID;
//    }
}
