class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 0;
        int[] output = new int[nums.length];
        int[] productBeforeMe = new int[nums.length + 1];
        productBeforeMe[0]=1;
        while (left<nums.length-1){
            productBeforeMe[left+1] = productBeforeMe[left] * nums[left];
            int right = left+1;
            int product = 1;
            if (nums[right] == 0){
                product = 0;
                output[left] = 0;
            } else {
                while (right < nums.length){
                    product *= nums[right];
                    right++;
                }
                product *= productBeforeMe[left];
                output[left] = product;

            }
            left++;
        }
        output[left] = productBeforeMe[left];
        return output;
    }
}  
