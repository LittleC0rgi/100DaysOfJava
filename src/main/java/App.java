import java.util.StringJoiner;
import org.apache.commons.lang3.ArrayUtils;

class App {

  public static String makeCensored(String str, String[] censorWords) {
    var words = str.split(" ");
    var result = new StringJoiner(" ");

    for (var word : words) {
      if (ArrayUtils.contains(censorWords, word)) {
        result.add("$#%!");
      } else {
        result.add(word);
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
  }
}