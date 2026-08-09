class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> map=new HashSet<>();
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
            max=Math.max(max,nums[i]);

        }

        for(int i=0;i<=max;i++){
            if(!map.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}