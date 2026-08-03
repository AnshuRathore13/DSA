class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            N=-N;
            x=1/x;

        }

        return pow(x,N);
    }

    public double pow(double x,long N){
        if(N==0) return 1;

        double half=pow(x,N/2);
        if(N%2==0) return half*half;
        else return x*half*half;
    }
}