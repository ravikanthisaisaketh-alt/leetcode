class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort()
        ans=[intervals[0]]
        for curr in intervals[1:]:
            last = ans[-1]
            if curr[0] <= last[1]:
                last[1] = max(last[1], curr[1])
            else:
                ans.append(curr)    
        return ans

        
                        

        