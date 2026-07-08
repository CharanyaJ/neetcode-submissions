class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int area = 0;
        int maximumArea=0;
        while(left<right){
            area = (right-left) * Math.min(heights[left], heights[right]);
            if (heights[left]<heights[right]) left++;
            else right--;
            maximumArea = Math.max(area,maximumArea);
        }
        return maximumArea;
    }
}
