class Solution {
    public int singleNumber(int[] nums) {
        int fin=0;
        for(int i=0;i<nums.length;i++){
            fin ^=nums[i];
        }

        return fin;
    }
}