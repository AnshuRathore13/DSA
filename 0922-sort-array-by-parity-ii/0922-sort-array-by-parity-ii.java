class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        for(int num:nums){
            if(num%2==0) even.add(num);
            else odd.add(num);
        }
        int e=0,o=0,c=0;
        while(c<nums.length){
            nums[c]=even.get(e);
            c++;
            nums[c]=odd.get(o);
            c++;
            e++;
            o++;
        }   

        return nums; 
    }
}