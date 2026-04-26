package Strings;


// reverse a string using the swap 
public class reverseString {
    public static String   reverseStrings(String a) {
        char z [] = a.toCharArray(); // first converet into the char so we can do itration 
        int s = 0;
        int e = a.length()-1; 
     
        while(s<e){
            char temp =  z[s] ;
            z[s] = z[e];
            z[e] = temp ;
             s++;
             e--;
        }
        return new String(z);  // to convert into String 
    
}
public static void main(String args[]){
    String a = "Aman";
    System.out.println(reverseStrings(a));

}
}
