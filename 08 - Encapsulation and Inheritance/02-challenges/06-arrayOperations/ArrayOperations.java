public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
        double mean () {
            double sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum /numbers.length;
        }
        double median (int array) {
            return 0;
        }
    }
}
