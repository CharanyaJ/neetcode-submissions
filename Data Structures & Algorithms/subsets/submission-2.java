class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, 
    List<Integer> current, int[] nums, int index) {
        if (index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtrack(result, current, nums, index+1);
        current.remove(current.size() - 1);
        backtrack(result, current, nums, index+1);
        }
    
}
