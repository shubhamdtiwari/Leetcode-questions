package JavaLeet.Searching.BinarySearch;

public class twoSum167 {
    public static void main(String[] args) {
        
    }

    static int[] add(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            if(arr[s] + arr[e] > target){
                e--;
            }else if(arr[s] + arr[e] < target){
                s++;
            }else {
                return new int[]{s + 1, e + 1};
            }
        }
        return new int[]{-1,-1};
    }
}
