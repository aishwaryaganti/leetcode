class Solution(object):
    def divide(self, dividend, divisor):
        if dividend == 0:
            return 0
        if dividend == -2147483648 and divisor == -1:
            return 2147483648 - 1
        sign=1
        if((dividend<0 and divisor>0) or(dividend>0 and divisor<0)):
            sign=-1
        dividend = abs(dividend)
        divisor = abs(divisor)
        res = 0
        while dividend >= divisor:
            d2 = divisor
            val = 1
            while (d2 + d2) <= dividend:
                d2=d2+d2
                val = val + val
            dividend -= d2
            res += val

        if sign > 0:
            return res
        else:
            return -res
        