class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        int i =0;
        long len =0;
        long cnt = 0;
        long sum = 0;
        for (int j =0; j<n; j++){
            len++;
            sum+=(long)nums[j];
            while(sum*len>=k){
                len--;
                sum-=(long)nums[i];
                i++;
            }
            cnt+= j-i+1;
        }
        return cnt;
    }
}