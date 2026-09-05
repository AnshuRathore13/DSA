class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        int n=nums.length;

        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    ans[i]=st.peek();
                }else{
                    ans[i]=-1;
                }
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}