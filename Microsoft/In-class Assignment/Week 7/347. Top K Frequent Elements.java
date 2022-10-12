class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     } 
        Queue<Integer>heap=new PriorityQueue<>((num1,num2)->map.get(num2)-map.get(num1));
        for(int num:map.keySet())
        {
            heap.add(num);
        } 
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=heap.poll();
        }
        return ans;
    }
}
