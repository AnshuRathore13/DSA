class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ar=new ArrayList<>();

        int sr=0,sc=0;
        int er=matrix.length-1,ec=matrix[0].length-1;

        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                ar.add(matrix[sr][i]);
            }
            sr++;

            for(int i=sr;i<=er;i++){
                ar.add(matrix[i][ec]);
            }

            ec--;
            if(sr<=er){
                for(int i=ec;i>=sc;i--){
                ar.add(matrix[er][i]);
                }
            er--;
            }
           
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                    ar.add(matrix[i][sc]);
                }
                sc++;
            }
            
        }    

        return ar; 
        
    }
}