import java.util.*;

public class moveZerosToEnd {
    // moving zeros to end of the arrays using loops two pointers approch 
    public static int [] moveZerosToEnds(int a []){
        int j = 0;
        for(int i =0 ; i<a.length ; i++){
            if( a [i] != 0){
                int temp = a [i];
                a [i] = a [ j];
                a [ j] = temp; 
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a  [] = {1,434,23,43,4,0,0,0,0,0,0,0,23424,43,34,54,35,45,234};
        int c [] = moveZerosToEnds(a);
        System.out.println(Arrays.toString(c));
    }
}
