class Solution {
    public int minInsertions(String s) {
        int opencount = 0;
        int insertion = 0;
        int i = 0;
        while(i<s.length())
        {
            if(s.charAt(i) == '(')
            {
                opencount++;
                i++;
            }
            else
            {
                if(i+1<s.length() && s.charAt(i+1) == ')')
                {
                    i += 2;
                }
                else
                {
                    i++;
                    insertion++;
                }
                if(opencount>0)
                {
                    opencount--;
                }
                else
                {
                    insertion++;
                }
            }
        }
        return insertion+opencount*2;
    }
}