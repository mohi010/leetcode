class Solution {
    public void sortColors(int[] nums) {

        // most optimal approach 
        int left = 0;
        int mid =0;
        int high = nums.length-1;
        while(mid<=high){
            if (nums[mid]==0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;

                mid++; left++;
            }
            else if (nums[mid] ==1) mid++;
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }


        // int cnt0 = 0;
        // int cnt1 = 0;
        // int cnt2 = 0;

        // for (int i = 0 ; i<nums.length; i++){
        //     if (nums[i]==0) cnt0++;
        //     else if (nums[i]==1) cnt1++;
        //     else cnt2++;
        // }
        
        // for(int i =0; i<nums.length; i++){
        //     if (i<cnt0) nums[i]=0;
        //     else if (i>=cnt0 && i<cnt1+cnt0) nums[i] = 1;
        //     else{
        //         nums[i] = 2;
        //     }
        // }
    }
}



