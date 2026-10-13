class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }
        Arrays.sort(nums);

        long ans=0;
        int n=nums.length;
        int h=n/2;
        for(int i=0;i<h;i++){
            ans-=Math.pow(nums[i],2);
        }

        for(int i=h;i<n;i++){
            ans+=Math.pow(nums[i],2);
        }
        
        return ans;
    }
}