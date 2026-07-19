class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0; 
        int max = 0;
        for (int i =0;i<weights.length; i++){
            sum+=weights[i];
            max = Math.max(max, weights[i]);
        }
        int ans =0 ;
        int lo = max;
        int hi = sum;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int cnt  = counter(weights, days, mid);
            if (cnt<=days){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
    public static int counter(int[] nums, int days, int mid){
        int cnt = 0;
        int sum = 0;
        for (int i =0 ;i<nums.length; i++){
            sum+=nums[i];
            if (sum>mid){
                cnt++;
                sum = nums[i];
            }
        }
        if (sum<=mid) cnt++;
        return cnt;
    }
}