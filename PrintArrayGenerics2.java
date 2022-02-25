package PrintArray;

public class PrintArrayGenerics2<X, Y, Z> {
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public PrintArrayGenerics2(X[] myXArray, Y[] myYArray, Z[] myZArray){
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Double[] b = {1.1, 2.2, 5.0};
        Character[] c = {'t', 'e', 'j'};
        new PrintArrayGenerics2<Integer, Double, Character>(a, b, c).toPrint();
    }

    public void toPrint(){
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }

    private static <E> void toPrint(E[] a) {
        for (E i : a) {
            System.out.println(i);
        }
    }
}
