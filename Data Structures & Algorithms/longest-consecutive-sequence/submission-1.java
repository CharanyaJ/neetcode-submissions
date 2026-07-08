class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int prevCount = 0;
        for (int num : set) {
            int count = 1;
            if (!set.contains(num - 1)) {
                while (count < set.size()) {
                    if (set.contains(num + 1)) {
                        count++;
                        num += 1;
                    } else
                        break;
                }
            }
            if (count > prevCount) {
                prevCount = count;
            }
        }
        return prevCount;
    }
}
