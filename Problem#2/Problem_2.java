public class Problem_2{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Solution(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void Solution(int[] arr){
        int prod = 1;
        for (int i : arr){
            prod*=i;
        }
        for (int i = 0 ; i < arr.length ; i++){
            arr[i]=prod/arr[i];
        }
    }
}
