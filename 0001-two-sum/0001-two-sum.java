class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int left=0,right=nums.length-1;

        // while(left<right){
        //     int sum=nums[left]+nums[right];
        //     if(sum==target){
        //         return new int[]{left,right};
        //     }else if(sum>target){right--;}
        //     else{left++;}
        // }
        // return new int[]{0};


        HashMap<Integer,Integer> map=  new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];

            if(map.containsKey(req)){
                return new int[]{i,map.get(req)};
            }

            map.put(nums[i],i);
        }



        return new int[]{0};

    }
}