class Solution {
    public int search(int[] nums, int target) { 
        int start=0; 
        int len=nums.length;
        int end=len-1;
        while(start<=end)
        { 
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            } 
            if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && target<nums[mid] )
                {
                    end=mid-1;
                } 
                else 
                {
                    start=mid+1;
                }
            } 
            else 
            {
                if( target>nums[mid]&& target<=nums[end] )
                {
                    start=mid+1;
                } 
                else 
                {
                    end=mid-1;
                }
            }
        }
        return -1;
        
    }
} 