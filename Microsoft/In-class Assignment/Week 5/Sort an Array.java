class Solution {
    public int[] sortArray(int[] nums) {
         
      //  Bubble Sort 
      
       if(nums.length==0)
         {
             return nums;
         }  
        else
        {
          bubblesort(nums); 
          return nums;
         } 
    }
        public void bubblesort(int nums[])
        {
        for(int i=(nums.length)-1;i>=1;i--)
          {
            for(int j=0;j<i;j++)
            { 
                if(nums[j]>nums[j+1])
                {
                  swap(nums,j,j+1); 
                }
            }
          } 
        } 
       public void swap(int nums[],int i,int j )
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
       }
