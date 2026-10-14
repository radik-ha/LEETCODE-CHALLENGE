class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9)
        {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<num;i++)
        {
           int digit = Math.min(sum,9);
           result.append(digit);
           sum = sum-digit;
        }
        return result.toString();
    }
}