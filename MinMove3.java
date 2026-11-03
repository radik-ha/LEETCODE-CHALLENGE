class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            moves = moves + max-nums[i];
        }
        return moves;
    }
}