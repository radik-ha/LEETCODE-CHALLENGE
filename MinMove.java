/*
class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--)
        {
            moves = moves + (nums[i]-nums[0]);
        }
        return moves;
    }
}*/
class Solution {
    public int minMoves(int[] nums) {
        int moves=0;
        int min = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            min = Math.min(min,nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            moves = moves + nums[i]-min;
        }
        return moves;
    }
}