class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {

                int complement = -nums[i] - nums[j];

                if (map.containsKey(complement)) {
                    set.add(Arrays.asList(nums[i], complement, nums[j]));
                }

                map.put(nums[j], j);
            }
        }

        return new ArrayList<>(set);
    }
}
