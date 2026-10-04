class Solution {
    public boolean isPowerOfTwo(int n) {
        //if((n%2!=0 && n>1) || n<=0){
          //  return false;
        //}else if(n==1) return true;

        //return isPowerOfTwo(n/2);

        if(n<1) return false;

        while(n!=1){
            if(n%2!=0){
                return false;
            }

            n/=2;
        }

        return true;
        
    }
}