enum direction{
    left,
    right
}


public class ArrayRotate {

        public static int[] rotateRight(int[] a ,int count,direction dir) {
            //no need to perfom mat if count is 0;
            if (count > 0) {
                //make working copy of input array
                int[] dataCopy = new int[a.length];
                //divide count by length of array remain is actual shift
                int shift = count% dataCopy.length;
                int pos;
                for (int i = 0; i < dataCopy.length; i++) {
                    //if direcion is right position index is shift+actual loop index. Divide by array length solve index out of bounds exception when we are close to end of array
                    if(dir == direction.right)
                        pos = (shift + i) % dataCopy.length;
                    else
                    //if direction is left position index is calculated form the end of array and subtracted from actual loop index. Divide by array length performs same
                        pos =(i-shift+ dataCopy.length) % dataCopy.length;
                    dataCopy[pos] = a[i];
                }
                return dataCopy;
            } else
                return a;
        }

        public static void main(String[] args) {


            System.out.println("Array rotate");
            System.out.println("=============");


            int[] a = {1, 2, 3, 4};
            int[] b = rotateRight(a,5,direction.right);
            System.out.println(java.util.Arrays.toString(a));

            System.out.println(java.util.Arrays.toString(b));


            int[] c = {1, 2, 3, 4, 5, 6, 7};
            int[] d = rotateRight(c,8,direction.left);
            System.out.println(java.util.Arrays.toString(c));

            System.out.println(java.util.Arrays.toString(d));

        }
}
