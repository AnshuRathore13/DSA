class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ar=new int[n][n];

        int sr=0,sc=0,er=n-1,ec=n-1,count=1;

        while(sr<=er&&sc<=ec){
            for(int i=sc;i<=ec;i++){
                ar[sr][i]=count;
                count++;
            }
            sr++;

            for(int i=sr;i<=er;i++){
                ar[i][ec]=count;
                count++;
            }
            ec--;

            if(sr<=er){
                for(int i=ec;i>=sc;i--){
                    ar[er][i]=count;
                    count++;
                }
                er--;
            }

            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                    ar[i][sc]=count;
                    count++;
                }
                sc++;
            }
        }

        return ar;

    }
}