class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        ans=""
        count=0
        for ch in s:
            if count == 0  and ch == '(':
                count+=1
            elif ch == '(':
                count+=1
                ans+=ch
            elif ch == ')' and count ==1:
                count-=1
            elif ch == ')':
                count-=1
                ans+=ch
        return ans

        