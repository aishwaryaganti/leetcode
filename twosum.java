public class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int i;
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        if(nums==null || nums.length<2)
            return new int[]{0,0};
        for(i=0 ; i<nums.length ; i++)
        {
            if(map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]),i};
            else
                map.put(target-nums[i],i);
        }
        return new int[]{0,0};
    }
}