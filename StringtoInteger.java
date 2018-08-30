public class Solution {
    public  int myAtoi(String str) 
    {
        str=str.trim();
        int len=str.length();
        int flag=-1,i=0;
        double res=0.0;
        if(len==0)
            return 0;
       // System.out.println(' '-'0');
        while(i<len)
        { 
           // System.out.println(flag);
            if(str.charAt(i)-'0'==-5 && flag==-1)
            {
                            //System.out.println("positive");

                flag=1;
                i++;
                continue;
            }
            else if(str.charAt(i)-'0'==-3 && flag==-1)
            {
                            System.out.println("negative");

                flag=0;
                i++;
                continue;
            }
            if(flag==-1)
            {
                System.out.println("invoked");
                flag=1;
            }
            
            if((str.charAt(i)-'0')<0 ||(str.charAt(i)-'0')>9)
                break;
            res=res*10+(str.charAt(i)-'0');
            i++;
        }
        res=(flag==1)?(int)res:(int)-res;

        if (res > Integer.MAX_VALUE)
		    return Integer.MAX_VALUE;
 
	    if (res < Integer.MIN_VALUE)
		    return Integer.MIN_VALUE;
        return (int)res;
 
    }
}