class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int cnt = 0;
        for (int i = 0; i <arr.length ; i++){
            if (arr[i] ==1) cnt++;
            else{
                if (max<cnt) max = cnt;
                cnt = 0;
            }
        }
        if (max>cnt) return max;
        else return cnt;
    }
}