import java.util.*;
public class Problem_29{
    public static void main (String[] args){
        String result = Coding("AAAABBBCCDAA");
        System.out.println(result);
        String ans = Decoding("4A3B2C1D2A");
        System.out.println(ans);
    }
    public static String Coding(String s){
        String ans = "";
        for (int i = 0 ; i < s.length()-1 ; i++){
            int count = 1;
            while((s.substring(i,i+1)).equals(s.substring(i+1,i+2))){
                count+=1;
                if (i<s.length()-2){
                    i++;
                }else{
                    break;
                }
            }
            String add = String.valueOf(count);
            ans+=add;
            ans+=s.substring(i,i+1);
        }
        return ans;
    }
    public static String Decoding(String s){
        String ans = "";
        for (int i = 0 ; i < s.length() ; i++){
            if (isNumber(s.substring(i,i+1))){
                int n= Integer.parseInt(s.substring(i,i+1));
                for (int j = 0 ; j<n ; j++)
                ans+=s.substring(i+1,i+2);
            }
        }
        return ans;
    }
    public static boolean isNumber(String s){
        List<String> numbers = new ArrayList<>();
        numbers.add("0");numbers.add("1");numbers.add("2");numbers.add("3");numbers.add("4");numbers.add("5");numbers.add("6");numbers.add("7");numbers.add("8");numbers.add("9");
        for (String j : numbers){
            if (s.equals(j)){
                return true;
            }
        }
        return false;
    }
}
