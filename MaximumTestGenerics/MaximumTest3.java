package MaximumTestGenerics;

public class MaximumTest3 {

    public static void main(String[] args) {
        Integer[] x = {2, 4, 10};
        findMax(x);
        Float[] y = {10.1f, 1.2f, 9.9f};
        findMax(y);
        String[] z = {"Pear", "Apple", "Orange"};
        findMax(z);
    }

    public static <E extends Comparable<E>> E findMax(E[] list) {
        E max = list[0];
        for(int i = 0; i < list.length; i++){
            if(list[i].compareTo(max) > 0){
                max = list[i];
            }
        }
        System.out.println("Maximum value : " + max);
        return max;
    }

}





