public class firstUniqChat{
    public static char firstUniqChats(String s){
        int [] charCount = new int[26]; // 26 alphabets 

        for(char ch : s.toCharArray()){ // we are travelling through the array to find the freqency of the arrays
            charCount[ch-'a']++;
        }
        for(char  ch: s.toCharArray()){ // its for chacking the conditions 
               if(charCount[ch-'a']==1){
                   return ch ;
               }
        }

        return '\0';
    
}
public static void main(String[] args) {
String a = "swiss";
System.out.println(firstUniqChats(a));
    
}
}