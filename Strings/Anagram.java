


import java.util.Arrays;

public class Anagram {
    public static boolean Anagrams(String a , String b  ){
    char y [] = a.toCharArray();
    char z [] = b.toCharArray();
    Arrays.sort(y);
    Arrays.sort(z);
     return Arrays.equals(y,z );

}
public static void main(String[] args) {
    String a = "anjhgfkufrhgam";
    String b = "aman";
    System.out.println(Anagrams(a, b));

}
}
