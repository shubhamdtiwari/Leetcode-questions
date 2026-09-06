package JavaLeet.Sorting;
// https://leetcode.com/problems/set-mismatch/
public class setMismatch645 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] finalAns = Mismatch(nums);
        for (int el : finalAns) {
            System.out.println(el);
        }

    }

    static int[] newMismatch(int[] arr){
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
               return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1,-1};

    }

    static int[] Mismatch(int[] arr) {
        int[] ans = { arr.length, arr.length };

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans[0] = arr[i];
                ans[1] = i + 1;
            }
        }
        return ans;
    }

    static void sort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
