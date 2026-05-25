class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> arrMap = new HashMap <> ();
        for(int i=0; i<nums.length; i++){
            if (arrMap.containsValue(nums[i])){
                return true;
            }
            else arrMap.put(i, nums[i]);
        }
        return false;
    }
}