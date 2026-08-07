class Solution {
    public int diagonalSum(int[][] mat) {
        int primDiagSum = 0;
        int secDiagSum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i == j) primDiagSum += mat[i][j];
                if(i+j == mat.length-1) secDiagSum += mat[i][j];
            }
        }
        if(mat.length%2 != 0){
            return primDiagSum + secDiagSum - mat[mat.length/2][mat.length/2];
        }
        return primDiagSum + secDiagSum;
    }
}