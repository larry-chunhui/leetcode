class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1=m-1;
        int tail2=n-1;
        int lastIndex=m+n-1;
        
        while(lastIndex>=0){
            if(tail1<0){
                nums1[lastIndex]=nums2[tail2];
                tail2--;
            }
            else if(tail2<0){
                return;
            }
            
            else if(nums1[tail1]>=nums2[tail2]){
                nums1[lastIndex]=nums1[tail1];
                tail1--;
            }
            else if(nums1[tail1]<nums2[tail2]){
                nums1[lastIndex]=nums2[tail2];
                tail2--;
            }
            
            lastIndex--;
        }
        
    }
}