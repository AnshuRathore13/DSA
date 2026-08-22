class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int pile:piles){
            if(pile>r) r=pile;

        }
        
        while(l<=r){
            int mid=l+(r-l)/2;

            long hour=0;

            for(int pile:piles){
                hour+=(pile+mid-1)/mid;
            }
            if(hour<=h) r=mid-1;
            else l=mid+1;
        }

        return l;
    }
}