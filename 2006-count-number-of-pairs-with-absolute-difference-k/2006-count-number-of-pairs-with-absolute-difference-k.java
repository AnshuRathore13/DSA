class Solution {
    public int countKDifference(int[] nums, int k) {
        // HashMap<Integer,Integer> map=new HashMap<>();
       

        // int count=0;

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // for(int num:map.keySet()){
        //     if(map.containsKey(num+k)  ){
        //         count+=map.get(num);
                
        //     }else if(!map.containsKey(num+k) && map.containsKey(num-k)){
        //         count+=map.get(num);
        //     }

            
        // }

        // return count;

        int count=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k ) count++;
            }
        }

        return count;

    }
}