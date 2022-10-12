class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int len1 = nums1.length;
        int len2 = nums2.length;
        int[] merge = new int[len1+len2];
        
        for(int i=0,j=0,n=0; n<len1+len2; n++){
            if(i<len1 && j<len2){
                if(nums1[i] < nums2[j])
                    merge[n] = nums1[i++];
                else
                    merge[n] = nums2[j++];             
            }
            else{
                if(i < len1)
                    merge[n] = nums1[i++];
                if(j < len2)
                    merge[n] = nums2[j++];
            }
        }
        int totallen;
        totallen = len1+len2;
        
        return totallen%2 == 0? (merge[totallen/2]+merge[totallen/2-1])/(double)2 : (double)merge[totallen/2];
      
    }
}
