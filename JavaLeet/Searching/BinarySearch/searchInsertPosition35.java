package JavaLeet.Searching.BinarySearch;
// https://leetcode.com/problems/search-insert-position/

public class searchInsertPosition35 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7 };
        System.out.println(InsertPosition(arr, 8));
    }

    static int InsertPosition(int nums[], int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] < target) {
                s = m + 1;
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                return m;
            }
        }
        return s;
    }
}
