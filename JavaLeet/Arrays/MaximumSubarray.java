package JavaLeet.Arrays;

// import java.util.ArrayList;
// import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-5,4,-1,7,8};

        int ans = largeSum(nums);

        // for(int el : ans){
        //     System.out.println(el);
        // }

        System.out.println(ans);
    }

    static int largeSum(int[] nums){


        // List<Integer> allSum = new ArrayList<>();
        
        
        // for(int i = 0; i < nums.length; i++){
        //     int largeSum = 0;
        //     largeSum += nums[i];
        //     if(nums.length < 2){
        //     allSum.add(largeSum);
        //     }else{
        //     for(int j = i + 1; j < nums.length; j++){
        //         largeSum += nums[j];
        //         allSum.add(largeSum);
        //     }
        // }
        // }
        // int max = 0;
        // for(int el : allSum){
            
        //     if(el > max){
        //         max = el;
        //     }
        // }
        // return max;

        // return allSum;
            // there is no need of storing it in arraylist i can just buse max to get the value
    
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            
            int largeSum = nums[i];
            if(largeSum > max){
            max = largeSum;
            }
            for(int j = i + 1; j < nums.length; j++){
                largeSum += nums[j];
                if(largeSum > max){
                    max = largeSum;
                }
            }
        
        }
        
        return max;

        // return allSum;
    
    }
}
