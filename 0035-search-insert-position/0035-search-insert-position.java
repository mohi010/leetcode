class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int lo=0;
        int hi =n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid] >= target){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
            
            
        }
        return ans;
    }
}