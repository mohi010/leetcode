class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (n==1) return nums[0];
            if(mid==n-1 || mid==0 || nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1] ) return nums[mid];
            else if (nums[mid]==nums[mid+1]){
                if (mid%2==0) lo = mid+1;
                else hi = mid-1;
            }
            else if (nums[mid]==nums[mid-1]){
                if(mid%2==0) hi = mid-1;
                else lo = mid+1;
            }
        }
        return nums[lo];
    }
}