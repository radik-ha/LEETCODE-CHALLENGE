class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        boolean ans = false;
        int count = 0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(Math.abs(arr1[i]-arr2[j])>d)
                {
                    ans = true;
                }
                else
                {
                    ans = false;
                    break;
                }
                
            }
            if(ans)
            {
                count++;
            }
        }
        return count;
    }
}