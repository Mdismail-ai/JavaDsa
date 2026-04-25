public class KadanesAlgorithm {
    public static int KadanesAlgorithms(int a []){
    int curr = a[0];
    int max = a[0];
    for(int i = 1; i< a.length ; i++){
        curr = Math.max(a[i], a[i]+curr);
        max = Math.max(curr, max);
    }
    return max;
 }
public static void main(String[] args) {
    int a [] ={5,4,-1,7,8};
    System.out.println(KadanesAlgorithms(a));
}
}
// this is find the sum for subarrays 
