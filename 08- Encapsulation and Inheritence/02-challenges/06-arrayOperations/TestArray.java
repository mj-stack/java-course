public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[] {1, 3, 8});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
