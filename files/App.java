
class App {
    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        String res = "";
        String stock = null;
        for (int i = 0; i < str.length(); i++) {
            if (stock == null) {
                stock = Character.toString(str.charAt(i));
            } else {
                res += str.charAt(i);
                res += stock;
                stock = null;
            }
        }

        if (stock != null) {
            res += stock;
        }

        return res;
        // END
    }

    public static void main(String[] args) {
        System.out.println(
                encrypt("move") // "omev"
        );
        System.out.println(
                encrypt("attack") // "taatkc"
        );
        System.out.println(
                encrypt("go!") // "og!"
        );
    }
}
