public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int[][] ans = transpose(matrix);

        for(int[] row : ans){
            for(int el : row) {
                System.out.println(row + " ");
            }
        }
    }

    static int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] finalMatrix = new int[col][row];

        for(int i = 0; i < row; i++){
            int[] currentRow = matrix[i];

            for (int j = 0; j < col; j++) {
                finalMatrix[j][i] = currentRow[j];
            }
        }

        return finalMatrix;
    }
}
