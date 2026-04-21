class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        majority_ele=[]
        n= len(nums)
        count={}
        for i in nums:
            if i in count:
                count[i]+=1
            else:
                count[i]=1
        for key,val in count.items():
            if val > n//3:
                majority_ele.append(key)
        return majority_ele        