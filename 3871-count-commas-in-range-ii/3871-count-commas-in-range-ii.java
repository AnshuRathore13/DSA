class Solution {
    public long countCommas(long n) {
        if(n<=999){
            return 0;
        }

        else if(n<=999999){
            return n-999;
        }

        else if(n<=999999999){
            return n-999+n-999999;
        }
        else if(n<=999999999999l){
            return n-999l+n-999999+n-999999999;
        }

        else{
            if(n==1000000000000000l){
                return n-999l+n-999999l+n-999999999l+n-999999999999l+1;
            }
            return n-999l+n-999999l+n-999999999l+n-999999999999l;
        }

        

    }
}