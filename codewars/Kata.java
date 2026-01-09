public class Kata {

    public static void main(String[] args) {
        System.out.println(evenOrOdd(4));
    }

    public static String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                return 0;
        }
    }
}
