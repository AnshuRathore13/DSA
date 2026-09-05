class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min[]=new int[n];
        int max[]=new int[n];
        int d=0;
        max[0]=nums[0];
        min[n-1]=nums[n-1];


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
            d=max[i]-min[i];
            if(d<=k){
                return i;
            }
        }

        return -1;
    }
}