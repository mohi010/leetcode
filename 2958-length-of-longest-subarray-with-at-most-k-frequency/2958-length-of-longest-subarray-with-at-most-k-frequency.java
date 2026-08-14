class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        int i =0;
        map.put(nums[0],1);
        int maxLen =1;
        for(int j =1; j<nums.length; j++ ){
            if (map.containsKey(nums[j])){
                if(map.get(nums[j])+1>k){
                    while(map.get(nums[j])>=k && i<=j){
                        map.put(nums[i], map.get(nums[i])-1);
                        i++;
                    }
                }
                    map.put(nums[j], map.get(nums[j])+1);
                // else{
                //     map.put(nums[j], map.get(nums[j])+1);
                // }
            }
            else map.put(nums[j],1);
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}