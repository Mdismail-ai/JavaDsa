import java.util.Arrays;
public class rotateArrayFromKsteps {
    public static void reverse(int a [] , int start , int end ){
        while(start<=end){
            int temp = a [start];
             a[start] = a [end];
             a [end] = temp ;
             start++;
             end--;
        }
    }
        public static void rotateArrayFromKstepss(int a [] , int steps ){
        reverse(a, 0, steps-1);
        reverse(a, steps, a.length-1);
        reverse(a, 0, a.length-1);
    }
    public static void main(String[] args) {
        int a [] = {1234,23,532545,654,65,46,456,5,6,5,};
        rotateArrayFromKstepss(a, 1);
        System.out.println(Arrays.toString(a));
    }
}
