class App {
    public static void swap(int[] numbers) {
        // BEGIN (write your solution here)
        if (numbers.length < 2) {
            return;
        }

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
        // END
    }
}
