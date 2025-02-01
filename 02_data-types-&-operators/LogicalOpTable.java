// Try This 2-2: a truth table for the logical operators.
class LogicalOpTable {
    private static final String tab = "\t";

    private static final void println(String message) {
        System.out.println(message);
    }

    private static final String getBooleanRow(
            boolean p,
            boolean q,
            boolean and,
            boolean or,
            boolean xor,
            boolean not
    ) {
        return p + tab + q + tab + and + tab + or + tab + xor + tab + not;
    }

    private static final int getIntFromBoolean(boolean value) {
        return value ? 1 : 0;
    }

    private static final String getBinaryRow(
            boolean p,
            boolean q,
            boolean and,
            boolean or,
            boolean xor,
            boolean not
    ) {
        return getIntFromBoolean(p) + tab + getIntFromBoolean(q) + tab + getIntFromBoolean(and) + tab + getIntFromBoolean(or) + tab + getIntFromBoolean(xor) + tab + getIntFromBoolean(not);
    }

    public static void main(String[] args) {
        boolean printBinary = false;
        if (args.length > 0) printBinary = args[0].equals("true");

        boolean p, q;

        // Column headers
        println("P" + tab + "Q" + tab + "AND" + tab + "OR" + tab + "XOR" + tab + "NOT");

        p = true;
        q = true;
        if (printBinary) {
            println(getBinaryRow(p, q, p & q, p | q, p ^ q, p != q));
        } else {
            println(getBooleanRow(p, q, p & q, p | q, p ^ q, p != q));
        }

        p = true;
        q = false;
        if (printBinary) {
            println(getBinaryRow(p, q, p & q, p | q, p ^ q, p != q));
        } else {
            println(getBooleanRow(p, q, p & q, p | q, p ^ q, p != q));
        }

        p = false;
        q = true;
        if (printBinary) {
            println(getBinaryRow(p, q, p & q, p | q, p ^ q, p != q));
        } else {
            println(getBooleanRow(p, q, p & q, p | q, p ^ q, p != q));
        }
    }
}
