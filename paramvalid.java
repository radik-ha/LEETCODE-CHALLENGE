class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openstack = new Stack<>();
        Stack<Integer> starstack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                openstack.push(i);
            }
            else if(ch == '*')
            {
                starstack.push(i);
            }
            else
            {
                if(!openstack.isEmpty())
                {
                    openstack.pop();
                }
                else if(!starstack.isEmpty())
                {
                    starstack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        while(!openstack.isEmpty() && !starstack.isEmpty())
        {
            if(openstack.peek()>starstack.peek())
            {
                return false;
            }
            openstack.pop();
            starstack.pop();
        }
        return openstack.isEmpty();
    }
}