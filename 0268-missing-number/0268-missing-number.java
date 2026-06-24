class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long temp = (n*(n+1))/2;
        long sum = 0;
        for (int i =0; i<n ; i++){
            sum+=nums[i];
        }
        return (int)(temp-sum);
    }
}