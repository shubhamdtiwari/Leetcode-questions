package JavaLeet.Arrays;

public class TargetElementInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        }

        

        static int[] createTargetArray(int[] nums, int[] index) {
            int[] target = new int[nums.length];

            // going to each elements in both
            for(int i = 0; i < nums.length; i++){
                // shifting each element till the required index is get
                for(int j = i; j < index[i]; j--){
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }


            return target;
        }

}
