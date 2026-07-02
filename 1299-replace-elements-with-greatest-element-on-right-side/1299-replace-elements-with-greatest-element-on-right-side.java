class Solution {
    public int[] replaceElements(int[] nums) {
        int n = nums.length;
        int max =nums[n-1];
        nums[n-1] = -1;
        for (int j= n-2; j>=0; j--){
            if (max>nums[j]){
                nums[j] = max;
            }
            else {
                int temp = nums[j];
                nums[j]= max;
                max = temp;
            }
        }
        return nums;
    }
}