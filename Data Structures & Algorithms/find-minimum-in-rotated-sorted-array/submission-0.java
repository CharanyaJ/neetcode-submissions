class Solution {
    public int findMin(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue <>((a,b) -> a-b);
        for (int n:nums){
            minHeap.offer(n);
        }
        return minHeap.poll();
    }
}
