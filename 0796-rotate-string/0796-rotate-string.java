class Solution {
    public boolean rotateString(String s, String goal) {
        String a=s;

        int i=s.length();
        while(i>0){
            a=rotate(a);
            if(a.equals(goal)) return true;
            i--;
        }

        return false;
    }

    static String rotate(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        sb.append(s.charAt(0));

        return sb.toString();

    }
}