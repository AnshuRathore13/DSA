class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
        
            set.add(nums[i]);

        }

        int max=0;
        for(int num:set){
           if(!set.contains(num-1)){
            int currnum=num;
            int cur=1;

            while(set.contains(currnum+1)){
                cur++;
                currnum=currnum+1;
            }

            max=Math.max(cur,max);
           }
        
        }

        return max;
    }
}