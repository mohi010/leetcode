class Solution {
    public int subarraySum(int[] nums, int k) {

        // since there are positives and negatives i have to use hashmap for this particular problem

        HashMap<Integer, Integer> mpp = new HashMap<>();
        int sum=0;
        int cnt=0;
        int n = nums.length;
        mpp.put(0,1);
        for (int i = 0 ; i<n ; i++ ){
            sum+=nums[i];
            if (mpp.containsKey(sum-k)) {
                cnt = cnt+mpp.get(sum-k);

            }
            if (mpp.containsKey(sum)) mpp.put(sum,1+mpp.get(sum));
            else mpp.put(sum,1);
        }
        return cnt;
    }
}