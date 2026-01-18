class App {
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