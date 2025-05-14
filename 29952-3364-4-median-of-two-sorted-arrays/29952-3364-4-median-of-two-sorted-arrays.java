class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       double x =0;
       if(nums1.length==0 && nums2.length==0){
        return x;
       } 
       int[] result = new int[nums1.length + nums2.length];
       int i=0;
       for(int nums:nums1){
        result[i++]=nums;
       }
       for(int nums:nums2){
        result[i++]=nums;
       }
       Arrays.sort(result);
       int temp = (nums1.length + nums2.length); 
       if(temp%2!=0){
        return (double)result[(int)Math.floor(temp/2)];
       }
       //System.out.println((result[(temp/2)-1]+result[(temp/2)])/2.0);
       return ((result[(temp/2)-1]+result[(temp/2)])/2.0);
    }
}