package JavaLeet.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
        };

        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
        // for(int el : ans){
        //     System.out.println(el);
        // }
        

    }

    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> output = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while( top <= bottom && left <= right){
            // for moving left to right
            for(int i = left; i <= right; i++){
                output.add(matrix[top][i]);
            }
            top++;

            // for moving top to bottom
            for(int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;

            // for moving right to left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // for moving up
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    output.add(matrix[i][left]);
                }
                left++;
            }
        }
        return output;
    }
}
