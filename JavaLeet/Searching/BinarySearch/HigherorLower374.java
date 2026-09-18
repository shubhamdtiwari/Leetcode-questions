package JavaLeet.Searching.BinarySearch;

public class HigherorLower374 {
    public static void main(String[] args) {
        int n = 1000;

        System.out.println(guessNumber(n));

    }

    static int guessNumber(int n) {
        int s = 1;
        int e = n;

        while (s <= e) {
            int m = s + (e - s) / 2;
            int pick = guess(m);

            if (pick == -1) {
                e = m - 1;
            } else if (pick == 1) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    // for guess api which is not require in leetcode ans

    static int guess(int num) {

        int InitialGuess = 30;

        if (num > InitialGuess) {
            return -1;
        } else if (num < InitialGuess) {
            return 1;
        } else {
            return 0;
        }
    }

}
