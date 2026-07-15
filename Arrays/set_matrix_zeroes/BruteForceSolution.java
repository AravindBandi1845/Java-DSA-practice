class Solution {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Traverse the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {

                    markRow(matrix, i, n);
                    markColumn(matrix, j, m);
                }
            }
        }

        // Convert all temporary markers to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void markRow(int[][] matrix, int row, int cols) {

        for (int j = 0; j < cols; j++) {

            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    private void markColumn(int[][] matrix, int col, int rows) {

        for (int i = 0; i < rows; i++) {

            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }
}
