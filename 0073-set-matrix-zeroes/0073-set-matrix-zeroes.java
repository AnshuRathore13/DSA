import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        
        Stack<Integer> row=new Stack<>();
        Stack<Integer> col=new Stack<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row.push(i);
                    col.push(j);
                }
            }
        }

        while(!row.empty()){
            int i=row.peek();
            int j=col.peek();

            for(int k=0;k<c;k++){
                matrix[i][k]=0;
            }

            for(int k=0;k<r;k++){
                matrix[k][j]=0;
            }

            row.pop();
            col.pop();
        }
    }
}