package JavaLeet;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] ans = new int[arr.length];
        System.out.println(ans);
        
    }

    static int[] runSum(int[] arr, int[] ans) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            ans[i] = sum;
        }
        return ans;

    }
    
}
