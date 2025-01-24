// Demonstration of the for loop.
class ForDemo {
    private static void println(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        int count;

        for (count = 0; count < 5; count++) {
            println("This is count: " + count);
        }

        println("Done!");
    }
}
