class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] prev=ps(heights);
        int[] nex=ns(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            int cur=heights[i]*(nex[i]-prev[i]);
            max=Math.max(max,cur);
        }

        return max;
    }

    public int[] ps(int [] arr){
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(st.empty()){
                ans[i]=0;
                st.push(i);
            }else{
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
                }
                
                if(st.isEmpty()){
                    ans[i]=0;
                }else{
                    ans[i]=st.peek()+1;
                }
                
                st.push(i);
            }
        }

        return ans;
    }

    static int[] ns(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int ans[] =new int[n];

        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=n;
                st.push(i);
            }else{
                while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=n;
                }else{
                    ans[i]=st.peek();
                }

                st.push(i);
            }
        }

        return ans;
    }
}