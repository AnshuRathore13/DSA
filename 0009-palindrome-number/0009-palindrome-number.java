class Solution {
    public boolean isPalindrome(int x) {
        
       if(x<0 || (x%10==0 && x!=0)){
        return false;
       } 
       
       int y=0;
       

        
        while(x>y){
            int ls=x%10;
            y=y*10+ls;
            x/=10;
       
        }
            
        

        if(x==y || x==(y/10)) return true;

        return false;

       
       
    }
    
}