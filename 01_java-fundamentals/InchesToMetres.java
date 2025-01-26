class InchesToMetres {
    private static void println(String message) {
        System.out.println(message);
    }

    private static String getInchString(int inches) {
        if (inches == 1) {
            return "inch";
        } else {
            return "inches";
        }
    }

    public static void main(String[] args) {
        final int inchesPerFoot = 12;
        final int totalInches = inchesPerFoot * 12;
        final double metresPerInch = 1 / 39.37;

        int inches;
        for (inches = 1; inches <= totalInches; inches++) {
            String metres = String.format("%.2f", inches * metresPerInch);
            println(inches + " " + getInchString(inches) + " is equal to " + metres + " metres.");

            if (inches % 12 == 0) println("");
        }
    }
}
