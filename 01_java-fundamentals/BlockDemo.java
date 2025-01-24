// Demonstrate a block of a code
class BlockDemo {
    private static void println(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        int num = 3;

        if (num <= 0) {
            println("A num of " + num + " is less than or equal to zero");
        } else {
            println("A num of " + num + " is greater than zero");
        }
    }
}
