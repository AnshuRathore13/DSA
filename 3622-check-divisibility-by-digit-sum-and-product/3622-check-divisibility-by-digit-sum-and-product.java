class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int i=n;
        while(i>0){
            int ls=i%10;
            sum+=ls;
            mul*=ls;
            i/=10;
        }

        return (n%(sum+mul)==0);
        
    }
}