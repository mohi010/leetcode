class Solution {
    public int findMin(int[] nums) {
        int n =nums.length;
        int lo = 0; int hi = n-1;
        int min1 = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            min1 = Math.min(nums[mid], min1);
            if (nums[mid]>=nums[lo]){   // left half is sorted;;
                if (nums[hi]<nums[lo]) lo = mid+1;
                else hi = mid-1;
            }
            else if (nums[mid]<=nums[hi]){
                 hi = mid-1;
            }
        }       
        return min1;
    }
}