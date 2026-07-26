class Solution {
    public int maxProduct(int n) {
        int first=0;
        int sec=0;

        while(n>0){
            int ls=n%10;
            if(ls>sec){
                sec=ls;
            }
            if(sec>first){
                int temp=first;
                first=sec;
                sec=temp;
            }
            n/=10;
        }

        return first*sec;
    }
}