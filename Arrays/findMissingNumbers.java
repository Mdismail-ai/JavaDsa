public class findMissingNumbers {

    // 0 to n find the missing numebers using for Actual Sum of number n*(n+1)/2 
    public static int findMissingNumberss(int a []) {

        int n = a.length;
        int ExpectedSum = n*(n+1)/2; 

        // sum of the array 
        int Actualsum = 0;
        for(int i = 0 ; i < a.length ; i++){
            Actualsum+=a[i];
        }
        return ExpectedSum-Actualsum ;
        
    }
    public static void main(String[] args) {
        int a [] = {3, 0, 1 };
        int sum = findMissingNumberss(a);
        System.out.println(sum);

    }
}




