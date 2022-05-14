package arrays;

public class ArraySortBubble {
    public static int[] sort(int[] a){
        int[] dataCopy = new int[a.length];
        //make a working copy of array to prevent input data modification
        System.arraycopy(a,0,dataCopy,0,dataCopy.length);
        //set initial number of iterations
        int cyclesRemaining = dataCopy.length-1;
        //array is sorted when number of iterations needed reach 0
       while(cyclesRemaining >0){
                for(int i=0;i<cyclesRemaining;i++) {
               int temp = dataCopy[i];
               if (temp > dataCopy[i + 1]) {
                   dataCopy[i] = dataCopy[i + 1];
                   dataCopy[i + 1] = temp;
               }
           }
            //number of iterations needed is reduced with each pass because there is no need to iterate through already sorted numbers
            cyclesRemaining--;
        }
        return dataCopy;
    }
    public static void main(String[] args) {


        System.out.println("Array reverse");
        System.out.println("=============");


        int[] a = {4, 2, 1, 3};
        int[] b = sort(a);
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(b));


        int[] c = {7, 3, 1, 6, 5, 4, 7};
        int[] d = sort(c);
        System.out.println(java.util.Arrays.toString(c));
        System.out.println(java.util.Arrays.toString(d));

    }
}
