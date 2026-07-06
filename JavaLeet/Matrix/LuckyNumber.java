import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,10,4,2},
            {9,3,8,7},
            {15,16,17,12},
        };

        List<Integer> ans = luckyNumber(matrix);

        for(int el : ans){
            System.out.println(el + " ");
        }

    }

    static List<Integer> luckyNumber(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int row = 0; row < m; row++) {
            int minRow = Integer.MAX_VALUE;
            int maxCol = Integer.MIN_VALUE;
            int minColIndex = 0;

            // for min row
            for (int i = 0; i < n; i++) {
                if(matrix[row][i] < minRow){
                    minRow = matrix[row][i];
                    minColIndex = i;
                }
            }


            //  for max col
            for (int j = 0; j < m; j++) {
                if(matrix[j][minColIndex] > maxCol) {
                    maxCol = matrix[j][minColIndex];
                }
            }

            if(minRow == maxCol){
                result.add(minRow);
            }
        }

        return result;
    }
}
