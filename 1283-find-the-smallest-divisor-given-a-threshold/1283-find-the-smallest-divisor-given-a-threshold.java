class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max= nums[0];
        for (int i =1; i<n; i++){
            max = Math.max(max, nums[i]);
        }
        int lo = 1;
        int hi = max;
        int ans =0 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int cnt =  counter(nums, threshold, mid);
            if (cnt<=threshold){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
        public static int counter(int[] nums, int threshold, int mid){
            int sum = 0;
            for (int i =0 ; i<nums.length; i++){
                if(nums[i]%mid!=0) sum+= nums[i]/mid+1;
                else sum+= nums[i]/mid; 
            }
            return sum;
        }
}