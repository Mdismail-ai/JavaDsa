import java.util.*;
public class romanToInteger {
    public static int romanToIntegers(String a){
        int result = 0;
        Map<Character , Integer > map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i = 0 ; i< a.length() ; i++){
            int curr = map.get(a.charAt(i));
            if(i<a.length()-1&& curr < map.get(a.charAt(i+1))){
                result -= curr;
            }else {
                result += curr;
            }
        }

return result;
    }
    public static void main(String[] args) {
      String  s = "III";
      System.out.println(romanToIntegers(s));
    }
}
