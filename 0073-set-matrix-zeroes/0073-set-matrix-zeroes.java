class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] ro  = new int[row];
        int[] co  = new int[col];

        for (int i = 0 ; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j]==0){
                    co[j] = 1;
                    ro[i] =1;
                }
            }
        }

        for (int i = 0 ; i<row; i++){
            for(int j = 0; j<col; j++){
                if (ro[i]==1 || co[j]==1){
                    matrix[i][j] = 0;
                }
            }
        } 
    }
}