import java.util.*;

public class findDuplicateNumber {
    public static void findDuplicateNumbers(int a []){
     // finding the duplicate from the arrays 
        for(int  i = 0; i < a.length ; i++){
             for(int j = i+1 ; j < a.length ; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    break;
                }
              }
            }
        }
    
    public static void main(String[] args) {
        int a [] = {1,1,2,2,3,3,4};
        findDuplicateNumbers(a);
        System.out.println("___________________________________________________________");
        findDuplicateNumberss(a);
    }
    public static void findDuplicateNumberss(int a []){
        Set<Integer> set = new HashSet<>();
        for(int i  = 0 ; i < a.length ; i++){
            if(set.contains(a[i])){
               System.out.println(a[i]);
            }else{
            set.add(a[i]);
        }
                
        }
        
    }
    
}