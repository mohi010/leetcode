class Solution {
    public int splitArray(int[] nums, int k) {
       int max = nums[0];
       int sum = nums[0];
       for (int i = 1;i<nums.length; i++){
            max = Math.max(max, nums[i]);
            sum+=nums[i];
       }
       int lo = max;
       int hi = sum;
       while(lo<=hi){
        int mid = lo + (hi-lo)/2;
        int cntSub = cntSubarr(nums, mid);
        if (cntSub<=k) hi = mid-1;
        else lo = mid+1;
       }
       return lo;

    }
    public static int cntSubarr(int[] nums, int mid){
        int cnt =1;
        int sum =0;
        for (int i =0;i<nums.length; i++){
            if (sum+nums[i]<=mid) sum+=nums[i];
            else {
                cnt++;
                sum = nums[i];
            }
        }
        return cnt;
    }
}