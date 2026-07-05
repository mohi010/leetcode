class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int col0 = -1;
        for (int i = 0 ; i<row; i++){
            for(int j = 0; j<col; j++){
                 if(matrix[i][j]==0){
                    if (j==0){
                        col0 = 0;
                    }
                    else{
                        matrix[0][j] =0;
                        matrix[i][0] = 0;
                    }
                    
                }
            }
        }


    for (int i = row-1; i>0; i--){
        for (int j = col-1; j>0 ; j--){
            if (matrix[i][0]==0 || matrix[0][j]==0){
                matrix[i][j] = 0;
            }
        }
    }
    if (matrix[0][0] ==0){
    for (int j =1 ; j<col; j++){
        matrix[0][j]=0;
    }
    }
    if (col0==0){
        for (int i =0 ; i<row; i++){
            matrix[i][0]=0;
        }
    }










        // int row = matrix.length;
        // int col = matrix[0].length;
        // int[] ro  = new int[row];
        // int[] co  = new int[col];

        // for (int i = 0 ; i<row; i++){
        //     for(int j = 0; j<col; j++){
        //         if(matrix[i][j]==0){
        //             co[j] = 1;
        //             ro[i] =1;
        //         }
        //     }
        // }

        // for (int i = 0 ; i<row; i++){
        //     for(int j = 0; j<col; j++){
        //         if (ro[i]==1 || co[j]==1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // } 
    }
}