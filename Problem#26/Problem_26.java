import java.util.*;
public class Problem_26{
    public static void main (String[] args){
        System.out.println("CS is fun at Google");
        List<Integer> input = new ArrayList<Integer>();
        input.add(10);input.add(20);input.add(30);input.add(40);input.add(50);input.add(60);
        List<Integer> result = Solution(input, 3);
        System.out.println(result);
    }
    public static List<Integer> Solution(List<Integer> inp, int k){
        int i = inp.size()-k;
        while(i>=0){
            inp.remove(i);
            i-=k;
        }
        return inp;
    }
}
