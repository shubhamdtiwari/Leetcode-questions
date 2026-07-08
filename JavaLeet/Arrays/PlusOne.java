import java.lang.reflect.Array;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9, 9};

        int[] ans = plusOne(nums);
        for(int el : ans){
            System.out.println(el + " ");
        }

    }

    static int[] plusOne(int[] nums){
       
        // for the case which nums and answer is of same length
        for (int i = nums.length - 1; i >= 0; i--) {
            
            if(nums[0] < 9){
                nums[i]++;
                return nums;
            }else{
                nums[i] = 0;
            }
        }
       int[] ans = new int[nums.length + 1];
       ans[0] = 1;
       return ans;

    }
}
