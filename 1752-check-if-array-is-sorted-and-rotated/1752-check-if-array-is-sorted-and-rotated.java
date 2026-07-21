class Solution {
    public boolean check(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                k=i+1;
            }
        }

        if(k==0){
            return true;
        }else return rotateleft(nums,k);
    }

    public boolean rotateleft(int [] nums,int k){
        int num2[]=new int[k];

        for(int i=0;i<k;i++){
            num2[i]=nums[i];
        }

        for(int i=0;i<nums.length-k;i++){
            nums[i]=nums[i+k];
        }

        for(int i=nums.length-k,j=0;i<nums.length;i++,j++){
            nums[i]=num2[j];
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }

        return true;
    }
}