class Solution {
    public int sumSubarrayMins(int[] arr) {
        int ps[] =pse(arr);
        int ns[]=nse(arr);
        int n=arr.length;
        long sum=0l;
        long mod=1000000007l;

        for(int i=0;i<n;i++){
            int l=i-ps[i];
            int r=ns[i]-i;
            sum=(sum+((long)arr[i]*l*r)%mod)%mod;
        }
        return (int)sum;
    }

    static int[] pse(int[] arr){
        Stack<Integer> st=new Stack<>();

        int res[]=new int[arr.length];

        int n=arr.length;

        for(int i=0;i<n;i++){

            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
            }
            if(st.isEmpty()){
                    res[i]=-1;

            }else{
                    res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }

    static int[] nse(int[] arr){
        Stack<Integer> st=new Stack<>();
        int [] res=new int[arr.length];
        int n=arr.length;

        for(int i=n-1;i>=0;i--){
  
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }

                if(st.isEmpty()){
                    res[i]=n;
                }else{
                    res[i]=st.peek();
                }
                st.push(i);
            
        }
        return res;
    }
}