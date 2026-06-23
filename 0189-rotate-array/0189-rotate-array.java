class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if (k>=n) k = k%n; 
        helper(arr, 0, n-k-1 );
        helper(arr, n-k, n-1);
        helper(arr, 0, n-1);
    }
    public static void helper(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
