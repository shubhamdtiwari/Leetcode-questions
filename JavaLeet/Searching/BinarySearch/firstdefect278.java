package JavaLeet.Searching.BinarySearch;

public class firstdefect278 {
    public static void main(String[] args) {

        System.out.println(firstBadVersion(8));
    }

    static int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int ans = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;
            boolean result = isBadVersion(m);

            if (result == false) {
                s = m + 1;
            } else {
                ans = m;
                e = m - 1;
            }

        }
        return ans;
    }

    // lets take an exapmle for [f,f,f,f,t,t,t,t]
    static boolean isBadVersion(int num) {
        if (num <= 4) {
            return false;
        } else {
            return true;
        }
    }
}
