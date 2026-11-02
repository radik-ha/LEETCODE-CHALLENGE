class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int moves = 0;
        int left = 0;
        int right = nums.length-1;
        int median = nums[left+right/2];
        for(int i=0;i<nums.length;i++)
        {
            moves = moves + Math.abs(nums[i]-median);
        }
        return moves;
    }
}