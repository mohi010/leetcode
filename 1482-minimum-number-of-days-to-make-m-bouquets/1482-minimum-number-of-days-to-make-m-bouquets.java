class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max =bloomDay[0];
        int min = bloomDay[0];
        int n =bloomDay.length;
        for (int i=1; i<n; i++ ){
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }
        int ans = -1;
        int lo = min;
        int hi = max;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int l= helper(mid,bloomDay, k,m);
            if (l==m){
                ans = mid;
                hi = mid-1;
            }
            else if (l<m) lo = mid+1;
            else hi= mid-1;
        }
        if (ans!=-1) return ans;
        return -1;
        
    }
    public static int helper(int mid, int[] bloomDay, int k, int m){
        int n = bloomDay.length;
        int cnt =0;
        int ans = 0;
        for (int i = 0; i<n; i++){
            if (bloomDay[i]<=mid){
                cnt++;
            }
            else cnt= 0;
            if (cnt==k) {
                ans++;
                cnt = 0;
            }
            if (ans==m) return m;
        }
        return -1;
    }
}