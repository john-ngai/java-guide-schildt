// This table displays a conversion table of gallons to litres.
class GalToLitTable {
    private static void println(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        int gallons;
        double litres;

        for (gallons = 0; gallons <= 100; gallons++) {
            litres = gallons * 3.7854;
            String roundedLitres = String.format("%.3f", litres);
            println(gallons + " gallon(s) is " + roundedLitres + " litres");

            if (gallons % 10 == 0) println("");
        }
    }
}
