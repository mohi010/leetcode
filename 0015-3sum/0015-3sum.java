class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // most optimal one;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i<n-2; i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                if ((nums[i]+nums[j]+nums[k])==0) {
                    int el1 = nums[j];
                    int el2 = nums[k];
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(nums[j]==el1 && j<k) j++;
                    while(nums[k]==el2 && k>0) k--;
                }
                else if ((nums[i]+nums[j]+nums[k])>0) k--;
                else j++;
            }
        }
        return ans;













        // Arrays.sort(nums);
        // Set<List<Integer>> set = new HashSet<>();

        // for (int i = 0; i < nums.length - 2; i++) {

        //     // Skip duplicate first elements
        //     if (i > 0 && nums[i] == nums[i - 1]) continue;

        //     HashMap<Integer, Integer> map = new HashMap<>();

        //     for (int j = i + 1; j < nums.length; j++) {

        //         int complement = -nums[i] - nums[j];

        //         if (map.containsKey(complement)) {
        //             set.add(Arrays.asList(nums[i], complement, nums[j]));
        //         }

        //         map.put(nums[j], j);
        //     }
        // }

        // return new ArrayList<>(set);

        




    }
}
