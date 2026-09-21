class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0]==0) return sum(nums);

        if(nums[0]>0 && k%2==0){
            return sum(nums);
        }
        if(nums[0]>0 && k%2!=0){
            return sum(nums)-2*nums[0];
        }

        int i=0;
        while(k>0 && nums[i]<0){
            nums[i]=-nums[i];
            k--;
            i=(i+1)%nums.length;
        }
        Arrays.sort(nums);

        if(k%2==0 || nums[0]==0){
            return sum(nums);
        }else{
            return sum(nums)-2*nums[0];
        } 
    }

    public static int sum(int arr[]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        return sum;
    }
}