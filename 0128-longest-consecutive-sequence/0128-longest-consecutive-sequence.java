class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n  = nums.length;
        if (n==0) return 0;
        int longest = 0;
        for (int i = 0; i<n ;i++) set.add(nums[i]);
        for (int ele: set){
            if (!set.contains(ele-1)){
                int x = ele;
                int cnt = 1;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest  = Math.max(longest, cnt);
            }
        }

        return longest;

    }
}