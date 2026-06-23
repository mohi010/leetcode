class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        int j=0;
        while(j!=arr.length){
            if (arr[i]==arr[j]) j++;
            else{
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return i+1;
    }
}