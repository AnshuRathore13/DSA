import java.util.Arrays;


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] merged = new double[nums1.length + nums2.length];

        for(int i=0;i<nums1.length;i++){
            merged[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            merged[nums1.length+i]=nums2[i];
        }

        Arrays.sort(merged);     
        int length=merged.length;

        if(length%2==0){
            double result=((merged[length/2]+merged[(length-1)/2])/2);
            return result;
        }else{
            return (merged[(length-1)/2]);
        }
    }
}