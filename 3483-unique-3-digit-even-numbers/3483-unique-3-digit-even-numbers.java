class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]%2==0){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        for(int k=0;k<n;k++){
                            if(i!=k && j!=k && digits[k]!=0){
                                int num=digits[i]+(digits[j]*10)+(digits[k]*100);
                                set.add(num);
                            }
                        }
                    }
                }
            }

        }

        return set.size();
    }
}