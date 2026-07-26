class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int firstRow = 0;
        int lastRow = m-1;
        int firstCol = 0;
        int lastCol = n-1;
        while(firstRow<=lastRow && firstCol<=lastCol){
            for(int j=firstCol;j<=lastCol;j++){
                arr.add(matrix[firstRow][j]);
            }
            firstRow++;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int i=firstRow;i<=lastRow;i++){
                arr.add(matrix[i][lastCol]);
            }
            lastCol--;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int j=lastCol;j>=firstCol;j--){
                arr.add(matrix[lastRow][j]);
            }
            lastRow--;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int i=lastRow;i>=firstRow;i--){
                arr.add(matrix[i][firstCol]);
            }
            firstCol++;
        }
        return arr;
    }
}