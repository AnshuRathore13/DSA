class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int [] num1=new int[k];

        for(int i=nums.length-k,j=0;i<nums.length;i++,j++){
            num1[j]=nums[i];
        }

        for(int i=nums.length-1;i>=k;i--){
            nums[i]=nums[i-k];
        }

        for(int i=0;i<k;i++){
            nums[i]=num1[i];
        }   

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }    
        
    }
}