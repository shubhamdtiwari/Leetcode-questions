package JavaLeet;

public class PermutationArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
    int[] ans = buildArray(nums);
    for (int i : ans) {
        System.out.print(i + " ");
    }
        
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i : nums){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    
}
