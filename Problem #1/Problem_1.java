public class Problem_1{
    public static void main(String[] args){
        int[] arr = {10,15,3,7};
        boolean ans = Solution(arr,17);
        System.out.println(ans);
    }
    public static boolean Solution(int[] arr, int k){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length ; j++){
                if (arr[i]+arr[j]==k && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}