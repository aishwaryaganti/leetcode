import itertools
class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        d={'2':['a','b','c'],'3':['d','e','f'],'4':['g','h','i'],'5':['j','k','l'],'6':['m','n','o'],'7':['p','q','r','s'],'8':['t','u','v'],'9':['w','x','y','z']}
        if digits=="":
            return []
        temp=[]
        result=[]
        for i in range(len(digits)):
            n=digits[i]
            t=d[n]
            temp.append(t)
        tt=list(itertools.product(*temp))
        for i in tt:
            res=''.join(i)
            result.append(res)
        return result