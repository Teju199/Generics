package PrintArray;

public class PrintArrayGenerics {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Double[] b = {1.1, 2.2, 5.0};
        Character[] c = {'t', 'e', 'j'};
        toPrint(a);
        toPrint(b);
        toPrint(c);
    }

    private static <E> void toPrint(E[] a) {
        for(E i : a){
            System.out.println(i);
        }
    }
}

