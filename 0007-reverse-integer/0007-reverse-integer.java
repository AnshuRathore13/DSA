class Solution {
    public int reverse(int x) {
        int rev=0;
        
        
            
        while(x!=0){
            int ls=x%10;
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10 && ls>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && ls<-8)){
                return 0;
            }  
            rev=rev*10+ls;
            x/=10;
        }

        return rev;
            
            
        
            

 
    } 
}