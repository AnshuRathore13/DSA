class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
            max=Math.max(max,nums[i]);

        }

        for(int i=1;i<=max;i++){
            if(!set.contains(i)) return i;
        }    

        return max+1;   
    }


}