class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int winsum = 0;
        int left = 0;
        for(int right=0;right<nums.length;right++)
        {
            winsum = winsum + nums[right];
            while(winsum >= target)
            {
                minlen = Math.min(minlen,right-left+1);
                winsum = winsum - nums[left];
                left++;
            }
        }
        if(minlen == Integer.MAX_VALUE)
        {
            return 0;
        }
        return minlen;
    }
}