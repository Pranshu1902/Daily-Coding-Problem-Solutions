import java.util.*;
public class Problem_31{
    public static void main (String[] args){
        int distance = Solution("kitten","sitting");
        System.out.println(distance);
    }
    public static int Solution(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int count = 0;
        if (n1!=n2){
            count+=Math.abs(n1-n2);
        }
        if (n1>=n2){
            for (int i = 0 ; i < n2 ; i++){
                if (!(s1.substring(i,i+1)).equals(s2.substring(i,i+1))){
                    count+=1;
                }
            }
        }else if (n1<n2){
            for (int i = 0 ; i < n1 ; i++){
                if (!(s1.substring(i,i+1)).equals(s2.substring(i,i+1))){
                    count+=1;
                }
            }
        }
        return count;
    }
}
