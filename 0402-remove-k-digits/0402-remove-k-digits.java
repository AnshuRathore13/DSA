class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int n=num.length();

        for(int i=0;i<n;i++){
            while(!st.empty() && k>0 && (num.charAt(i)-'0')<(st.peek()-'0')){
                st.pop();
                k-=1;
                
            }
            st.push(num.charAt(i));
        }

        if(k>0){
            while(k>0){
                st.pop();
                k--;
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        while(sb.length()>0 && sb.charAt(sb.length()-1)=='0'){
            sb.deleteCharAt(sb.length()-1);
        }

        if(sb.length()==0) return "0";

        sb.reverse();

        return sb.toString();


    }
}