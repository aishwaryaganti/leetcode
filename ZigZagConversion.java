public class Solution {
    public String convert(String s, int numRows) 
    {
        String res="",temp="";
        int j=1,k,i,flag=0;
        int len=s.length();
        System.out.println(len);
        HashMap<Integer,String> map=new HashMap<>();
        if(s=="" || numRows==1|| len<numRows)
            return s;
        for(i=0;i<len;i++)
        {
            if(j==numRows+1)
            {   j=numRows-1;
             flag=1;}
            if(j==1)
                flag=0;
            if(map.get(j)==null)
                temp=""+s.charAt(i);
            else
                temp=map.get(j)+s.charAt(i);
            if(flag==0)
            {
                
                map.put(j++,temp);
            }
            else
            {
                map.put(j--,temp);
            }
        }
        for(i=1;i<=numRows;i++)
            res=res+map.get(i);
        return res;
    }
}