class Solution {
    public int reverseDegree(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=((i+1)*(26-(s.charAt(i)-'a')));
        }
        return count;
    }
}