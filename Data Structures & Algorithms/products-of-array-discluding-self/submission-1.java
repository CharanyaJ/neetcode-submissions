class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        prefixProduct[0]=1;
        suffixProduct[nums.length-1]=1;
        int left = 1;
        while (left<nums.length){
            prefixProduct[left] = prefixProduct[left-1] * nums[left-1];
            left++;
        }
        int right = nums.length-2;
        while (right>=0){
            suffixProduct[right] = suffixProduct[right+1] * nums[right+1];
            right--;
        }
        for (int i=0; i< nums.length; i++){
            output[i] = prefixProduct[i] * suffixProduct[i];
        }
        return output;
    }
}  
