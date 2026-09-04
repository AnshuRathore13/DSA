class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min[]=new int[nums.length];
        int max[]=new int[nums.length];
        int n=nums.length;
        max[0]=nums[0];
        min[nums.length-1]=nums[nums.length-1];

        int s=0;

        for(int i=1;i<n;i++){
            if(nums[i]>max[i-1]){
                max[i]=nums[i];
            }else{
                max[i]=max[i-1];
            }

            if(nums[n-i-1]<min[n-i]){
                min[n-i-1]=nums[n-i-1];
            }else{
                min[n-i-1]=min[n-i];
            }
        }
        
        for(int i=0;i<n;i++){
            s=max[i]-min[i];
            if(s<=k){
                return i;
            }
        }

        return -1;
    }
}