import java.util.Arrays;

public class twoSum {
    public static int [] twoSums(int a [], int target  ){
        int s [] = new int[2]; 
        for(int i = 0 ; i<a.length ; i++){
             for(int k = i+1 ; k<a.length ; k++){
              if(a[i]+a[k]==target){
                 s[0] =  i;
                 s[1] =  k;
                 return s;
              }
        }
        }
        System.out.println("There is nothing matches to target ");
        return new int[]{-1,-1};

        
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,6,7,8,9};
        System.out.println(Arrays.toString(twoSums(a, 0)));
    }
}
// two sum using the simple approch 