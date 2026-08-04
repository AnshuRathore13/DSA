import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int i=0;
        List<List<Integer>> arl=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();

        sets(nums,i,arl,curr);  
        return arl;     
    }

    public void sets(int[] nums,int i,List<List<Integer>> arl,List<Integer> curr){
        if(i==nums.length){
            arl.add(new ArrayList<>(curr));
            return;
            
        }
        curr.add(nums[i]);
        sets(nums,i+1,arl,curr);
        curr.remove(curr.size()-1);
        sets(nums,i+1,arl,curr);
        


    }
}