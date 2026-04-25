import java.util.Arrays;

public class twoArraysIntoSameArray {
    public static int[] twoArraysIntoSameArrays(int a [], int b []){
        int x = a.length;
       int result [] = new int[a.length+ b.length];
       for(int i = 0 ; i < x ; i++){
           result[i] = a[i];
       }
       for(int i = 0 ; i < b.length ; i++){
           result[x+i] = b[i];
       }
       return result ;
    }
    public static void main(String[] args) {
        int a [] = {1,3435,43,5,235,43,5,2435};
        int b [] = {1,3435,43,5,235,43,5,2435};
        System.out.println(Arrays.toString(twoArraysIntoSameArrays(a, b)));
    }
}
