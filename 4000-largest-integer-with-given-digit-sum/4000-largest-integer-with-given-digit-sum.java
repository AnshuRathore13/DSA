class Solution {
    public int largestInteger(int n, int s) {
        int max=(int )Math.pow(10,n)-1;
              

        while(max>=0){
            int check=max;
            int count=0;
            while(check>0){
                int ls=check%10;
                count+=ls;
                check/=10;

            }
            if(count == s){
                return max;
            }

            max--;
        }

        return -1;
    }
}