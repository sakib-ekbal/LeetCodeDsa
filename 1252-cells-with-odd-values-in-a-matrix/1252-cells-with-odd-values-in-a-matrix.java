class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int odd = 0;
        for (int k = 0; k < indices.length; k++) {
            int row = indices[k][0];
            int col = indices[k][1];
            for (int j = 0; j < n; j++) {
                arr[row][j]++;
            }
            for (int i = 0; i < m; i++) {
                arr[i][col]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0) {
                    odd++;
                }
            }
        }
        return odd;
    }
}