class App {
  public static int mult(int[] numbers) {
    if (numbers.length == 0) {
      return 0;
    }

    int sum = 1;
    for (int num : numbers) {
      sum *= num;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] numbers1 = { 1, 4, 3, 4, 5 };
    var res = App.mult(numbers1); // 240
    System.err.println(res);
  }
}
