package JavaLeet.Searching.BinarySearch;

public class ArrengingCoins441 {
    public static void main(String[] args) {
        System.out.println(arrengingStairs(7));

    }

    static int arrengingStairs(int n) {
        long s = 1;
        long e = n;
        long ans = 0;

        while (s <= e) {
            long m = s + (e - s) / 2;

            if (m * (m + 1) / 2 <= n) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return (int) ans;
    }
}
