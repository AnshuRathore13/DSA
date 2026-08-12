import java.util.*; 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch=new HashSet<>();

        int k=0,count=0,max=0;


        for(int i=0;i<s.length();i++){
            if(!ch.contains(s.charAt(i))){
                ch.add(s.charAt(i));
                count++;
                max=Math.max(max,count);
            }else{
                while(ch.contains(s.charAt(i))){
                    ch.remove(s.charAt(k));
                    k++;
                    count--;
                    
                }
                ch.add(s.charAt(i));
                count++;
            }
        }

        return max;
    }

}