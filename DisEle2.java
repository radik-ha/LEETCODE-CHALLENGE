class Solution {
    public int sumCounts(int[] nums) {
        int n = nums.length;
        long total = 0;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> set = new HashSet<>();
            
            for(int j=i;j<n;j++)
            {
                set.add(nums[j]);
                int count = set.size();
                total = (total + count*count)%1000000007;
            }
        }
        return (int)total;
    }
}