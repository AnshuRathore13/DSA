class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ar=new ArrayList<>();
        int l=0;
        int idx=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                l++;
            }else if(nums[i]==target){
                idx++;
            }
        }

        for(int j=l;j<l+idx;j++){
            ar.add(j);
        }

        return ar;
    }
}