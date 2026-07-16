package JavaLeet.BinarySearch;

public class peakedElement {
    public static void main(String[] args) {
         int[] arr = {0, 1, 3, 5, 7, 4, 2, 1};

         int ans = peakElement(arr);
         System.out.println(ans);
    }

    static int peakElement(int[] arr){
         int s = 0;
        int e = arr.length - 1;

        while(s < e){

            int m = s + (e - s) / 2;

            if(arr[m] > arr[m + 1]){
                e = m;
            }else if(arr[m] < arr[m + 1]){
                s = m + 1;
            }
        }

        return s;
    }
}
