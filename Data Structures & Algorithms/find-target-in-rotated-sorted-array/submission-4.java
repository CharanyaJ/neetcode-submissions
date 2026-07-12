class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int minIdx = 0;
        if (nums[left] > nums[right]) {
            minIdx = minIndex(nums, left, right);

            if (target >= nums[0] && target <= nums[minIdx - 1]) {
                left = 0;
                right = minIdx - 1;
            } else if (target >= nums[minIdx] && target <= nums[nums.length - 1]) {
                left = minIdx;
                right = nums.length - 1;
            }
            else return -1;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target >= nums[mid])
                left = mid + 1;
            else
                right = mid;
        }
        if (nums[left] != target) {
            return -1;

        } else {
            return left;
        }
    }
    int minIndex(int[] nums, int left, int right) {
        while (left < right) {
            if (nums[left] <= nums[right]) {
                return left;
            }
            int mid = left + (right - left) / 2;
            if (nums[left] <= nums[mid])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
