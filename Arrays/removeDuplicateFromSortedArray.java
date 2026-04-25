import java.util.*;
public class removeDuplicateFromSortedArray {
    public static int removeDuplicateFromSortedArrays(int a []){
        int k =  0 ;
        for (int i = 1 ; i < a.length ;  i++){
            if(a[i]!=a[k]){
                k++;
                a[k] = a [i];
            }
            
        }
        System.out.println(Arrays.toString(Arrays.copyOf(a, k + 1)));
        return k+1;
        
    }
    public static void main(String[] args) {
        int a [] = {1,1,2,2,3,4,5,6,7,8,9,9};
        System.out.println(removeDuplicateFromSortedArrays(a));
    }
}
// removing duplicates from sorter array 
