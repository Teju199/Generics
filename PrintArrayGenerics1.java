package PrintArray;

public class PrintArrayGenerics1<E> {
    private E[] myArray;

    public PrintArrayGenerics1(E[] myArray){

        this.myArray = myArray;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Double[] b = {1.1, 2.2, 5.0};
        Character[] c = {'t', 'e', 'j'};
        new PrintArrayGenerics1<Integer>(a).toPrint();
        new PrintArrayGenerics1<Double>(b).toPrint();
        new PrintArrayGenerics1<Character>(c).toPrint();
    }

    public void toPrint(){

        toPrint(myArray);
    }

    private static <E> void toPrint(E[] e) {
        for (E i : e) {
            System.out.println(i);
        }
    }
}
