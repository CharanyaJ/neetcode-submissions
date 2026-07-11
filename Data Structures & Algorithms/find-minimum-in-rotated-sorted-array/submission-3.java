class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right = nums.length-1;
        int result = 0,  mid = 0;
        while(left<right){
            System.out.println("left: " + left + " nums[left]: " + nums[left] + " right: " + right +" nums[right]: " 
            +nums[right] + " mid: " + mid +" nums[mid]: " + nums[mid]);
            if (nums[left]<=nums[right]){
                result=nums[left];
                System.out.println("result:" + result);
                return result;
            }
            else {
                mid = left + (right-left)/2;
                if (nums[mid]>=nums[left]){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
            }
            System.out.println("left: " + left + " nums[left]: " + nums[left] + " right: " + right +" nums[right]: " 
            +nums[right] + " mid: " + mid +" nums[mid]: " + nums[mid]);
        }
        return nums[left];
    }
}
