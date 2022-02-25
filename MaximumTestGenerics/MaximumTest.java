package MaximumTestGenerics;

public class MaximumTest {
    static Integer[] x;

    public static void main(String[] args) {
        Integer[] x = {1, 5, 7};
        int max = findMax(x);
        System.out.println(max);
    }

    private static int findMax(Integer[] x) {
        int i=0;
        int max = x[i];

        for (i = 0; i < x.length; i++) {

            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
}
