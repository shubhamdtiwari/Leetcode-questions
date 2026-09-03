package JavaLeet.Sorting;

public class missingNumber286 {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1, 2 };
        System.out.println(missingNumber(nums));

    }

    static int missingNumber(int[] nums) {
        int ans = nums.length;

        cycleSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return ans = i;
            }
        }
        return ans;
    }

    static void cycleSort(int[] nums) {
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == nums.length) {
                j++;
            } else if (nums[j] != nums[nums[j]]) {
                swap(nums, j, nums[j]);
            } else {
                j++;
            }
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
