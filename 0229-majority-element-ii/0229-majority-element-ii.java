class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0 ; i<nums.length; i++){
            if (map.containsKey(nums[i]) == true) map.put(nums[i], map.get(nums[i])+1);
            else {
                map.put(nums[i], 1);
            }
        }
        for (Integer key: map.keySet()){
            if (map.get(key) > nums.length/3){
                ans.add(key);
            } 
        }
        return ans;
    }
}