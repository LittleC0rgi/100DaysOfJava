import java.util.Arrays;

class App {
  public static int getTotalAmount(String[] banknotes, String currency) {
    String[] tempArr = new String[banknotes.length];
    int count = 0;

    for (int i = 0; i < banknotes.length; i++) {
      if (banknotes[i].contains(currency)) {
        tempArr[count] = banknotes[i].replace(currency, "").trim();
        count++;
      }
    }

    System.out.println(Arrays.toString(tempArr)); // изменено здесь

    int res = 0;
    for (String string : tempArr) {
      if (string == null) {
        break;
      }
      res += Integer.parseInt(string);
    }

    System.out.println(res);

    return res;
  }

  public static void main(String[] args) {
    String[] banknotes1 = { "eur 10", "usd 1", "usd 10", "rub 50", "usd 5" };
    App.getTotalAmount(banknotes1, "usd"); // 16

    String[] banknotes2 = { "eur 10", "usd 1", "eur 5", "rub 100", "eur 20", "eur 100", "rub 200" };
    App.getTotalAmount(banknotes2, "eur"); // 135

    String[] banknotes3 = { "eur 10", "rub 50", "eur 5", "rub 10", "rub 10", "eur 100", "rub 200" };
    App.getTotalAmount(banknotes3, "rub"); // 270
  }
}
