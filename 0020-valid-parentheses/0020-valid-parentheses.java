import java.util.Stack;
class Solution {
    public boolean isValid(String s) {

        if(s.length()<=1){
            return false;
        }
        
        Stack<Character> ch=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                ch.push(s.charAt(i));
            }else {
                if(ch.isEmpty()) return false;
                if(s.charAt(i)==')' && ch.peek()=='('){
                ch.pop();
                }
                else if(s.charAt(i)=='}' && ch.peek()=='{'){
                ch.pop();
                }
                else  if(s.charAt(i)==']' && ch.peek()=='['){
                ch.pop();
                }
                else return false;
            }
            
        
        }

        if(ch.size()==0){
            return true;
        }
        return false;

    }
}