class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            map.putIfAbsent(num, 0);
            int count = map.get(num);
            map.put(num, count+1);
        }
        return map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .mapToInt(Map.Entry::getKey)
                        .limit(k)
                        .toArray();
    }
}
