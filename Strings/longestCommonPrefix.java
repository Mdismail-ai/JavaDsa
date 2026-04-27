
public class longestCommonPrefix{
     public static String  longestCommonPrefixs(String [] a ){
     String pre = a[0]  ;
     for(int i = 1 ; i < a.length ; i++){
         while(a[i].indexOf(pre)!=0){
            pre = pre.substring(0,pre.length()-1);
         }
     }
     return pre;
     
}
public static void main(String args[]){
    String [] a  = {"dkkajfdlk","dkdfhifh","dklkdjfl"};
    System.out.println(longestCommonPrefixs(a));
}
}