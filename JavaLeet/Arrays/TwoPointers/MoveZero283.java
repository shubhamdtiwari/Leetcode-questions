package JavaLeet.Arrays.TwoPointers;
// https://leetcode.com/problems/move-zeroes/

import java.util.Arrays;

public class MoveZero283 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 0, 3, 4, 6, 7 };
        System.out.println(Arrays.toString(moveZero(arr)));

    }

    static int[] moveZero(int[] arr) {
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, s);
                s++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int f, int se) {
        int temp = arr[f];
        arr[f] = arr[se];
        arr[se] = temp;
    }
}
