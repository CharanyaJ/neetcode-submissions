class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        output[0]=1;
        int left = 1;
        while (left<nums.length){
            output[left] = output[left-1] * nums[left-1];
            left++;
        }
        int right = nums.length-2;
        int product =1;
        while (right>=0){
            product *= nums[right+1];
            output[right] *= product; 
            right--;
        }
        return output;
    }
}  
