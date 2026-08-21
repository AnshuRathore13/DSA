class Solution {
    public int romanToInt(String s) {
        int ans=0;

        for(int i=1;i<s.length();i++){
            if(value(s.charAt(i-1))>=value(s.charAt(i))){
                ans+=value(s.charAt(i-1));
            }else if(value(s.charAt(i-1))<value(s.charAt(i))){
                ans-=value(s.charAt(i-1));
            
            }
                
        }
        ans+=value(s.charAt(s.length()-1));
        return ans;
    }

    static int value(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        if(c=='M') return 1000;
        return 0;
    }
}