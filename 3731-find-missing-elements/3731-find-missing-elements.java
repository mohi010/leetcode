class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        HashSet<Integer> set = new HashSet<>(); 
        for (int i =0; i<nums.length; i++){
            set.add(nums[i]);
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        for (int i = min; i<=max; i++){
            if (set.contains(i)==false) ans.add(i);
        }
        return ans;
    }
}