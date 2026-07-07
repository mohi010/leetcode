class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i<n-3; i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            for (int l = i+1; l<n-2; l++){
            if (l>i+1 &&nums[l]== nums[l-1] ) continue;
            int j = l+1;
            int k = n-1;
            while(j<k){
                long sum =(long)nums[i]+nums[j]+nums[k]+nums[l];
                if (sum==target) {
                    int el1 = nums[j]; int el2 = nums[k];
                    ans.add(Arrays.asList(nums[i],nums[l] ,nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == el1) j++;
                    while (j < k && nums[k] == el2) k--;
                }
                else if (sum>target) k--;
                else j++;
            }
        }
        }
        return ans;
    }
}