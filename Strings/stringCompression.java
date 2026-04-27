public class stringCompression {
    public static int stringCompressions(char [] a) {
     int l = 0;
     int index = 0;
     while(l<a.length){
        char curr = a[l];  // stroring all valuse 
        int count = 0 ;
        while(l<a.length && a[l] == curr ){ // comparing all valuse with each one
            l++;
            count++;
        }
        a[index++] = curr;
        if(count>1){
            for(char c : String.valueOf(count).toCharArray()){
                a[index++]  = c ;
            }
        }
     }
     return index ;
  }
  public static void main(String[] args) {
    char[] arr = {'a','a','b','b','c','c','c'};
    System.out.println(stringCompressions(arr));
    String a = "Ismail";
    
  }
}
