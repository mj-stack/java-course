package in.kgcoding.varargs;

public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(1,2,3,4,5,6));
    }

    public static int sum(int first, int second, int... a) {
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

//    public static int sum(int[] a) {
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
