class Solution {
    public boolean checkValidString(String s) {
       int p=0;
       int n=0;

       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                p++;
                n++;
            }else if(s.charAt(i)==')'){
                p--;
                n--;

            }else{
                p++;
                n--;
            }

            if(p<0) return false;

            n=Math.max(n,0);
       }

       return n==0;
    }

    
}