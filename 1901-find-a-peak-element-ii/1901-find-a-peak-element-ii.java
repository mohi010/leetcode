class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int lo = 0;
        int hi = m-1;
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            int row = maxEle(mat, n, m, mid);
            int left = mid-1>=0?mat[row][mid-1]:-1;
            int right = mid+1<m?mat[row][mid+1]:-1;
            if (mat[row][mid]>left && mat[row][mid]>right) return new int[]{row, mid};
            else if(mat[row][mid]>left) lo = mid+1;
            else hi = mid-1;
        }
        return new int[]{-1,-1};

    }
    public static int maxEle(int[][] mat, int n, int m, int mid){
        int max = 0;
        int idx = -1;
        for(int i=0; i <n; i++){
            if (max<mat[i][mid]){
                idx =i;
                max = mat[i][mid];
            }
        }
        return idx;
    }
}