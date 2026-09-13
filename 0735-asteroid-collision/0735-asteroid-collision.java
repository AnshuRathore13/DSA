class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            int v=asteroids[i];
            if(v>0){
                st.push(v);
            }else{
                while(!st.isEmpty() && st.peek()>0 && v<0){
                    if((v+st.peek())==0){
                        st.pop();
                        v=0;
                    }else if((v+st.peek())<0){
                        st.pop();

                    }else{
                        v=0;
                    }
                }
                if(v!=0){
                    st.push(v);
                }
            }
        }

        int arr[]=new int[st.size()];

        int j=0;
        for(int i:st){
            arr[j]=i;
            j++;
        }

        return arr;
    }
}