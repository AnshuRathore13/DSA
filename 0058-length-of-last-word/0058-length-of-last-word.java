class Solution {
    public int lengthOfLastWord(String s) {
        int i=0;
        int j=s.length()-1;

        while(j>=0 && s.charAt(j)==' '){
            j--;
        }

        

        i=j;

        while(i>=0 && s.charAt(i)!=' '){
            i--;
        }

        return j-i;


    }
}