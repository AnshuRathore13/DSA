class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st= new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                sb.append(s.charAt(i));
                st.push('(');
            }else if(s.charAt(i)==(')')){
                if(!st.isEmpty()){
                    sb.append(')');
                    st.pop();
                }
            }else{
                sb.append(s.charAt(i));
            }
        }


        int size=st.size();
        

        for(int i=sb.length()-1;i>=0;i--){
            if(size>0){
                if(sb.charAt(i)=='('){
                    sb.deleteCharAt(i);
                    size--;
                    
                }
            }else break;
        }
        return sb.toString();
    }
}