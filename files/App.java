class App {
    public static void main(String[] args) {
        System.out.println(
                getSquare(10, 10, 60) // Приблизительно 43.3
        );
    }

    public static double getSquare(int a, int b, int degrees) {
        double radians = Math.toRadians(degrees);
        return (a * b * Math.sin(radians)) / 2;
    }
}