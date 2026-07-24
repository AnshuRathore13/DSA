class Solution {
    public int[] runningSum(int[] nums) {
        int[] nums2=new int[nums.length];
        nums2[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            nums2[i]=nums[i]+nums2[i-1];
        }

        return nums2;
    }
}