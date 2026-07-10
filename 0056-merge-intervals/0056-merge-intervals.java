class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        List<List<Integer>> merged = new ArrayList<>();

        // Traverse through all intervals
        for (int[] interval : intervals) {
            // If merged list is empty or no overlap
            if (merged.isEmpty() ||
                    merged.get(merged.size() - 1).get(1) < interval[0]) {
                // Add current interval as a new block
                merged.add(
                        Arrays.asList(interval[0], interval[1]));
            } else {
                // Overlapping: update end to max of both
                int last = merged.size() - 1;
                int maxEnd = Math.max(
                        merged.get(last).get(1),
                        interval[1]);
                merged.get(last).set(1, maxEnd);
            }
        }
        int[][] ans = new int[merged.size()][];

        for (int i = 0; i < merged.size(); i++) {
            ans[i] = new int[merged.get(i).size()];
            for (int j = 0; j < merged.get(i).size(); j++) {
                ans[i][j] = merged.get(i).get(j);
            }
        }
        return ans;
    }
}