class Solution {
    public int findKthPositive(int[] arr, int k) {;
       int value=0; 

       for(int i=0;i<arr.length;i++){
        value++;
        while(value!=arr[i]){      
            k--;
            if(k==0) return value;
            value++;
        }
        
       }
        if(k>0)return value+k;
        return value;
    }
}