package Strings;

// 1.validPalindromes using the  normal way  main thing is charAt 
public class validPalindrome {
    public static boolean  validPalindromes(String a){
        int l  = 0 ;
        int r = a.length()-1;
        while(l<r){
            if(a.charAt(l)!=a.charAt(r)){
               return false;
               
            }
             l++;
             r--;
                
        }
        
            
        
        return true;
        
    }
    public static void main(String[] args) {
        String a = "mam";
        System.out.println(validPalindromes(a));

    }
}
