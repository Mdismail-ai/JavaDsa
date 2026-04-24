import java.util.Arrays;
import java.util.Collections;

public class reverseArrays {
    // swaping the array and we are not ovverriding them its optimized way 
    public static void reverseArrayss(int a []){
       for(int i =0 ; i<a.length/2 ; i ++  ){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
       }
       System.out.println(Arrays.toString(a));
    }


// swaping the array and we are not ovverriding them using the collections only work on the classess
    public static void reverseArraysss(Integer a []){
       Collections.reverse(Arrays.asList(a));
       System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a []  = {12,234,234,324,543,6,5,2,5432,5};
        Integer b []  = {12,234,234,324,543,6,5,2,5432,5};
          reverseArrayss(a);
          reverseArraysss(b);
    }
}
