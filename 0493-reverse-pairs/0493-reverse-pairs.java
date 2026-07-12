class Solution {
    static int count;

    public int reversePairs(int[] nums) {
        count = 0;
        partition(nums);
        return count;
    }

    public static void partition(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = nums[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = nums[idx++];
        }

        partition(a);
        partition(b);
        mergeSort(a, b, nums);

    }

    public static void mergeSort(int[] a, int[] b, int[] nums) {
        int i = 0;
        int j = 0;
        int k = 0;
        countPairs(a, b);
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                nums[k++] = a[i++];
            else {
                nums[k++] = b[j++];
            }
        }
        while (i < a.length)
            nums[k++] = a[i++];
        while (j < b.length)
            nums[k++] = b[j++];
    }

    public static void countPairs(int[] a, int[] b) {
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            while (j < b.length && (long) a[i] >(long) 2 * b[j]) {
                j++;
            }
            count += j;
        }
    }
}