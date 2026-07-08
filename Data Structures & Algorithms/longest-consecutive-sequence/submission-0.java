class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> seq = new ArrayList<>();
        for (int n : nums){
            set.add(n);
        }
        int prevCount = 0;
        for (int i=0; i< nums.length; i++){
            if(set.contains(nums[i]-1)) continue;
            else{
                seq.add(nums[i]);
            }
        }
        for (int j=0; j< seq.size(); j++){
            int count = 1;
            int num = seq.get(j);
            while (count <= nums.length){
                if (set.contains(num+1)){
                    count++;
                    num+=1;
                }
                else break;
            }
            if (count> prevCount){
                prevCount = count;
            }
        }
        return prevCount;
        
    }
}
