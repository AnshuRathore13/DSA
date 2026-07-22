class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
        return false;
       } 
       int z=x;
       int y=0;
       int i=0;

       while(z>0){
        int ls=z%10;
        y=y*10+ls;
        z/=10;
        i++;
       }

       while(x>0){
        int lsx=x%10;
        int lsy=y%10;

        if(lsx!=lsy){
            return false;
        
        }
        x/=10;
        y/=10;
       }

       return true;
       
    }
    
}