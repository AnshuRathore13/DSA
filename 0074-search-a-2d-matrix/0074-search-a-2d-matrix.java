class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;

        int low=0, high=(r*c)-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(matrix[mid/c][mid%c]==target) return true;
            else if(matrix[mid/c][mid%c]<target){low=mid+1;}
            else{high=mid-1;}

        }
        return false;
    }

}