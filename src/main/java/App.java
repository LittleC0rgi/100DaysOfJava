import java.util.ArrayList;
import java.util.List;

class App {

  public static void bubbleSort(int[] items) {
    var stepsCount = items.length - 1;
    boolean swapped;
    do {
      swapped = false;
      for (int i = 0; i < stepsCount; i++) {
        var temp = items[i];
        items[i] = items[i + 1];
        items[i + 1] = temp;
        swapped = true;
      }
    } while (swapped);
  }

  return result.stream().mapToInt(Integer::intValue).toArray();

  }

  public static void main(String[] args) {

  }
}
