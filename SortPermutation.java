class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int k = 0;
        boolean first = true;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != i)
            {
                if(first)
                {
                    k = nums[i];
                    first = false;
                }
                else
                {
                    k = k&nums[i];
                }
            }
        }
        return k;
    }
}