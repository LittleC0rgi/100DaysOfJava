class App {
    public static String getHiddenCard(String cardNumber, int countDot) {
        return "*".repeat(countDot) + cardNumber.substring(12);
    }

    public static String getHiddenCard(String cardNumber) {
        return App.getHiddenCard(cardNumber, 4);
    }

    public static void main(String[] args) {
        System.out.println(
                App.getHiddenCard("2034399002121100", 1) // "*1100"
        );

        System.out.println(
                App.getHiddenCard("1234567812345678", 2) // "**5678"

        );

        System.out.println(
                App.getHiddenCard("1234567812345678", 3) // "***5678"

        );
    }
}
