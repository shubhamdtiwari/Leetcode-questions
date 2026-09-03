package JavaLeet.Sorting;

public class duplicateNumber287 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };

        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums) {
        // int ans = 0;
        // cycleSort(nums);

        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != i + 1) {
        // ans = nums[i];
        // }
        // }
        // return ans;

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                if (nums[i] != nums[nums[i] - 1]) {
                    swap(nums, i, nums[i] - 1);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    // static void cycleSort(int[] arr) {

    // int i = 0;
    // while (i < arr.length) {
    // if (arr[i] != arr[arr[i] - 1]) {
    // swap(arr, i, arr[i] - 1);
    // } else {
    // i++;
    // }
    // }
    // }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
