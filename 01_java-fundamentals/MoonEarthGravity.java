class MoonEarthGravity {
    public static void main(String[] args) {
        int earthWeight = Integer.parseInt(args[0]);
        double moonWeight = earthWeight * 0.17;

        String message = "If my weight on Earth is " + earthWeight + " lb, then my weight on the moon is " + moonWeight + " lb.";
        System.out.println(message);
    }
}
