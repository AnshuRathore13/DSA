class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();

        StringBuilder st=new StringBuilder();

        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }

        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            
            while(i<s.length() && s.charAt(i)!='('){
                st.append(s.charAt(i));
                i++;
            }

            if(i<s.length () &&s.charAt(i)=='('){
                i++;
                while(i<s.length() && s.charAt(i)!=')'){
                    sb.append(s.charAt(i));
                    i++;
                }

                if(map.containsKey(sb.toString())){
                    st.append(map.get(sb.toString()));
                }else{
                    st.append('?');
                }
            }
        }

        return st.toString();


    }
}