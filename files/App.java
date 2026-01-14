import java.util.Arrays;

class App {
  public static int[] getSameParity(int[] numbers) {
    if (numbers.length == 0) {
      return numbers;
    }

    int firstNumberParity = Math.abs(numbers[0]) % 2;
    int[] tempArrNumbers = new int[numbers.length];
    int count = 0;

    for (int number : numbers) {
      if (Math.abs(number) % 2 == firstNumberParity) {
        tempArrNumbers[count] = number;
        count++;
      }
    }

    return Arrays.copyOfRange(tempArrNumbers, 0, count);
  }

  public static void main(String[] args) {
    // Тестовые примеры
    int[] numbers1 = {};
    System.out.println(Arrays.toString(getSameParity(numbers1))); // []

    int[] numbers2 = { 1, 2, 3 };
    System.out.println(Arrays.toString(getSameParity(numbers2))); // [1, 3]

    int[] numbers3 = { 1, 2, 8 };
    System.out.println(Arrays.toString(getSameParity(numbers3))); // [1]

    int[] numbers4 = { 2, 2, 8 };
    System.out.println(Arrays.toString(getSameParity(numbers4))); // [2, 2, 8]

    int[] numbers5 = { -3, 2, 1 };
    System.out.println(Arrays.toString(getSameParity(numbers5))); // [-3, 1]
  }
}
