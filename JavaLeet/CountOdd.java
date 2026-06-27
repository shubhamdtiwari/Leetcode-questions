package JavaLeet;

public class CountOdd {
    public static void main(String[] args) {
        int[][] indices = {
                        {0,1},
                        {1,1},
        };
        int m = 2;
        int n = 3;

        int ans = cell(m, n, indices);
        System.out.println(ans);

    }

    static int cell(int m, int n, int[][] indices) {

        int[][] initialMatrix = new int[m][n];

        for(int i = 0; i < indices.length; i++){
            int ri = indices[i][0];
            int ci = indices[i][1];

        for(int j = 0; j < n; j++){
            initialMatrix[ri][j]++;
        }

         for(int in = 0; in < m; in++){
            initialMatrix[in][ci]++;
        }

       }
       int count = 0;

       for(int row = 0; row < m; row++){
        for(int col = 0; col < n; col++){
            if (initialMatrix[row][col] % 2 != 0){
                count++;
            }
        }
       }

        return count;
        

          
        }
    
}

