public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = generateSpiralMatrix(5);
        printMatrix(matrix);
    }
    
     static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1, rowStart = 0, rowEnd = n-1, colStart = 0, colEnd = n-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = num++;
            }
            rowStart++;

            for(int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;

                for(int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = num++;
                }
                 rowEnd--;

                for(int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = num++;
            }
            colStart++;
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
 