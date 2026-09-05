package JavaLeet.Sorting;
// https://leetcode.com/problems/first-missing-positive/

public class missingPositive41 {
    public static void main(String[] args) {

    }

    static int missingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1] && arr[i] > 0 && arr[i] <= arr.length) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}