package in.kgcoding.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        int sum  = test.sum(6, 7);
        test.printString("This is the best course");
    }

    public void printString(String toPrint) {
        System.out.println(toPrint);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
