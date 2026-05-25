class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arrMap = new HashSet();
        for(int i=0; i<nums.length; i++){
            if (arrMap.contains(nums[i])){
                return true;
            }
            else arrMap.add(nums[i]);
        }
        return false;
    }
}