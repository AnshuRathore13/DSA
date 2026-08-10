class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int row=mat.length-1;
        int i=0;
        int j=row;

        while(i<=row){
            if(i!=j){
                sum+=mat[i][i];
                sum+=mat[j][row-j];
                i++;
                j--;
            }else{
                sum+=mat[i][i];
                i++;
                j--;
            }
        }
        return sum;
    }
}