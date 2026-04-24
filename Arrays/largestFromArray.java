
import java.util.Arrays;
class A{

// finding the largest number from the array 
    public void largestFromArray(int a[]){
        Arrays.sort(a);
        int result = a[a.length-1];
        System.out.println(result);
    }

// find the largest number from array without using function 
public void largestFromArrays(int a []){
   for(int i = 0; i<a.length ; i++) {
      for(int j = i+1; j<a.length ; j++) {
          if(a[i]>a[j]){
            int temp =  a[i];
            a[i] = a[j]; // use sawp if number is bigger 
            a[j] = temp;
          }
     }
   }
   int result = a[a.length -1];
     System.out.println(result);
}
// best code we are not sorting 
public void largestFromArrayss(int []a){
    int max = a[0]; // sroring the biggr valuse 
    for(int i =0 ;i<a.length ; i++){
        if ( a [i] > max ){ // comparing the valuse 
            max = a [i];
        }
    }
    System.out.println(max);
}

}
public class largestFromArray{
    public static void main(String args[]){
         A a = new A();
         int b [] = {1,234,35,25,6,45};
         a.largestFromArray(b);
         a.largestFromArrays(b);
         a.largestFromArrayss(b);
        
    }
}



