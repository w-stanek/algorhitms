package arrays;

public class ArrayReverse{

    public static int[] reverse(int[] a) {
        int[] dataCopy = new int [a.length];
        int i2 = 0;
        for(int i = a.length-1;i>=0;i--){
            dataCopy[i2] = a[i];
            i2++;
        }
        return dataCopy;
    }
    public static void main(String[] args) {


        System.out.println("Array reverse");
        System.out.println("=============");


        int[] a = {1, 2, 3, 4};
        int[] b = reverse(a);
        System.out.println(java.util.Arrays.toString(a));

        System.out.println(java.util.Arrays.toString(b));


        int[] c = {1, 2, 3, 4, 5, 6, 7};
        int[] d = reverse(c);
        System.out.println(java.util.Arrays.toString(c));

        System.out.println(java.util.Arrays.toString(d));

    }
}