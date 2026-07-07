class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num: nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }
        //Frequency Bucket Solution
        List<Integer>[] bucket = new List[nums.length +1];

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if (bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[] result = new int[k];
        int index = 0;
        for (int freq = bucket.length -1; freq>=1 && index<k; freq--){
            if (bucket[freq]==null) continue;
            for (int num: bucket[freq]){
                result[index++] = num;
                if (index==k)
                    return result;
            }
        }
        return result;
    }
}
