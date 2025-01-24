// Demostrate the if statement.
class IfDemo {
    private static void println(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) println("a is less than b");

        if (a == b) println("You won't see this");

        println("");

        c = a - b; // 2 - 3 = -1
        println("c contains " + c);

        if (c >= 0) println("c is non-negative");
        if (c < 0) println("c is negative");
    }
}
