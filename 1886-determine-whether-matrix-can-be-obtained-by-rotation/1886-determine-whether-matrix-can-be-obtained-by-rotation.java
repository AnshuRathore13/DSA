import java.util.*;
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count =3;
        while(count>=0){
            if(Arrays.deepEquals(rot(mat),target)){
                return true;
            }
            count--;
        }
        return false;

    }

    public static int[][] rot(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }



        int c=0;
        int col=mat[0].length-1;
        while(c<=col/2){
            int r=0;
            while(r<mat.length){
                int temp=mat[r][c];
                mat[r][c]=mat[r][col-c];
                mat[r][col-c]=temp;
                r++;
            }
            c++;
        }

        return mat;

    }

    
}