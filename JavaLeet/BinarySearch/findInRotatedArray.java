public class findInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int ans = search(arr, target);
        System.out.println(ans);
    }

    // this will not work in duplicate values

    static int search(int[] arr, int target){
        int pivot = pivot(arr);

        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target){
            return pivot;
        }

         if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }

        
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
        

    }

    static int binarySearch(int[] arr, int target, int s, int e){
        while(s <= e){
            int m = s + ( e - s) / 2;

            if(target < arr[m]){
                e = m - 1;
            }else if(target > arr[m]){
                s = m + 1;
            }else {
                return m;
            }
        }
        return -1;
    }

    static int pivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int m = s + (e - s) / 2;

            if(m < e && arr[m] > arr[m + 1]){
                return m;
            }
            if(m > s && arr[m] < arr[m - 1]){
                return m - 1;
            }
            if(arr[m] <= arr[s]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return -1;
    }
}
