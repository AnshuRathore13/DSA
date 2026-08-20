class Solution {
    public int myAtoi(String s) {
        int sign=1;
        int result=0;

        int ch=0;
        while(ch<s.length() && s.charAt(ch)==' '){
            ch++;
        }
        
        if(ch<s.length() && (s.charAt(ch)=='-')){
            sign=-1;
            ch++;
        }else if(ch<s.length() && (s.charAt(ch)=='+')){
            sign=1;
            ch++;
        }
        while(ch<s.length() && s.charAt(ch)>='0' && s.charAt(ch)<='9'){
            int ls=s.charAt(ch)-'0';
            ch++;

            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && ls  >7)){
                return sign ==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            result=result*10+ls;
        }

        

        return sign*result;  
    }
}