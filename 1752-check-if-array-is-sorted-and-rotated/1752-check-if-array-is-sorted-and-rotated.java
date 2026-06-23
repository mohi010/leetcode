class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int idx = -1;
        for (int i =0 ; i<n-1 ; i++){
            if (arr[i+1]<arr[i]){
                idx= i;
                break;
            }
        }
        if (idx==-1) return true;
        int i = 0;
        int j = idx;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i= idx+1;
        j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i=0;
        j=n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        for (int k = 0 ; k<n-1 ; k++){
            if (arr[k]>arr[k+1]) return false;
        }
        return true;
    }
}