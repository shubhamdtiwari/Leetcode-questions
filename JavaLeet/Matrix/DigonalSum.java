package JavaLeet.Matrix;

public class DigonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int ans = digonalSum(matrix);
        System.out.println(ans);
    }

    static int digonalSum(int[][] matrix){

        int sum = 0;

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                if(row == col){
                    sum += matrix[row][col];
                }else if(row + col == matrix.length - 1){
                    sum += matrix[row][col];
                }
            }
        }


        return sum;
    }
}
