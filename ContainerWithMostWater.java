class Solution {
    public int maxArea(int[] height) 
    {
     int res=0;
        
        int j=0,k=height.length-1;
        System.out.println(k);
        while(j<k)
        {
            res=Math.max(Math.min(height[j],height[k])*(k-j),res);
            if(height[j]<height[k])
                j++;
            else
                k--;
            
        }
        return res;
    }
}