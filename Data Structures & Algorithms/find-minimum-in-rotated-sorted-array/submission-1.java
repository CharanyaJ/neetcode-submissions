class Solution {
    public int findMin(int[] nums) {
        Stack<Integer> s = new Stack<>();
        s.push(nums[0]);
        for (int i=1;i<nums.length; i++){
            if(nums[i]<s.peek()) s.push(nums[i]);
        }
        return s.peek();
    }
}
