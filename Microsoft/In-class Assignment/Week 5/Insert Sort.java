classic Solution {
    public int[] sortArray(int[] nums) {
         
      //  insert sort
      if(nums.length==0)
      { 
          return nums;
      } 
      else 
       {
            insertionsort(nums);
            return nums;
       }  
    } 
    public void insertionsort(int nums[])
    {
        
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(nums[j-1]>nums[j])
                {
                    swap(j,j-1,nums);
                } 
                else{
                break; 
}
            }
        } 
    }
       public void swap(int j,int i,int nums[])
       {
           int temp=nums[j]; 
           nums[j]=nums[i];
           nums[i]=temp;
           
       }
       
    
}
