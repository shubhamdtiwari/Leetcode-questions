package JavaLeet.Searching.BinarySearch;
// https://leetcode.com/problems/kth-missing-positive-number/

public class kthMIssingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        System.out.println(missingNumber(arr, 1));

    }

    static int missingNumber(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] - m - 1 < k) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s + k;
    }
}
