class Solution {
    public int[] sortArray(int[] nums) {
         
      //  selection sort 
      
        if(nums.length==0)
         {
          return nums;
         }  
        else 
        {
           selectionsort(nums); 
            return nums;
        }
    }
         public void selectionsort(int nums[])
         { 
            
            for(int i=0;i<nums.length-1;i++)
            {  
                int min=i;
                for(int j=i+1;j<nums.length;j++)
                {
                   if(nums[j]<nums[min])
                   {
                     min=j;
                    } 
                   
                 }  
                if(i!=min)
                {
                    swap(i,min,nums);
                }
                
            }
         } 
         public void swap(int j,int min ,int nums[])
         {
           int temp=nums[j];
           nums[j]=nums[min];
           nums[min]=temp; 
         }
        
       
    
}
       
