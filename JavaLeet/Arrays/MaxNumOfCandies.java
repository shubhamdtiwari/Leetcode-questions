package JavaLeet.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxNumOfCandies {
    public static void main(String[] args) {

        int[] candies = {2,3,4,5,6,7};
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
         for( Boolean ints : ans){
            System.out.print(ints + " ");
        }
        
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // finding max. num of candies
        int max = candies[0];

        for(int candy : candies) {
            if(candy > max) {
            max = candy;
            }
        }

        // candies for each child
        for(int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;

    }
}
