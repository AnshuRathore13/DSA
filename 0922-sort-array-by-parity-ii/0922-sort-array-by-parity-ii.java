class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int [] ar=new int[nums.length];
        int e=0,o=1;
        for(int num:nums){
            if(num%2==0){
                ar[e]=num;
                e+=2;
            } else{
                ar[o]=num;
                o+=2;
            }
        }
        return ar;
    
    }
}