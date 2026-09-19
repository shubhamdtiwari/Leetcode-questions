package JavaLeet.Searching.BinarySearch;
// https://leetcode.com/problems/valid-perfect-square/

public class validPerfectSquare367 {
    public static void main(String[] args) {
        System.out.println(perfectsqrt(6241));

    }

    static boolean perfectsqrt(int n) {
        int s = 1;
        int e = n;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m == n / m && n % m == 0) {
                return true;
            } else if (m > n / m) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return false;
    }
}
