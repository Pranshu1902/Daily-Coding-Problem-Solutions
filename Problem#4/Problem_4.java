public class Problem_4{
    public static void main(String[] args){
        int[] arr = {3,4,-1,1};
        int ans = Solution(arr);
        System.out.println(ans);
    }
    public static int Solution(int[] arr){
        for (int i = 1 ; i <= max(arr)+1 ; i++){
            if (!check(arr,i)){
                return i;
            }
        }
        return -1;
    }
    public static boolean check(int[] arr, int k){
        for (int i : arr){
            if (i==k){
                return true;
            }
        }
        return false;
    }
    public static int max(int[] arr){
        int max = 0;
        for (int i : arr){
            if (i>max){
                max=i;
            }
        }
        return max;
    }
}
