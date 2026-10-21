class Solution {
    public int minOperations(String s) {
        int n = s.length();
       
        boolean sorted = true;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)<s.charAt(i-1))
            {
                sorted = false;
                break;
            }
        }
        if(sorted)
        {
            return 0;
        }
         if(n == 2)
        {
            return -1;
        }
        char min = 'z';
        char max = 'a';
        int mincount=0;
        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c < min)
            {
                min = c;
                mincount=1;
            }
            else if(c == min)
            {
                mincount++;
            }
            if(c > max)
            {
                max = c;
                maxcount=1;
            }
            else if(c == max)
            {
                maxcount++;
            }
        }
        if(s.charAt(0)==min || s.charAt(n-1)==max)
        {
            return 1;
        }
        else if((s.charAt(0)==max && maxcount==1) && (s.charAt(n-1)==min && mincount==1)){
            return 3;
        }
        else
        {
            return 2;
        }
    }
}