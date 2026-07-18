class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int max = nums[0];
        int n = nums.length;
        for (int i = 1; i<n; i++){
            max = Math.max(max, nums[i]);
        }
        int ans= 0;
        int lo = 1;
        int hi = max;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (requiredTime(nums, mid)>(long)h) lo = mid+1;
            else {
                ans = mid;
                hi = mid-1;
            } 
        }
        return ans;
    }
    public static long requiredTime(int[] nums,int k){
        long cnt= 0;
        for (int i =0 ; i <nums.length; i++){
            if (nums[i]%k==0) cnt+=nums[i]/k;
            else cnt+= nums[i]/k +1;
        }
        return cnt;
    }
}