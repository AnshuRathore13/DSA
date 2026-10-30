class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        int i=0;

        while(j<haystack.length() && i<needle.length()){
            
            if(haystack.charAt(j)==needle.charAt(i)){
                int k=j+1;
                i++;
                while(k<haystack.length() && i<needle.length() && haystack.charAt(k)==needle.charAt(i)){
                    k++;
                    i++;
                }

                if(i==needle.length()) return j;
            }

            j++;
            i=0;
            
        }

        return -1;
    }
}