class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        def backtrack(current,opencount,closecount):
            if len(current) == 2*n:
                result.append(current)
                return
            if(opencount<n):
                backtrack(current + "(",opencount+1,closecount)
            if(closecount<opencount):
                backtrack(current + ")",opencount,closecount+1)
        backtrack("",0,0)
        return result
