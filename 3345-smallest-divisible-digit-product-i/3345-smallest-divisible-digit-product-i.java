class Solution {
    public int smallestNumber(int n, int t) {
        int sum=1;
        int x=n;

        while(x>0){
            int ls=x%10;
            sum*=ls;
            x/=10;

        }
        if(sum%t==0) return n;
        else return smallestNumber(n+1,t);

    }
}