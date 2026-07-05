class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int cl = 0;
        int ch = col-1;
        int rl = 0;
        int rh = row-1;
        while(cl<=ch && rl<=rh){
            for(int k = cl; k<=ch ;k++){
                ans.add(matrix[rl][k]);
            }
            rl++;
            if (cl<=ch && rl<=rh){
                for(int k = rl; k<=rh ;k++){
                ans.add(matrix[k][ch]);
            }
            ch--;
            }
            if(cl<=ch && rl<=rh){
                for(int k = ch; k>=cl ;k--){
                ans.add(matrix[rh][k]);
            }
            rh--;
            }
            if (cl<=ch && rl<=rh){
                for(int k = rh; k>=rl ;k--){
                ans.add(matrix[k][cl]);
            }
            cl++;
            }
            
        }
        return ans;
    }
}