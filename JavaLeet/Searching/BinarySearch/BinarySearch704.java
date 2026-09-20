package JavaLeet.Searching.BinarySearch;
// https://leetcode.com/problems/binary-search/

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 8, 12, 23, 43, 54 };
        System.out.println(BSrecursion(arr, 12, 0, arr.length - 1));

    }

    static int BSrecursion(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[m] > target) {
            return BSrecursion(arr, target, s, m - 1);
        }

        return BSrecursion(arr, target, m + 1, e);

    }
}
