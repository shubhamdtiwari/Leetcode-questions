package JavaLeet.BinarySearch;

public class firstandLastPositon {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = firstandLastPositons(nums, target);

        for(int el : ans){
            System.out.println(el);
        }

    }
    
    static int[] firstandLastPositons(int[] nums, int target){
        
        int[] ans = {-1,-1};

        // int start = search(nums, target, true);
        // int end = search(nums, target, false);

        // ans[0] = start;
        // ans[1] = end;

        ans[0] = search(nums, target, true);

        if(ans[0] != -1){
        ans[1] = search(nums, target, false);
        }
        return ans;
        
    }

    static int search(int[] nums, int target, boolean findFirstIndex){
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if(target > nums[m]){
                s = m + 1;
            }else if(target < nums[m]){
                e = m - 1;
            }else{
                ans = m;

                if(findFirstIndex){
                    e = m - 1;
                }else{
                    s = m + 1;
                }
            }

        }

        return ans;
    }
}
