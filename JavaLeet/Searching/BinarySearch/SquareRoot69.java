package JavaLeet.Searching.BinarySearch;

// https://leetcode.com/problems/sqrtx/
public class SquareRoot69 {
    public static void main(String[] args) {
        int x = -4;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x) {
        int s = 1;
        int e = x;

        int ans = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m > x / m) { // i dont do m * m to save it from overflow
                e = m - 1;
            } else {
                ans = m;
                s = m + 1;
            }
        }
        return ans;
    }
}
