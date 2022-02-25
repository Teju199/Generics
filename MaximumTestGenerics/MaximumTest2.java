package MaximumTestGenerics;

public class MaximumTest2 {

    public static void main(String[] args) {
        Integer[] x = {1, 5, 7};
        Float[] y = {1.1f, 2.0f, 10.5f};
        String[] z = {"Tej", "Ram", "Shyam"};
        findMax(x);
        findMax(y);
        findMax(z);
    }

    private static void findMax(Integer[] x) {
        int i = 0;
        int max = x[i];

        for (i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        System.out.println(max);
    }

    private static void findMax(Float[] y) {
        int i;
        float max = y[0];

        for (i = 0; i < y.length; i++) {
            if (y[i] > max) {
                max = y[i];
            }
        }
        System.out.println(max);
    }

    private static void findMax(String[] z) {
        String max = z[0];

        for (int i = 0; i < z.length; i++) {
            if (z[i].length() > max.length()) {
                max = z[i];
            }
        }
        System.out.println(max);
    }

}
