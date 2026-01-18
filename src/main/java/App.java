import org.apache.commons.lang3.StringUtils;

class App {

  public static String capitalizeWords(String sentence) {
    // split разделяет строку по пробелу
    var words = sentence.split(" ");
    for (var i = 0; i < words.length; i++) {
      // Приводим первую букву слова к верхнему регистру
      // И заменяем слово в массиве
      words[i] = StringUtils.capitalize(words[i]);
    }
    // Соединяет массив используя разделитель
    return String.join(" ", words);
  }

  public static String buildDefinitionList(String[][] items) {

    if (items.length == 0) {
      return "";
    }

    final int titleIndex = 0;
    final int descrIndex = 1;

    var result = new StringBuilder();
    result.append("<dl>");

    for (String[] string : items) {
      result.append("<dt>");
      result.append(string[titleIndex]);
      result.append("</dt>");

      result.append("<dd>");
      result.append(string[descrIndex]);
      result.append("</dd>");
    }

    result.append("</dl>");

    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println("Hello world");
  }
}