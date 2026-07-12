package JavaLeet.Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, -5, -6};

        int ans = maximumProductSubarray(nums);
        System.out.println(ans);

    }

    static int maximumProductSubarray(int[] nums){
        int maxProductHere = nums[0];
        int minProductHere = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            int newMax = Math.max(maxProductHere * nums[i], minProductHere * nums[i]);
            int newMin = Math.min(maxProductHere * nums[i], minProductHere * nums[i]);

            maxProductHere = Math.max(newMax, nums[i]);
            minProductHere = Math.min(newMin, nums[i]);

            globalMax = Math.max(newMax, globalMax);
        }

        return globalMax;
    }
}
