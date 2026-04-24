import java.util.Arrays;



public class secondLargestFromArray {
    // sorting the array using the sort functiont to find the second largest number
    public static void secondLargestFromArrays(int a []){
         Arrays.sort(a);
         int result =  a[a.length -2];
         System.out.println(result); 
    }
    // findin the second largest number in the arrays using the  loops 
    public static void secondLargestFromArrayss(int a []){
        for (int i = 0; i<a.length ; i++){
            for (int j = i+1; j<a.length ; j++){
            if( a[i]> a[j]){
                int temp = a[i];
                a[i] = a [j];
                a[j] = temp ;
            }
        }
        }
        int result =  a[a.length -2];
         System.out.println(result); 

    }
    public static void main(String args[]){
        int a [] = {12,4,3,25,436,54,654,6,25,42};
        int b [] = {12,4,3,25,436,54,654,6,25,42};
       
        secondLargestFromArrays(a);
        secondLargestFromArrayss(a);
         // comparing the arrays 
         System.out.println(Arrays.equals(a,b));
        // copying array
        int c [] = Arrays.copyOf(a, 25);
        for(int i =0;i<c.length;i++){
            System.out.println( c[i]);
        }
       // Arrays fill the vluse 
       int d [] = new   int [10];
       Arrays.fill(d,50);
        for(int i =0;i<d.length;i++){
            System.out.println( d[i]);
        }
    }
}
