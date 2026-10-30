class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;

        while(digits[i]==9 && i>0){
            digits[i]=0;
            i--;
        }
        if(i==0 && digits[i]==9){
            int []arl=new int[digits.length+1];
            arl[0]=1;

            return arl;

        }
        digits[i]=digits[i]+1;

        return digits;
    }
}