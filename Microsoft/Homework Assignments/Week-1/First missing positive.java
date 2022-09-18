class Solution {
    public int firstMissingPositive(int[] nums) { 
        HashSet<Integer> set= new HashSet<>(); 
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                set.add(nums[i]);
                count++;
            }
        }  
        int res=1; 
        while(set.contains(res) && count>=0)
        {
            res++;
            count--;
        } 
        return res;
    }
}
