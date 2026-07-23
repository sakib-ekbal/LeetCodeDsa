class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int firstRow = 0;
        int lastRow = matrix.length-1;
        int firstCol = 0;
        int lastCol = matrix[0].length-1;
        int count = 1;
        while(firstRow<=lastRow && firstCol<=lastCol){
            for(int j=firstCol;j<=lastCol;j++){
                matrix[firstRow][j] = count;
                count++;
            }
            firstRow++;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int i=firstRow;i<=lastRow;i++){
                matrix[i][lastCol] = count;
                count++;
            }
            lastCol--;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int j=lastCol;j>=firstCol;j--){
                matrix[lastRow][j] = count;
                count++;
            }
            lastRow--;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int i=lastRow;i>=firstRow;i--){
                matrix[i][firstCol] = count;
                count++;
            }
            firstCol++;
        }
        return matrix;
    }
}