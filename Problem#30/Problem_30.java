import java.util.*;
public class Problem_30{
    public static void main (String[] args){
        int[] arr = {3, 0, 1, 3, 0, 5};
        int water = Solution(arr);
        System.out.println(water);
    }
    public static int Solution(int[] walls){
        int ans = 0;
        for (int i = 1 ; i < walls.length-1 ; i++){
            int left = walls[i];
            for (int j = 0 ; j < i ; j++){
                left = Math.max(left,walls[j]);
            }
            int right = walls[i];
            for (int k = i+1 ; k < walls.length ; k++){
                right = Math.max(right, walls[k]);
            }
            ans+=Math.min(left,right)-walls[i];
        }
        return ans;
    }
}
