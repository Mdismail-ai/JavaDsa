import java.util.*;

public class longestSubstringWithoutRepeatingCharacters {
    public static int longestSubstringWithoutRepeatingCharacterss(String a){
        Set<Character> set = new HashSet<>();
        int l  = 0 ;
        int max = 0;
        for(int i = 0 ; i < a.length() ; i++) {
            while(set.contains(a.charAt(i))){
                set.remove(a.charAt(l));
                l++;
            }
            set.add(a.charAt(i));
            max = Math.max(max , i-l+1 );
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeatingCharacterss(s));
    }
}
