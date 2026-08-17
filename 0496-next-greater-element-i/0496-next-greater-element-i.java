class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = n-1; i>=0; i--){
            while(st.size()>0 && nums2[i]>st.peek()) st.pop();
            if (st.size()==0) map.put(nums2[i], -1);
            else map.put(nums2[i], st.peek());
            st.add(nums2[i]);
        }
        for (int i =0; i<m; i++) ans[i] = map.get(nums1[i]);
        return ans;
    }
}