class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nums2[]=new int[nums.length];
        
        int pref[]=new int [nums.length];
        int suff[]=new int [nums.length];
        pref[0]=nums[0];
        pref[1]=nums[0];
        suff[nums.length-1]=nums[nums.length-1];
        suff[nums.length-2]=nums[nums.length-1];


        for(int i=2;i<nums.length;i++){
            pref[i]=nums[i-1]*pref[i-1];

        }

        for(int i=nums.length-3;i>=0;i--){
            suff[i]=nums[i+1]*suff[i+1];
        }
        
        nums2[0]=suff[0];
        nums2[nums.length-1]=pref[nums.length-1];

        for(int i=1;i<nums.length-1;i++){
            nums2[i]=pref[i]*suff[i];

        }

        return nums2;



    }
}