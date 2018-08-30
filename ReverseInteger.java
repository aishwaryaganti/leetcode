public class Solution {
    public int reverse(int x) 
    {
        boolean neg=false;
        if(x<0)
        {
            x=-x;
            neg=true;
        }
        int cur=0,rev=0,prev=0;
        while(x!=0)
        {
            cur=x%10;
            rev=rev*10+cur;
            if((rev-cur)/10 != prev)
            {
                return 0;
            }
            prev=rev;
            x=x/10;
        }
        return (neg)?-rev:rev;
    }
}