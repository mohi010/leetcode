class Solution {
    public int majorityElement(int[] nums) {

        //most optimal solution   
        int cnt  = 0;
        int ele = 0;
        for (int i =0; i<nums.length; i++){
            if (cnt==0) {
                ele = nums[i];
                cnt++;
            }
            else if (nums[i] == ele) cnt++;
            else {
                cnt--;
            }
        }
        return ele;
        


        // int cnt = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i =0 ; i<nums.length; i++){
        //     if (map.containsKey(nums[i]) == true) map.put(nums[i], map.get(nums[i])+1);
        //     else {
        //         map.put(nums[i], 1);
        //     }
        // }
        // for (Integer key: map.keySet()){
        //     if (map.get(key) > nums.length/2){
        //         return key;
        //     } 
        // }
        // return 5;
    }
}