package arrays;

public class ArrayReverse2 {

        public static int[] reverse(int[] a) {
            //declaration and creation of working copy of array
            int[] dataCopy = new int [a.length];
            System.arraycopy(a,0,dataCopy,0,dataCopy.length);
            //setting endpoint to half of array length
            int Endpoint = dataCopy.length/2;
            //setting last index to end of array
            int lastIndex = dataCopy.length-1;
            int temp;
            //iterate through half of till start and end indexes meets there
            for(int i=0;i <=Endpoint;i++){
                //swapping values along center
                temp = dataCopy[lastIndex];
                dataCopy[lastIndex] = dataCopy[i];
                dataCopy[i] = temp;
                lastIndex--;
            }
            return dataCopy;
        }
        public static void main(String[] args) {


            System.out.println("Array reverse");
            System.out.println("=============");


            int[] a = {1, 2, 3, 4};
            int[] b = reverse(a);
            System.out.println(java.util.Arrays.toString(a));
            // [1, 2, 3, 4] expected
            System.out.println(java.util.Arrays.toString(b));
            // [4, 3, 2, 1] expected

            int[] c = {1, 2, 3, 4, 5, 6, 7};
            int[] d = reverse(c);
            System.out.println(java.util.Arrays.toString(c));
            // [1, 2, 3, 4, 5, 6, 7] expected
            System.out.println(java.util.Arrays.toString(d));
            // [7, 6, 5, 4, 3, 2, 1] expected
        }
}
