package JavaLeet;

public class ShuffleArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 3;
        
        int[] answ = Shuffle(arr, n);
        for(int ints : answ){
            System.out.print(ints + " ");
        }
    }

    static int[] Shuffle(int[] arr, int n){
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[ 2 * i] = arr[i];
            ans[2 * i + 1] = arr[n + i];
        }
        return ans;
    }
}
